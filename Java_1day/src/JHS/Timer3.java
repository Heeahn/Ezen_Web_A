package JHS;

public class Timer3 extends Thread{

	@Override
	public void run() {
		for(int i=60; i>=1; i--){
			System.out.println(i);
			try {Thread.sleep(250);} 
			catch (Exception e) {return;}
		}
		System.out.println("시간이 초과되어 당신이 졌습니다.");
		System.exit(0);
	}
}
