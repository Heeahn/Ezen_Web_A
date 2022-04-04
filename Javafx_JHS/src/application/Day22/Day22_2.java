package application.Day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Day22_2 {
	
	// 1. �ʵ�
		private Connection connection; // DB���� ��ü ����
		
	// 2. ������
		public Day22_2() {
			try { // JAVA�� �ܺο� ����� ������ �Ϲݿ��� �߻�
				// 1. DB ����̺� Ŭ���� ȣ��[DB ȸ�� ���� �ٸ��� ������ �ϱ� X ����O]
				Class.forName("com.mysql.cj.jdbc.Driver");
				// 2. DB ����
				connection = DriverManager.getConnection(
						// JDBC : JAVA DATABASE CONNECTION
						// jdbc:mysql://IP�ּ�(����[����pc]�̸� localhost)port��ȣ/DB�̸�?DB�ð�
						// ,������, "DB��й�ȣ"
						"jdbc:mysql://localhost:3306/javafx?serverTimezone=UFC",
						"root",
						"1234"
						);
				// 3. Ȯ��
				System.out.println("[DB ���� ����]");
		} catch (Exception e) {
				System.out.println("[DB ���� ����]");
		}
	}
	// 3. ������ ���� �޼ҵ�
	public boolean write(String �ۼ���, String ����) {
		
		try {
			// 1. SQL �ۼ�[DB�� ���̺� ������ ����]
				// db�� ���̺� ������ ���� : insert into ���̺��1(�ʵ��1,�ʵ��2) values(�ʵ��1�� ��, �ʵ��2�ǰ�)
			String sql = "insert into test(writer,content) values(?,?)";
			// 2. SQL ����[����� DB�� SQL ����]
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, �ۼ���); // sql�� �ۼ��� ù��° ?�� ���� �ֱ� [1 : ù��°?]
			ps.setString(2, ����); // [2 : �ι�° ?]
			// 3. SQL ����
			ps.executeUpdate(); // sql ���� ���ڤ�
			
			//* ������ True
			return true;
		
		}catch (Exception e) {	System.out.println("[sql ���� ���� ���� :]"+e);}
		
		//* ���н� False
		return false;
	}
	
	// 4. ������ ȣ�� �޼ҵ�[��ȯŸ���� ArrayList ����� ���� : ���� ��[����Ʈ]�� �������� ���ؼ�
	public ArrayList<������> get(){
		
		//* DB���� ������ �����͸� ������ ����Ʈ ����
		ArrayList<������> �����͸�� = new ArrayList<>();
		
		try {
			// 1. SQL �ۼ�[������ ȣ��]
				// select*(����ʵ�) from ���̺��; : ��� �����͸� ��������
			String sql = "select * from test";
			// 2. SQL ����
			PreparedStatement ps = connection.prepareStatement(sql);
			// 3. SQL
			ResultSet rs = ps.executeQuery(); // ����� ��������
			
			//* ����� �ϳ��� �ƴϰ� ������ �̹Ƿ� �ݺ��� ����ټ�
				// ���پ� ��üȭ -> ����Ʈ�� ����
			while(rs.next()) { // ������[���ڵ�]�� ������
				// 1. ���پ�[���ڵ�]���� ��üȭ
				������ temp = new ������(rs.getInt(1), rs.getString(2), rs.getString(3));
				// 2. ��ü�� ����Ʈ�� ����ֱ�
				�����͸��.add(temp);
			}
			// �ݺ��� ����Ǹ� ����Ʈ ��ȯ
			//* ������ ������ ��� ��ȯ
			return �����͸��;
		}catch (Exception e) {
			System.out.println("[sql ���� ���� ���� :]"+e);
		}
		// ���н�
		return null;
	}
		
}
