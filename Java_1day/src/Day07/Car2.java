package Day07;

public class Car2 {

	//1. �ʵ�
	int speed;
	//2. ������
		// ������ ������ �⺻������ �߰�
	//3. �޼ҵ�
	
	//1. ���� �ʵ尪�� ��ȯ���ִ� �޼ҵ�
	int getSpeed() {// �μ�X��ȯO
		return speed;
	}
	
	//2. ��¸޼ҵ�
	void keyTurnOn() {//�μ�x��ȯx
		System.out.println("Ű�� �����ϴ�.");
	}
	//3. ���ǵ����� �޼ҵ�
	void run() {// �μ�x��ȯx
		for(int i = 10;i<=50;i+=10) {
			speed =i;
			System.out.println("�޸��ϴ�.(�ü�:"+speed+"km/h)");
		}
	}
}