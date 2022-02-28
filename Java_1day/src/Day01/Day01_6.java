package Day01;

import java.util.Scanner;

public class Day01_6 {

	public static void main(String[] args) {
		
		Scanner JS = new Scanner(System.in);
		
		// 문제2: 하나의 방문록
		// 1. 작성자, 내용, 날짜
	
	System.out.println("순번 : "); String 순번 = JS.next();
	System.out.println("작성자 : "); String 작성자 = JS.next();
	System.out.println("내용 : "); String 내용 = JS.next();
	System.out.println("날짜 : "); String 날짜 = JS.next();
	
	System.out.println("....................방문록....................");
	System.out.println("│순번│ │작성자│ │내용    │ │날짜│");
	System.out.println(순번 + "\t" + 작성자 + "\t" + 내용 + "\t" + 날짜);
	System.out.println("............................................");
	
	}

}
