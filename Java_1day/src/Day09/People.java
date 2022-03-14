package Day09;

public class People {//클래스 선언
	
	// 1. 필드
	public String name;
//접근제한자 자료형 변수명
	public String ssn;
	// 2. 생성자
	public People() {}
	
	public People(String name, String ssn) {
		//super(); // 생략가능
		this.name = name;
		this.ssn = ssn;
	}
	// 3. 메소드

}
