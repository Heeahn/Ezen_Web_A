package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Product;
import dto.Room;
import dto.Roomlive;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class RoomDao {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static RoomDao roomDao = new RoomDao();
	
	public RoomDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC",
					"root","1234");
		}catch(Exception e ) {}
	}

	// 1. �� ���� �޼ҵ�
	public boolean roomadd(Room room) {
		try {
				
			String sql="insert into room(roname,roip) values(?,?)";
					// ���̺� ���ڵ� �߰� ���� : insert into ���̺��(�ʵ��1, �ʵ��2) values(��1,��2);
			ps = con.prepareStatement(sql);
			ps.setString(1, room.getRoname());
			ps.setString(2, room.getRoip());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("[SQL ����] :"+e);}
		return false;
	}
	
	// 2. �� ��ȣ ȣ�� �޼ҵ� [ ���ȣ= port��ȣ�� ����� ����]
	public int getroomnum() {// ���� �ֱ��� ��ϵ� �� ��ȣ ��������
		try {							// max(�ʵ��) : �ش� �ʵ��� ���� ū ��
			String sql = "select max(ronum) from room";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1); // �ֱٿ� ��ϵ� ���ȣ ��ȯ
			}
		} catch (Exception e) {System.out.println("[SQL ����] :"+e);}
		return 0;
	}
	
	// 3. ��� �� ȣ�� �޼ҵ�[tablevew -> ObservableList]
	public ObservableList<Room> roomlist(){
		ObservableList<Room> roomlist = FXCollections.observableArrayList();
		try {
			String sql = "select * from room order by ronum desc";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			// rs = Resultset �������̽� ��ü : select�� ��� ��������
					// Resultset (�ʱⰪ null)
					// rs.next() : select ����� ���ڵ� 1�� ��������
					// rs(null) -> rs.next() -> rs(����� ù��° ���ڵ�) ->rs.next()
			while(rs.next()) {
				Room room = new Room(rs.getInt(1), rs.getString(2),rs.getString(3),0);
				roomlist.add(room);
			}
			return roomlist;
		} catch (Exception e) {System.out.println("[SQL ����] :"+e);}
		return null;
	}
	
	// 4. ä�ù� ���� ��� �߰�
	public boolean addroomlive(Roomlive roomlive) {
		String sql = "insert into roomlive(ronum,mid) values(?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, roomlive.getRonum());
			ps.setString(2, roomlive.getMid());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("[SQL ����] :"+e);}
		return false;
	}
	
	// 5. ä�ù� ���ӵ� ��� ��� ȣ��
	public ArrayList<Roomlive> getRoomlivelist(int ronum){
		ArrayList<Roomlive> roomlivelist = new ArrayList<>();
		try {
			String sql = "select * from roomlive where ronum=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, ronum);
			rs = ps.executeQuery();
			while(rs.next()) {
				Roomlive roomlive = new Roomlive(rs.getInt(1), rs.getInt(2), rs.getString(3));
				roomlivelist.add(roomlive);
			}
			return roomlivelist;
		} catch (Exception e) {System.out.println("[SQL ����] :"+e);}
		return null;
	}
	
	// 6. ä�ù� ���� ��� ����
	public boolean roomlivedelete(String mid) {
		try {
			String sql = "delete from roomlive where mid=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, mid);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("[SQL ����] :"+e);}
		return false;
	}
	
	// 7. ä�ù� ����[���� : �ش� ä�ù濡 ���Ӹ���� 0���϶�]
	public boolean roomdelete(int ronum) {
		
		//���࿡ �ش� ���ȣ�� roomlive���� �˻����� ��
			// �˻������ ����[���ڵ� ����o]�ϸ� �� ���� x
			// �˻������ ������[���ڵ�����x] �� ����o
		String sql = "select * from roomlive where ronum=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, ronum);
			rs = ps.executeQuery();
				// rs.next() : ��ȯŸ��[���� ���ڵ尡 ������ true]
				//							[���� ���ڵ尡 ������ false]
			if(rs.next()) { // ����� �����ϸ� �����x
				return false;
			}else {// ����� ������ �����ó��
				String sql2 = "delete from room where ronum=?";
				ps = con.prepareStatement(sql2);
				ps.setInt(1, ronum);
				ps.executeUpdate();
				return true; // ���� ����� ���� �� ���� ����
			}
		} catch (Exception e) {System.out.println("[SQL ����] :"+e);}
		
		return false;
	}
}




































