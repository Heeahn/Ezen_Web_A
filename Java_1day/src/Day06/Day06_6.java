package Day06;

import java.util.Scanner;

public class Day06_6 {//cs

	public static void main(String[] args) {//ms
		
		//준비 [모든 {} 안에서 사용되는 변수 선언]
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100];
				//* Board 객체를 100개를 저장할 수 있는 1차원 배열 선언
		
		while(true) {
			
			System.out.println("--------------------커뮤니티------------------");
			//////////////////////////////////모든 게시물 조회/////////////////////////////////////
			System.out.println("번호\t작성자\t제목");
				//배열내 모든 객체(게시물) 출력 반복문
				int index=0; // 인덱스 변수[배열내 객체 수 체크]
				for(Board board:boardlist) {// 배열내 모든 객체(게시물) 출력 반복문
					if(board!=null) {// 만약에 해당 board 객체가 내용물이 있으면 출력
						System.out.printf("%d\t%s\t%s \n",index,board.writer,board.title);
					}
					index++; // 인덱스 증가
				}
				///////////////////////////////////////////////////////////////////////
			System.out.println("1. 글쓰기 2.글보기");
			int ch = scanner.nextInt();
			
			if(ch==1) { // 1. 글쓰기
				//////////////////////////////////글쓰기/////////////////////////////////////
				System.out.println("-----------------------글쓰기 페이지-----------------------");
				System.out.println("title :"); 				String title = scanner.next();
				System.out.println("content :"); 		String content = scanner.next();
				System.out.println("writer :"); 			String writer = scanner.next();
				System.out.println("password :"); 	String password = scanner.next();
				//2. 4개 변수를 객체화[객체를 만들어서 4개변수를 객체내 필드에 저장]
				Board board = new Board(title, content, writer, password);
										// 4개 필드를 갖는 생성자 사용
				// 3. 배열내 빈공간을 찾아서 빈공간에 객체 대입
				int i = 0;
				for( Board temp:boardlist) {
					if(temp==null) { 
						boardlist[i] = board;
						break;
					}
					i++;
				}
				///////////////////////////////////////////////////////////////////////////			
			}
			else if(ch==2) {// 2. 글 보기
				System.out.println("게시물 번호 선택 : "); int bno = scanner.nextInt();
				System.out.println("-------------------------계시물 상세페이지-----------------------");
				// 반복문 사용 목적X -> 출력할위치[인덱스] 입력 받았기 때문에 -> 입력받은 인덱스 위치에 객
				System.out.printf("작성자: %s	제목 : %s \n", boardlist[bno].writer, boardlist[bno].title);
				
				System.out.printf("내용 : %s \n", boardlist[bno].content);
				System.out.println("--------------------------------------------------------------");
				System.out.print("1. 목록보기(뒤로가기) 2.글삭제 3. 글수정 선택 : "); int ch2 =scanner.nextInt();
				
				if(ch2==1) { }
				else if(ch2==2) {// 2. 글 삭제
			////////////////////////////////글 삭제///////////////////////////////////////////			

					System.out.println("현 게시물 비밀번호: "); String password = scanner.next();
					// 반복문X 검색X=> 삭제할 인덱스 위치를 입력받았기 때문에
					if(boardlist[bno].password.equals(password)) {
						System.out.println("알림) 삭제 성공");
						boardlist[bno]=null;
						// 삭제후에 삭제된 인덱스 뒤로 한칸식 앞으로 이동
						// 왜? 만약에 해당 코드가 없을 경우 배열내 공백 발생
						for(int i =bno;i<boardlist.length;i++) {
												// 배열길이 = 100 인덱스: 0~99
							//* 검색된 게시무르이 인덱스부터 마지막인덱스까지 1씩증가
							if(i==boardlist.length-1) boardlist[boardlist.length-1] =null;
							//i가 마지막인덱스와 같으면 마지막인덱스에는 null 대입
							else	boardlist[i] = boardlist[i+1]; // 삭제된 게시물 다음 게시물
						// i가 마지막인덱스와  같으면 마지막 인덱스에는 null 대입
						}
					}
					else {
						System.err.println("알림) 비밀번호가 다릅니다.[삭제실패]");
					}
				
			///////////////////////////////////////////////////////////////////////////////			

				}
				else if(ch2==3) {// 3. 글 수정 

					System.out.println("현 게시물 비밀번호: "); String password = scanner.next();
					// 반복문X 검색X=> 삭제할 인덱스 위치를 입력받았기 때문에
					if(boardlist[bno].password.equals(password)) {
						System.out.println("알림) 수정할 제목 : "); boardlist[bno].title = scanner.next();
						System.out.println("알림) 수정할 내용 : "); boardlist[bno].content = scanner.next();
						System.err.println("알림) 글이 수정되었습니다.");
					}
					else {
						System.err.println("알림) 비밀번호가 다릅니다.[수정실패]");
					}
					
				}
				else {
					System.err.println("알림) 알수 없는 번호입니다.");
				}
				
				
			}
			else {
				System.err.println("알림) 알수 없는 번호입니다.");
			}
			
		}
		
	}//me
}//ce
