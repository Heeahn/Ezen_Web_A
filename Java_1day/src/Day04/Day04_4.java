package Day04;

public class Day04_4 {
	public static void main(String[] args) {
		
		// 데이터 저장 1개  => 변수
		//	배열 [ 특정(인덱스) 기준으로 나열]
			//* 여러개 변수를 저장/관리
			//1. 인덱스 : 저장되는 순서번호[ 0번 시작 ~]
			//2. [ ] : 대괄호 사용한다.
			//3. 동일한 자료형을 여러 번수를 관리
		
		// 선언
			// 1. 자료형[] 배열명;		2. 자료형 배열명[]
			// 3. 자료형[] 배열명 = {데이터1, 데이터2, 데이터3,~~}
			// 4. 자료형[] 배열명 = new 자료형[길이]
				// 길이 : 배열내 저장할 변수 개수
		
		// 데이터 호출
			// * 배열명: 배열 메모리 주소값
			// 1. 배열명[인덱스번호]	: 해당 인덱스번호의 데이터 호출
		
		// 데이터 변경 
			// 1. 배열명[인덱스번호] = 새로운 데이터
			// 
		
		
		// p. 153 예1)
			
		int[] scores = {83,52,87};
			// 1. int[] : int형 데이터 여러개를 저장할 수 있는 배열 선언
			// 2. scores : 배열이름[아무거나]
			// 3. {데이터1, 데이터2, 데이터3 ~~} : 배열에 값 추가
		//* 83,90,87 이라는 int형 데이터 3개를 저장하는 배열 선언
			// 83 -> 0번 인덱스에 저장
			// 90 -> 1번 인덱스에 저장
			// 87 -> 2번 인덱스에 저장
		
		// 배열 출력
		
		System.out.println("scores  // : "+ scores); // 배열이름 호출 -> 메모리 주소값
		System.out.println("scoess[0] :"+scores[0]); // 0번째 인덱스의 데이터 호출
		System.out.println("scores[1] :"+scores[1]);
		System.out.println("scores[2] :"+scores[2]);
		
		// 반복문과 배열 활용
		int sum=0;
		for(int i=0;i<3;i++) {
			System.out.println("scores["+i+"] :"+scores[i]);
			sum += scores[i]; // 배열명[인덱스번호]
		}
		
		System.out.println("총합 :"+sum);
		double avg = sum/3;
		System.out.println("평균 :"+avg);
		
		//예제2)
		int[] 정수배열1 = new int[3];
			// int[] : int형 배열 선언
			// 정수배열1 : 배열이름[아무거나]
			// new : 메모리할당(객체, 배열에서 사용)
			// int[3] : 자료형[길이] : 저장개수
		//* int형 변수 3개를 저장할 수 있는 배열 선언[메모리할당]
		for(int i=0;i<3;i++) {
			System.out.println(정수배열1[i]);
		}
		// 데이터 넣기
		정수배열1[0] = 100;		정수배열1[1] = 93;		정수배열1[2]=20;
				
		// 데이터 넣기후
		for(int i=0;i<3;i++) {
			System.out.println(정수배열1[i]);
		}
		
		
		
		
		
		
		
		

		
	}
}
