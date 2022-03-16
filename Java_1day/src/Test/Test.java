package Test;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		//배열
		Student[] studentlist = new Student[100];
		Scanner scanner = new Scanner(System.in);
		int[] rank = new int[100]; 
		
		while( true ) {
			try {
				System.out.println("---------------------------------------------------------------");
				System.out.println("                           성    적    표                              ");
				System.out.println("---------------------------------------------------------------");
				System.out.printf("%2s\t%3s\t%3s\t%3s\t%4s\t%4s\t%6s\t%s\n","번호","이름","국어","영어","수학","총점","평균","석차");			
			
				for( int j = 0 ; j<studentlist.length; j++ ) {				
					if( studentlist[j] != null) {
						System.out.printf("%2d\t%s\t%3d\t%3d\t%3d\t%3d\t%.2f\t%d\n" , (j+1),studentlist[j].getName(),studentlist[j].getKorean(),
								studentlist[j].getEnglish(),studentlist[j].getMath(),studentlist[j].getTotal(),studentlist[j].getAverage(),rank[j]);
					}
					
				}		
				System.out.println("---------------------------------------------------------------");
				
				System.out.println(" 1. 학생등록 2.학생삭제 : ");
				int ch = scanner.nextInt();
				if( ch==1 ) {   
					System.out.println("이름 : "); String name = scanner.next();
					System.out.println("국어점수 : "); int korean = scanner.nextInt();
					System.out.println("영어점수 : "); int english = scanner.nextInt();
					System.out.println("수학점수 : "); int math = scanner.nextInt();
					
					int total = korean + english + math;
					double average = (double)total/3;
					Student student = new Student(name,korean,english,math,total,average);
					int i = 0;
					for( Student temp : studentlist ) {						
						if( temp == null) {
							studentlist[i] = student; break;
						} 
						i++;
					}
					rank[i] =1;
					for(int r = i; r<rank.length; r++) {
						for(int t = 0; t<rank.length; t++) {
							if(studentlist[r].getTotal() < studentlist[t].getTotal()) {
								  rank[r]++;
							}
						}
					}
									
				} 			
				
				else if( ch== 2 ) {
					System.out.println(" 삭제할 학생의 이름을 입력하세요 :");  String name = scanner.next();
					int i=0;
					for( Student temp: studentlist) {
						if( temp != null && temp.getName().equals(name))  {
							studentlist[i] = null;
							for(int j=0;j<studentlist.length;j++) {
								if(j==studentlist.length-1)studentlist[studentlist.length-1] = null;
								else studentlist[j] = studentlist[j+1];
							}
						}
					}
					i++;
				}  
				
				else { 
					System.out.println(" 알수없는 명령입니다. ");  
					}
			}
			catch( Exception e ) {
				scanner = new Scanner(System.in);
			}
		}
	}
}
