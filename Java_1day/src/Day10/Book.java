package Day10;

public class Book {

	//1. 필드
	private String bookName;
	private String writer;
	
	//2. 생성자
	public Book() {}
	
	public Book(String bookName, String writer) {
		this.bookName = bookName;
		this.writer = writer;
	}
	//3. 메소드

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	
}
