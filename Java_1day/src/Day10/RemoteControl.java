package Day10;

public interface RemoteControl { // �������̽� ����
	
	// ���
		// 1. ����ʵ� : ������ ������
	public int MAX_VOLUME = 10; // �������� �ִ����
	public int MIN_VOLUME = 0; 	// �������� �ּҼ���
	
		// 2. �߻�޼ҵ�** : ����O����X
	public void turnOn(); // {} : �߷�[����x]
	public void turnOff(); // {} : �߷�[����x]
	public void setVolume(int volume); // {} : �߷�[����x]
		
		// 3. ����Ʈ�޼ҵ� : ����O����O
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}
		else {
			System.out.println("���� �����մϴ�.");
		}
	}
		// 4. �����޼ҵ� : ����O ����O [ ��ü���� ����]
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
