package Day15;

public class SumThread extends Thread {

	private long sum;
	
	public long getsum() {
		return sum;
	}
	public void setsum(long sum) {
		this.sum= sum;
	}
	@Override
	public void run() {
		for(int i = 1; i<=100;i++) {
			sum+=i; // i부터 100까지 누적합
		}
	}
}
