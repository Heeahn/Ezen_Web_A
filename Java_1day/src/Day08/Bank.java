package Day08;

public class Bank {

	//1. �ʵ�
	
	private String bank;//����
	private String number;//���¹�ȣ
	private String bpassword;//���º�й�ȣ
	private int money;//��
	
	//2. ������
		// 1. �������
	public Bank() {}
		// 2. 3��
	public Bank(String bank, String number, String bpassword) {
		this.bank = bank;
		this.number = number;
		this.bpassword = bpassword;
	}
		// 3. Ǯ
	public Bank(String bank, String number, String bpassword, int money) {
		this.bank = bank;
		this.number = number;
		this.bpassword = bpassword;
		this.money = money;
	}

	//3. �޼ҵ�
		//���»���
	boolean ���»���() {
		System.out.println("----------------------���»��� ������----------------------");
		System.out.println("����� :"); 		String bank = Day08_5.scanner.next();
		System.out.println("���¹�ȣ :"); 	String number = Day08_5.scanner.next();
		System.out.println("���º�й�ȣ :"); 		String bpassword = Day08_5.scanner.next();
	
		for(Bank temp : Day08_5.banks) {
			if(temp != null && temp.number.equals(number)) {
				System.out.println("�˸�) ���� ������� ���¹�ȣ�Դϴ�.");
				return false; 
			}
		}
		Bank bank2 = new Bank(bank,number,bpassword);
		
		int i = 0;
		for(Bank temp : Day08_5.banks) {//fs
			if(temp==null) {
				Day08_5.banks[i] = bank2;
				System.out.println("ȸ�����Կ� �����߽��ϴ�.");
				return true; //
			}
			i++;
		}
		return false;
	}
	
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getBpassword() {
		return bpassword;
	}
	public void setBpassword(String bpassword) {
		this.bpassword = bpassword;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
