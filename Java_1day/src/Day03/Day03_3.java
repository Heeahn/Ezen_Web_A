package Day03;

import java.util.Scanner;

public class Day03_3 { // cs

	public static void main(String[] args) { //ms
		
		Scanner scanner = new Scanner(System.in);
		
//		//����6(������ �Է¹޾� ������ 90�� �̻��̸� �հ� �ƴϸ� ���հ� ���) 
//		System.out.println("�����Է�: "); int ���� = scanner.nextInt();
//		
//		if(����>=90) System.out.println("�հ�");
//		else System.out.println("���հ�");
//		
//		//����7
//		// ������ �Է¹޾� ������ 90�� �̻��̸� A���
//		//				������ 80�� �̻��̸� B���
//		//				������ 70�� �̻��̸� C���
//		//				�׿� �����
//		System.out.println("�����Է�: "); int ����1 = scanner.nextInt();
//		
//		if(����1>=90) System.out.println("A���");
//		else if(����1>=80)System.out.println("B���");
//		else if(����1>=70)System.out.println("C���");
//		else System.out.println("�����");		
//		
		//����8 �α���������
		// [ �Է� ] : ���̵�� ��й�ȣ�� �Է¹ޱ�
		// [ ���� ] : ȸ�����̵� admin �̰� 
		//           ��й�ȣ�� 1234 �� ��쿡�� 
		//          �α��� ���� �ƴϸ� �α��� ���� ���
		System.out.println("-------------�α��� ������-------------");
		System.out.println("���̵�: "); String id = scanner.next();
			// char �ڷ��� [ ���� 1�� ����]
			// �ڷ������� ���ڿ��� ������ �� ����.
				//1. String Ŭ���� ����ϸ� ���ڿ� ���尡��
				//2. char �迭/����Ʈ ����ϸ� ����
		System.out.println("��й�ȣ: "); int pw = scanner.nextInt();
				// ��ü�� ����Ұ�
					//'�ڹ�' >= <= == > < != [�Ұ���]
					// Ŭ���� ����ϴ� ��ü�� ������ ��� �Ұ� -> �޼ҵ�
						// ���ڿ� �񱳽� .equals
						// ���ڿ�1.eqals(���ڿ�2)
		
		boolean �α��μ��� = false;
		
			// boolean : 1��Ʈ true Ȥ�� false ����
		if( id.equals("admin")) { // id�� Ŭ���� ��ü�̱� ������ == �Ұ��� // ��ü�񱳽ÿ��� .equals
			//�Է��� id�� admin �̸�
		   if(pw==1234) {
			   //�Է��� pw 1234�̸�
				System.out.println("�˸�)�α��� ����");
				�α��μ��� = true;
		   }
		   else {System.out.println("�˸�) ��й�ȣ�� Ʋ�Ƚ��ϴ�.");}  
	
		} else {// �Է��� id�� admin�� �ƴϸ� 
			System.out.println("�˸�) ���̵� Ʋ�Ƚ��ϴ�.");}
		
		if(�α��μ���==false) System.out.println("�˸�) �α��� ����"); 
		
		/* ����9
		[ �Է� ] : ����,����,���� �Է¹ޱ�
		[ ���� ]
			����� 90�� �̻��̸鼭 
				�������� 100�� �̸� '������' ���
				�������� 100�� �̸� '������' ���
				�������� 100�� �̸� '���п��' ���
			����� 80�� �̻��̸鼭 
				�������� 90���̻� �̸� '�������' ���
				�������� 90���̻� �̸� '��������' ���
				�������� 90���̻� �̸� '�������' ���
			�׿� ����� 
	 */
		
		System.out.println("�������� :"); int ���� = scanner.nextInt();
		System.out.println("�������� :"); int ���� = scanner.nextInt();
		System.out.println("�������� :"); int ���� = scanner.nextInt();
		int ��� = (����+����+����)/3;
		
		if(���>=90) {
			if(���� ==100) System.out.println("������");
			if(���� ==100) System.out.println("������");
			if(���� ==100) System.out.println("���п��");
		}
		else if(���>=80) {
			if(���� >=90) System.out.println("�������");
			if(���� >=90) System.out.println("�������");
			if(���� >=90) System.out.println("�������");
		}
		else {
			System.out.println("�����");
		}
				
	
		
		
		
		
	
	
	
	
	} //me
	
} //ce
