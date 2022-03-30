package controller.login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Loginpane implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Button btnlogin;

    @FXML
    private Button btnsignup;

    @FXML
    private Button btnfindid;

    @FXML
    private Button btnfindpassword;

    @FXML
    private Label lblconfirm;

    @FXML
    void accfindid(ActionEvent event) {
    	System.out.println(" ���̵�ã�� �������� �̵� ");
    }

    @FXML
    void accfindpassword(ActionEvent event) {
    	System.out.println(" �н�����ã�� �������� �̵� ");
    }

    @FXML
    void accsignup(ActionEvent event) {
    	System.out.println(" ȸ������ �������� �̵� ");
    	// *ȸ������ ��ư�� ������ login��Ʈ��Ŭ���� �� borderpane �����̳� center ������ ����
    	// ���� : �ٸ� Ŭ������ �����̳� ȣ�� 
//    		Login login = new Login(); // ���ο� �����̳� ���� [ x ]
//    		login.loadpage("/view/signuppane.fxml"); // [ x ]
    	// �ذ��� : ���� �����̳� �������� ��� !!!! -> this
    	Login.instance.loadpage("/view/view.login/signuppane.fxml");
    }

    @FXML
    void login(ActionEvent event) {
    	//    System.out.println(txtid.getText()+"�� ���̵� �ԷµǾ����ϴ�.");
    	//	System.out.println(txtpassword.getText()+"�� �н����尡 �ԷµǾ����ϴ�.");
    	String id = txtid.getText();
    	String password = txtpassword.getText();
    	
    	if(id.equals("admin") && password.equals("1234")) lblconfirm.setText("�������̱���!!!");
    	else lblconfirm.setText("�Ϲ�ȸ���̱���!!!");
    	System.out.println("�α��� ó��");
    }
	
	
}










