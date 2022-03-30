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
    	System.out.println(" 아이디찾기 페이지로 이동 ");
    }

    @FXML
    void accfindpassword(ActionEvent event) {
    	System.out.println(" 패스워드찾기 페이지로 이동 ");
    }

    @FXML
    void accsignup(ActionEvent event) {
    	System.out.println(" 회원가입 페이지로 이동 ");
    	// *회원가입 버튼을 누르면 login컨트롤클래스 내 borderpane 컨테이너 center 페이지 변경
    	// 문제 : 다른 클래스내 컨테이너 호출 
//    		Login login = new Login(); // 새로운 컨테이너 생성 [ x ]
//    		login.loadpage("/view/signuppane.fxml"); // [ x ]
    	// 해결방안 : 기존 컨테이너 가져오는 방법 !!!! -> this
    	Login.instance.loadpage("/view/view.login/signuppane.fxml");
    }

    @FXML
    void login(ActionEvent event) {
    	//    System.out.println(txtid.getText()+"로 아이디가 입력되엇습니다.");
    	//	System.out.println(txtpassword.getText()+"로 패스워드가 입력되엇습니다.");
    	String id = txtid.getText();
    	String password = txtpassword.getText();
    	
    	if(id.equals("admin") && password.equals("1234")) lblconfirm.setText("관리자이군요!!!");
    	else lblconfirm.setText("일반회원이군요!!!");
    	System.out.println("로그인 처리");
    }
	
	
}










