package Day01;

import java.util.Scanner;

public class Day01_5 {

	public static void main(String[] args) {
		
		// ����1: ȸ������ ǥ �ۼ�
		// 1. ���̵�, ��й�ȣ, ����, �̸���
		Scanner JS = new Scanner(System.in);
		
	System.out.println("���̵� : "); String ���̵� = JS.next();
	System.out.println("��й�ȣ : "); String ��й�ȣ = JS.next();
	System.out.println("���� : "); String ���� = JS.next();
	System.out.println("�̸��� : "); String �̸��� = JS.next();

	System.out.println(">>>>>>>>>>>>>>>ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ���<<<<<<<<<<<<<<");
	System.out.println("���̵�\t��й�ȣ\t����\t�̸���");
	System.out.println(���̵�+"\t"+��й�ȣ+"\t"+����+"\t"+�̸���);
		
	}
}
