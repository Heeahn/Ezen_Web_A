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
		// ��ü ȸ����
		int mtotal = MemberDao.memberDao.counttotal("member");
		lblmtotal.setText(mtotal+"��");
		// ��ü ��ǰ��
		int ptotal = MemberDao.memberDao.counttotal("product");
		lblptotal.setText(ptotal+"��");
		// ��ü �Խù���
		int btotal = MemberDao.memberDao.counttotal("board");
		lblbtotal.setText(btotal+"��");
		
		// ��¥���� ȸ�� ��� ��
		XYChart.Series series = new XYChart.Series<>(); // 1. x.y�� �迭 ����
		
			// ��¥���� ȸ������ �� üũ [2022-04-11, 3]
			// Map �÷��� => Ű(��¥), ��(���Լ�) ���� �ϳ��� ��Ʈ�� ����
			Map<String, Integer> map = MemberDao.memberDao.datetotal();
			
			// �ݺ���
			for(String key : map.keySet()) {
				XYChart.Data data = new XYChart.Data<>(key, map.get(key));
				series.getData().add(data);
			}
			// ������Ʈ �̸�
			mbc.getData().add(series);
			
			// 1. �迭����
			XYChart.Series series2 = new XYChart.Series<>();
			Map<String, Integer> map2 = MemberDao.memberDao.datetotal2();
			// 2. ������ ����
			for(String key : map2.keySet()) {
				XYChart.Data data = new XYChart.Data<>(key, map2.get(key));
				// 3. �迭�� ������ �߰�
				series2.getData().add(data);
			}
			// 4. ��Ʈ�� �迭 �߰�
			bbc.getData().add(series2);			
	}

}
