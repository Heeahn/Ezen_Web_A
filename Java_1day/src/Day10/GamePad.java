package Day10;

public interface GamePad {

	// ����ʵ�
	// �߻�޼ҵ�
	public void Abutton();
	public void Bbutton();
	public void Cbutton();
	// ����Ʈ�޼ҵ�
	default void gamePadLogOut() {
		System.out.println("�����е�����");
	}
	// �����޼ҵ�
	static void charge() {
		System.out.println("������");
	}
}
