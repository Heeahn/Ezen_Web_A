package Day15;

public class ThreadB extends Thread {
	
	//�ʵ�
	public boolean stop = false; // ���� �÷���
	public boolean work = true; // �۾����࿩��(����) �÷���
	
	//����ó��
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB �۾� ����");
			}
			else {
				Thread.yield(); // �ٸ������忡�� �纸
			}
		}
		System.out.println("ThreadB ����");
	}

}
