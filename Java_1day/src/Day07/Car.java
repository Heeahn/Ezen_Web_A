package Day07;

public class Car {
	// Ŭ���� ����
	
	//	1. �ʵ�
	int gas; // ��������
	//	2. ������
			// ������ ������ �⺻������
	//	3. �޼ҵ�
		// 1. gas�� �ܺηκ��� �޾Ƽ� ���ο� �����ϴ� �޼ҵ� ����
	void setGas(int gas) { // �μ�O��ȯX
//����x �޼ҵ��   ( �μ�1)    {���κ��� = �ܺκ���}		
		this.gas = gas;
// ���κ����� �ܺκ����� �̸��� ������ �� �����ϴ� ���!!!!
		// this.�ʵ�� : ����(��Ŭ��������)����
	}
	
	// 2. ���κ��� gas�� ������ Ȯ��[0=��������false][1�̻�=�����ִ�true]
	boolean isLeftGas() { // �μ�X��ȯO
//�� ��ȯ 		�޼ҵ��
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false;// ���κ����� gas�� 0�̸� false ��ȯ
		}
		else {
			System.out.println("gas�� �ֽ��ϴ�.");
			return true;
		}
	}
	//3. gas 0�϶����� �����ϴµ� ������ ������ ���� 1�� ���� �޼ҵ�
	void run() {// �μ�x ��ȯx
		
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ� :(gas�ܷ� : "+gas+")");
				gas--;
			}
			else {
				System.out.println("����ϴ� :(gas�ܷ� : "+gas+")");
				return;
			}
		}
		
	}
	
}
