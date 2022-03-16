package Day11;

public class Reply {

	//필드
	private String content;
	private String password;
	private String writer;
	private String date;
	//생성자
		// 1. 빈생성자
	public Reply() {}
	
		// 2. 풀생성자
	public Reply(String content, String writer, String password, String date) {
		this.content = content;
		this.password = password;
		this.writer = writer;
		this.date = date;
	}
		// 3. 댓글등록시 사용되는 생성자
	public Reply(String content, String writer, String password) {
		this.content = content;
		this.password = password;
		this.writer = writer;
	}
	
	// 메소드
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}	
}
