package Day08;

public class Bank {
	//1. 필드
	private String bname;//은행
	private String number;//계좌번호
	private String bpassword;//계좌비밀번호
	private double money;//돈
	private String mid;
	
	//2. 생성자
		// 1. 빈생성자
	public Bank() {}
	public Bank(String mid) {
		this.mid = mid;
	}
	
		// 2. 3개
	public Bank(String bank, String number, String bpassword) {
		this.bname = bank;
		this.number = number;
		this.bpassword = bpassword;
	}
	
		// 3. 풀
	public Bank(String bank, String number, String bpassword, double money, String mid) {
		this.bname = bank;
		this.number = number;
		this.bpassword = bpassword;
		this.money = money;
		this.mid = mid;
	}

	//3. 메소드
		//계좌생성
	void 계좌생성(String loginid) {
		System.out.println("----------------------계좌생성 페이지----------------------");
		System.out.println("은행명 :"); 		String bname = Day08_5.scanner.next();
		System.out.println("계좌번호 :"); 	String number = Day08_5.scanner.next();
		System.out.println("계좌비밀번호 :"); 		String bpassword = Day08_5.scanner.next();
	
		for(Bank temp : Day08_5.banks) {
			if(temp != null && temp.number.equals(number)) {
				System.out.println("알림) 현재 사용중인 계좌번호입니다.");
				return ; 
			}
		}
		Bank bank = new Bank(bname,number,bpassword,0,loginid);
		
		int i = 0;
		for(Bank temp : Day08_5.banks) {//fs
			if(temp==null) {
				Day08_5.banks[i] = bank;
				System.out.println("계좌생성 성공했습니다.");
				Day08_5.banks[i].mid = loginid;
				return; //
			}
			i++;
		}
	}
	void 계좌목록(String loginid) {
		System.out.println("----------------------계좌목록 페이지----------------------");
		System.out.print("은행명\t계좌번호\t잔여금\t예금주 \n");
		
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
	
	void 입금(String loginid) {
		System.out.println("----------------------입금 페이지----------------------");
		System.out.println("계좌번호 입력 :"); String number = Day08_5.scanner.next();
		
		int i = 0;
		for(Bank temp : Day08_5.banks) {
			if(temp !=null && temp.number.equals(number)) {
				System.out.println("입금 금액 입력 :"); double money = Day08_5.scanner.nextInt();
				Day08_5.banks[i].money += money;
				System.out.println("잔액 :"+temp.money);
				Day08_5.banks[i].mid = loginid;
				return;
			}
			else {
				System.out.println("틀린 계좌입니다.");
				return;
			}
		}
		i++;
	}
	
	void 출금(String loginid) {
		System.out.println("----------------------출금 페이지----------------------");
		System.out.println("계좌번호 입력 :"); String number = Day08_5.scanner.next();
		System.out.println("비밀번호 입력 :"); String bpassword = Day08_5.scanner.next();
		
		int i = 0;
		for(Bank temp : Day08_5.banks) {
			if(temp !=null && temp.number.equals(number) && temp.bpassword.equals(bpassword)) {
				System.out.println("출금 금액 입력 :"); double money = Day08_5.scanner.nextInt();
				if(temp.money<money) {
					System.out.println("잔액 부족");
					return;
				}
				else {
					Day08_5.banks[i].money -= money;
					System.out.println("잔액 :"+temp.money);
					Day08_5.banks[i].mid = loginid;
					return;
				}
				
			}
			else {
				System.out.println("틀린 계좌입니다.");
				return;
			}
		}
		i++;
	}
	void 이체(String loginid) {
		System.out.println("----------------------이체 페이지----------------------");
		System.out.println("계좌번호 입력 :"); String number = Day08_5.scanner.next();
		System.out.println("이체 계좌 입력 :"); String yournumber = Day08_5.scanner.next();
		
		int i =0;
		for(Bank temp : Day08_5.banks) {
			if(temp != null&&temp.number.equals(number) && !temp.number.equals(yournumber)) {
				System.out.println("보낼 금액 :"); int sendmoney = Day08_5.scanner.nextInt();
				if(temp.money<sendmoney) {
						System.out.println("잔액부족");
						return;
					}
				else {
					System.out.println("이체가 완료되었습니다.");
					Day08_5.banks[i].money -= sendmoney;
					System.out.println("잔액 : "+temp.money);
					Day08_5.banks[i].mid = loginid;
					return;
					}
				}
			else {
				System.out.println("틀린 계좌입니다.");
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
