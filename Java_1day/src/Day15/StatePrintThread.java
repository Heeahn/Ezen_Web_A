package Day15;

public class StatePrintThread extends Thread{

	//필드
	private Thread targetThread;

	//생성자
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}	
	//병렬처리
	@Override
	public void run() {
		while(true) {
			//스레드 상태 호출
			Thread.State state = targetThread.getState(); // 현 스레드 상태 호출
			System.out.println("타겟 스레드 상태 : " +state);
			//스레드 상태 제어
			if(state == Thread.State.NEW) { // NEW : 스레드 생성상태 뜻
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) { // TERMINATED : 스레드 종료상태 뜻
				break;
			}
		}
		try {Thread.sleep(500);} catch (Exception e) {} // 0.5초간 일시정지
	}
}
