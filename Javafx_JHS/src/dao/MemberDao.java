package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Member;

public class MemberDao { // DB ���ٰ�ü
	
	private Connection con; // DB������ ���Ǵ� Ŭ���� : DB����Ŭ����
	private PreparedStatement ps; // ����� DB�� SQL ���� �Ҷ� ���Ǵ� �������̽� : DB�����������̽�
	private ResultSet rs; // ������� �����ϴ� �������̽� 
	
	public static MemberDao memberDao = new MemberDao(); // DB ���� ��ü;
	
	public MemberDao() {
		try {
			// DB���� 
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1. DB ����̹� ��������
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC",
					"root","1234"); // 2. DB �ּ� ���� 
		}
		catch(Exception e ) { System.out.println( "[DB ���� ����]"+e  ); }
	}
	// �޼ҵ� 
		// * ���̵� �ߺ�üũ �޼ҵ� ( �μ� : ���̵� �μ��� �޾� db�� �����ϴ��� üũ )
	public boolean idcheck( String id) {
		try {
			// 1. SQL �ۼ�
				// �˻� : select * from ���̺�� where ����( �ʵ��=�� )
			String sql = "select * from member where mid=?";
			// 2. SQL ���� 
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			// 3. SQL ���� 
			rs = ps.executeQuery(); // select ���� -> �˻��� ����� ���� -> resultset O
			// resultset ó�� �⺻ ���� : null ---next()---> ��� ���ڵ�
			// 4. SQL ���
			if( rs.next() ){ // ���࿡ ���� ������� �����ϸ� => �ش� ���̵� ���� -> �ߺ�O 
				return true; // �ش� ���̵�� �ߺ��� ����
			}
		}catch(Exception e ) { System.out.println( "[SQL ����]"+e  ); }
		return false; // �ش� ���̵�� �ߺ��� ���� 
	}
		// 1. ȸ������ �޼ҵ� ( �μ� : db�� ���� ���̵�,��й�ȣ,�̸���,�ּ� )
	public boolean signup( Member member ) { 
		try {
			// 1. SQL �ۼ�  [ ȸ����ȣ(�ڵ���ȣ=auto) ������ ��� �ʵ� ���� ]
			String sql = "insert into member(mid,mpassword,memail,maddress,mpoint,msince)values(?,?,?,?,?,?)";
			// 2. SQL ����
			ps = con.prepareStatement(sql); // PreparedStatement �������̽��� ����� db�� sql �ֱ�
			ps.setString( 1 , member.getMid() ); // 1�� ? �� ���̵� �־��ֱ�
			ps.setString( 2 , member.getMpassword() ); // 2�� ? �� ��й�ȣ �־��ֱ�
			ps.setString( 3 , member.getMemail() ); // 3�� ? �� �̸��� �־��ֱ�
			ps.setString( 4 , member.getMaddress() ); // 4�� ? �� �ּ� �־��ֱ�
			ps.setInt( 5 , member.getMpoint() ); // 5�� ? �� ����Ʈ �־��ֱ�
			ps.setString( 6 , member.getMsince() ); // 6�� ? �� ������ �־��ֱ�
			// 3. SQL ���� 
			ps.executeUpdate(); // insert ���� -> ���� ����� X -> resultset X
			return true; // * ������ 
		}catch(Exception e ) { System.out.println( "[SQL ����]"+e  ); }
		return false; // * ���н�
	}
		// 2. �α��� �޼ҵ� ( �μ� : �α��ν� �ʿ��� ���̵�,��й�ȣ )
	public boolean login( String id , String password ) { 
		try {
		// 1. sql �ۼ�
			//  and : ����1 and ����2     �̸鼭  
			//  or : ����1 or ����2		�̰ų� 
			String sql = "select * from member where mid=? and mpassword=?";
			// 2. sql ����
			ps = con.prepareStatement(sql);
			ps.setString(1, id);		// ù��° ? �� id ���� �ֱ� 
			ps.setString(2, password); // �ι�° ? �� password ���� �ֱ�
			// 3. sql ���� 
			rs = ps.executeQuery(); // select ���� -> resultset  
			// 4. sql ���
			if( rs.next() ) { // select �� ������� ������ 
				return true; // ���̵�� ��й�ȣ�� ���� -> �α��� ���� 
			}
		}catch(Exception e ) { System.out.println( "[SQL ����]"+e  ); }
		return false; // �α��� ����
	}
		// 3. ���̵�ã�� �޼ҵ� ( �μ� : ���̵�ã�� �� �ʿ��� �̸��� )
	public String findid( String email ) { 
		
		try {
			// 1. SQL �ۼ�
			String sql = "select * from member where memail=?";
			// 2. SQL ����
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			// 3. SQL ����
			rs = ps.executeQuery();
			// 4. SQL ���
			if(rs.next()) {
				return rs.getString(2); // �ʵ��ȣ
				//rs.getString(������ �ʵ� ������ȣ);
			}
			
		}catch (Exception e) {}
		return null;
		}
		// 4. ��й�ȣã�� �޼ҵ� ( �μ� : ��й�ȣã�� �� �ʿ��� ���̵�, �̸��� )
	public String findpassword( String id , String email ) { 
		
		try {
			// 1. SQL �ۼ�
			String sql = "select * from member where mid=? and memail=?";
			// 2. SQL ����
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, email);
			// 3. SQL ����
			rs = ps.executeQuery();
			// 4. SQL ���
			if(rs.next()) {
				return rs.getString(3);
			}
		}catch (Exception e) {System.out.println( "[SQL ����]"+e  ); }
		return null;
		}
	
	// 5. ���̵� �μ� �� ȸ������ ȣ��
	public Member getmember(String id) {
		try {
			// 1. SQL �ۼ�
			String sql = "select * from member where mid=?";
			// 2. SQL ����
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			// 3. SQL ����
			rs = ps.executeQuery();
			// 4. SQL ���
			if(rs.next()) {
				// 1. ��ü ����
				Member member = new Member(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6),
						rs.getString(7)
						);
				return member;
			}
			
		}catch (Exception e) {System.out.println( "[SQL ����]"+e  );}
		return null;
	}
	
	// 6. ȸ��Ż��[ȸ����ȣ�� �μ��� �޾� �ش� ȸ����ȣ�� ���ڵ� ����]
	public boolean delete(int mnum) {
		try {
		// 1. SQL �ۼ�
			String sql = "delete from member where mnum=?";
		// 2. SQL ����
			ps = con.prepareStatement(sql);
			ps.setInt(1, mnum);
		// 3. SQL ����
			ps.executeUpdate(); 
		// 4. SQL ���
			return true;
		} catch (Exception e) {}		
		return false;
	}
	
	// 7. ȸ������[ȸ����ȣ(���), �̸���, �ּҸ� �μ��� �޾Ƽ� ȸ������ ó��]
	public boolean update(int mnum, String memail, String maddress) {
		try {
			// 1. SQL �ۼ�
				// ���� : update ���̺�� set �ʵ��1 = ������1, �ʵ�� 2=������2 where ����
			String sql = "update member set memail=? , maddress=? where mnum=? ";
			// 2. SQL ����
			ps = con.prepareStatement(sql);
			ps.setString(1, memail); ps.setString(2, maddress); ps.setInt(3, mnum);
			// 3. SQL ����
			ps.executeUpdate();
			// 4. SQL ���
			return true;
		} catch (Exception e) {}
		
		return false;
	}
	
	
	
}








