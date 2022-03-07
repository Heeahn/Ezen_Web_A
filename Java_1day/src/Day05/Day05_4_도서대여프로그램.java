package Day05;

import java.util.Scanner;

public class Day05_4_도서대여프로그램 {//cs

	public static void main(String[] args) {//ms
		
		//1. 준비
		Scanner scan = new Scanner(System.in);
		String[][]memberlist =	new String[100][2];
		String[][]booklist = new String[100][3];
		
		String 가능 = "대여가능";
		String 불가능 = "대여중";
		
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
						
						System.err.println("회원가입 완료!");
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
						System.err.println("관리자 로그인");
						logincheck = true;
						
						while(true) {
							System.out.println("[[ 관리자 메뉴 ]]");
							System.out.println("1.도서 등록     2.도서 목록     3.도서 삭제    4.로그아웃\n>>선택 : ");	int ch3 = scan.nextInt();
							
							if(ch3==1) {
								System.out.println("도서명 : ");		String title = scan.next();
								boolean bookcheck = true;
								
								for(int j=0; j<booklist.length; j++) {
									if(booklist[j][0] == null) {
										booklist[j][0] = title;
										booklist[j][1] = 가능;
										System.err.println("도서를 등록하였습니다");
										break;
									}//if end
									
									if(booklist[j][0] != null && booklist[j][0].equals(title)) {
											System.err.println("동일한 도서가 존재합니다 [재입력]");
											bookcheck = false;
											break;
									}//if end
								}//for end
							}//1.관리자 도서등록 if end
							
							
							else if(ch3==2) {
								System.out.println("-----[[ 도서목록 ]]-----");
								System.out.println("번호\t도서명");
								
								for(int j=0; j<booklist.length; j++) {
									if(booklist[j][0]!=null) {
										System.out.printf("%d\t%s\n", j, booklist[j][0]);
									}//if end
								}//for end
							}//2.도서목록 if end
							
							else if(ch3==3) {
								
								
							}//3.도서삭제 if end
							
							else if(ch3==4) {
								System.err.println("로그아웃 되었습니다");
								break;
							}//4. 로그아웃 if end
							
						}//관리자 while end
					}//admin if end
					
					if(memberlist[i][0]!=null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw)) {
						System.err.println("로그인 성공!");
						logincheck = true;
						
			////////////////////////////////////////////////////////////////////////////////
						
						while(true) {
							System.out.println("------[[ 도서 메뉴 ]]-------");
							System.out.println("1.도서 검색    2.도서 목록    3.도서 대여    4.도서 반납     5.로그아웃\n>>선택 : ");	int ch2 = scan.nextInt();
							
							if(ch2==1) {	//도서 검색
								System.out.println("도서명 : ");		String bookname = scan.next();
								
								boolean sw = true;
								for(int j=0; j<booklist.length; j++) {
									if(booklist[j][0] != null && booklist[j][0].equals(bookname)) {
										System.err.println("도서명\t도서대여여부\t대여자");
										System.out.println("----------------------");
										System.out.printf("%s\t%s\t%s\n\n", booklist[j][0],booklist[j][1],booklist[j][2]);
										sw = false;
										break;
									}//if end
									
								}//for end
								
								if(sw) System.out.println("동일한 도서가 없습니다.");
								
							}//ch2==1 if end
							
							
							else if(ch2==2) {
								System.out.println("------[[ 도서 목록 ]]-------");
								System.out.println("번호\t도서명\t대여여부\t대여자");
								
								for(int j=0; j<booklist.length; j++) {
									if(booklist[j][0]!=null) {
										System.out.printf("%d\t%s\t%s\t%s\n\n", j,booklist[j][0],booklist[j][1],booklist[j][2]);
									}
								}//for end
							}//ch2==2 if end
							
							else if(ch2==3) {
								
								System.out.println("대여할 도서명 : "); 	String bookname2 = scan.next();
								
								for(int j=0; j<booklist.length; j++) {
									if(booklist[j][0].equals(bookname2)) {
										if(booklist[j][1].equals(가능)) {
											System.err.printf("%s를 대여하였습니다\n", booklist[j][0]);
											booklist[j][1] = 불가능;
											booklist[j][2] = id;
											break;
										}//대여가능여부 if end
										
										else {
											System.err.println("대여중입니다.");
											break;
										}//
									}//같은도서명 찾기 if end
								}//도서대여 for end
								
							}//ch2==3 if end
							
							else if(ch2==4) {

								System.out.println("반납할 도서명: "); String bookname3 = scan.next();
								
								for(int j=0; j<booklist.length; j++) {
									if(booklist[j][0].equals(bookname3)) {
										if(booklist[j][1].equals(불가능)) {
											if(booklist[j][2].equals(id)) {
											System.err.printf("%s를 반납하였습니다.\n", booklist[j][0]);
											booklist[j][1] = 가능;
											booklist[j][2] = null;
											break;
											}
											else {
												System.err.println("대여자가 다릅니다.");
												break;
											}
										}//대여가능여부 if end
										
										else {System.err.println("알수없는 도서입니다.");
											break;
										}

									}//같은도서명 찾기 if end
								}//도서대여 for end
							}//ch2==4 if end
							
							else if(ch2==5) {
								System.err.println("로그아웃되었습니다.");
								break;
							}//ch2==4 if end
							
							else {
								System.err.println("잘못된입력입니다.");
								break;
							}//잘못된입력 else end
						}//로그인 후 무한루프 while end	
					}//if end
				}//로그인체크 for end
			}//ch==2 if end
		}//while end		
	}//me
}//ce
