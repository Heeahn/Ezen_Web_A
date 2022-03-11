package Day08;

public class Bank {

	//1. 필드
	
	private String bank;//은행
	private String number;//계좌번호
	private String bpassword;//계좌비밀번호
	private int money;//돈
	
	//2. 생성자
		// 1. 빈생성자
	public Bank() {}
		// 2. 3개
	public Bank(String bank, String number, String bpassword) {
		this.bank = bank;
		this.number = number;
		this.bpassword = bpassword;
	}
		// 3. 풀
	public Bank(String bank, String number, String bpassword, int money) {
		this.bank = bank;
		this.number = number;
		this.bpassword = bpassword;
		this.money = money;
	}

	//3. 메소드
		//계좌생성
	boolean 계좌생성() {
		System.out.println("----------------------계좌생성 페이지----------------------");
		System.out.println("은행명 :"); 		String bank = Day08_5.scanner.next();
		System.out.println("계좌번호 :"); 	String number = Day08_5.scanner.next();
		System.out.println("계좌비밀번호 :"); 		String bpassword = Day08_5.scanner.next();
	
		for(Bank temp : Day08_5.banks) {
			if(temp != null && temp.number.equals(number)) {
				System.out.println("알림) 현재 사용중인 계좌번호입니다.");
				return false; 
			}
		}
		Bank bank2 = new Bank(bank,number,bpassword);
		
		int i = 0;
		for(Bank temp : Day08_5.banks) {//fs
			if(temp==null) {
				Day08_5.banks[i] = bank2;
				System.out.println("회원가입에 성공했습니다.");
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
