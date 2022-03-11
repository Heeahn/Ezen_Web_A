package Day08;

import java.util.Scanner;

public class Day08_5 {

	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[1000];
	static Bank[] banks = new Bank[1000];
	static Loan[] loans = new Loan[1000];
	
	// 모바일 뱅크 프로그램[2인 과제]
	
	public static void main(String[] args) {
		Day08_5 bank = new Day08_5();
		bank.menu();
	}
	// 초기 메뉴 메소드
	
	void menu() {
		Member member = new Member();
			while(true) {
				System.out.println("----------------------------------------------");
				System.out.println("1. 회원가입 2 . 로그인 3. 아이디찾기 4. 비밀번호찾기 :");
				int ch = scanner.nextInt();		

				if(ch==1) {
					boolean result = member.회원가입();// 회원가입 메소드 호출
					if(result) System.err.println("회원가입 성공");
					else System.err.println("회원가입 실패");
				}
				
				else if(ch==2) {// 로그인 메소드 호출
					String result = member.로그인();
					if(result == null) {
						System.out.println("동일한 회원정보가 없습니다.");
					}
					else {
						if(result != null && result.equals("admin")) {
							System.out.println("안녕하세요."+result+"님"); 
							loanadmin();
						}
						else {
							System.out.println("안녕하세요."+result+"님"); 
							bankmenu(result);
							}
					}
				}
				else if(ch==3) {member.아이디찾기();}
					// 아이디 찾기 메소드 호출	
				else if(ch==4) {member.비밀번호찾기();}
					// 비밀번호 찾기 메소드 호출
				else {System.err.println("알림) 알수 없는 번호입니다.");}
		}
	}
	
	// 계좌 메소드
	void bankmenu(String loginid) {
		while(true) {
			System.out.println("----------------------------------------------");
			System.out.println("1. 계좌생성 2 .계좌목록 3. 입금 4. 출금 5. 이체 6.대출  선택:");
			int ch = scanner.nextInt();		
			Bank bank = new Bank();
			
			// 계좌생성
			if(ch==1) {
				bank.계좌생성(loginid);
			}
			// 계좌목록
			else if(ch==2) {
				bank.계좌목록(loginid);				
			}
			// 입금
			else if(ch==3) {
				bank.입금(loginid);
			}
			
			// 출금
			else if(ch==4) {
				bank.출금(loginid);
			}
			
			// 이체
			else if(ch==5) {
				bank.이체(loginid);
			}
			
			// 대출
			else if(ch==6) {
				loan(loginid);
			}
			
			// 그 외
			else {System.err.println("알림) 알수 없는 번호입니다.");}
		}
	}
	
	void loan(String loginid) {
		while(true) {
			System.out.println("----------------------대출 페이지------------------------");
			System.out.println("1.대출진행 2. 대출상환 3. 로그아웃  선택:");
			int ch = scanner.nextInt();	
			Loan loan = new Loan();
			
			if(ch==1) {
				loan.대출진행(loginid);
			}
			else if(ch==2) {
				loan.대출상환(loginid);
			}
			else if(ch==3) {
				return;
			}
			else {
				System.out.println("알수없는 번호입니다.");
			}
			
			
		}
	}
	
	void loanadmin() {
		while(true) {
			System.out.println("----------------------대출 페이지------------------------");
			System.out.println("1.대출 등록 2. 대출 고객 목록 3.대출삭제 4. 로그아웃 선택: ");
			int ch = scanner.nextInt();	
			Loan loan = new Loan();
			
			if(ch==1) {
				loan.대출등록();
			}
			else if(ch==2) {
				loan.대출고객목록();
			}
			else if(ch==3) {
				loan.대출삭제();
			}
			else if(ch==4) {
				return;
			}
			else {
				System.out.println("알수없는 번호입니다.");
			}
		
		
		}
	}
}
