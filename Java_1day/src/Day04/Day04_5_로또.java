package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_5_�ζ� {
	public static void main(String[] args) {
		
		//�غ�
		int[] ����ڹ�ȣ = new int[6]; // ����ڰ� ������ ��ȣ ���
		int[] ��÷��ȣ = new int[6];	// ��ǻ���� ���� ��ȣ ���
		Scanner scanner = new Scanner(System.in);
		
	
		
		//1. ����ڿ��� �Է¹ޱ�
		for(int i=0;i<6;i++) {//fs
				// i�� 0���� 5���� 1�� �����ݺ� => 6ȸ �ݺ�
			System.out.print("1~45 �����Է� :");
			boolean pass=true;
			int ��ȣ = scanner.nextInt();
			
			//���� 1
			if(��ȣ<1||��ȣ>45) {//is
				// 1���� �۰ų� 45���� ũ�� ������ �� ���� ��ȣ�Է½� ���Է�
				System.err.println("�˸�) ������ �� ���� ��ȣ�Դϴ�.[���Է�]");
				i--; // ���� i�� �����Է�x
				pass=false; // ����x
			}// i e
			
			//����2 (�ߺ�üũ)
				// 1. �迭�� ��� �ε��� ȣ��
			for(int j=0;j<6;j++) {
				if(��ȣ == ����ڹ�ȣ[j]) {
					// 2. �Է¹��� ���� j��° �ε������� ������ ��
					System.err.println("�˸�) �̹� ������ ��ȣ �Դϴ�.[���Է�]");
					i--; // ���� i�� �����Է�x
					pass=false; // ����x
				}//ie
			}//f2e			
			// �����Է� �̸� �迭�� �����ϱ�
			if(pass==true)����ڹ�ȣ[i] = ��ȣ;
			
		}// fe
		
		System.out.print("\n����ڰ� ������ ��ȣ :\n");
		//* ����� �迭�� ��� �ε��� ���
		for(int temp:����ڹ�ȣ) {
			System.out.print("["+temp+"]");
		}
		
		//2. ��ǻ�Ͱ� ���� ����
		
		System.out.println("\n--------------------------------");
		
		for(int i=0;i<6;i++) {//fs
			// i�� 0���� 5���� 1�� �����ݺ� => 6ȸ �ݺ�
			Random rd = new Random();
			int ��÷ = rd.nextInt(45)+1;
			
			// ���� 1: �ߺ� üũ
			boolean pass=true;
			for(int temp: ��÷��ȣ) {
				if(��÷ == temp) {
					i--;
					pass=false;
				}
			}
			if(pass) ��÷��ȣ[i] = ��÷;
		}

			System.out.print("\n��÷��ȣ :\n");
				//* ����� �迭�� ��� �ε��� ���
			for(int temp : ��÷��ȣ) {
			System.out.print("["+temp +"]");
			}

			//3. �� = �� �迭�� ������ �� ã��
				// 352
				// 831
			int �����Ѽ� =0;
			// ���1
//			for(int i=0; i<����ڹ�ȣ.length; i++) {
//				// i �� ������
//				for(int j=0; j<��÷��ȣ.length ; j++) {
//					//j �񱳴��
//					if( ����ڹ�ȣ[i] == ��÷��ȣ[j]) {
//						//����� �迭�� i��° �ε��� �� 
//						//��ǻ�� �迭�� j��° �ε��� �� ���� �����ϸ� 
//						�����Ѽ�++;
//					}
//				}
//			}
			//���2
			
			for(int �񱳱��� : ����ڹ�ȣ) {
				for(int �񱳴�� : ��÷��ȣ) {
					if(�񱳱��� == �񱳴��) �����Ѽ�++;
				}
			}
			
			System.out.println("\n�����Ѽ� :" + �����Ѽ�);
			
			
		}	//ms
		
	}//cs

