package Test;

public class Controller {

	Parking parking = new Parking();
	
	//입차 메소드
	public static boolean enter(String carNumber) {
		
		//입차 코드 작성
			// 1. 입력받은 차량번호(인수) 가져온다.
			//* 차량번호 중복체크
			// 2. 입차날짜(현재날짜)을 구한다(????:)
			// 3. 입차시간을 구한다
			// *출차시간, 금액은 출차시
			// 4. 차량번호, 입차날짜, 입차시간 => 3개변수 -> 객체화
			// 5. 차량객체를 배열이나 리스트에 저장
			// 6. 파일처리 or DB 처리
		
		return false;
	}
	//출차 메소드
	public static boolean exit(String carNumber) {
		// 출차 코드 작성
			// 1. 입력받은 차량번호(인수) 가져온다.
			// 2. 배열 or 리스트내 동일한 차량번호를 찾아서
			// 3. 출차시간(현재시간)을 구한다
			// 4. 계산[출차시간-입차시간 => (분-30)/10 * 1000
			// 5. (수정)찾은 객체내 출차시간과 금액을 대입한다.
		return false;
	}
	//금액 계산 메소드
	public static void money() {
		
	}
}
