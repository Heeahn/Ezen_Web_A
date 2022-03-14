package Day09;

public class Day09_5_타이어예제실행 {

	public static void main(String[] args) {
		
		// 1. 객체생성[자덩차 1대 생성]
		Car mycar = new Car();
		
		//2. 메소드 호출
		for(int i = 1; i<=5;i++) {
			int problemLocation = mycar.run();

			switch(problemLocation) {
				case 1 :
					System.out.println("앞왼쪽 한국타이어 교체");
					mycar.frontLeftTire = new HankookTire("앞왼쪽", 15);
					break;
				case 2 :
					System.out.println("앞오른쪽 금호타이어 교체");
					mycar.frontRightTire = new KumhoTire("앞오른쪽", 13);
					break;
				case 3 : 
					System.out.println("뒤왼쪽 한국타이어로 교체");
					mycar.backLeftTire = new HankookTire("뒤왼쪽", 14);
					break;
				case 4 :
					System.out.println("뒤오른쪽 금호타이어로 교체");
					mycar.backRightTire = new KumhoTire("뒤오른쪽", 17);
					break;
			}
			System.out.println("-------------------------------------");
		}		
	}
}
