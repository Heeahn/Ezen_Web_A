package Day09;

public class Bank {
	
	// 1. �ʵ�
	private String bankNumber;	// ���¹�ȣ[�ߺ�x = �ĺ���]
	private String bankPassword;	// ��й�ȣ
	private String bankid;	// ������
	private int bankmoney;	// ���ݾ�
	
	// 2. ������
		// 1. ��
	public Bank() {}
		// 2. ����ʵ� ������
	public Bank(String bankNumber, String bankPassword, String bankid, int bankmoney) {
		this.bankNumber = bankNumber;
		this.bankPassword = bankPassword;
		this.bankid = bankid;
		this.bankmoney = bankmoney;
	}
	
	// 3. �޼ҵ�
	public String getBankNumber() {
		return bankNumber;
	}
	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}
	public String getBankPassword() {
		return bankPassword;
	}
	public void setBankPassword(String bankPassword) {
		this.bankPassword = bankPassword;
	}
	public String getBankid() {
		return bankid;
	}
	public void setBankid(String bankid) {
		this.bankid = bankid;
	}
	public int getBankmoney() {
		return bankmoney;
	}
	public void setBankmoney(int bankmoney) {
		this.bankmoney = bankmoney;
	}

}
