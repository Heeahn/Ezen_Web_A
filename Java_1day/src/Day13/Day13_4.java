package Day13;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Day13_4 {

	public static void main(String[] args) throws InterruptedException {		
	
	//p.544 DecimalFormat 클래스 : 숫자 데이터를 원하는 형식으로 표현
		// 패턴 종류
			// 0 : 자리수[빈자리면 0으로 채움]
			// # : 자리수[빈자리면 채우기]
	double num = 1234567.89;
	
	DecimalFormat df = new DecimalFormat("0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("0.0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("0000000000.00000");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#.#");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("##########.#####");
	System.out.println(df.format(num));
	
	df=new DecimalFormat("#.0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("+#.0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("-#.0");
	System.out.println(df.format(num));
	
	// ***** 천단위 구분 쉼표 *****[#,##0]
	df = new DecimalFormat("금액 #,##0원");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("0.0E0"); // E : 지수문자
	System.out.println(df.format(num));
	
	df = new DecimalFormat("+#,### ; -#.###"); // 양수 ; 음수
	System.out.println(df.format(num));
	
	// ***** 컴퓨터는 백분율X [  계산시 1:100%	0.5:50% 0.05:5%]
	df = new DecimalFormat("#.#%");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("\u00A4 #,###");
	System.out.println(df.format(num));
	
	// p.544 : DecimalFormat 클래스 : 숫자형식 변환
	// p.545 : SimpleDateFormat 클래스 : 날짜 형식 변환
	// p.547 : MessageFormat 클래스 : 문자 형식 변환
	
	String id = "java";
	String name = "신용권";
	String te1 = "010-123-5678";
									// {  } 변수 들어가는 위치
	String text = "회원 ID : {0} \n회원 이름 : {1} \n회원 전화 : {2}";
	String result1 = MessageFormat.format(text, id,name,te1);
																	// 패턴, {0}, {1}, {2}
	System.out.println(result1); System.out.println();
	
	// *** 데이터베이스에서 사용할 예정 ***
	String sq1 = "insert into member values({0}, {1}, {2})";
	Object[] 배열 = {id,name,te1};
	String result2 = MessageFormat.format(sq1, 배열);
	System.out.println(result2);
	
	// JAVA 7버전 이전 Date 이후에는 여러가지 날짜 API 추가중
	LocalDate currDate = LocalDate.now();
	System.out.println("현재 날짜 :"+currDate);
	
	LocalTime currTime = LocalTime.now();
	System.out.println("현재 시간:"+currTime);

	// Date 현재날짜/시간 [조작이 안되거나 비교기능 불충분]
	// vs
	// LocalDate : 현재날짜 		LocalTime : 현재시간
	
	LocalDateTime currDateTime = LocalDateTime.now();
	System.out.println("현재날짜/시간"+currDateTime);
	
	// 시간 계산
	Instant instant1 = Instant.now();
	Thread.sleep(1000); // 1초 대기 [ 코드흐름 1초간 멈춤] // 일반예외
	Instant instant2 = Instant.now();
	
	if(instant1.isBefore(instant2)) {
		System.out.println("instant1 더 빠름");
	}
	else if(instant1.isAfter(instant2)) {
		System.out.println("instant2 가 더 늦습니다.");
	}
	else System.out.println("동일한 시간입니다.");
	
	System.out.println("시간 차 : " + instant1.until(instant2, ChronoUnit.NANOS));
					// 밀리초 = 1000/1초	마이크로초 = 1000000(100만)/1초	나노초 = 1000000000(10억)/1초
	
	
	
	
	
	
	}
}
