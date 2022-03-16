package Day11;

public class Day11_2 {//cs

	//p. 422
		// 컴퓨터의 하드웨어 문제를 에러 [실행불가능]
		// 사용자의 잘못된 조작 or 개발자의 잘못된 코딩의 에러의 예외
		// 종류 : 1. 일반예외 2. 실행예외
			// 일반예외 : 컴파일[실행]전에 예외 검사 [ 개발자에게 강제 예외처리 안내(실행전)]
			// 실행예외 : 컴파일[실행]후에 예외 검사 [ 개발자의 경험을 통해 판단해서 예외처리]
		// 예외처리
			//목적 : 에러가 발생하면 프로그램은 종료된다. ! [안정성문제]
			// 만약에 에러가 발생하면 대체 코드가 실행[ 프로그램이 종료되지 않게]
	
	public static void main(String[] args) {//ms
		
		//p. 423[NullPointerException]
		try { // ts
			String data = null;
			System.out.println(data.toString()); // Object클래스 메소드 : toString() : 객체정보출력
					// 실행전에는 에러 없다.
			// 에러가 발생하는 이유 : null은 메모리가 없기 때문에 객체정보 출력 불가
		} // t e
		catch(NullPointerException exception) {//cs
			System.out.println("예외발생 :"+exception);
		}//ce
		
		// p.424 [ArrayIndexOutOfBoundsException]
		try {
			String[] 배열 = new String[2]; //String 2개를 저장할 수 있는 배열
			배열[0] = "a";
			배열[1] = "b";
			배열[2] = "c";
		}catch(ArrayIndexOutOfBoundsException e) {
							//예외발생한 예외클래스명 객체명 = 객체에 예외 이유가 저장됨
			// 만약에 예외가 발생하면 실해되는코드
			System.out.println("예외발생 :" + e);
		}
		
		// p.426
		try {
			String data1 = "100";
			String data2 = "a100";
			int value1 = Integer.parseInt(data1); // "100" -> 100
			int value2 = Integer.parseInt(data2);  // "a100" -> X[a는 정수로 표현불가능]
							//Integer.parseInt(문자열);  문자열 -> 정수
			// 오류발생 이유 : 문자열내 숫자형식은 변환이 가능하지만 문자열내 문자형식 변환이 불가능
			// 오류가 발생하면 catch로 이동 [오류 발생 이후 코드 실행x]
			int result = value1 + value2;
			System.out.println(data1+"+"+data2+"="+result);
		}catch(NumberFormatException e) {
			System.out.println("오류발생 :"+e);
		}
		
		//p. 428
		String 문자열 = "유재석";	// 자바 클래스중 하나 [ 무조건 Object 상속]
		Object 슈퍼객체;				// 자바 클래스내 최상위 클래스
			
		슈퍼객체 = 문자열;				// 자식 --> 부모[가능]
		문자열 = (String)슈퍼객체;	// 부모 --> 자식[불가능]
					// 강제형변환
					// 실행중에 형변환
		// 예외처리 판단
			// 입출력(사용자 입장) 관련된 코드 [무조건 예외처리]
		
	}//me
}//ce
