package Day09;

public class Bank {
	
	// 1. 필드
	private String bankNumber;	// 계좌번호[중복x = 식별용]
	private String bankPassword;	// 비밀번호
	private String bankid;	// 계좌주
	private int bankmoney;	// 예금액
	
	// 2. 생성자
		// 1. 빈
	public Bank() {}
		// 2. 모든필드 생성자
	public Bank(String bankNumber, String bankPassword, String bankid, int bankmoney) {
		this.bankNumber = bankNumber;
		this.bankPassword = bankPassword;
		this.bankid = bankid;
		this.bankmoney = bankmoney;
	}
	
	// 3. 메소드
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
