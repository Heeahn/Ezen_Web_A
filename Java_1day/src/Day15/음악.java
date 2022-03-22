package Day15;

public class 음악 extends Thread {

	@Override
	public void run() {
		// 병렬처리 실행
		while(true) {
			System.out.println("***음악실행중***");
			
			try {
				Thread.sleep(500);// 0.5초간 일시정지
			} catch (Exception e) {} 
		}
	}
	
}
