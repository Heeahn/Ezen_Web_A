package Day14;

public class 게시판 {
	
	// 1. 필드
	private String title;
	private String contents;
	private String writer;
	private String point;
	
	// 2. 생성자[객체 생성시 초기값 = 처음값]
	public 게시판() {}

	public 게시판(String title, String contents, String writer, String point) {
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.point = point;
	}
	
}
