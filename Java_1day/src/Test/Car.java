package Test;

public class Car {
	
	// 필드
	private String carNumber;
	private String intimeymd;
	private String intimehm;
	private String outtime;
	private String money;
	private String intime;	
	
	// 생성자
	public Car() {}

	public Car(String intimeymd, String carnum,  String intimehm, String outtime, String money, String intime) {
		this.carNumber = carnum;
		this.intimeymd = intimeymd;
		this.intimehm = intimehm;
		this.outtime = outtime;
		this.money = money;
		this.intime = intime;
	}
	// 메소드
	

	public String getCarnumber() {
		return carNumber;
	}

	public void setCarnumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getIntimeymd() {
		return intimeymd;
	}

	public void setIntimeymd(String intimeymd) {
		this.intimeymd = intimeymd;
	}

	public String getIntimehm() {
		return intimehm;
	}

	public void setIntimehm(String intimehm) {
		this.intimehm = intimehm;
	}

	public String getOuttime() {
		return outtime;
	}

	public void setOuttime(String outtime) {
		this.outtime = outtime;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getIntime() {
		return intime;
	}

	public void setIntime(String intime) {
		this.intime = intime;
	}
	
}
