package Day10;

public class Book {

	//1. �ʵ�
	private String bookName;
	private String writer;
	
	//2. ������
	public Book() {}
	
	public Book(String bookName, String writer) {
		this.bookName = bookName;
		this.writer = writer;
	}
	//3. �޼ҵ�

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
