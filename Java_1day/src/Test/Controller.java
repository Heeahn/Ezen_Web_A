package Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;

public class Controller {

	public static ArrayList<Parking> parkingList = new ArrayList<>();
	Date date = new Date();
	
	//입차 메소드
	public static boolean enter(String carNumber) {
		for(Parking temp : parkingList) {
			if(temp==null) {
				//입차 코드 작성
					// 1. 입력받은 차량번호(인수) 가져온다.
				Parking parking = new Parking(carNumber);
					//* 차량번호 중복체크
				for(Parking temp1: parkingList) {
					if(temp1!=null&&temp1.getCarNum().equals(carNumber)) {
						System.out.println("동일한 차량이 존재합니다.");
						break;
					}
					else {
						temp1.setCarNum(carNumber);
						// 2. 입차날짜(현재날짜)을 구한다
						LocalDate date =LocalDate.now();
						temp1.setDate(date);
						// 3. 입차시간을 구한다
						LocalTime localTime = LocalTime.now();
						DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
						String formatttedNow = localTime.format(dateTimeFormatter);
						temp1.setInTime(localTime);
						// 4. 차량번호, 입차날짜, 입차시간 => 3개변수 -> 객체화
						Parking parkingin = new Parking(date, carNumber, localTime);
						// 5. 차량객체를 배열이나 리스트에 저장
						parkingList.add(parkingin);
						return true;
					}
				}
			}
		else return false; 
		}
		return false;
	}
	//출차 메소드
	public static boolean exit(String carNumber) {
		// 출차 코드 작성
			// 1. 입력받은 차량번호(인수) 가져온다.
		Parking parking = new Parking(carNumber);
			// 2. 배열 or 리스트내 동일한 차량번호를 찾아서
		for(Parking temp: parkingList) {
			if(temp==null) {
				if(temp!=null&&temp.getCarNum().equals(carNumber)) {
				System.out.println(carNumber+"출차합니다.");
				// 3. 출차시간(현재시간)을 구한다
				LocalTime localTime = LocalTime.now();
				DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
				String formatttedNow = localTime.format(dateTimeFormatter);
				temp.setOutTime(localTime);
				// 4. 계산[출차시간-입차시간 => (분-30)/10 * 1000
				temp.setMoney(((temp.getOutTime().until(temp.getInTime(),ChronoUnit.MINUTES))-30)/10*1000);
				
				// 5. (수정)찾은 객체내 출차시간과 금액을 대입한다.
				temp = null;
				
				return true;
				}
				else {
					System.out.println("차량번호가 다릅니다.[재입력]");
					break;
				}
			}
		}
		return false;
	}	
}
