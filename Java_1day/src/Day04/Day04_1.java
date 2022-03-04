package Day04;

import java.util.Scanner;

public class Day04_1 { // cs
	public static void main(String[] args) { // ms
		
		// 제어문 : if, switch
		// 반복문 : for[]. while[무한루프] 
			// 1. 초기값 2. 조건식 3. 증감식 4. 실행문
			// while 형태
			//		1. 초기값;
			//		while(2. 조건식) {
			//		4. 실행문;
			//		3. 증감식;
			//			}
		
		// for 예1)
		for(int i=1;i<=10;i++) {
			// * i는 1부터 10이하까지 1씩 증가하면서 실행문 반복처리 = 10번실행
			System.out.println(i+" ");
		}
		
		// while 예1)
		int i= 1; // 1. 초기값
		while(i<=10) { // 2. 조건식
			System.out.println(i +" "); //실행문
			i++; //3. 증감식
		} // w e
		
		//for 예2) 1~100 누적합계
		int sum = 0;
		for(int j=1;j<=100;j++) {
			sum += j;
		}
		System.out.println("for 1~100까지 누적합 :"+sum);
		
		//while 예2)
		int j= 1;
		int sum2 = 0;
		while(j<=100) {
			sum2 +=j;
			j++;
		}
		System.out.println("while 1~100까지 누적합 :"+sum2);
		
		//while 예3) 무한루프
		while(true) {
			System.out.println("무한루프");
			Scanner scanner = new Scanner(System.in);
			int exit = scanner.nextInt();
			if (exit==3)
			break; // 가장 가까운 반복문탈출[if 제외]
		}
		
		
		
		
		
		
		
		
	}//me
	
	
}//ce
