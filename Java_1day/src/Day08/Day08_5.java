package Day08;

import java.util.Scanner;

public class Day08_5 {

	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[1000];
	static Bank[] banks = new Bank[1000];
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
						System.out.println("안녕하세요."+result+"님"); 
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
	void bank() {
		Member member = new Member();
		Bank bank = new Bank();
		
		while(true) {
			System.out.println("----------------------------------------------");
			System.out.println("1. 계좌생성 2 .계좌목록 3. 입금 4. 출금 5. 이체 6. 대출  선택:");
			int ch = scanner.nextInt();		
			// 계좌생성
			if(ch==1) {}
			// 계좌목록
			else if(ch==2) {}
			// 입금
			else if(ch==3) {}
			// 출금
			else if(ch==4) {}
			// 이체
			else if(ch==5) {}
			// 대출
			else if(ch==6) {}
			// 그 외
			else {System.err.println("알림) 알수 없는 번호입니다.");}
		}
	}
}
