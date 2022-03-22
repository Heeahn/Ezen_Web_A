package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3_Calendar {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("���� :"); int year = scanner.nextInt();
		System.out.println("�� :"); int month = scanner.nextInt();

		�޷�(year, month);
	}
	
	public static void �޷�(int year, int month) {
		while(true) {
			// 1. Ķ���� Ŭ������ ���� ��¥/�ð� ��ü ȣ��
			Calendar calendar = Calendar.getInstance();
		
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			//* �ش� ���� 1���� ����ã��
				// 1. ����� ���� Ķ���� ����
				calendar.set(year, month-1,1); // ��) 3�� 1��
				// 2. 3��1���� ����
				int sweek = calendar.get(Calendar.DAY_OF_WEEK);
				// 3. 3���� ������ ��
				int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
				
			//3. ���
			System.out.println("*********************"+year+"��"+month+"��*********************");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			
			//* ���� �� 1���� ��ġ �տ� ���� ä���
			for(int i=1; i<sweek; i++) {
				System.out.print("\t");
			}
			// 1�Ϻ��� ������������ ���
			for(int i=1; i<=eday; i++) {
				System.out.print(i+"\t");
				if(sweek%7==0) System.out.println();//����ϸ��� �ٹٲ�ó��[�����=7] ������ 7�������
				sweek++; // �Ϸ羿 ���� ����
			}	
			
			//��ư[1.��(������) 2.��(������) 3. �ٽð˻�]
			try {
				System.out.println("\n\n***[1.��(������) 2.��(������) 3. �ٽð˻� 4. ���� ����]***");
				int ch = scanner.nextInt();
				
				if(ch==1) {
					month-=1;
					if(month == 0) {
						year-=1; month=12;
					}
				}
				else if(ch==2) {
					month+=1; 
					if(month==13) {
						month=1; year+=1;
					}
				}
				else if(ch==3) {
					System.out.println("���� :");  	year = scanner.nextInt();
					System.out.println("�� :");  		month = scanner.nextInt();
				}
				else if(ch==4) {
					System.err.println("�˸�]] �޷� ���α׷� ����");
					break;
			}
			else System.err.println("�˸�]] �˼� ���� ��ȣ�Դϴ�.");
			}catch(Exception e) {
				System.err.println("���]] �������� �Է��� ���ּ���[�����ڿ��� ����]");
			}
		}
	} // �޷� �޼ҵ� end
}// class end