package Day12;

import java.util.Scanner;

import Day12.Student;

public class 프로그래밍언어활용_정희승 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student[] students = new Student[100];
		int[] rank = new int[100];
		
		while(true) {
			try {
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("                성      적      표");
				System.out.println("-------------------------------------------------------------------------");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n","번호","이름","국어","영어","수학","총점","평균","석차");
				System.out.println("-------------------------------------------------------------------------");
				
				int i =0;
				for(Student student : students) {
					if(student != null) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
							(i+1),students[i].getName(),students[i].getKorean(),students[i].getEnglish(),
				students[i].getMath(),students[i].getTotal(),students[i].getAverage(),rank[i]);
					}
					i++;
				}
				System.out.println("-------------------------------------------------------------------------");
	
				System.out.println("메뉴 : 1.학생점수 등록 2.학생점수 삭제");
				int ch = scanner.nextInt();
				
				if(ch==1) {
					System.out.println("학생 이름 :"); String name=scanner.next();
					System.out.println("국어 점수 :"); int korean=scanner.nextInt();
					System.out.println("영어 점수 :"); int english=scanner.nextInt();
					System.out.println("수학 점수 :"); int math=scanner.nextInt();
					
					int total = korean+english+math;
					double average = total/3;
					
					Student student = new Student(name, korean, english, math, total, average);
					
					int s =0;
					for(Student student2 : students) {
						if(student2 == null) {
							students[s] = student; 
							break;
						}
						s++;
					}			
					
					for(int a = 0; a <students.length;a++) {
						for(int z = 0; z < students.length;z++) {
							if(students[a] != null && students[z] != null){
								if(students[a].getTotal() > students[z].getTotal()) {
									Student[] temp = new Student[1];
									temp[0] = students[a];
									students[a] = students[z];
									students[a] = temp[0];
									}
							}
						}
					}
					
				}
				else if(ch==2) {
					System.out.println(" 삭제할 학생의 이름 :");  String name = scanner.next();
					int s=0;
					for( Student temp: students) {
						if( temp != null && temp.getName().equals(name))  {
							students[s] = null;
							for(int j=s;j<students.length;j++) {
								if(j==students.length-1)students[students.length-1] = null;
								else students[j] = students[j+1];
							}
						}
					}
					s++;
					
				}
				else {
					System.err.println("올바른 입력이 아닙니다.");
				}	
			}
			catch(Exception e) {
				scanner = new Scanner(System.in);
			}			
		}		
	}
}
