package jspweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
	protected Connection con; 
	protected PreparedStatement ps; 
	protected ResultSet rs; 

	public Dao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb?serverTimezone=UTC",
					"root","1234");
		}catch(Exception e ) { System.out.println( "DB연동 실패"+e  ); }
	}
}
