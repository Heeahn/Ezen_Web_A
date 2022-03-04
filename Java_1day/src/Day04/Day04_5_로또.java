package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_5_로또 {
	public static void main(String[] args) {
		
		//준비
		int[] 사용자번호 = new int[6]; // 사용자가 선택한 번호 목록
		int[] 추첨번호 = new int[6];	// 컴퓨터의 난수 번호 목록
		Scanner scanner = new Scanner(System.in);
		
	
		
		//1. 사용자에게 입력받기
		for(int i=0;i<6;i++) {//fs
				// i는 0부터 5까지 1씩 증가반복 => 6회 반복
			System.out.print("1~45 사이입력 :");
			boolean pass=true;
			int 번호 = scanner.nextInt();
			
			//조건 1
			if(번호<1||번호>45) {//is
				// 1보다 작거나 45보다 크면 선택할 수 없는 번호입력시 재입력
				System.err.println("알림) 선택할 수 없는 번호입니다.[재입력]");
				i--; // 현재 i는 정상입력x
				pass=false; // 저장x
			}// i e
			
			//조건2 (중복체크)
				// 1. 배열내 모든 인덱스 호출
			for(int j=0;j<6;j++) {
				if(번호 == 사용자번호[j]) {
					// 2. 입력받은 값과 j번째 인덱스값과 같은지 비교
					System.err.println("알림) 이미 선택한 번호 입니다.[재입력]");
					i--; // 현재 i는 정상입력x
					pass=false; // 저장x
				}//ie
			}//f2e			
			// 정상입력 이면 배열에 저장하기
			if(pass==true)사용자번호[i] = 번호;
			
		}// fe
		
		System.out.print("\n사용자가 선택한 번호 :\n");
		//* 사용자 배열내 모든 인덱스 출력
		for(int temp:사용자번호) {
			System.out.print("["+temp+"]");
		}
		
		//2. 컴퓨터가 난수 생성
		
		System.out.println("\n--------------------------------");
		
		for(int i=0;i<6;i++) {//fs
			// i는 0부터 5까지 1씩 증가반복 => 6회 반복
			Random rd = new Random();
			int 추첨 = rd.nextInt(45)+1;
			
			// 조건 1: 중복 체크
			boolean pass=true;
			for(int temp: 추첨번호) {
				if(추첨 == temp) {
					i--;
					pass=false;
				}
			}
			if(pass) 추첨번호[i] = 추첨;
		}

			System.out.print("\n추첨번호 :\n");
				//* 사용자 배열내 모든 인덱스 출력
			for(int temp : 추첨번호) {
			System.out.print("["+temp +"]");
			}

			//3. 비교 = 두 배열간 동일한 수 찾기
				// 352
				// 831
			int 동일한수 =0;
			// 방법1
//			for(int i=0; i<사용자번호.length; i++) {
//				// i 비교 기준점
//				for(int j=0; j<추첨번호.length ; j++) {
//					//j 비교대상
//					if( 사용자번호[i] == 추첨번호[j]) {
//						//사용자 배열내 i번째 인덱스 와 
//						//컴퓨터 배열내 j번째 인덱스 의 수가 동일하면 
//						동일한수++;
//					}
//				}
//			}
			//방법2
			
			for(int 비교기준 : 사용자번호) {
				for(int 비교대상 : 추첨번호) {
					if(비교기준 == 비교대상) 동일한수++;
				}
			}
			
			System.out.println("\n동일한수 :" + 동일한수);
			
			
		}	//ms
		
	}//cs

