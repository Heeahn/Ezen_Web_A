package Day08;

public class Day08_2 {
	
	public static void main(String[] args) {
		
		// p.245 : final
			// 최종적 뜻.
			// 고정값 만들기
			// 사용되는 방법 : 1. 필드 선언시 2. 생성자에서
		
		Person p1 = new Person("123123-123123", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "USA";
		//p1.ssn = "654321-7654321";
		p1.name = "을지문덕";
		
	}

}
