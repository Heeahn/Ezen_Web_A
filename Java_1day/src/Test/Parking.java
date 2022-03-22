package Test;

import java.time.LocalDate;
import java.time.LocalTime;

public class Parking {
	
	//필드
	private String carNum;
	private LocalDate date;
	private LocalTime inTime;
	private LocalTime outTime ;
	private int money ;
	
	//생성자
	public Parking() {}
	
	public Parking( String carNum) {
		this.carNum = carNum;
	}
	
	public Parking( LocalDate date,String carNum, LocalTime inTime) {
		this.carNum = carNum;
		this.date = date;
		this.inTime = inTime;
	}

	public Parking( LocalDate date,String carNum, LocalTime inTime, LocalTime outTime, int money) {
		this.carNum = carNum;
		this.date = date;
		this.inTime = inTime;
		this.outTime = outTime;
		this.money = money;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getInTime() {
		return inTime;
	}

	public void setInTime(LocalTime inTime) {
		this.inTime = inTime;
	}

	public LocalTime getOutTime() {
		return outTime;
	}

	public void setOutTime(LocalTime outTime) {
		this.outTime = outTime;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	//메소드
	

}
