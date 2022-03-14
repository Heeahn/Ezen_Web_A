package Day08;

public class Bank {
	//1. �ʵ�
	private String bname;//����
	private String number;//���¹�ȣ
	private String bpassword;//���º�й�ȣ
	private double money;//��
	private String mid;
	
	//2. ������
		// 1. �������
	public Bank() {}
	public Bank(String mid) {
		this.mid = mid;
	}
	
		// 2. 3��
	public Bank(String bank, String number, String bpassword) {
		this.bname = bank;
		this.number = number;
		this.bpassword = bpassword;
	}
	
		// 3. Ǯ
	public Bank(String bank, String number, String bpassword, double money, String mid) {
		this.bname = bank;
		this.number = number;
		this.bpassword = bpassword;
		this.money = money;
		this.mid = mid;
	}

	//3. �޼ҵ�
		//���»���
	void ���»���(String loginid) {
		System.out.println("----------------------���»��� ������----------------------");
		System.out.println("����� :"); 		String bname = Day08_5.scanner.next();
		System.out.println("���¹�ȣ :"); 	String number = Day08_5.scanner.next();
		System.out.println("���º�й�ȣ :"); 		String bpassword = Day08_5.scanner.next();
	
		for(Bank temp : Day08_5.banks) {
			if(temp != null && temp.number.equals(number)) {
				System.out.println("�˸�) ���� ������� ���¹�ȣ�Դϴ�.");
				return ; 
			}
		}
		Bank bank = new Bank(bname,number,bpassword,0,loginid);
		
		int i = 0;
		for(Bank temp : Day08_5.banks) {//fs
			if(temp==null) {
				Day08_5.banks[i] = bank;
				System.out.println("���»��� �����߽��ϴ�.");
				Day08_5.banks[i].mid = loginid;
				return; //
			}
			i++;
		}
	}
	void ���¸��(String loginid) {
		System.out.println("----------------------���¸�� ������----------------------");
		System.out.print("�����\t���¹�ȣ\t�ܿ���\t������ \n");
		
		int i = 0;
		for(Bank temp : Day08_5.banks ) {
			if(temp != null) {
				System.out.println(temp.bname+"\t"+temp.number+
						"\t"+temp.money+"\t"+temp.mid);
				Day08_5.banks[i].mid = loginid;
			}
		}
		i++;
	}
	
	void �Ա�(String loginid) {
		System.out.println("----------------------�Ա� ������----------------------");
		System.out.println("���¹�ȣ �Է� :"); String number = Day08_5.scanner.next();
		
		int i = 0;
		for(Bank temp : Day08_5.banks) {
			if(temp !=null && temp.number.equals(number)) {
				System.out.println("�Ա� �ݾ� �Է� :"); double money = Day08_5.scanner.nextInt();
				Day08_5.banks[i].money += money;
				System.out.println("�ܾ� :"+temp.money);
				Day08_5.banks[i].mid = loginid;
				return;
			}
			else {
				System.out.println("Ʋ�� �����Դϴ�.");
				return;
			}
		}
		i++;
	}
	
	void ���(String loginid) {
		System.out.println("----------------------��� ������----------------------");
		System.out.println("���¹�ȣ �Է� :"); String number = Day08_5.scanner.next();
		System.out.println("��й�ȣ �Է� :"); String bpassword = Day08_5.scanner.next();
		
		int i = 0;
		for(Bank temp : Day08_5.banks) {
			if(temp !=null && temp.number.equals(number) && temp.bpassword.equals(bpassword)) {
				System.out.println("��� �ݾ� �Է� :"); double money = Day08_5.scanner.nextInt();
				if(temp.money<money) {
					System.out.println("�ܾ� ����");
					return;
				}
				else {
					Day08_5.banks[i].money -= money;
					System.out.println("�ܾ� :"+temp.money);
					Day08_5.banks[i].mid = loginid;
					return;
				}
				
			}
			else {
				System.out.println("Ʋ�� �����Դϴ�.");
				return;
			}
		}
		i++;
	}
	void ��ü(String loginid) {
		System.out.println("----------------------��ü ������----------------------");
		System.out.println("���¹�ȣ �Է� :"); String number = Day08_5.scanner.next();
		System.out.println("��ü ���� �Է� :"); String yournumber = Day08_5.scanner.next();
		
		int i =0;
		for(Bank temp : Day08_5.banks) {
			if(temp != null&&temp.number.equals(number) && !temp.number.equals(yournumber)) {
				System.out.println("���� �ݾ� :"); int sendmoney = Day08_5.scanner.nextInt();
				if(temp.money<sendmoney) {
						System.out.println("�ܾ׺���");
						return;
					}
				else {
					System.out.println("��ü�� �Ϸ�Ǿ����ϴ�.");
					Day08_5.banks[i].money -= sendmoney;
					System.out.println("�ܾ� : "+temp.money);
					Day08_5.banks[i].mid = loginid;
					return;
					}
				}
			else {
				System.out.println("Ʋ�� �����Դϴ�.");
				return;
			}
		}
		i++;
	}

	public String getBank() {
		return bname;
	}
	public void setBank(String bname) {
		this.bname = bname;
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
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	
	
}
