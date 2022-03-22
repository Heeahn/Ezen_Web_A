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
	
	//���� �޼ҵ�
	public static boolean enter(String carNumber) {
		for(Parking temp : parkingList) {
			if(temp==null) {
				//���� �ڵ� �ۼ�
					// 1. �Է¹��� ������ȣ(�μ�) �����´�.
				Parking parking = new Parking(carNumber);
					//* ������ȣ �ߺ�üũ
				for(Parking temp1: parkingList) {
					if(temp1!=null&&temp1.getCarNum().equals(carNumber)) {
						System.out.println("������ ������ �����մϴ�.");
						break;
					}
					else {
						temp1.setCarNum(carNumber);
						// 2. ������¥(���糯¥)�� ���Ѵ�
						LocalDate date =LocalDate.now();
						temp1.setDate(date);
						// 3. �����ð��� ���Ѵ�
						LocalTime localTime = LocalTime.now();
						DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
						String formatttedNow = localTime.format(dateTimeFormatter);
						temp1.setInTime(localTime);
						// 4. ������ȣ, ������¥, �����ð� => 3������ -> ��üȭ
						Parking parkingin = new Parking(date, carNumber, localTime);
						// 5. ������ü�� �迭�̳� ����Ʈ�� ����
						parkingList.add(parkingin);
						return true;
					}
				}
			}
		else return false; 
		}
		return false;
	}
	//���� �޼ҵ�
	public static boolean exit(String carNumber) {
		// ���� �ڵ� �ۼ�
			// 1. �Է¹��� ������ȣ(�μ�) �����´�.
		Parking parking = new Parking(carNumber);
			// 2. �迭 or ����Ʈ�� ������ ������ȣ�� ã�Ƽ�
		for(Parking temp: parkingList) {
			if(temp==null) {
				if(temp!=null&&temp.getCarNum().equals(carNumber)) {
				System.out.println(carNumber+"�����մϴ�.");
				// 3. �����ð�(����ð�)�� ���Ѵ�
				LocalTime localTime = LocalTime.now();
				DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
				String formatttedNow = localTime.format(dateTimeFormatter);
				temp.setOutTime(localTime);
				// 4. ���[�����ð�-�����ð� => (��-30)/10 * 1000
				temp.setMoney(((temp.getOutTime().until(temp.getInTime(),ChronoUnit.MINUTES))-30)/10*1000);
				
				// 5. (����)ã�� ��ü�� �����ð��� �ݾ��� �����Ѵ�.
				temp = null;
				
				return true;
				}
				else {
					System.out.println("������ȣ�� �ٸ��ϴ�.[���Է�]");
					break;
				}
			}
		}
		return false;
	}	
}
