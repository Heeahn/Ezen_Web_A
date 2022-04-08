package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import controller.login.Login;
import dao.RoomDao;
import dto.Room;
import dto.Roomlive;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Alert.AlertType;

public class Chatting implements Initializable {

    @FXML
    private Button btnconnect;

    @FXML
    private TextArea txtcontent;

    @FXML
    private TextField txtmsg;

    @FXML
    private Button btnsend;

    @FXML
    private TableView<Room> roomtable;

    @FXML
    private TextField txtroomname;

    @FXML
    private Button btnadd;

    @FXML
    private TextArea txtmidlist;

    @FXML
    private Label lblselect;
    
    public Server server;			// ���� ���� ����[��� ���Ͽ��� �����Ϸ���]
    public static Room selectroom; 	// ���̺�信�� ���õ� �水ü	
    
    public void show() {
    	// 1. DB���� ��� �� ��� ��������
    	ObservableList<Room> roomlist = RoomDao.roomDao.roomlist();
    	// 2. ���̺���� ù��° �ʵ带 �����ͼ� ���ȣ �ʵ�� ����
    	TableColumn tc = roomtable.getColumns().get(0);
    	tc.setCellValueFactory(new PropertyValueFactory<>("ronum"));   	
    	// 3. ���̺���� �ι��� �ʵ带 �����ͼ� ���̸� �ʵ�� ����
    	tc = roomtable.getColumns().get(1);
    	tc.setCellValueFactory(new PropertyValueFactory<>("roname"));    	
    	// 4. ���̺���� ����° �ʵ带 �����ͼ� ���ο� �ʵ�� ���� 
    	tc = roomtable.getColumns().get(2);
    	tc.setCellValueFactory(new PropertyValueFactory<>("mcount"));
    	// 5. ���̺���� ����Ʈ�� �־��ֱ�
    	roomtable.setItems(roomlist);
    	// 6. �ش� ���̺�並 Ŭ������ ��
    	roomtable.setOnMouseClicked(e -> {
    		// 7. Ŭ���� ��ü ��������
    		selectroom = roomtable.getSelectionModel().getSelectedItem();
    		// 8. ���̺� ǥ��
    		lblselect.setText("���� ���õ� �� :"+ selectroom.getRoname());
    		// 9.  ���� ��ư ��� Ȱ��ȭ
    		btnconnect.setDisable(false);
    	});
    }
    
    @FXML
    void add(ActionEvent event) { // �� ���� ��ư�� ������ ��
    	// 1. ��Ʈ�ѿ� �Էµ� �� �̸� ��������
    	String roomname = txtroomname.getText();
    	if(roomname.length()<4) {
    		//���࿡ ���̸��� 4���� �̸��̸� �氳�� ����
    		Alert alert = new Alert(AlertType.CONFIRMATION);
        	alert.setHeaderText("�� ������ ����[�� �̸� 4���� �̻� �ۼ�]" );
        	alert.showAndWait();
    		return;
    	}
    	// 2. �� ��ü
    	Room room = new Room(0,roomname,"127.0.0.1",0);
    	// 3. DB ó��
    	RoomDao.roomDao.roomadd(room);
    	// 4. �ش� �� ���� ����
    	server = new Server(); // �޸��Ҵ�
    	// ��������[�μ��� ip�� port �ѱ��]
    	server.serverstart(room.getRoip(), RoomDao.roomDao.getroomnum());
    	txtroomname.setText("");  //������ ���̸� �Է�â ���� ó��
    	
    	show(); // ���̺� ���ΰ�ħ
    	
    	//�޼��� â
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setHeaderText("�� ������ �Ǿ����ϴ�. ���ȣ :"+RoomDao.roomDao.getroomnum());
    	alert.showAndWait();
    }

    Socket socket;    // 1. Ŭ���̾�Ʈ ���� ����
    
    public void clientstart(String ip, int port){	// 2. Ŭ���̾�Ʈ ���� �޼ҵ�
        // ��Ƽ������
    	Thread thread = new Thread(){
    		@Override
    		public void run() {
    			try {
					socket = new Socket(ip, port); // ������ ip�� ��Ʈ��ȣ �־��ֱ�
					send(Login.member.getMid()+"���� �����߽��ϴ�.\n"); // ���Ӱ� ���ÿ� ����޽��� ������
					receive(); // ���Ӱ� ���ÿ� �ޱ� �޼ҵ�� ���ѷ���
				} catch (Exception e) {}
    		}
    	}; // ��Ƽ������ ���� ��
    		thread.start(); // ��Ƽ������ ����
    }
    public void clientstop(){// 3. Ŭ���̾�Ʈ ���� �޼ҵ�
       try {socket.close();} catch (Exception e) {	}
    }
    public void send(String msg){	// 4. �������� �޽��� ������ �޼ҵ� [�������� : ������ �޽����� �޾�����]
    	Thread thread = new Thread(){
        	@Override
        	public void run() {
        		try {
					OutputStream outputStream = socket.getOutputStream(); // 1. ��� ��Ʈ��
					outputStream.write(msg.getBytes());
					outputStream.flush(); // 3. ��Ʈ�� �ʱ�ȭ[��Ʈ�� �� ����Ʈ �����]
				} catch (Exception e) {}
        	}
        }; // ��Ƽ������ ���� ��
        thread.start();
    }
    
