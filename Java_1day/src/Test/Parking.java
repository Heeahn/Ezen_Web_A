package Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Parking {
	
	//필드
	ArrayList<Parking> parkingList = new ArrayList<>();
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

	public Parking( LocalDate date,String carNum, LocalTime inTime, LocalTime outTime, int money) {
		this.carNum = carNum;
		this.date = date;
		this.inTime = inTime;
		this.outTime = outTime;
		this.money = money;
	}
	
	public Parking(ArrayList<Parking> parkingList, String carNum, LocalDate date, LocalTime inTime, LocalTime outTime, int money) {
		this.parkingList = parkingList;
		this.carNum = carNum;
		this.date = date;
		this.inTime = inTime;
		this.outTime = outTime;
		this.money = money;
	}

	public ArrayList<Parking> getParkingList() {
		return parkingList;
	}

	public void setParkingList(ArrayList<Parking> parkingList) {
		this.parkingList = parkingList;
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
