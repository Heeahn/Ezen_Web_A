package JHS;

public class Timer3 extends Thread{

	@Override
	public void run() {
		for(int i=60; i>=1; i--){
			System.out.println(i);
			try {Thread.sleep(250);} 
			catch (Exception e) {return;}
		}
		System.out.println("�ð��� �ʰ��Ǿ� ����� �����ϴ�.");
		System.exit(0);
	}
}
