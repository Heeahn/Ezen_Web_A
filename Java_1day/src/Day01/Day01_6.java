package Day01;

import java.util.Scanner;

public class Day01_6 {

	public static void main(String[] args) {
		
		Scanner JS = new Scanner(System.in);
		
		// ����2: �ϳ��� �湮��
		// 1. �ۼ���, ����, ��¥
	
	System.out.println("���� : "); String ���� = JS.next();
	System.out.println("�ۼ��� : "); String �ۼ��� = JS.next();
	System.out.println("���� : "); String ���� = JS.next();
	System.out.println("��¥ : "); String ��¥ = JS.next();
	
	System.out.println("....................�湮��....................");
	System.out.println("�������� ���ۼ��ڦ� ������    �� ����¥��");
	System.out.println(���� + "\t" + �ۼ��� + "\t" + ���� + "\t" + ��¥);
	System.out.println("............................................");
	
	}

}
