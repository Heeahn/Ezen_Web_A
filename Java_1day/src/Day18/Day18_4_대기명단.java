package Day18;

import java.util.ArrayList;
import java.util.Scanner;

public class Day18_4_����� {
	
	public static void main(String[] args) {
		
		// ����� ���α׷�
			// �޴� :[��] 1.����߰� 2.������[������] 3.���������
				// ����߰� : �ο����� �Է¹޾� ����ȣ ��ȯ
				// ������ : ����ȣ �Է¹޾� ��� ���
				// ��������� : ù��° ������� ����ȣ ȣ��
		int waitNum = 1;
		ArrayList<Waiting> waitings = new ArrayList<>();
			// �������� ��� ��ü�� ������ �� �ִ� ����Ʈ��ü ����
		Scanner scanner = new Scanner(System.in);
		
		try {
		while(true) {
				// �ݺ����� �̿��� ����Ʈ�� ��� ��ü ȣ��
				System.out.println("����ȣ\t �ο��� \t ��⿹��ð�");
				for(Waiting temp: waitings) {
					if(waitings.indexOf(temp)==0) System.out.println(temp.waitNum+"\t\t"+temp.number+"\t\t ����");
					else System.out.println(temp.waitNum + "\t\t"+temp.number+"\t\t"+waitings.indexOf(temp)*3+"��");
				}
				System.out.println("[��] 1.����߰� 2.������ [������] 3.���������");
				int ch = scanner.nextInt();
				
				if(ch==1) {
					// 1. �Է¹��� ���� ������ ����
					System.out.println("*��ȭ��ȣ : "); String phone = scanner.next();
					System.out.println("*�ο��� : "); int number = scanner.nextInt();
					// 2. 3������ -> 1�� ��üȭ
					Waiting temp = new Waiting(waitNum, phone, number);
					// 3. ��� �ο����� ����Ʈ�� ����
					waitings.add(temp);
					waitNum++; //* ����ȣ ����
				}
				else if(ch==2) {
					System.out.println("����ȣ :"); int ��������ȣ = scanner.nextInt();
					//����Ʈ�� ��ü �ʵ� �˻�
					for(Waiting temp : waitings) {if(temp.waitNum == ��������ȣ) {waitings.remove(temp); break;}
					// * ����� ����Ʈ�� �ϳ��� temp ȣ���ϴµ� ���࿡ temp�� ����ȣ�� �Է¹��� ��������ȣ�� ������ �ش� temp�� ������ �ݺ�������
					}
				}
				else if(ch==3) {
					System.out.println("���� �տ� �ִ� ������� ���� ��ŵ�ϴ�."); waitings.remove(0); // 0��° �ε��� ����
				}
				else {System.out.println("�Է��� �߸��Ǿ����ϴ�.");}
			}
		}catch (Exception e) {	}
	}
}
