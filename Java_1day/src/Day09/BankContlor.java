package Day09;

import java.util.Random;

public class BankContlor { // Ŭ����
					// ����� ��� x
	// V[�����] <----> M
	// �ش� ũ������ ���� ���� ����ѷ�
	// M : ��[������]
	// V : �� [�����]
	// C : �𵨰� �� ���� ����
	
	// �信�� ��û�ϴ� ����[���] ����
		// 1. ���»���(C)
	public String ���»���(String bankPassword, String bankid, int bn) {
		
		// 1. �Է¹��� ���� �����´�[�μ�]
		String bankNumber =null;
		while(true) {
			// ���¹�ȣ �ڵ�����
			Random random = new Random(); // ����
			// 4�ڸ� ����
			int ���� = random.nextInt(10000); // 0~9999 ����
			bankNumber = String.format("%04d", ����);	// %04d ���� 4�ڸ�[���� �ڸ��� ������ 0ó��]		
			//�ߺ�üũ
			boolean sameBankNumber = false;
			for(Bank temp3 : Day09_6_����������α׷�.���¸���Ʈ) {
				if(temp3!=null&&temp3.getBankNumber().equals(bankNumber)) {
					sameBankNumber = true;
				}
				if(sameBankNumber==false) break;
			}
			
			// 2. ��üȭ[�ټ��� ������ �ϳ��� ��ü�� �����]
			Bank temp = null;
			if(bn ==1) {temp = new KBB(bankNumber, bankPassword, bankid, 0);
			}
			else if(bn ==2) {temp = new SHB(bankNumber, bankPassword, bankid, 0);
			}
			else if(bn==3) {temp = new HNB(bankNumber, bankPassword, bankid, 0);
			}
			// 3. �迭�� ����
			int i = 0;
			for(Bank temp2 : Day09_6_����������α׷�.���¸���Ʈ) {
				if(temp2 == null ) {Day09_6_����������α׷�.���¸���Ʈ[i] = temp;
					System.out.println("***���µ��***"); return bankNumber; // ���¹�ȣ�� �����ϸ� ����
				}
				i++;
			}
			return null;
		}
	}
		// 2. �Ա�(U)
	public boolean �Ա�(String bankNumber, int bankMoney) {		

		// 1. ������ ���¹�ȣ ã�Ƽ�
		int i = 0;
		for(Bank temp : Day09_6_����������α׷�.���¸���Ʈ) {
			if(temp != null && temp.getBankNumber().equals(bankNumber)) {
				// �ش� ���°� ������ �ƴϰ� �Է���[�μ�]�� ������

		// 2. ������ ���¹�ȣ�� ������ �Ա� ó��
				Day09_6_����������α׷�.���¸���Ʈ[i].setBankmoney(temp.getBankmoney()+bankMoney);
				return true;
			}
		i++;
		}
		// 3. ������ ���¹�ȣ�� ������ �Ա� ����
		return false;
	}
		// 3. ���(U)
	public int ���(String bankNumber,String bankPassword, int bankMoney) {
		
		int i = 0;
		for(Bank temp : Day09_6_����������α׷�.���¸���Ʈ) {
			if(temp != null && temp.getBankPassword().equals(bankPassword) &&
					temp.getBankNumber().equals(bankNumber)) {
				// �ش� ���°� ������ �ƴϰ� �Է���[�μ�]�� ������

				// 2. ������ ���¹�ȣ�� ������ �Ա� ó��
				if(temp.getBankmoney()<bankMoney) {
					return 1;
				}
				else {
					Day09_6_����������α׷�.���¸���Ʈ[i].setBankmoney(temp.getBankmoney()-bankMoney);
					return 2;
				}
			}
			i++;
		}
		return 3;}
	
		// 4. ��ü(U)
	public int ��ü(String myBankNumber, String bankPassword, int bankMoney, String yourBankNumber ) {
		
		int i= 0;
		for(Bank temp: Day09_6_����������α׷�.���¸���Ʈ) {
			if(temp != null && temp.getBankNumber().equals(myBankNumber)&&
					temp.getBankPassword().equals(bankPassword)) {
				
				int j = 0;
				for(Bank temp2 : Day09_6_����������α׷�.���¸���Ʈ) {
					if(temp2 != null && temp2.getBankNumber().equals(yourBankNumber)) {
						
						if(temp.getBankmoney()<bankMoney) {
							return 1;
						}
						else {
							Day09_6_����������α׷�.���¸���Ʈ[i].setBankmoney(temp.getBankmoney()-bankMoney);
							Day09_6_����������α׷�.���¸���Ʈ[j].setBankmoney(temp2.getBankmoney()+bankMoney);
							return 2;
						}
					}
					j++;
				}				
			}
			i++;
		}
		return 4;}
	
		// 5. �����¸��(R)
	public Bank[] ���¸��(String bankid) {
	// �Է¹��� �������� ���¸�� ���� ��ȯ	
		//������ �������� ���¸� ã�Ƽ� �迭��� �ѱ��
		Bank[] myBankList = new Bank[100];
		
		for (Bank temp : Day09_6_����������α׷�.���¸���Ʈ) {
			if(temp!=null && temp.getBankid().equals(bankid)) {
				// �ش� ���³� �����ֿ� �μ��� �����ֿ� �����ϸ�
				// �����¸�� �迭�� ������� ã�Ƽ� �����¸�Ͽ� �ֱ�
				int i = 0;
				for(Bank temp2 : myBankList) {
					if(temp2 == null) {
						myBankList[i]=temp; break;
					}
					i++;
				}
			}
		}
		return myBankList;
	}
		// 6. ����(U)
	public boolean ����() {return false;}
	
}
