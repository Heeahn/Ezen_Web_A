package Day05;

import java.util.Scanner;

public class Day05_4_도서대여프로그램 {//cs

	public static void main(String[] args) {//ms
		
		//1. 준비
		Scanner scan = new Scanner(System.in);
		String[][]memberlist =	new String[100][2];
		String[][]booklist = new String[100][3];
		
		while(true) {
			
			System.out.println("-------[[ 회원제 도서대여 ]]------");
			System.out.println("1.회원가입     2. 로그인\n>>선택 : ");	int ch = scan.nextInt();
			
			if(ch==1) {
				System.out.println("ID : ");		String id = scan.next();
				System.out.println("Password : ");	String pw = scan.next();
				
				//중복 체크
				boolean idcheck = true;
				
				for(int i=0; i<memberlist.length; i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						System.err.println("동일한 아이디가 존재합니다 [재입력]");
						idcheck = false;
						break;
					}//if end
				}//중복체크 for end
				
				//정상입력
				for(int i=0; i<memberlist.length; i++) {
					if(idcheck) {
						memberlist[i][0] = id;
						memberlist[i][1] = pw;
						
						System.out.println("회원가입 완료!");
						break;
					}//if end
				}//회원가입 정상입력 for end
			}//ch==1 if end
			
			
			else if(ch==2) {
				System.out.println("-----[[ 로그인 ]]------");
				System.out.println("ID : ");		String id = scan.next();
				System.out.println("Password : ");	String pw = scan.next();
				
				boolean logincheck = false;
				
				for(int i=0; i<memberlist.length; i++) {
					
					if(logincheck==true) break;
					
					if(id.equals("admin")) {
						System.out.println("관리자 로그인");
						logincheck = true;
						
						while(true) {
							
							System.out.println("[[ 관리자 메뉴 ]]");
							System.out.println("1.도서 등록	2.도서 목록	3.도서삭제 4.로그아웃\n>>선택 : ");	int ch3 = scan.nextInt();
							
							if(ch3==1) {
								System.out.println("도서명 : ");		String title = scan.next();
								boolean bookcheck = true;
								
								for(int j=0; j<booklist.length; j++) {
									if(booklist[j][0] == null) {
										booklist[j][0] = title;
										break;
									}
									if(booklist[j][0] != null && booklist[j][0].equals(title)) {
										System.err.println("동일한 도서가 존재합니다. [재입력]");
										bookcheck = false;
										break;
									}
								}//for end								
							}//1.도서등록 if end
							
							else if(ch3==2) {
								System.out.println("-----[[ 도서목록 ]]-----");
								System.out.println("번호\t도서명");
								
								for(int j=0; j<booklist.length; j++) {
									if(booklist[j][0]!=null) {
										System.out.printf("%d\t%s\n", i, booklist[j][0]);
									}//if end
								}//for end
							}//2.도서목록 if end
							
							else if(ch==3) {}// 도서삭제
							
							else if(ch3==4) {
								System.out.println("로그아웃되었습니다.");
								break;
							}//3.로그아웃 if end
							
						}//관리자 while end
						
					}//admin if end
					
					if(memberlist[i][0]!=null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw)) {
						System.out.println("로그인 성공!");
						logincheck = true;
						
			////////////////////////////////////////////////////////////////////////////////
						
						while(true) {
							System.out.println("------[[ 도서 메뉴 ]]-------");
							System.out.println("1.도서 검색   2.도서 목록   3.도서 대여   4.도서 반납 5.로그아웃\n>>선택 : ");	int ch2 = scan.nextInt();
							
							if(ch2==1) {	//도서 검색
								System.out.println("도서명 : ");		String bookname = scan.next();
								
								for(int j=0; j<booklist.length; j++) {
									if(booklist[j][0] != null && booklist[j][0].equals(bookname)) {
										System.out.printf("%d\t%d\t%d \n", booklist[j][0], booklist[j][1],booklist[j][2]);
										}
									else	System.out.println("해당 도서가 없습니다.");
									break;
									}
								}
							
							else if(ch2==2) {
								System.out.println("----[[ 도서 목록 ]]-----");
								System.out.println("번호\t도서명\t대여여부\t대여자");
								
								for(int j=0; j<booklist.length; j++) {
									System.out.printf("%d\t%d\t%d \n", booklist[j][0], booklist[j][1],memberlist[j][2]);
									}
									break;
									}
							
							
							else if(ch2==3) {
								for(int j=0; j<booklist.length; j++) {
									System.out.printf("도서대여");
									}
							}//ch2==3 if end
							
							else if(ch2==4) {
								
								
							}//ch2==4 if end
							
							else if(ch2==5) {
								System.out.println("로그아웃되었습니다.");
								break;
							}

						}//로그인 후 무한루프 while end	
					}//if end
				}//로그인체크 for end				
			}//ch==2 if end
		}//while end		
	}//me
}//ce
