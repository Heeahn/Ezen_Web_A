package Day09;

import java.util.Scanner;

public class Day09_6_은행계좌프로그램 {

	// 은행계좌프로그램[상속]
		// 은행[super]
		// 국민은행[sub], 신한은행[sub], 하나은행[sub]
		// 주 기능 : 1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 내계좌목록 6. 대출
	
	//** main 밖에서 선언하는 이유
		//* 모든 클래스에서 사용하기 위해 static 배열로 선언
		// static 변수는 프로그램 시작시 메모리할당 -> 프로그램 종료시 메모리 할당
	public static Bank[] 계좌리스트 = new Bank[100];
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {// 프로그램 무한루프[종료조건x]
			System.out.println("---------------계좌 시스템---------------");
			System.out.println("1.계좌생성 2. 입금 3. 출금 4. 이체 5. 계좌목록 6. 대출 선택 :");
			int ch = scanner.nextInt();
			
			BankContlor bankContlor = new BankContlor(); // 컨트롤러 메소드 호출
			
			if(ch==1) {
				//입력
				System.out.println("+++ 계좌등록 페이지 +++");
				System.out.println("비밀번호 :"); String bankPassword = scanner.next();
				System.out.println("계좌주 :");	String bankid = scanner.next();
				System.out.println("은행선택 <1.국민 2. 신한 3. 하나> : ");	int bn = scanner.nextInt();
				// 컨트롤러 연결
				String bankNumber = bankContlor.계좌생성(bankPassword, bankid, bn); // 메소드 호출[인수3개]
				// 메소드 반환 저장 = 계좌번호 혹은 null
				// 메소드 실행후 메시지 출력
				if(bankNumber!=null) {
					System.out.println("***계좌 생성***");
					System.out.println("고객님의 계좌번호 :"+bankNumber);
				}
				else {
					System.out.println("알림] 계좌등록 실패(관리자에게 문의)");
				}
			}
			else if(ch==2) {
				System.out.println("+++ 입금 페이지 +++");
				System.out.println("계좌번호 입력 :"); String bankNumber = scanner.next();
				System.out.println("금액입력 : "); int bankMoney = scanner.nextInt();
				
			Boolean result = bankContlor.입금(bankNumber, bankMoney);
				
				if(result) {
					System.out.println("**입금성공**");
				}
				else {
					System.err.println("알림)입금에 실패하였습니다.");
				}
			}
			else if(ch==3) {
				System.out.println("+++ 출금 페이지 +++");
				System.out.println("계좌번호 입력 :"); String bankNumber = scanner.next();
				System.out.println("비밀번호 입력 :"); String bankPassword = scanner.next();
				System.out.println("금액입력 : "); int bankMoney = scanner.nextInt();
				
			int result = bankContlor.출금(bankNumber,bankPassword, bankMoney);
				
				if(result ==1) {
					System.out.println("**잔액 부족**");
				}
				else if(result == 2){
					System.err.println("**출금 성공**");
				}
				else if(result ==3) {
					System.out.println("** 올바른 정보가 아닙니다. **");
				}
				else System.out.println("올바른 정보가 아닙니다.");
			}
			else if(ch==4) {
				System.out.println("+++ 이체 페이지 +++");
				System.out.println("내 계좌번호 입력 :"); String myBankNumber = scanner.next();
				System.out.println("비밀번호 입력:"); String bankPassword = scanner.next();
				System.out.println("이체 금액 입력:"); int bankMoney = scanner.nextInt();
				System.out.println("받는 계좌번호 입력 : "); String yourBankNumber = scanner.next();
				
				int result = bankContlor.이체(myBankNumber, bankPassword, bankMoney, yourBankNumber);
				
				if(result == 1) {
					System.out.println("**잔액부족**");
				}
				else if(result == 2) {
					System.out.println("**이체 성공**");
				}
				else if(result == 3) {
					System.out.println("** 받는 계좌 정보가 없습니다.**");
				}
				else if(result == 4) {
					System.out.println("** 보내는 계좌 정보가 없습니다.**");
				}
				
			}
			else if(ch==5) {
				System.out.println("+++ 내 계좌목록 페이지 +++");
				System.out.println("계좌주 :"); String bankid = scanner.next();
				Bank[] myBanklist = bankContlor.계좌목록(bankid);
				
				System.out.println("*** 검색한 계좌주 님의 계좌목록 ***");
				int i =1;
				for(Bank temp : myBanklist) {
					if(temp !=null) { 
						System.out.println(i+"번 계좌번호 :"+temp.getBankNumber());
						System.out.println(i+"번 잔액"+temp.getBankmoney());
					}
					i++;
				}
				
			}
			else if(ch==6) {
				System.out.println("+++ 대출 페이지 +++");
			}
			else {
				System.err.println("알림) 알수없는 번호입니다.");
			}
				
		}
		
		
		
	}
	
}
