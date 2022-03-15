package Day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Day10_5_도서관리_리스트버전 {
	
	public static void main(String[] args) {
		// 1. 리스트[객체] 생성
		ArrayList<Book> booklist = new ArrayList<>();
//	리스트클래스<리스트안에 저장할 클래스>
		//<클래스> : 해당 클래스의 여러 객체를 리스트에 저장
		// 길이는 가변 [기본 : 10]
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1.등록 2.목록 3.삭제 4.수정");	
			int ch = scanner.nextInt();
			if(ch==1) {
				// 1. 입력받기
				System.out.println("도서명 :"); String bookname = scanner.next();
				System.out.println("저자 :"); String writer = scanner.next();
				// 2. 객체화[여러개 변수 ---> 1개 객체]
				Book book = new Book(bookname,writer);
				
				// 3. 배열저장[공백을 찾아서] vs 리스트
				booklist.add(book); // 리스트에 저장
				// ?????? : .add(객체명) 
					// 마지막 인덱스에 자동적으로 객체가 추가
				
			}
			else if(ch==2) {
				// 1. 배열[null 제외] vs 리스트
				System.out.println("도서명 \t 저자");
				for(Book book : booklist) {
					System.out.println(book.getBookName()+"\t"+book.getWriter());
				}
			}
			else if(ch==3) {
				// 1. 배열[ 삭제후에 뒤 인덱스 당기기] vs 인덱스[자동]
				// 	1 2 3 [2삭제] 1 null 3			vs 1234 [2삭제] 134
				System.out.println("삭제할 도서명 :"); String bookName = scanner.next();
				// 도서찾기
				for(Book book : booklist) {
					if(book.getBookName().equals(bookName)) {
						booklist.remove(book); 
						break; // 삭제 성공했으면 반복문 탈출
					}
				}
			}
			else if(ch==4) {
				System.out.println("수정할 도서명 : "); String bookName = scanner.next();
				for(Book book : booklist) {
					if(book.getBookName().equals(bookName)) {
						System.out.println("수정 저자: "); String writer = scanner.next();
						book.setWriter(writer);
					}
				}
			}
		}		
	}
}
