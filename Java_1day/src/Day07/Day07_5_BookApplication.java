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
		
		System.out.println("-----------------------���� �뿩 ���α׷�-----------------------");
		System.out.println("1. ȸ������ 2 . �α��� 3. ���̵�ã�� 4. ��й�ȣã�� :");
		int ch = scanner.nextInt();
		
		while(true) {
			if(ch==1) {
				member.ȸ������();	// ȸ������ �޼ҵ� ȣ��
			}
			else if(ch==2) {
				member.�α���();
				// �α��� �޼ҵ� ȣ��
					// 1.�Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
					// 2. ������ �޴� �޼ҵ� ȣ�� 
			}
			else if(ch==3) {
				member.���̵�ã��();
				// ���̵� ã�� �޼ҵ� ȣ��
			}
			else if(ch==4) {
				member.��й�ȣã��();
				// ��й�ȣ ã�� �޼ҵ� ȣ��
			}
			else {
				System.err.println("�˸�) �˼� ���� ��ȣ�Դϴ�.");
			}
		}
	}
	
	// 2. �Ϲ�ȸ�� �޼ҵ�
	void membermenu() {
		
	}
	
	// 3. ������ �޴� �޼ҵ�
	void adminmenu() {
		
	}
	
}
