package Day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day10_6 {
	// 주기억장치 : 메모리 : RAM : 프로그램 실행시에만 저장할 수 있는 메모리
	// 보조기억장치 : c드라이브, USB, CD : (프로그램) 파일[영구저장]
	// 파일처리[자바내 메모리를 --> 보조기억장치]
	// DB처리[ 자바내 메모리 --> DB 서버[PC]]
		// 스트림(stream) : 프로그램과 외부[키보드,파일,네트워크등] 통신
				//통신 단위
		// FileOutputStream : 파일 출력 클래스
			// 객체명.write(바이트열);
		// FileInputStream : 파일 입력 클래스
			// 객체명.read(바이트배열);
		// String 클래스
			// 문자열.equals() : 문자열 비교 메소드
			// 문자열.getBytes() : 문자열 -> 바이트열 변환
			// new String(바이트배열) : 바이트배열 -> 문자열 배열
	public static void main(String[] args) throws IOException {
		
		// 파일 출력[파일 -> 자바] 
		FileOutputStream fileOutputStream = new FileOutputStream("D:/java/java1.txt");
		//FileInputStream : 파일입출력 클래스
		//FileInputStream(파일경로/파일명.확장자); // txt : 메모장
		String 내용 = "자바에서 입력된 데이터";
		fileOutputStream.write(내용.getBytes()); // 예외[오류]
		
		//파일 입력[자바 -> 파일]
		FileInputStream fileInputStream = new FileInputStream("D:/java/java1.txt");
		byte[] bytes = new byte[1000];
		fileInputStream.read(bytes);
		System.out.println("파일내용 :"+new String(bytes));
	}
}










