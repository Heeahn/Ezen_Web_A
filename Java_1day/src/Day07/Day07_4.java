package Day07;

public class Day07_4 {
	
	//p. 229 : �ܺ�ȣ��
	public static void main(String[] args) {
		
		// 1. ******��ü����*******
		Car2 myCar = new Car2();
		// 2. �ڵ��� �õ��ɱ�
		myCar.keyTurnOn();//�μ�X��ȯX
		// 3. �ڵ��� ����
		myCar.run();// �μ�X��ȯX
		//4. ���� ���ǵ� Ȯ�� �޼ҵ� ȣ��
		int speed = myCar.getSpeed();
		System.out.println("����ӵ� :"+speed+"km/h)");
		
		
		
	}

}
