package Day08;

public class Loan {
	
	// 1. 필드
	private String loanName;	// 대출이름(관리자)
	private int lmoney;	// 금액(관리자)
	private double interest;	// 이자(관리자)
	private String lid;	// 대출인[id]
	private boolean cl;	// 상환여부(한번에)

	// 2. 생성자
	// 빈생성자
	public Loan() {}
	
	// 3개 생성자[대출상품]
	public Loan(String loanName, int lmoney, double interest) {
		this.loanName = loanName;
		this.lmoney = lmoney;
		this.interest = interest;
	}
	
	// 풀생성자
	public Loan(String loanName, int lmoney, double interest, String lid, boolean cl) {
		this.loanName = loanName;
		this.lmoney = lmoney;
		this.interest = interest;
		this.lid = lid;
		this.cl = cl;
	}

	// 3. 메소드
	
	// 고객 메소드
	void 대출진행(String loginid) {
		System.out.println("----------------------대출 진행 페이지------------------------");
		System.out.println("대출 상품 : "); String loanName = Day08_5.scanner.next();
		
		Loan loan = new Loan();
		
		int i = 0;
		for(Loan temp : Day08_5.loans) {
			if(temp != null && temp.loanName.equals(loanName)) {
				System.out.println(loanName+"상품을 대출하였습니다.");
			}
		}
		i++;
	}
	void 대출상환() {
		System.out.println("----------------------대출 상환 페이지------------------------");

	}
	
	// 관리자 메소드
	void 대출등록() {
		System.out.println("----------------------대출 등록 페이지------------------------");
		System.out.println("대출 상품 이름 :"); String loanName = Day08_5.scanner.next();
		for(Loan temp : Day08_5.loans) {
			if(temp != null && temp.loanName.equals(loanName)) {
				System.out.println("알림) 현재 사용중인 아이디입니다.");
				return;
			}
		}	
		System.out.println("금액 :"); int lmoney = Day08_5.scanner.nextInt();
		System.out.println("이자 :"); double interest = Day08_5.scanner.nextDouble();
		
		Loan loan = new Loan(loanName, lmoney, interest);
		
		int i = 0;
		for(Loan temp : Day08_5.loans) {
			if(temp == null) {
				Day08_5.loans[i] = loan;
				return; // 등록 성공시 메소드 종료
			}
		i++;
		}		
	}
	void 대출고객목록() {
		System.out.println("----------------------대출 고객 목록 페이지------------------------");
		System.out.println("대출 이름\t대출 금액\t대출 이자\t대출인");
		for(Loan temp : Day08_5.loans) {
			if(temp !=null) {
				System.out.println(temp.loanName+"\t"+temp.lmoney+"\t"+
					temp.interest+"\t"+temp.lid);
			}
		}
	}
	void 대출삭제() {
		System.out.println("----------------------대출 삭제 페이지------------------------");
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
