package Day15;

public class Day15_6 {

	public static void main(String[] args) {
		
		// p.597
			// �����층 : �ü���� �޸𸮸� ���μ������� �Ҵ��ϴ� ���
		
		// p. 598~600
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
		
	}
}