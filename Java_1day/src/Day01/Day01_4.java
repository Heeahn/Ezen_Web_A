package Day01;

import java.util.Scanner; // import : ��������

public class Day01_4 { // c s

	public static void main(String[] args) { // m s
		
		// ����1 : �Ѹ��� �̸�, 1����, 2����, 3���� �⼮���θ� �Է¹޾� ���
			// �Է� -> ���� -> ���
		// 1. �Է°�ü ����
		Scanner JS = new Scanner(System.in);
		
		// 2. �Է¹��� ������ �ȳ�
		System.out.println("�̸� : ");
		
		// 3. �Է¹��� ������ �������� -> �ٸ���(String:���ڿ�)�� ����
		String �̸� = JS.next();
			//  = ����( �����ʰ��� ���� ����[����] )

			// �ȳ� ���							// �Է¹޾� �ٸ� ��ü�� ����
		System.out.println("1���� : ");		String ����1 = JS.next();
		System.out.println("2���� : ");		String ����2 = JS.next();
		System.out.println("3���� : ");		String ����3 = JS.next();
		
		// 4. ���
		System.out.println("\t\t[[�⼮��]]");
		System.out.println("----------------------------------------");
		System.out.println("�̸�\t1����\t2����\t3����\t���");
		System.out.println( �̸� +"\t"+ ����1 +"\t" + ����2 +"\t" +����3);
		System.out.println("----------------------------------------");
		
		
	} // m e
} // c e
