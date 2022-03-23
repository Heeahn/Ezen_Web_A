package Test;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Control {

	public static ArrayList<Car> carList = new ArrayList<>(); 
	// ���� �޼ҵ�
	public static boolean incar(Date date,String carnumber) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat hm = new SimpleDateFormat("HH:mm");
		
		for(Car temp : carList) {
			if(temp.getCarnumber().equals(carnumber) && temp.getOuttime().equals("���� ��")) {
				return false;
			}
		}
		
		Car temp = new Car(ymd.format(date), carnumber, hm.format(date) , "���� ��", "���� ��",sdf.format(date));
		carList.add(temp);

		return true;
	}
	
	// ���� �޼ҵ�
	public static int outcar(String carnumber) throws ParseException {
		
		for(Car temp : carList) {
			if(temp.getCarnumber().equals(carnumber) && temp.getMoney().equals("���� ��")) {
				pay(carnumber);
				return 3; 
			}	
		}
		for(Car temp : carList) {
			if(temp.getCarnumber().equals(carnumber)) {
				return 2; 
			}
		}
		return 1; 
	}
	
	// �ݾװ�� �޼ҵ�
	public static void pay(String carnumber) throws ParseException {
	
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		DecimalFormat decimalFormat = new DecimalFormat("#,###��"); 
		Date date = new Date();
		
		int i=0; 
		for(Car temp : carList) {
			if(temp.getCarnumber().equals(carnumber)) {
				
				Date date1 = dateFormat.parse(temp.getIntime()); 
				Date date2 = date; 
				String date3 = format.format(date2); 
				
				long ���� = date2.getTime() - date1.getTime(); 
				long min = ����/60000;
				long min1 = (long)Math.ceil(min/10.0) *10;
				min = (min1*100 -3000); 
				if(min<=30) { min=0;}

				int money = (int)min; 

				carList.get(i).setOuttime(date3);
				carList.get(i).setMoney(decimalFormat.format(money));
			} // ie
			i++;
		} // fe
	}
}