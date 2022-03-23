package Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Parking_Program {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd   hh:mm");
		
		while(true) {
			try {
				System.out.println("------------------------------------  주차 현황 표  ------------------------------------");
				System.out.println("\t\t\t\t\t현재시간 :"+	dateFormat.format(date));
				System.out.printf("\t\t%s\t\t\t%s\t\t\t%s\t\t%s\t\t%s \n","날짜","차량번호","입차시간","출차시간","금액");
				for(Car temp : Control.carList) {
					System.out.printf("\t%s\t\t%8s\t\t%s\t\t%s\t\t%s \n",
							temp.getIntimeymd(),temp.getCarnumber(),temp.getIntimehm(),temp.getOuttime(),temp.getMoney());	
				}
				System.out.println("------------------------------------------------------------------------------------");
				System.out.println("\t\t\t\t\t\t 1. 입차 \t\t 2. 출차"); int ch = scanner.nextInt();
				
				if(ch==1) {
					System.out.println("주차할 차량번호 : "); String carnum = scanner.next();
					boolean result = Control.incar(date,carnum);
					
					if(result) {
						System.out.println("주차가 완료되었습니다.");
					}else {
						System.out.println("이미 주차중인 차량입니다.");
					}
				}
				else if(ch==2) {
					System.out.println("차량번호 입력 : "); String carnum = scanner.next();
					int result = Control.outcar(carnum);
					
					if(result==1) {
						System.out.println("일치하는 차량번호가 없습니다.");
					}
					else if(result==2) {
						System.out.println("이미 결제완료한 차량입니다.");
					}
					else if(result==3) {
						
						for(int i=0; i<Control.carList.size(); i++) {
							if(Control.carList.get(i).getCarnumber().equals(carnum)) {
								System.out.println("결제금액 : "+Control.carList.get(i).getMoney());
								System.out.println("출차완료");
								break;
							}
						}
					}
				}
				else System.err.println("잘못 입력 하였습니다.[재선택]");
				
			}catch (Exception e) {scanner = new Scanner(System.in);}
		}//we
	}//me
}//ce
