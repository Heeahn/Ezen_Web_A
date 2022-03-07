package Day05;

import java.util.Scanner;

public class Day05_3_p181 {
	public static void main(String[] args) {
		
		//p.181
			// 1.
			// 2.
			// 3. 2 : 객체 비교시 equals  메소드 사용
			// 4. 2 : 길이가 없을 경우 값 대입 불가
			// 5. 3 : boolean 초기값은 false
			// 6. 3,5
			// 		{1행},	{2행},	{3행}
			//		{78 83 93 87 88} => 5
			// 7. 
		
		int max = 0;// 최대값 저장하는 변수
		int[] array = {1,5,3,8,2}; // 선언+초기값 선언
		
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) max=array[i];
		}
		
		System.out.println("max :"+max);
		
			//8.
		int[][] array2 = {	
				{95,86}, 
				{83,92,96}, 
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int count = 0;
		
		//풀이
		for(int i=0; i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++) {
				sum+=array2[i][j];
			}
			count += array2[i].length;
		}
		
		avg= (double)sum/count;
		
		System.out.println("sum :"+sum);
		System.out.println("avg :"+avg);
		
			//9.
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.학생수 2. 점수임력 3. 점수리스트 4. 분석 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) { // 학생수 입력받기
				System.out.println("학생수>"); studentNum = scanner.nextInt(); // 학생수 입력받기
				scores = new int[studentNum];	// 입력받은 학생수만큼 배열길이 선언
				
			}
			else if(selectNo == 2) {// 학생 점수 입력받기
				for(int i=0;i<scores.length;i++) { // 배열내 모든 인덱스만큼 반복처리
					System.out.printf("점수[%d] : \n", i);
					scores[i] = scanner.nextInt(); // 입력받아 i번째 입력받아 출력
				}
			}
			else if(selectNo == 3) { // 학생 점수 출력하기
				for(int i=0;i<scores.length;i++) {
					System.out.printf("scores[%d] : %d \n",i,scores[i]);
				}
			}
			else if(selectNo == 4) {
				int max1 = 0;
				int score =0;
				double avg1 = 0.0;
				
				for(int i=0;i<scores.length;i++) {
					//최고점수구하기
					if(max1<scores[i]) max1 = scores[i];	
					score +=scores[i];
				}
				
			//평균점수구하기
				avg1 = (double)score/scores.length;
				
				System.out.println("최고 점수 :"+max1);
				System.out.println("평균 점수 :"+avg1);
				
			}
			else if(selectNo == 5) {
				run=false;
			}
			
		}
		
		System.out.println("프로그램 종료");
		
	}
}
