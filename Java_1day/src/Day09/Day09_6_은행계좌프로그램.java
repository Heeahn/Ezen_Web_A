package Day09;

import java.util.Scanner;

public class Day09_6_����������α׷� {

	// ����������α׷�[���]
		// ����[super]
		// ��������[sub], ��������[sub], �ϳ�����[sub]
		// �� ��� : 1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. �����¸�� 6. ����
	
	//** main �ۿ��� �����ϴ� ����
		//* ��� Ŭ�������� ����ϱ� ���� static �迭�� ����
		// static ������ ���α׷� ���۽� �޸��Ҵ� -> ���α׷� ����� �޸� �Ҵ�
	public static Bank[] ���¸���Ʈ = new Bank[100];
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {// ���α׷� ���ѷ���[��������x]
			System.out.println("---------------���� �ý���---------------");
			System.out.println("1.���»��� 2. �Ա� 3. ��� 4. ��ü 5. ���¸�� 6. ���� ���� :");
			int ch = scanner.nextInt();
			
			BankContlor bankContlor = new BankContlor(); // ��Ʈ�ѷ� �޼ҵ� ȣ��
			
			if(ch==1) {
				//�Է�
				System.out.println("+++ ���µ�� ������ +++");
				System.out.println("��й�ȣ :"); String bankPassword = scanner.next();
				System.out.println("������ :");	String bankid = scanner.next();
				System.out.println("���༱�� <1.���� 2. ���� 3. �ϳ�> : ");	int bn = scanner.nextInt();
				// ��Ʈ�ѷ� ����
				String bankNumber = bankContlor.���»���(bankPassword, bankid, bn); // �޼ҵ� ȣ��[�μ�3��]
				// �޼ҵ� ��ȯ ���� = ���¹�ȣ Ȥ�� null
				// �޼ҵ� ������ �޽��� ���
				if(bankNumber!=null) {
					System.out.println("***���� ����***");
					System.out.println("������ ���¹�ȣ :"+bankNumber);
				}
				else {
					System.out.println("�˸�] ���µ�� ����(�����ڿ��� ����)");
				}
			}
			else if(ch==2) {
				System.out.println("+++ �Ա� ������ +++");
				System.out.println("���¹�ȣ �Է� :"); String bankNumber = scanner.next();
				System.out.println("�ݾ��Է� : "); int bankMoney = scanner.nextInt();
				
			Boolean result = bankContlor.�Ա�(bankNumber, bankMoney);
				
				if(result) {
					System.out.println("**�Աݼ���**");
				}
				else {
					System.err.println("�˸�)�Աݿ� �����Ͽ����ϴ�.");
				}
			}
			else if(ch==3) {
				System.out.println("+++ ��� ������ +++");
				System.out.println("���¹�ȣ �Է� :"); String bankNumber = scanner.next();
				System.out.println("��й�ȣ �Է� :"); String bankPassword = scanner.next();
				System.out.println("�ݾ��Է� : "); int bankMoney = scanner.nextInt();
				
			int result = bankContlor.���(bankNumber,bankPassword, bankMoney);
				
				if(result ==1) {
					System.out.println("**�ܾ� ����**");
				}
				else if(result == 2){
					System.err.println("**��� ����**");
				}
				else if(result ==3) {
					System.out.println("** �ùٸ� ������ �ƴմϴ�. **");
				}
				else System.out.println("�ùٸ� ������ �ƴմϴ�.");
			}
			else if(ch==4) {
				System.out.println("+++ ��ü ������ +++");
				System.out.println("�� ���¹�ȣ �Է� :"); String myBankNumber = scanner.next();
				System.out.println("��й�ȣ �Է�:"); String bankPassword = scanner.next();
				System.out.println("��ü �ݾ� �Է�:"); int bankMoney = scanner.nextInt();
				System.out.println("�޴� ���¹�ȣ �Է� : "); String yourBankNumber = scanner.next();
				
				int result = bankContlor.��ü(myBankNumber, bankPassword, bankMoney, yourBankNumber);
				
				if(result == 1) {
					System.out.println("**�ܾ׺���**");
				}
				else if(result == 2) {
					System.out.println("**��ü ����**");
				}
				else if(result == 3) {
					System.out.println("** �޴� ���� ������ �����ϴ�.**");
				}
				else if(result == 4) {
					System.out.println("** ������ ���� ������ �����ϴ�.**");
				}
				
			}
			else if(ch==5) {
				System.out.println("+++ �� ���¸�� ������ +++");
				System.out.println("������ :"); String bankid = scanner.next();
				Bank[] myBanklist = bankContlor.���¸��(bankid);
				
				System.out.println("*** �˻��� ������ ���� ���¸�� ***");
				int i =1;
				for(Bank temp : myBanklist) {
					if(temp !=null) { 
						System.out.println(i+"�� ���¹�ȣ :"+temp.getBankNumber());
						System.out.println(i+"�� �ܾ�"+temp.getBankmoney());
					}
					i++;
				}
				
			}
			else if(ch==6) {
				System.out.println("+++ ���� ������ +++");
			}
			else {
				System.err.println("�˸�) �˼����� ��ȣ�Դϴ�.");
			}
				
		}
		
		
		
	}
	
}
