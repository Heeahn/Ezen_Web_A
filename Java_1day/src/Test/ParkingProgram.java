package Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParkingProgram {

//	1. ���� ��Ȳ ǥ �� �׻� ����� �Ǿ� �ֵ��� �մϴ�. [ 10�� ]
//			  * ���� �� �����ð��� �������̸� ���� �� ���� �ð��� �����մϴ�. 
//			  * ���� �� �ƴ� ���� ���� ������ ǥ�� �ϰ� ������ ������ ������ �����ð��� ǥ���մϴ�.
//			  * �ݾ��� �������̸� ������ ���� ǥ���ϰ� �����ð��� ������ ��� �ݾ��� ǥ���մϴ�.
//
//			2. �޴����� 1�� ���ý� ������ �մϴ�. [ 10�� ]
//			  * ������ : ������ȣ�� �Է¹޽��ϴ�. [ ��¥ , �����ð� , �����ð� , �ݾ� �� �Է¹��� �ʽ��ϴ�. ]
//			  * ���Ƿ� 5���� ������ ����Ͽ� ǥ���Ͻÿ�. 
//
//			3. �޴����� 2�� ���ý� ������ �մϴ�. [ 10�� ]
//			  * ������ : ������ȣ�� �Է¹޽��ϴ�.
//			  * ������ ���� ��Ȳǥ ���� �����ð��� �����ϰ� �ݾ��� ����Ͽ� ǥ���մϴ�.
//
//			4. �����ʹ� Ű����� �Է¹޾� ���� ��ü�� �迭 �� ����Ʈ �� �����մϴ�. [ 5�� ]
//
//			6. �����ð��� �����ð��� ����Ͽ� �ݾ��� ���Ͻÿ�. [ 10�� ]
//			  * ���� 30�� ���� [ 10�д� 1,000�� ]
//
//			7. ����ó���� ���� �ʽ��ϴ�.
//			8. �Է� ������ ���Ͽ� ���ܹ߻� ��Ȳ�� ���� ó���� �մϴ�. [ 5�� ]
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd      hh:mm");
		Scanner scanner = new Scanner(System.in);
		try {
			while(true) {
				
				System.out.println("------------------------------- ���� ��Ȳ ǥ -------------------------------");
				System.out.println("\t\t\t\t����ð� :"+dateFormat.format(date));
				SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
				System.out.printf("\t%s\t\t%s\t\t%s\t\t%s\t\t%s \n", "��¥", "������ȣ", "�����ð�", "�����ð�", "�ݾ�");	
				for(Parking temp: Controller.parkingList) {
					if(temp!=null) {
						System.out.printf("\t%s\t\t%s\t\t%s\t\t%s\t\t%s \n",
								temp.getDate(), temp.getCarNum(), temp.getInTime(), temp.getOutTime(), temp.getMoney());	
					}
				}
				System.out.println("------------------------------- ���� ��Ȳ ǥ -------------------------------");
				System.out.println("\t\t\t\t\t 1.����\t\t 2. ����");
				int ch = scanner.nextInt();
				
				if(ch==1) {
					// 1. ������ȣ�� �Է¹޴´�.
					System.out.println("������ �ڷ���ȣ :"); String carNumber = scanner.next();
					System.out.println(carNumber+" �����Ϸ�");
					// 2. �Է¹��� ������ȣ�� ��Ʈ�ѳ� �޼ҵ忡�� �ѱ��.
					Parking parking = new Parking(carNumber);
					Controller.enter(carNumber);
					// 3. �޼ҵ� ����� ���� ���
					
				}
				else if(ch==2) {
					// 1. ������ȣ�� �Է¹޴´�.
					System.out.println("������ �ڷ���ȣ :"); String carNumber = scanner.next();
					System.out.println(carNumber+" �����Ϸ�");
					// 2. �Է¹��� ������ȣ�� ��Ʈ�ѳ� �޼ҵ忡�� �ѱ��.
					Parking parking = new Parking(carNumber);
					Controller.exit(carNumber);
					// 3. �޼ҵ� ����� ���� ���
				}
				else System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�. [���Է�]");
				
				
			}
		}
		catch (Exception e) {
			scanner = new Scanner(System.in);
		}
		
	}
}
