package Day01;

import java.util.Scanner; // import : 가져오다

public class Day01_4 { // c s

	public static void main(String[] args) { // m s
		
		// 예제1 : 한명의 이름, 1교시, 2교시, 3교시 출석여부를 입력받아 출력
			// 입력 -> 저장 -> 출력
		// 1. 입력객체 선언
		Scanner JS = new Scanner(System.in);
		
		// 2. 입력받을 데이터 안내
		System.out.println("이름 : ");
		
		// 3. 입력받은 데이터 가져오기 -> 다른곳(String:문자열)에 저장
		String 이름 = JS.next();
			//  = 대입( 오른쪽값이 왼쪽 저장[대입] )

			// 안내 출력							// 입력받아 다른 객체로 저장
		System.out.println("1교시 : ");		String 교시1 = JS.next();
		System.out.println("2교시 : ");		String 교시2 = JS.next();
		System.out.println("3교시 : ");		String 교시3 = JS.next();
		
		// 4. 출력
		System.out.println("\t\t[[출석부]]");
		System.out.println("----------------------------------------");
		System.out.println("이름\t1교시\t2교시\t3교시\t비고");
		System.out.println( 이름 +"\t"+ 교시1 +"\t" + 교시2 +"\t" +교시3);
		System.out.println("----------------------------------------");
		
		
	} // m e
} // c e
