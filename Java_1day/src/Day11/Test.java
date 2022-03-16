package Day11;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		//배열
		Student[] student = new Student[100];
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("                   성      적      표");
				System.out.println("-------------------------------------------------------------------------");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s",
						"번호","이름","국어","영어","수학","총점","평균","석차");
				System.out.println("-------------------------------------------------------------------------");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s",
						"번호","이름","국어","영어","수학","총점","평균","석차");
				System.out.println("-------------------------------------------------------------------------");

				
				System.out.println("메뉴 : 1. 학생점수 등록 2. 학생점수 삭제");
				int ch = scanner.nextInt();
				if(ch==1) {
					System.out.println("학생 이름 :"); String name = scanner.next();
					System.out.println(name +"의 국어 점수 :"); int korean = scanner.nextInt();
					System.out.println(name +"의 영어 점수 :"); int english = scanner.nextInt();
					System.out.println(name +"의 수학 점수 :"); int math = scanner.nextInt();
					
					
					
				}
				else if(ch==2) {}
				else {
					System.out.println("잘못된 입력입니다.[재입력]");
				}
				
				
			}
			catch(Exception e) {}
		}
		
	}

}
