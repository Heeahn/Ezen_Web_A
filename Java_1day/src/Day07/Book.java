package Day07;

//클래스 설계
	// 1. book
		// 필드: ISBN(도서번호), 도서명, 작가, 도서대여여부, 대여회원
		// 메소드: 1. 도서검색 2. 도서목록 3. 도서대여 4. 도서반납 5. 도서등록 6. 도서삭제

public class Book { 

	// 1. 필드
	String ISBN;				// ISBN
	String bname;		// 도서명
	String bwriter;		// 작가
	boolean brental;	// 도서대여여부
	String mid;				// 대여회원
	
	// 2. 생성자
		// 1. 빈생성자[기본생성자] : 메소드호출용
	public Book() {}
		// 2. 풀생성자[모든 필드받는 생성자] : 도서등록
	public Book(String isbn, String bname, String bwriter, boolean brental, String mid) {
		this.ISBN = isbn;
		this.bname = bname;
		this.bwriter = bwriter;
		this.brental = brental;
		this.mid = mid;
	}
	// 3. 메소드
		// 1. 도서검색
	void 도서검색() {
		System.out.println("----------------------도서 검색 페이지----------------------");
		System.out.println("ISBN 입력 : "); String isbn = Day07_5_BookApplication.scanner.next();
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp!=null&&temp.ISBN.equals(isbn)) {
				System.out.printf("도서명\t작가\t대여중여부");
				System.out.println(temp.bname+"\t"+temp.bwriter+"\t"+temp.brental+"\t");
			}
			else {
				System.out.println("알수 없는 도서입니다.");
			}
		}
	}
		// 2. 도서목록
	void 도서목록() {
		System.out.println("----------------------도서 목록 페이지----------------------");
		System.out.printf("ISBN\t도서명\t작가\t대여가능여부");
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp!=null) {
				if(temp.brental) // 해당도서의 도서대여여부가 true 이면
					System.out.println(temp.ISBN+"\t"+temp.bname+"\t"+temp.bwriter+"\t"+"대여가능");
				else // 해당도서의 도서대여여부가 false
					System.err.println(temp.ISBN+"\t"+temp.bname+"\t"+temp.bwriter+"\t"+"대여중");
			}	
		}

	}
		// 3. 도서대여
	void 도서대여(String loginid) {
		System.out.println("----------------------도서 대여 페이지----------------------");
		System.out.println("도서 ISBN :"); String isbn = Day07_5_BookApplication.scanner.next();
		
		int i= 0;
		for(Book temp: Day07_5_BookApplication.books) {
			if(temp !=null && temp.ISBN.equals(isbn)) {
				if(temp.brental) {
					System.out.println("해당 도서 대여 합니다.");
					Day07_5_BookApplication.books[i].brental = false;
					Day07_5_BookApplication.books[i].mid = loginid;
					return;
				}
				else {
					System.err.println("해당 도서 대여중 상태입니다.[대여불가]");
					return;
				}
			}
		}
		i++;
		System.out.println("동일한 도서가 없습니다.");
	}
		// 4. 도서반납
	void 도서반납(String loginid) {
		System.out.println("----------------------도서 반납 페이지----------------------");
		도서대여목록(loginid);
		System.out.println("도서 ISBN "); String isbn = Day07_5_BookApplication.scanner.next();
		
		int i =0;
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp !=null && temp.ISBN.equals(isbn)) { // 입력한 isbn이 있으면
				if(temp.mid.equals(loginid)) {//대여인과 현재 로그인된 사람이 동일하면
					if(temp.brental) {// 대여중이 아니면
						System.err.println("알림) 현재 도서가 대여중이 아닙니다.");
					}
					else { // 대여중이면
						System.out.println("알림) 반납 완료!!");
						Day07_5_BookApplication.books[i].brental = true;
						Day07_5_BookApplication.books[i].mid = null;
						return;
					}
				}
				else {
					System.out.println("회원님이 대여한 도서가 아닙니다.");
				}
			}
		}
		i++;
	}
	
	void 도서대여목록(String loginid) {
		System.out.println("----------------------도서대여 목록 페이지----------------------");
		System.out.printf("ISBN\t도서명\t작가\t대여가능여부");
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp!=null && temp.mid.equals(loginid)) {
					System.err.println(temp.ISBN+"\t"+temp.bname+"\t"+temp.bwriter+"\t"+"대여중");
			}	
		}
	}
	
		// 5. 도서등록
	void 도서등록() {
		System.out.println("----------------------도서 등록 페이지----------------------");
		// 1. 입력받는다[ISBN(도서번호), 도서명, 작가, 도서대여여부, 대여회원]
		System.out.println("도서번호 :"); 		String isbn = Day07_5_BookApplication.scanner.next();
		// 중복체크
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp != null && temp.ISBN.equals(isbn)) {
				System.out.println("알림) 현재 사용중인 도서번호입니다.");
				return; // 아이디가 중복되었기 때문에 false[가입실패]
			}
		}	
		System.out.println("도서명 :"); 	String bname = Day07_5_BookApplication.scanner.next();
		System.out.println("작가 :"); 		String bwriter = Day07_5_BookApplication.scanner.next();
		
		// 2. 객체화[도서대여여부 = true, 대여회원id =null]
		Book book = new Book(ISBN, bname, bwriter, true, null);
		
		// 3. 배열 대입[넣기]
		int i = 0;
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp == null) {
				Day07_5_BookApplication.books[i] = book;
				return; // 등록 성공시 메소드 종료
			}
			i++;
		}
	}		
		// 6. 도서삭제
	void 도서삭제() {
		System.out.println("----------------------도서 삭제 페이지----------------------");

	}
	
}
