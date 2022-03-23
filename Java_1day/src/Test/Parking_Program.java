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
				System.out.println("------------------------------------  ���� ��Ȳ ǥ  ------------------------------------");
				System.out.println("\t\t\t\t\t����ð� :"+	dateFormat.format(date));
				System.out.printf("\t\t%s\t\t\t%s\t\t\t%s\t\t%s\t\t%s \n","��¥","������ȣ","�����ð�","�����ð�","�ݾ�");
				for(Car temp : Control.carList) {
					System.out.printf("\t%s\t\t%8s\t\t%s\t\t%s\t\t%s \n",
							temp.getIntimeymd(),temp.getCarnumber(),temp.getIntimehm(),temp.getOuttime(),temp.getMoney());	
				}
				System.out.println("------------------------------------------------------------------------------------");
				System.out.println("\t\t\t\t\t\t 1. ���� \t\t 2. ����"); int ch = scanner.nextInt();
				
				if(ch==1) {
					System.out.println("������ ������ȣ : "); String carnum = scanner.next();
					boolean result = Control.incar(date,carnum);
					
					if(result) {
						System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					}else {
						System.out.println("�̹� �������� �����Դϴ�.");
					}
				}
				else if(ch==2) {
					System.out.println("������ȣ �Է� : "); String carnum = scanner.next();
					int result = Control.outcar(carnum);
					
					if(result==1) {
						System.out.println("��ġ�ϴ� ������ȣ�� �����ϴ�.");
					}
					else if(result==2) {
						System.out.println("�̹� �����Ϸ��� �����Դϴ�.");
					}
					else if(result==3) {
						
						for(int i=0; i<Control.carList.size(); i++) {
							if(Control.carList.get(i).getCarnumber().equals(carnum)) {
								System.out.println("�����ݾ� : "+Control.carList.get(i).getMoney());
								System.out.println("�����Ϸ�");
								break;
							}
						}
					}
				}
				else System.err.println("�߸� �Է� �Ͽ����ϴ�.[�缱��]");
				
			}catch (Exception e) {scanner = new Scanner(System.in);}
		}//we
	}//me
}//ce
