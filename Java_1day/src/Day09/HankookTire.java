package Day09;

public class HankookTire extends Tire {

	// 1. 필드
	// 2. 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		// super(인수1, 인수2)  // 슈퍼클래스내 [인수2개] 생성자 호출
	}
	// 3. 메소드
@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"한국타이어 수명 :"+(maxRotation-accumulatedRotation)+"회");
			return true;
		}
		else {
			System.out.println("*** "+location+"한국타이어 펑크 ***");
			return false;
		}
	}
}
