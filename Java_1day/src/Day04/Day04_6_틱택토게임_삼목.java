package Day04;

import java.util.Random;
import java.util.Scanner;

import javax.swing.text.PlainDocument;

//	삼목게임[틱택토 게임]

//		1. 9칸 생성
//			1. string[] 배열 = new string[9]

//		2. 사용자에게 0~8 인덱스번호 입력받기
//			1. 해당 인덱스에 O 표시
//			2. 이미 둔 자리는 재입력

//		3. 컴퓨터는 0~8 사이 난수 발생
//			1. 해당 인덱스에 x 표시
//			2. 이미 둔 자리는 재난수 생성

//		4. 승리판단
//			1. 가로 인덱스의 모양이 모두 동일하면 
//				012		345		678
//						첫번째 인덱스가 0부터 6까지 3씩 증가
//								두번째: 첫번째+1
//								세번째: 첫번째+2
//				2. 세로 인덱스의 모양이 모두 동일하면
//				036 		147		258
//				3. 대각선 인덱스들의 모양이 모두 동일하면
//				048		246

public class Day04_6_틱택토게임_삼목 {//CS
	public static void main(String[] args) {//MS
		Scanner sc = new Scanner(System.in); // 1. 입력객체
		String[] gameboard = {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
			// String 객체 9개를 저장할 수 있는 배열 선언
		
		String 승리알=""; // 3목 되었을 때 해당 알을 저장 변수
		
		// 게임 실행
		while (true) { // 무한루프가 종료조건 : 9칸 모두 알이 있을경우 2. 3목이 되었을때[승리자]
			// 게임판 출력[배열내 모든 인덱스 출
			for(int i=0;i<gameboard.length;i++) {
				System.out.print(gameboard[i]);
				if(i%3==2) System.out.println();
				// 배수찾기 : 값 % 수 == 0
				// 인덱스 2,5,8 이면 줄발꿈
			}
			////////////////////////////// 1. 플레이어 위치 선택////////////////////////////////////
			
			while(true) {
				System.out.print("\n위치 선택 :");			int place = sc.nextInt();
				if(gameboard[place].equals("[ ]")) {
					gameboard[place] = "[O]";			break;
				}
				else {
				System.err.println("알림) 해당 위치에 이미 알이 존재[재선택]");
				}	
			}//w2e
			/////////////////////////////// 2. 컴퓨터 난수 선택////////////////////////////////////
			while(true) {
				Random rd = new Random(); //1. 난수 객체 생성
				int place = rd.nextInt(9);		// 2. 0~8 사이의 난수 int형으로 가져오기
				if(gameboard[place].equals("[ ]")) {// 3. 해당 난수위치가 공백이면
					// 난수 위치에 공백이면 X 알 두기
					gameboard[place] = "[X]";			break; //4. 알을 두었으면 반복문 탈출 
				}
				
			}//w2e[난수가 공백위치를 생성했을 경우애 break;]
			
			/////////////////////////////// 3.  승리자 판단    //////////////////////////////////////
			// 1. 가로로 이기는 수
			for(int i=0;i<=6;i+=3) {
				if(gameboard[i].equals(gameboard[i+1])&&gameboard[i+1].equals(gameboard[i+2])) {
					승리알=gameboard[i]; // 동일한 알을 승리알 변수에 대입
				}
			}
			// 2. 세로로 이기는 수
			for(int i=0;i<=2;i++) {
				if(gameboard[i].equals(gameboard[i+3])&&gameboard[i+3].equals(gameboard[i+6])) {
					승리알=gameboard[i]; // 동일한 알을 승리알 변수에 대입
				}
			}
			// 3.  대각선으로 이기는 수
			if(gameboard[0].equals(gameboard[4])&&gameboard[4].equals(gameboard[8])) {
				승리알 = gameboard[0];
			}
			if(gameboard[2].equals(gameboard[4])&&gameboard[4].equals(gameboard[6])) {
				승리알=gameboard[2];
			}
	
		/////////////////////////////////4. 게임종료//////////////////////////////////////
			
			if(승리알.equals("[O]")) {
				System.err.println("플레이어 승리");	break;
			}
			if(승리알.equals("[X]")) {
				System.err.println("컴퓨터 승리"); break;
			}
		}//w1e
		/////////////////////////////////5. 무승부 출력//////////////////////////////////////

		
		/////////////////////////////////6. 게임보드 출력//////////////////////////////////////
	
		for(int i=0;i<gameboard.length;i++) {
			System.out.print(gameboard[i]);
			if(i%3==2) System.out.println();
		}
			
	}//ME
}//CS
