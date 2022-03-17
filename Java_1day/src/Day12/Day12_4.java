package Day12;

import java.util.Random;
import java.util.Scanner;

public class Day12_4 {

	// 차량번호 구분 프로그램
	// 조건
		// 1. 난수 0000~9999 사이의 난수 10개 생성해서 배열에 저장
		// 2. 모든 차량 번호를 배열에 저장
		// 3. 끝자리 번호로 홀/짝 구분
		// 4. 차량 끝자리의 번호가 홀수 차량 배열에 저장
		// 5. 차량 끝자리의 번호가 짝수 차량 배열에 저장
		// 6. 홀수차량 배열 출력 // 짝수 차량 배열 출력 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] carlist = new String[10];
		String[] evenlist = new String[10];
		String[] oddlist = new String[10];
		
		
		while(true){
			
			// 모든 차량 번호 출력
			System.out.println("\n*** 주차중인 모든 차량번호 ***");
			for(String temp : carlist) {
				if(Integer.parseInt(temp)%2==0) {
					for(int i =0;i<evenlist.length;i++) {
						if(evenlist[i]==null) {evenlist[i]=temp; break;}
					}
				}
				else {
					if(oddlist[i]==null) {oddlist[i]=temp; break;}
				}
			}
			
			// 홀수차량 번호 출력
			System.out.println("*** 주차중인 모든 홀수 차량번호 ***");
			
			// 짝수차량 번호 출력
			System.out.println("*** 주차중인 모든 짝수 차량번호 ***");
			
			System.out.println("1. 차량입차"); int ch = scanner.nextInt();
			
			if(ch==1) {
				Random random = new Random();
				int rn = random.nextInt(10000);
				String carNumber=String.format("%04d", rn);
				
				boolean full = false;
				for(int i =0;i<carlist.length;i++) { 
					if(carlist[i]==null) {carlist[i]=carNumber; full = true; break;}
				}
				if(full==false)System.err.println("만차[주차불가]");
			}
			
		}
				
	}
}
