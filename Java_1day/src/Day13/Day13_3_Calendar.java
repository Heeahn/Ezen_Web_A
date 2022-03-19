package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3_Calendar {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("연도 :"); int year = scanner.nextInt();
		System.out.println("월 :"); int month = scanner.nextInt();

		달력(year, month);
	}
	
	public static void 달력(int year, int month) {
		while(true) {
			// 1. 캘린더 클래스내 현재 날짜/시간 객체 호출
			Calendar calendar = Calendar.getInstance();
		
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			//* 해당 월의 1일의 요일찾기
				// 1. 사용자 정의 캘린더 설정
				calendar.set(year, month-1,1); // 예) 3월 1일
				// 2. 3월1일의 요일
				int sweek = calendar.get(Calendar.DAY_OF_WEEK);
				// 3. 3월의 마지막 일
				int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
				
			//3. 출력
			System.out.println("*********************"+year+"년"+month+"월*********************");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			//* 현재 월 1일의 위치 앞에 공백 채우기
			for(int i=1; i<sweek; i++) {
				System.out.print("\t");
			}
			// 1일부터 마지막날까지 출력
			for(int i=1; i<=eday; i++) {
				System.out.print(i+"\t");
				if(sweek%7==0) System.out.println();//토요일마다 줄바꿈처리[토요일=7] 요일이 7배수마다
				sweek++; // 하루씩 요일 증가
			}	
			
			//버튼[1.◀(이전달) 2.▶(다음달) 3. 다시검색]
			try {
				System.out.println("\n\n***[1.◀(이전달) 2.▶(다음달) 3. 다시검색 4. 종료 선택]***");
				int ch = scanner.nextInt();
				
				if(ch==1) {
					month-=1;
					if(month == 0) {
						year-=1; month=12;
					}
				}
				else if(ch==2) {
					month+=1; 
					if(month==13) {
						month=1; year+=1;
					}
				}
				else if(ch==3) {
					System.out.println("연도 :");  	year = scanner.nextInt();
					System.out.println("월 :");  		month = scanner.nextInt();
				}
				else if(ch==4) {
					System.err.println("알림]] 달력 프로그램 종료");
					break;
			}
			else System.err.println("알림]] 알수 없는 번호입니다.");
			}catch(Exception e) {
				System.err.println("경고]] 정상적인 입력을 해주세요[관리자에게 문의]");
			}
		}
	} // 달력 메소드 end
}// class end
