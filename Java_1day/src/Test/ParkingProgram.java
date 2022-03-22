package Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParkingProgram {

//	1. 주차 현황 표 는 항상 출력이 되어 있도록 합니다. [ 10점 ]
//			  * 입차 시 출차시간은 주차중이며 출차 시 출차 시간을 대입합니다. 
//			  * 출차 가 아닌 차는 주차 중으로 표시 하고 출차를 진행한 차량은 출차시간을 표시합니다.
//			  * 금액은 주차중이면 정산전 으로 표시하고 출차시간이 존재할 경우 금액을 표시합니다.
//
//			2. 메뉴에서 1번 선택시 입차를 합니다. [ 10점 ]
//			  * 입차시 : 차량번호만 입력받습니다. [ 날짜 , 입차시간 , 출차시간 , 금액 은 입력받지 않습니다. ]
//			  * 임의로 5개의 차량을 등록하여 표시하시오. 
//
//			3. 메뉴에서 2번 선택시 출차를 합니다. [ 10점 ]
//			  * 출차시 : 차량번호만 입력받습니다.
//			  * 출차시 주차 현황표 에서 출차시간을 대입하고 금액을 계산하여 표시합니다.
//
//			4. 데이터는 키보드로 입력받아 차량 객체를 배열 및 리스트 에 저장합니다. [ 5점 ]
//
//			6. 입차시간과 출차시간을 계산하여 금액을 구하시오. [ 10점 ]
//			  * 최초 30분 무료 [ 10분당 1,000원 ]
//
//			7. 파일처리는 하지 않습니다.
//			8. 입력 오류에 대하여 예외발생 상황에 대한 처리를 합니다. [ 5점 ]
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd      hh:mm");
		Scanner scanner = new Scanner(System.in);
		try {
			while(true) {
				
				System.out.println("------------------------------- 주차 현황 표 -------------------------------");
				System.out.println("\t\t\t\t현재시간 :"+dateFormat.format(date));
				SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
				System.out.printf("\t%s\t\t%s\t\t%s\t\t%s\t\t%s \n", "날짜", "차량번호", "입차시간", "출차시간", "금액");	
				for(Parking temp: Controller.parkingList) {
					if(temp!=null) {
						System.out.printf("\t%s\t\t%s\t\t%s\t\t%s\t\t%s \n",
								temp.getDate(), temp.getCarNum(), temp.getInTime(), temp.getOutTime(), temp.getMoney());	
					}
				}
				System.out.println("------------------------------- 주차 현황 표 -------------------------------");
				System.out.println("\t\t\t\t\t 1.입차\t\t 2. 출차");
				int ch = scanner.nextInt();
				
				if(ch==1) {
					// 1. 차량번호를 입력받는다.
					System.out.println("주차할 자량번호 :"); String carNumber = scanner.next();
					System.out.println(carNumber+" 주차완료");
					// 2. 입력받은 차량번호를 컨트롤내 메소드에게 넘긴다.
					Parking parking = new Parking(carNumber);
					Controller.enter(carNumber);
					// 3. 메소드 결과에 따른 출력
					
				}
				else if(ch==2) {
					// 1. 차량번호를 입력받는다.
					System.out.println("출차할 자량번호 :"); String carNumber = scanner.next();
					System.out.println(carNumber+" 출차완료");
					// 2. 입력받은 차량번호를 컨트롤내 메소드에게 넘긴다.
					Parking parking = new Parking(carNumber);
					Controller.exit(carNumber);
					// 3. 메소드 결과에 따른 출력
				}
				else System.out.println("입력이 올바르지 않습니다. [재입력]");
				
				
			}
		}
		catch (Exception e) {
			scanner = new Scanner(System.in);
		}
		
	}
}
