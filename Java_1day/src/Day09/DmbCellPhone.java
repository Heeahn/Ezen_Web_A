package Day09;

public class DmbCellPhone extends CellPhone {
	// ����Ŭ������ ����Ŭ���� ���� => extends
		// ����Ŭ������ ����Ŭ������ ��� ��밡��
	
	// 1. �ʵ�
	int channel;
	// 2. ������
	public DmbCellPhone(String model, String color, int channel) {
		this.channel = channel; 	// this. �ʵ��
		this.color = color;				// this. �ʵ��
		this.model = model;			// this. �ʵ��
		//* ���� Ŭ������ ���� �ʵ� �̹Ƿ� ����Ŭ������ �ع� ȣ��
	}
	// 3. �޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� :"+channel+"�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ü�� :"+channel+"������ �ٲ�ϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
