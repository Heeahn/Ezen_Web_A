package Test;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		//�迭
		Student[] studentlist = new Student[100];
		Scanner scanner = new Scanner(System.in);
		int[] rank = new int[100]; 
		
		while( true ) {
			try {
				System.out.println("---------------------------------------------------------------");
				System.out.println("                           ��    ��    ǥ                              ");
				System.out.println("---------------------------------------------------------------");
				System.out.printf("%2s\t%3s\t%3s\t%3s\t%4s\t%4s\t%6s\t%s\n","��ȣ","�̸�","����","����","����","����","���","����");			
			
				for( int j = 0 ; j<studentlist.length; j++ ) {				
					if( studentlist[j] != null) {
						System.out.printf("%2d\t%s\t%3d\t%3d\t%3d\t%3d\t%.2f\t%d\n" , (j+1),studentlist[j].getName(),studentlist[j].getKorean(),
								studentlist[j].getEnglish(),studentlist[j].getMath(),studentlist[j].getTotal(),studentlist[j].getAverage(),rank[j]);
					}
					
				}		
				System.out.println("---------------------------------------------------------------");
				
				System.out.println(" 1. �л���� 2.�л����� : ");
				int ch = scanner.nextInt();
				if( ch==1 ) {   
					System.out.println("�̸� : "); String name = scanner.next();
					System.out.println("�������� : "); int korean = scanner.nextInt();
					System.out.println("�������� : "); int english = scanner.nextInt();
					System.out.println("�������� : "); int math = scanner.nextInt();
					
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
					System.out.println(" ������ �л��� �̸��� �Է��ϼ��� :");  String name = scanner.next();
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
					System.out.println(" �˼����� ����Դϴ�. ");  
					}
			}
			catch( Exception e ) {
				scanner = new Scanner(System.in);
			}
		}
	}
}
