package jspweb.dao;

import java.util.ArrayList;

import jspweb.dto.Category;
import jspweb.dto.Product;
import jspweb.dto.Stock;

public class ProductDao extends Dao {
	
	public ProductDao() {  super(); }
	// 외부클래스에서 접근 객체 
	private static ProductDao productDao = new ProductDao();
	public static ProductDao getProductDao() { return productDao; }
/////////////////////////////////////// 카테고리 ///////////////////////////////////////
	
	// 1. 카테고리 등록
	public boolean csave(String cname) {
		String sql = "insert into category(cname)values('"+cname+"')";
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate(); return true;
		} catch (Exception e) {System.out.println(e);} return false;
	}
	
	// 2. 카테고리 호출 
	public ArrayList<Category> getcategorylist(){
		ArrayList<Category> list = new ArrayList<Category>();
		String sql = "select * from category";
		try {
			ps =con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Category category = new Category(rs.getInt(1), rs.getString(2));
				list.add(category);
			} return list;
		} catch (Exception e) {System.out.println(e);} return null;
	}
	// 3. 카테고리 수정
	// 4. 카테고리 삭제

/////////////////////////////////////// 제품 ///////////////////////////////////////
	// 1. 제품 등록
	public boolean psave(Product pro) {
		String sql ="insert into product(pname, pprice, pdiscount, pimg, cno) values(?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, pro.getPname()); ps.setInt(2, pro.getPprice()); ps.setFloat(3, pro.getPdiscount());
			ps.setString(4, pro.getPimg()); ps.setInt(5, pro.getCno()); ps.executeUpdate(); return true;
		} catch (Exception e) {System.out.println(e);} return false;
	}
	// 2. 제품 호출 
	public ArrayList<Product> getproductlist(){
		ArrayList<Product> list = new ArrayList<Product>();
		String sql = "select * from product";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Product product  = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getFloat(4), 0, rs.getString(6), rs.getInt(7));
				list.add(product);
			}return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;}
	// 3. 제품 수정
	// 4. 제품 삭제
	
	
/////////////////////////////////////// 재고 ///////////////////////////////////////
	// 1. 재고 등록
	public boolean ssave() {return false;}
	// 2. 재고 호출 
	public ArrayList<Stock> getstock(){return null;}
	// 3. 재고 수정
	// 4. 재고 삭제

}
