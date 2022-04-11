package controller;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

import dao.MemberDao;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class Record implements Initializable{
	
	@FXML
	private Label lblmtotal;
	@FXML
	private Label lblptotal;
	@FXML
	private Label lblbtotal;
	@FXML
	private BarChart mbc;
	@FXML
	private BarChart bbc;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 전체 회원수
		int mtotal = MemberDao.memberDao.counttotal("member");
		lblmtotal.setText(mtotal+"명");
		// 전체 제품수
		int ptotal = MemberDao.memberDao.counttotal("product");
		lblptotal.setText(ptotal+"개");
		// 전체 게시물수
		int btotal = MemberDao.memberDao.counttotal("board");
		lblbtotal.setText(btotal+"개");
		
		// 날짜별로 회원 등록 수
		XYChart.Series series = new XYChart.Series<>(); // 1. x.y축 계열 생성
		
			// 날짜별로 회원가입 수 체크 [2022-04-11, 3]
			// Map 컬렉션 => 키(날짜), 값(가입수) 으로 하나의 엔트리 구성
			Map<String, Integer> map = MemberDao.memberDao.datetotal();
			
			// 반복문
			for(String key : map.keySet()) {
				XYChart.Data data = new XYChart.Data<>(key, map.get(key));
				series.getData().add(data);
			}
			// 막대차트 이름
			mbc.getData().add(series);
			
			// 1. 계열생성
			XYChart.Series series2 = new XYChart.Series<>();
			Map<String, Integer> map2 = MemberDao.memberDao.datetotal2();
			// 2. 데이터 생성
			for(String key : map2.keySet()) {
				XYChart.Data data = new XYChart.Data<>(key, map2.get(key));
				// 3. 계열에 데이터 추가
				series2.getData().add(data);
			}
			// 4. 차트에 계열 추가
			bbc.getData().add(series2);			
	}

}
