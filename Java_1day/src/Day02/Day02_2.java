package Day02;

public class Day02_2 {// c s

	public static void main(String[] args) { //ms
	
		// ; : 실행 단위 구분
		// 동일한 변수명은 사용할 수 없다. [ 이름이 중복되면 오류(구분불가)]
		
		// p.40 byte : 1바이트 +-128
		byte var1 = 127; 	System.out.println(var1);
		byte var2 = -30; 	System.out.println(var2);
		byte var3 = 30; 	System.out.println(var3);
		// byte var4 = 300; 	System.out.println(var4);
			// 오류 발생 : 128 이상은 저장할 수 없다.
		byte var4 = 'j'; System.out.println(var4);
			// 문자 -> 정수
		
	} // me
	
} // ce
