package Day15;

public class TargetThread extends Thread{

	@Override
	public void run() {// ������ ���� : NEW : ��ü�����ǰ� ��Ƽ������ ������

		for(long i=0;i<1000000000;i++) { // ������ ���� : RUNNABLE : ��Ƽ������ ������
								//10�� �ݺ�
		}
		// 1.5�ʰ� ���
			
		try{Thread.sleep(1500);} // ������ ���� : WAITING : ��Ƽ������ �Ͻ�����
		catch (Exception e) {	}
			
		for(long i=0;i<1000000000;i++) {}
		
	} // run�޼ҵ尡 ����Ǹ� ������ ���� : TERMINATED : ��Ƽ������ ����
}
