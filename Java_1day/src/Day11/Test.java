package Day11;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		//�迭
		Student[] student = new Student[100];
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("                   ��      ��      ǥ");
				System.out.println("-------------------------------------------------------------------------");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s",
						"��ȣ","�̸�","����","����","����","����","���","����");
				System.out.println("-------------------------------------------------------------------------");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s",
						"��ȣ","�̸�","����","����","����","����","���","����");
				System.out.println("-------------------------------------------------------------------------");

				
				System.out.println("�޴� : 1. �л����� ��� 2. �л����� ����");
				int ch = scanner.nextInt();
				if(ch==1) {
					System.out.println("�л� �̸� :"); String name = scanner.next();
					System.out.println(name +"�� ���� ���� :"); int korean = scanner.nextInt();
					System.out.println(name +"�� ���� ���� :"); int english = scanner.nextInt();
					System.out.println(name +"�� ���� ���� :"); int math = scanner.nextInt();
					
					
					
				}
				else if(ch==2) {}
				else {
					System.out.println("�߸��� �Է��Դϴ�.[���Է�]");
				}
				
				
			}
			catch(Exception e) {}
		}
		
	}

}
