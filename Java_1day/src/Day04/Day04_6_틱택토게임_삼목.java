package Day04;

import java.util.Random;
import java.util.Scanner;

import javax.swing.text.PlainDocument;

//	������[ƽ���� ����]

//		1. 9ĭ ����
//			1. string[] �迭 = new string[9]

//		2. ����ڿ��� 0~8 �ε�����ȣ �Է¹ޱ�
//			1. �ش� �ε����� O ǥ��
//			2. �̹� �� �ڸ��� ���Է�

//		3. ��ǻ�ʹ� 0~8 ���� ���� �߻�
//			1. �ش� �ε����� x ǥ��
//			2. �̹� �� �ڸ��� �糭�� ����

//		4. �¸��Ǵ�
//			1. ���� �ε����� ����� ��� �����ϸ� 
//				012		345		678
//						ù��° �ε����� 0���� 6���� 3�� ����
//								�ι�°: ù��°+1
//								����°: ù��°+2
//				2. ���� �ε����� ����� ��� �����ϸ�
//				036 		147		258
//				3. �밢�� �ε������� ����� ��� �����ϸ�
//				048		246

public class Day04_6_ƽ�������_��� {//CS
	public static void main(String[] args) {//MS
		Scanner sc = new Scanner(System.in); // 1. �Է°�ü
		String[] gameboard = {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
			// String ��ü 9���� ������ �� �ִ� �迭 ����
		
		String �¸���=""; // 3�� �Ǿ��� �� �ش� ���� ���� ����
		
		// ���� ����
		while (true) { // ���ѷ����� �������� : 9ĭ ��� ���� ������� 2. 3���� �Ǿ�����[�¸���]
			// ������ ���[�迭�� ��� �ε��� ��
			for(int i=0;i<gameboard.length;i++) {
				System.out.print(gameboard[i]);
				if(i%3==2) System.out.println();
				// ���ã�� : �� % �� == 0
				// �ε��� 2,5,8 �̸� �ٹ߲�
			}
			////////////////////////////// 1. �÷��̾� ��ġ ����////////////////////////////////////
			
			while(true) {
				System.out.print("\n��ġ ���� :");			int place = sc.nextInt();
				if(gameboard[place].equals("[ ]")) {
					gameboard[place] = "[O]";			break;
				}
				else {
				System.err.println("�˸�) �ش� ��ġ�� �̹� ���� ����[�缱��]");
				}	
			}//w2e
			/////////////////////////////// 2. ��ǻ�� ���� ����////////////////////////////////////
			while(true) {
				Random rd = new Random(); //1. ���� ��ü ����
				int place = rd.nextInt(9);		// 2. 0~8 ������ ���� int������ ��������
				if(gameboard[place].equals("[ ]")) {// 3. �ش� ������ġ�� �����̸�
					// ���� ��ġ�� �����̸� X �� �α�
					gameboard[place] = "[X]";			break; //4. ���� �ξ����� �ݺ��� Ż�� 
				}
				
			}//w2e[������ ������ġ�� �������� ���� break;]
			
			/////////////////////////////// 3.  �¸��� �Ǵ�    //////////////////////////////////////
			// 1. ���η� �̱�� ��
			for(int i=0;i<=6;i+=3) {
				if(gameboard[i].equals(gameboard[i+1])&&gameboard[i+1].equals(gameboard[i+2])) {
					�¸���=gameboard[i]; // ������ ���� �¸��� ������ ����
				}
			}
			// 2. ���η� �̱�� ��
			for(int i=0;i<=2;i++) {
				if(gameboard[i].equals(gameboard[i+3])&&gameboard[i+3].equals(gameboard[i+6])) {
					�¸���=gameboard[i]; // ������ ���� �¸��� ������ ����
				}
			}
			// 3.  �밢������ �̱�� ��
			if(gameboard[0].equals(gameboard[4])&&gameboard[4].equals(gameboard[8])) {
				�¸��� = gameboard[0];
			}
			if(gameboard[2].equals(gameboard[4])&&gameboard[4].equals(gameboard[6])) {
				�¸���=gameboard[2];
			}
	
		/////////////////////////////////4. ��������//////////////////////////////////////
			
			if(�¸���.equals("[O]")) {
				System.err.println("�÷��̾� �¸�");	break;
			}
			if(�¸���.equals("[X]")) {
				System.err.println("��ǻ�� �¸�"); break;
			}
		}//w1e
		/////////////////////////////////5. ���º� ���//////////////////////////////////////

		
		/////////////////////////////////6. ���Ӻ��� ���//////////////////////////////////////
	
		for(int i=0;i<gameboard.length;i++) {
			System.out.print(gameboard[i]);
			if(i%3==2) System.out.println();
		}
			
	}//ME
}//CS
