package Day08;

public class Loan {
	
	// 1. �ʵ�
	private String loanName;	// �����̸�(������)
	private int lmoney;	// �ݾ�(������)
	private double interest;	// ����(������)
	private String lid;	// ������[id]
	private boolean cl;	// ��ȯ����(�ѹ���)

	// 2. ������
	// �������
	public Loan() {}
	
	// 3�� ������[�����ǰ]
	public Loan(String loanName, int lmoney, double interest) {
		this.loanName = loanName;
		this.lmoney = lmoney;
		this.interest = interest;
	}
	
	// Ǯ������
	public Loan(String loanName, int lmoney, double interest, String lid, boolean cl) {
		this.loanName = loanName;
		this.lmoney = lmoney;
		this.interest = interest;
		this.lid = lid;
		this.cl = cl;
	}

	// 3. �޼ҵ�
	
	// �� �޼ҵ�
	void ��������(String loginid) {
		System.out.println("----------------------���� ���� ������------------------------");
		System.out.println("���� ��ǰ : "); String loanName = Day08_5.scanner.next();
		
		Loan loan = new Loan();
		
		int i = 0;
		for(Loan temp : Day08_5.loans) {
			if(temp != null && temp.loanName.equals(loanName)) {
				System.out.println(loanName+"��ǰ�� �����Ͽ����ϴ�.");
			}
		}
		i++;
	}
	void �����ȯ() {
		System.out.println("----------------------���� ��ȯ ������------------------------");

	}
	
	// ������ �޼ҵ�
	void ������() {
		System.out.println("----------------------���� ��� ������------------------------");
		System.out.println("���� ��ǰ �̸� :"); String loanName = Day08_5.scanner.next();
		for(Loan temp : Day08_5.loans) {
			if(temp != null && temp.loanName.equals(loanName)) {
				System.out.println("�˸�) ���� ������� ���̵��Դϴ�.");
				return;
			}
		}	
		System.out.println("�ݾ� :"); int lmoney = Day08_5.scanner.nextInt();
		System.out.println("���� :"); double interest = Day08_5.scanner.nextDouble();
		
		Loan loan = new Loan(loanName, lmoney, interest);
		
		int i = 0;
		for(Loan temp : Day08_5.loans) {
			if(temp == null) {
				Day08_5.loans[i] = loan;
				return; // ��� ������ �޼ҵ� ����
			}
		i++;
		}		
	}
	void ��������() {
		System.out.println("----------------------���� �� ��� ������------------------------");
		System.out.println("���� �̸�\t���� �ݾ�\t���� ����\t������");
		for(Loan temp : Day08_5.loans) {
			if(temp !=null) {
				System.out.println(temp.loanName+"\t"+temp.lmoney+"\t"+
					temp.interest+"\t"+temp.lid);
			}
		}
	}
	void �������() {
		System.out.println("----------------------���� ���� ������------------------------");
		System.out.println("");
		
	}

	
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	public int getLmoney() {
		return lmoney;
	}
	public void setLmoney(int lmoney) {
		this.lmoney = lmoney;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public boolean isCl() {
		return cl;
	}
	public void setCl(boolean cl) {
		this.cl = cl;
	}
}
