package Day02;

import java.util.Scanner;

public class Day02_5 {
	
	public static void main(String[] args) {
		
		
		// ����2 : ���� ���� 
		/*
		 * [ �Է����� ] 
		 * 		�ݾ� 
		 * [ ���� ] 
		 * 		�ʸ��� ���� ��� ������ ���� ���� 
		 * [ ������� ]
		 * 		��) 356789 �Է½� 
		 * 		�ʸ��� 3�� 
		 * 		���� 5��
		 * 		õ�� 6�� 
		 * 		��� 7��
		 * 
		 */
		
		// 1. �Է°�ü
		Scanner scanner = new Scanner(System.in);
		
		// 2. �Է¹��� ������ -> ������ �̵�
//		System.out.println("�ݾ� :");	int �ݾ� = scanner.nextInt();
//		// 3. ����
//		System.out.println("�Է��� �ݾ�: "+ �ݾ�);
//		
//		System.out.println("�ʸ���: " + (�ݾ�/100000) + "��");
//			// �ʸ��� ����
//		�ݾ� = �ݾ�-(�ݾ�/100000)*100000; // �ݾ׿��� �ʸ��� ���� ����
//		System.out.println("�ʸ��� ���� :" + �ݾ�);
//
//		// �ݾ׿��� ���� ���� ����
//		
//		�ݾ� -= (�ݾ�/100000) * 100000;
//		
//		System.out.println("����: " + (�ݾ�/10000) + "��");
//		
//		�ݾ� -= (�ݾ�/10000)*10000;
//		
//		System.out.println("õ��: " + (�ݾ�/1000) + "��");
//		
//		�ݾ�-=(�ݾ�/1000)*1000;
//		
//		System.out.println("���: " + (�ݾ�/100) + "��");
//		
//		// 4.���
//		
//		//����3 : �ϳ��� ������ �Է¹޾� 7�� ������� ���[ true , false ]
//		System.out.println("����3) ���� �Է�:");
//		int ����3 = scanner.nextInt();
//		System.out.println("�Է��� ������ 7�� ��� �Ǵ� :" + (����3%7==0));
//		
//		
//		//����4 : �ϳ��� ������ �Է¹޾� Ȧ�� ���� Ȯ�� [ true , false ]
//			// Ȧ¦ ã��
//				// Ȧ�� : �� % 2 ������ �������� 1�̸� ���� Ȧ��
//				// ¦�� : �� % 2 ������ �������� 0�̸� ���� ¦��
//		
//		System.out.println("����4) ���� �Է�:");
//		int ����4 = scanner.nextInt();
//		System.out.println("�Է��� ������ Ȧ�� �Ǵ� :" + (����4%2 ==1));				
//		
//		//����5 : �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ�� [ true , false ]
//	
//		System.out.print("����5) ���� �Է� :");	int ����5 = scanner.nextInt();
//		System.out.println("�Է��� ������ 7�� ����̸鼭 ¦�� �Ǵ� :" + (����5%7==0 && ����5%2==0));
//		
//		//����6 : �ΰ��� ������ �Է¹޾� �� ū�� ���  [ true , false ]
//		System.out.print("����6) ����1 �Է� :"); int ����6 = scanner.nextInt();
//		System.out.print("����6) ����2 �Է� :"); int ����6_1 = scanner.nextInt();
//		int ū�� = ����6>����6_1 ? ����6 : ����6_1;
//		System.out.println("�� ū���� :" + ū��);		
//		
//		//����7 : �������� �Է¹޾� �� ���� ����ϱ� 
//				// �� ���� ���� => ������ * ������ * ������[3.14]
//		System.out.println("����7) ������ �Է� :"); int ����7 = scanner.nextInt();
//		System.out.println("�� ���̴� : " + (����7*����7*3.14));
//		
//		//����8 : �� �Ǽ��� �Է¹޾� �սǼ��� ���� ���� ���� ��% ���� ����ϱ�
//				// ��) 54.5   84.3 �̸�    64.285714%
//		System.out.println("����8) �Ǽ�1 �Է�: "); double ����8 = scanner.nextDouble(); 
//		System.out.println("����8) �Ǽ�2 �Է�: "); double ����8_1 = scanner.nextDouble();
//		
//		double ���� = (����8/����8_1)*100;
//		System.out.println("�Ǽ�1�� �Ǽ�2 ����� :" +����+"%");
//		System.out.printf("�Ǽ�1�� �Ǽ�2 ����� : %.6f %% " , ���� );
//				// %f : �Ǽ�ǥ��
//					//%. ����f
//		
//		//����9 : ��ٸ��� ���� ���ϱ�[������ �غ� ���̸� �Է¹޾� ����ϱ�]
//				//��ٸ��� ���� = > (���� * �غ�) * ���� / 2
//		System.out.println("����9) ���� :"); double ���� = scanner.nextDouble();
//		System.out.println("����9) �غ� :"); double �غ� = scanner.nextDouble();
//		System.out.println("����9) ���� :"); double ���� = scanner.nextDouble();
//		System.out.println("����9) ��ٸ����� ���� :" + (����*�غ�)*����/2);
//		
//		
//		//����10: Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
//				//ǥ��ü�� ���� = > (Ű - 100) * 0.9
//		System.out.println("����10) Ű :"); 
//		double Ű = scanner.nextDouble();
//		System.out.println("����10) ǥ��ü�� :" + (Ű-100)*0.9);
//		
//		
//		//����11: Ű�� �����Ը� �Է¹޾� BMI ����ϱ�
//				//BMI ���� = > ������ / ((Ű / 100) * (Ű / 100))
//		System.out.println("����11) Ű :"); 
//		System.out.println("����11) ������ :"); double ������ = scanner.nextDouble();
//		
//		System.out.println("����11) BMI :" + (������/((Ű/100.0)*(Ű/100.0))));	
//		
		//����12: inch �� �Է¹޾� cm �� ��ȯ�ϱ� [ 1 inch -> 2.54cm ] 
		System.out.println("����12) inch : "); int inch = scanner.nextInt();
		System.out.println("����12) cm : "+ (inch*2.54)+"cm");
		
		
		//����13:  �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����ϱ�
				//�Ҽ� ��° �ڸ� ���� ���� ����ϱ�
				//�߰���� �ݿ����� => 30 %
				//�⸻��� �ݿ����� => 30 %
				//������ �ݿ����� => 40 %
		System.out.println("����13) �߰���� : "); double �߰���� = scanner.nextDouble();
		System.out.println("����13) �⸻��� : "); double �⸻��� = scanner.nextDouble();
		System.out.println("����13) ������ : "); double ������ = scanner.nextDouble();
		�߰����*=0.3;	�⸻���*=0.3;	������*=0.4;
		
		System.out.printf("����13) �ݿ������� ���� : %.2f \n ", (�߰����+�⸻���+������));
		
	//����14 :  ���� ���� ���� �ϰ� x�� y�� �����ϱ�
		//int x = 10;
		//int y = x-- + 5 + --x;
		//printf(" x�� �� : %d , y�ǰ� :  %d ", x, y)
			// 1. x-- + 5 -> 10+5
			// 2. x-- -> x ���� [x = 9]
			// 3. 15+ --x -> ���� ���� [x = 8]
			// 4. 15 +8 => 23
		
	//����15 : ���̸� �Է¹޾� ���̰� 10���̻��̸� �л� , 20���̻��̸� ���� , 40���̻��̸� �߳� ���� ����ϱ�
	System.out.println("����15) ���� :");		int ���� = scanner.nextInt();
	
		
	//����16 : 3���� ������ �Է¹޾� ������������ ���� 
	System.out.println("����16) ����1 :"); int ����1 = scanner.nextInt();
	System.out.println("����16) ����2 :"); int ����2 = scanner.nextInt();
	System.out.println("����16) ����3 :"); int ����3 = scanner.nextInt();
	
	
	//����17 : 4���� ������ �Է¹޾� ������������ ���� 
	System.out.println("����17) ����4 :"); int ����4 = scanner.nextInt();
	System.out.println("����17) ����5 :"); int ����5 = scanner.nextInt();
	System.out.println("����17) ����6 :"); int ����6 = scanner.nextInt();
	System.out.println("����17) ����7 :"); int ����7 = scanner.nextInt();
	
	// p. 102 Ȯ�ι���
	
	}
	
	
}