    public void receive(){ // 5. �������� �޽��� �ޱ� �޼ҵ�
        try {
			while(true) {
				InputStream inputStream = socket.getInputStream(); 	// 1. �Է� ��Ʈ��
				byte[] bytes = new byte[1000];											// 2. ����Ʈ�迭 ����
				inputStream.read(bytes);														// 3. �о����
				String msg = new String(bytes); 											// 4. ����Ʈ�迭 -> ���ڿ� ��ȯ
				txtcontent.appendText(msg); // �Է¹��� ������ ä��â�� �߰��ϱ�
			}
		} catch (Exception e) {}
    }
    
	public void midshow() {
		// 1. ���̺�信�� ���õ� �� ��ȣ�� ���ӵ� ȸ����� ��������
		ArrayList<Roomlive> roomlivelist = RoomDao.roomDao.getRoomlivelist(selectroom.getRonum());
    	txtmidlist.setText(""); // 2. ��� �ʱ�ȭ
    	int i =1;
    	for(Roomlive temp : roomlivelist) { // 3. ����Ʈ�� ��� ��ü�� �ϳ��� ��ܿ� �߰�
    		txtmidlist.appendText(i+"��"+temp.getMid()+"\n");
    		i++;
    	}
	}
    
    @FXML
    void msg(ActionEvent event) { // �Է�â���� �Է��� ���͸� ������ ��
    	
    	String msg = Login.member.getMid()+" : "+txtmsg.getText()+"\n";
    	send(msg);
    	txtmsg.setText("");
    	txtmsg.requestFocus();
    	midshow();
    }

    @FXML
    void send(ActionEvent event) {
    	String msg = Login.member.getMid()+":"+txtmsg.getText()+"\n"; // ���� �޽���
    	send(msg); // �޽��� ������
    	txtmsg.setText(""); // �������� �޽����Է�â �����
    	txtmsg.requestFocus(); // ������ �� �޽����Է�â���� ��Ŀ��(Ŀ��) �̵�
    	midshow();
    }
    
    @FXML
    void connect(ActionEvent event) {
    	if(btnconnect.getText().equals("ä�ù� ����")) { //���࿡ ��ư�� "ä�ù� ����" �̸� 
    		clientstart(selectroom.getRoip(), selectroom.getRonum()); // Ŭ���̾�Ʈ ���� �޼ҵ�
    		// ���� �� ���Ӹ�� �߰�
    		Roomlive roomlive = new Roomlive(0,selectroom.getRonum(),Login.member.getMid());
    		// dbó��
    		RoomDao.roomDao.addroomlive(roomlive);
    		
    		txtcontent.appendText("---[ä�ù� ����]---\n");
    		btnconnect.setText("ä�ù� ������");
    		
    		txtmsg.setText("");
    		txtmsg.setDisable(false); 			// ä���Է�â ��������
    		txtcontent.setDisable(false); 		// ä���� ��� ������
    		btnsend.setDisable(false); 			// ���۹�ư ������
    		txtmsg.requestFocus();
    		
    		txtroomname.setDisable(true);  // ä�ù� �̸� �Է�â ������
    		btnadd.setDisable(true);				// ä�� ���� ��ư ������
    		roomtable.setDisable(true); 		// ä�ù� ��� ������
    	}else {
    		clientstop(); // Ŭ���̾�Ʈ ���� �޼ҵ�
    		txtcontent.appendText("---[ä�ù� ����]---\n");
    		btnconnect.setText("ä�ù� ����");
    		
    		txtmsg.setText("ä�ù� ������ ��밡��");
    		txtmsg.setDisable(true); 		// ä���Է�â ��������
    		txtcontent.setDisable(true); 	// ä���� ��� ������
    		btnsend.setDisable(true); 		// ���۹�ư ������
    		
    		txtroomname.setDisable(false);  // ä�ù� �̸� �Է�â ���
    		btnadd.setDisable(false);				// ä�� ���� ��ư ���
    		roomtable.setDisable(false); 		// ä�ù� ��� ���
    		// 1. �� ���� ��ܿ��� ����[����] �ϱ�
    		
    		// 2. ���࿡ �� ���� ����� 0���̸� �� ����
    		RoomDao.roomDao.roomlivedelete(Login.member.getMid());
    			// 2-2. ���࿡ ���� �����Ǹ鼭 �������� ����
    		boolean result = RoomDao.roomDao.roomdelete(selectroom.getRonum());
    		if(result) {server.serverstop();}
    		// * ���̺�信�� ���õ� �� ��ü �ʱ�ȭ
    		selectroom = null;
    		// * ���õ� �� ���̺� �ʱ�ȭ
    		lblselect.setText("���� ���õ� �� :");
    		
    		txtcontent.setText("");
    		
    		show(); // �� ��� ���̺� ���ΰ�ħ
    	}
    }

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// ä�� �������� �ʱⰪ �޼ҵ�
			//* ä�ù� �������� �Ʒ� fxid�� �����ϰ� ����
		txtmsg.setText("ä�ù� ������ ��밡��");
		txtmsg.setDisable(true); 		// ä���Է�â ��������
		txtcontent.setDisable(true); 	// ä���� ��� ������
		btnsend.setDisable(true); 		// ���۹�ư ������
		btnconnect.setDisable(true); 	// �����ư ������
		txtmidlist.setDisable(true); 	// ������ȸ�� ��� ������
		show();
	}
}
