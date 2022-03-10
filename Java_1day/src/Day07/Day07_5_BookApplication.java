package Day07;

// 2. ȭ�鼳��
// 1. �ʱ�޴� [1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣã��]
// 2. �Ϲ�ȸ���޴�[1. �����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5. �α׾ƿ�]
// 3. ������ �޴� [ 1. ������� 2. ������� 3. �������� 4. ����(����) 5. �α׾ƿ�

import java.util.Scanner;

public class Day07_5_BookApplication {
	
	//* main �ۿ� ������ �����ϴ� ���� : ��� �޼ҵ忡�� ����ϱ� ���ؼ�
		// �������� : {��������} ��ȣ������ ����� ������ {	} ���� ������
			// ���� �ٸ� {	}��ȣ ������ ���� -> ��������
		// static : ���α׷� ����ñ��� �޸� �Ҵ� /���α׷� ����� �޸� �ʱ�ȭ
			// ���α׷� ���������� ������ ���Ǵ� �޸�[����]
	
	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[1000]; // ��� ���Ͽ��� ����ϴ� ȸ����� �迭
	static Book[] books = new Book[1000];
	
	// 0. �ڵ带 �о��ִ� ���� �޼ҵ�[������]
	public static void main(String[] args) { //ms
	
		//�޼ҵ� ȣ��
			// 1. menu(); // ����ȣ�� �Ұ���
				// static : �޸� �켱�Ҵ� �̱⶧���� static �� �޼ҵ�, �ʵ� ������
				// main �޼ҵ� static �޼ҵ� �̱⋚���� static �޼ҵ常 ����ȣ�� ����
		
		// 2. �ܺ�ȣ��
		// 1. ��ü ����(�޸��Ҵ�) -> �޼ҵ� ȣ��
		Day07_5_BookApplication application = new Day07_5_BookApplication();
		application.menu();
		
	}	 // me
	
	// 1. �ʱ� �޴� �޼ҵ�
	void menu() {
		Member member = new Member();
		while(true) {
			System.out.println("-----------------------���� �뿩 ���α׷�-----------------------");
			System.out.println("1. ȸ������ 2 . �α��� 3. ���̵�ã�� 4. ��й�ȣã�� :");
			int ch = scanner.nextInt();		

			if(ch==1) {
				boolean result = member.ȸ������();// ȸ������ �޼ҵ� ȣ��
				if(result) System.err.println("ȸ������ ����");
				else System.err.println("ȸ������ ����");
			}
			
			else if(ch==2) {// �α��� �޼ҵ� ȣ��
				String result = member.�α���();
				if(result == null) {
					System.out.println("������ ȸ�������� �����ϴ�.");
				}
				else if(result.equals("admin")) { // ������ /2. ������ �޴� �޼ҵ� ȣ�� 
					System.out.println("�ȳ��ϼ���."+result+"��"); 
					adminmenu();					
				}
				else {// 1.�Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
					System.out.println("�ȳ��ϼ���."+result+"��"); 
					membermenu(result); // �μ� 1��[�α��μ����� id]
				}
			}
			else if(ch==3) {member.���̵�ã��();}
				// ���̵� ã�� �޼ҵ� ȣ��	
			else if(ch==4) {member.��й�ȣã��();}
				// ��й�ȣ ã�� �޼ҵ� ȣ��
			else {System.err.println("�˸�) �˼� ���� ��ȣ�Դϴ�.");}
		}
	}
	
	// 2. �Ϲ�ȸ�� �޼ҵ�
	void membermenu(String loginid) {// �μ��� �������� �޶� ������ �ڷ��� ����
		while(true) {
			System.out.println("-----------------------ȸ�� �޴�-----------------------");
			System.out.println("1. �����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5. �α׾ƿ� ���� :");
			int ch = scanner.nextInt();
			Book book = new Book();
			
			if(ch==1) {
				book.�����˻�();
			}
			else if (ch==2) {
				book.�������();
			}
			else if (ch==3) {
				book.�����뿩(loginid);
			}
			else if (ch==4) {
				book.�����ݳ�(loginid);
			}
			else if (ch==5) {return;}
			else {System.err.println("�˸�) �˼����� ��ȣ�Դϴ�.");}
		}
	}
	
	// 3. ������ �޴� �޼ҵ�
	void adminmenu() {
		while(true) {
			System.out.println("-----------------------������ �޴�-----------------------");
			System.out.println("1. ������� 2. ������� 3. ��������  4. �α׾ƿ� ����:");
			int ch = scanner.nextInt();
			Book book = new Book();
			
			if(ch==1) {
				book.�������();
			}
			else if (ch==2) {
				book.�������();
			}
			else if (ch==3) {
				book.��������();
			}
			else if (ch==4) {return;}
			else {System.err.println("�˸�) �˼����� ��ȣ�Դϴ�.");}
		}
	}
	
}//ce
