package Day07;

public class Day07_2 {
	
	public static void main(String[] args) {
		
		// p.223~224 : ���ϰ��� ���� �޼ҵ�(void)
		
		// 1. ��ü ����[�������=�⺻������]
		Car myCar = new Car();
		// 2. �޼ҵ� ȣ��[�μ�1��=5]
		myCar.setGas(5);
		
		//3. �޼ҵ� ȣ��[�μ�x ��ȯ =true Ȥ�� false]
		if(myCar.isLeftGas()) {
			System.out.println("����մϴ�.");
			//4. �޼ҵ�ȣ��[�μ�x]
			myCar.run();
		}
		
		// 5. �޼ҵ�ȣ��
		if(myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}
		else {
			System.out.println("gas�� �����ؾ��մϴ�.");
		}
		
	}
}
