package Day03;

import java.util.Scanner;

public class Day03_7_Ȯ�ι���7 {

	public static void main(String[] args) {
		// ���� ���� [ ��𼭵� ����� �� �̾� ���� ]
		boolean run = true; // ���� ���� ���� / true=���� false=����
		
		int balance = 0; // ���ݾ�[����ȿ� �ִ� �ݾ�] ����
		
		Scanner scanner = new Scanner(System.in); // �Է°�ü
		
		while( run ) { // while(���ǽ�) {} : ���ѷ���
			System.out.println("---------------------");
			System.out.println("1.���� 2.��� 3.�ܰ� 4.����");
			System.out.println("---------------------");
			System.out.println("����>"); 
			int ���� = scanner.nextInt();
			
			if(����==1) {System.out.println("���ݾ� :"); int ���ݾ� = scanner.nextInt();	balance += ���ݾ�;}
			else if(����==2) {
				System.out.println("��ݾ� :"); int ��ݾ� = scanner.nextInt();
				
				if(��ݾ�>balance) System.out.println("�˸�) �ܾ��� �����մϴ�.");
				else (balance -= ��ݾ�;) System.out.println("");
			}
			else if(����==3) { System.out.println("�ܰ� :"+balance); int �ܰ� = scanner.nextInt();}
			else if(����==4) { System.out.println("����");}
			else System.out.println("�˸�)�˼� ���� ��ȣ �Դϴ�.");			
			
//		switch(����) {
//			case 1 : System.out.println("1.����"); break;
//			case 2 : System.out.println("2.���"); break;
//			case 3 : System.out.println("3.�ܰ�"); break;
//			case 4 : System.out.println("4.����"); break;
//			default : System.out.println("����");
//		}
			
		}
		
		System.out.println("���α׷� ����");
		
		
	}
	
}
