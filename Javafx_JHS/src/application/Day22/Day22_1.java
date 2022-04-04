package application.Day22;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// 수요일 [javafx 처음 사용](책) 
	
	// javafx 사용 설정
		// 1. javafx 설치
		// 2. javafx 프로젝트 생성
		// 3. 프로젝트내 javafx 라이브러리 추가
		// 4. 라이브러리 연결 성정 / 스레드

public class Day22_1 extends Application{
	
	@Override
	public void start(Stage stage) throws Exception {
								//스테이지 이름정하기[아무거나]
		//1. 씬빌더에서 작성한 파일[FXML] 을 객체로 가져오기
		Parent parent = FXMLLoader.load(getClass().getResource("DB테스트.fxml"));
		// 2. 씬 객체를 만들어서 가져온 fxml 객체를 넣어준다
		Scene scene = new Scene(parent);
		// 3. 씬 객체를 스테이지에 연결
		stage.setScene(scene);
		// 4. 스테이지 열기
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
