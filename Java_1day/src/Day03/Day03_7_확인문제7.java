package Day03;

import java.util.Scanner;

public class Day03_7_확인문제7 {

	public static void main(String[] args) {
		// 공통 변수 [ 어디서든 사용할 수 이쓴 변수 ]
		boolean run = true; // 실행 여부 변수 / true=실행 false=종료
		
		int balance = 0; // 예금액[통장안에 있는 금액] 변수
		
		Scanner scanner = new Scanner(System.in); // 입력객체
		
		while( run ) { // while(조건식) {} : 무한루프
			System.out.println("---------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("---------------------");
			System.out.println("선택>"); 
			int 선택 = scanner.nextInt();
			
			if(선택==1) {System.out.println("예금액 :"); int 예금액 = scanner.nextInt();	balance += 예금액;}
			else if(선택==2) {
				System.out.println("출금액 :"); int 출금액 = scanner.nextInt();
				
				if(출금액>balance) System.out.println("알림) 잔액이 부족합니다.");
				else (balance -= 출금액;) System.out.println("");
			}
			else if(선택==3) { System.out.println("잔고 :"+balance); int 잔고 = scanner.nextInt();}
			else if(선택==4) { System.out.println("종료");}
			else System.out.println("알림)알수 없는 번호 입니다.");			
			
//		switch(선택) {
//			case 1 : System.out.println("1.예금"); break;
//			case 2 : System.out.println("2.출금"); break;
//			case 3 : System.out.println("3.잔고"); break;
//			case 4 : System.out.println("4.종료"); break;
//			default : System.out.println("중지");
//		}
			
		}
		
		System.out.println("프로그램 종료");
		
		
	}
	
}
