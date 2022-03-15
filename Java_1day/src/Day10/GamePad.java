package Day10;

public interface GamePad {

	// 상수필드
	// 추상메소드
	public void Abutton();
	public void Bbutton();
	public void Cbutton();
	// 디폴트메소드
	default void gamePadLogOut() {
		System.out.println("게임패드종료");
	}
	// 정적메소드
	static void charge() {
		System.out.println("충전중");
	}
}
