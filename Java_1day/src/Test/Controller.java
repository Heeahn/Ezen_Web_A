package Test;

import java.util.ArrayList;
import java.util.Date;

public class Controller {

	public static ArrayList<Parking> parkingList = new ArrayList<>();
	Date date = new Date();
	
	//���� �޼ҵ�
	public static boolean enter(String carNumber) {
		
		//���� �ڵ� �ۼ�
			// 1. �Է¹��� ������ȣ(�μ�) �����´�.
		Parking parking = new Parking(carNumber);
			//* ������ȣ �ߺ�üũ
		for(Parking temp: parkingList) {
			if(temp==null) {
				if(temp!=null&&temp.getCarNum().equals(carNumber)) {
					System.out.println("������ ������ �����մϴ�.");
					break;
				}
				else {
					temp.setCarNum(carNumber);
					// 2. ������¥(���糯¥)�� ���Ѵ�
					parkingList.add(parking);
				}
			}
		}

		
			// 3. �����ð��� ���Ѵ�
			// *�����ð�, �ݾ��� ������
			// 4. ������ȣ, ������¥, �����ð� => 3������ -> ��üȭ
			// 5. ������ü�� �迭�̳� ����Ʈ�� ����
			// 6. ����ó�� or DB ó��
		
		return false;
	}
	//���� �޼ҵ�
	public static boolean exit(String carNumber) {
		// ���� �ڵ� �ۼ�
			// 1. �Է¹��� ������ȣ(�μ�) �����´�.
			// 2. �迭 or ����Ʈ�� ������ ������ȣ�� ã�Ƽ�
			// 3. �����ð�(����ð�)�� ���Ѵ�
			// 4. ���[�����ð�-�����ð� => (��-30)/10 * 1000
			// 5. (����)ã�� ��ü�� �����ð��� �ݾ��� �����Ѵ�.
		return false;
	}
	//�ݾ� ��� �޼ҵ�
	public static void money() {
		
	}
}
