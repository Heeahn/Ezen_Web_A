package Day07;

public class Car {
	// 클래스 선언
	
	//	1. 필드
	int gas; // 가스변수
	//	2. 생성자
			// 생성자 없으면 기본생성자
	//	3. 메소드
		// 1. gas를 외부로부터 받아서 내부에 저장하는 메소드 역할
	void setGas(int gas) { // 인수O반환X
//리턴x 메소드명   ( 인수1)    {내부변수 = 외부변수}		
		this.gas = gas;
// 내부변수와 외부변수와 이름이 동일할 떄 구별하는 방법!!!!
		// this.필드명 : 내부(현클래스파일)변수
	}
	
	// 2. 내부변수 gas에 데이터 확인[0=가스없다false][1이상=가스있다true]
	boolean isLeftGas() { // 인수X반환O
//논리 반환 		메소드명
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;// 내부변수에 gas가 0이면 false 반환
		}
		else {
			System.out.println("gas가 있습니다.");
			return true;
		}
	}
	//3. gas 0일때까지 실행하는데 실행할 때마다 가스 1씩 감소 메소드
	void run() {// 인수x 반환x
		
		while(true) {
			if(gas>0) {
				System.out.println("달립니다 :(gas잔량 : "+gas+")");
				gas--;
			}
			else {
				System.out.println("멈춥니다 :(gas잔량 : "+gas+")");
				return;
			}
		}
		
	}
	
}
