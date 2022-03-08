package Day06;

public class Korean {
	//* Korean 클래스 선어
	
	//1. 필드
	String nation = "대한민국";
		// 국가 변수
	String name;
		// 이름 변수에는 초기화X[null]
	String ssn;
		// 주민등록번호 변수에는 초기화X[null]
	
	//2. 생성자
		// 조건1 : 생성자이름 == 클래스이름 동일
		// 조건2 : 외부로부터 들어오는 매개값[인수]
		// 조건3 : 동일한 생성자 이름 가질 수 없다.
			// 오버로딩 : 동일한 이름일경우 재정의
	
	// 1. 빈생성자
	Korean(){
		// 내용물 없다.
		
	}
	
	//2. 필드 1개를 갖는 생성자
	Korean( String name){
		this.name =name;
	}
	//3. 필드 2개를 갖는 생성자
	Korean( String name, String ssn){
		this.name =name;
		this.ssn=ssn;
	}
	
	// 4. 필드 3개를 갖는 생성자
	Korean( String nation, String name, String ssn){
		this.nation = nation;
		this.name = name;
		this.ssn = ssn;
		// 내부변수(현재 클래스내 변수)
		// 매개변수(외부로부터 들어온 변수)
		// 내부변수 == 매개변수 이름이 동일하면 충돌
		// 내부변수 표시 방법
			// this.필드명 : 현재 클래스내 필드호출
	}
	
	//3. 메소드
	
}
