package Day04;

import java.util.Scanner;

public class Day04_1 { // cs
	public static void main(String[] args) { // ms
		
		// ��� : if, switch
		// �ݺ��� : for[]. while[���ѷ���] 
			// 1. �ʱⰪ 2. ���ǽ� 3. ������ 4. ���๮
			// while ����
			//		1. �ʱⰪ;
			//		while(2. ���ǽ�) {
			//		4. ���๮;
			//		3. ������;
			//			}
		
		// for ��1)
		for(int i=1;i<=10;i++) {
			// * i�� 1���� 10���ϱ��� 1�� �����ϸ鼭 ���๮ �ݺ�ó�� = 10������
			System.out.println(i+" ");
		}
		
		// while ��1)
		int i= 1; // 1. �ʱⰪ
		while(i<=10) { // 2. ���ǽ�
			System.out.println(i +" "); //���๮
			i++; //3. ������
		} // w e
		
		//for ��2) 1~100 �����հ�
		int sum = 0;
		for(int j=1;j<=100;j++) {
			sum += j;
		}
		System.out.println("for 1~100���� ������ :"+sum);
		
		//while ��2)
		int j= 1;
		int sum2 = 0;
		while(j<=100) {
			sum2 +=j;
			j++;
		}
		System.out.println("while 1~100���� ������ :"+sum2);
		
		//while ��3) ���ѷ���
		while(true) {
			System.out.println("���ѷ���");
			Scanner scanner = new Scanner(System.in);
			int exit = scanner.nextInt();
			if (exit==3)
			break; // ���� ����� �ݺ���Ż��[if ����]
		}
		
		
		
		
		
		
		
		
	}//me
	
	
}//ce
