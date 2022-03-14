package Day09;

import java.util.Random;

public class BankContlor { // 클래스
					// 입출력 기능 x
	// V[입출력] <----> M
	// 해당 크래스는 은행 관련 컨드롤러
	// M : 모델[데이터]
	// V : 뷰 [입출력]
	// C : 모델과 뷰 연결 역할
	
	// 뷰에서 요청하는 서비스[기능] 제공
		// 1. 계좌생성(C)
	public String 계좌생성(String bankPassword, String bankid, int bn) {
		
		// 1. 입력받은 값을 가져온다[인수]
		String bankNumber =null;
		while(true) {
			// 계좌번호 자동생성
			Random random = new Random(); // 랜덤
			// 4자리 생성
			int 난수 = random.nextInt(10000); // 0~9999 사이
			bankNumber = String.format("%04d", 난수);	// %04d 정수 4자리[만일 자리수 없으면 0처리]		
			//중복체크
			boolean sameBankNumber = false;
			for(Bank temp3 : Day09_6_은행계좌프로그램.계좌리스트) {
				if(temp3!=null&&temp3.getBankNumber().equals(bankNumber)) {
					sameBankNumber = true;
				}
				if(sameBankNumber==false) break;
			}
			
			// 2. 객체화[다수의 변수를 하나의 객체로 만들기]
			Bank temp = null;
			if(bn ==1) {temp = new KBB(bankNumber, bankPassword, bankid, 0);
			}
			else if(bn ==2) {temp = new SHB(bankNumber, bankPassword, bankid, 0);
			}
			else if(bn==3) {temp = new HNB(bankNumber, bankPassword, bankid, 0);
			}
			// 3. 배열에 저장
			int i = 0;
			for(Bank temp2 : Day09_6_은행계좌프로그램.계좌리스트) {
				if(temp2 == null ) {Day09_6_은행계좌프로그램.계좌리스트[i] = temp;
					System.out.println("***계좌등록***"); return bankNumber; // 계좌번호가 존재하면 성공
				}
				i++;
			}
			return null;
		}
	}
		// 2. 입급(U)
	public boolean 입금(String bankNumber, int bankMoney) {		

		// 1. 동일한 계좌번호 찾아서
		int i = 0;
		for(Bank temp : Day09_6_은행계좌프로그램.계좌리스트) {
			if(temp != null && temp.getBankNumber().equals(bankNumber)) {
				// 해당 계좌가 공백이 아니고 입력한[인수]가 같으면

		// 2. 동일한 계좌번호가 있으면 입금 처리
				Day09_6_은행계좌프로그램.계좌리스트[i].setBankmoney(temp.getBankmoney()+bankMoney);
				return true;
			}
		i++;
		}
		// 3. 동일한 계좌번호가 업으면 입금 실패
		return false;
	}
		// 3. 출금(U)
	public int 출금(String bankNumber,String bankPassword, int bankMoney) {
		
		int i = 0;
		for(Bank temp : Day09_6_은행계좌프로그램.계좌리스트) {
			if(temp != null && temp.getBankPassword().equals(bankPassword) &&
					temp.getBankNumber().equals(bankNumber)) {
				// 해당 계좌가 공백이 아니고 입력한[인수]가 같으면

				// 2. 동일한 계좌번호가 있으면 입금 처리
				if(temp.getBankmoney()<bankMoney) {
					return 1;
				}
				else {
					Day09_6_은행계좌프로그램.계좌리스트[i].setBankmoney(temp.getBankmoney()-bankMoney);
					return 2;
				}
			}
			i++;
		}
		return 3;}
	
		// 4. 이체(U)
	public int 이체(String myBankNumber, String bankPassword, int bankMoney, String yourBankNumber ) {
		
		int i= 0;
		for(Bank temp: Day09_6_은행계좌프로그램.계좌리스트) {
			if(temp != null && temp.getBankNumber().equals(myBankNumber)&&
					temp.getBankPassword().equals(bankPassword)) {
				
				int j = 0;
				for(Bank temp2 : Day09_6_은행계좌프로그램.계좌리스트) {
					if(temp2 != null && temp2.getBankNumber().equals(yourBankNumber)) {
						
						if(temp.getBankmoney()<bankMoney) {
							return 1;
						}
						else {
							Day09_6_은행계좌프로그램.계좌리스트[i].setBankmoney(temp.getBankmoney()-bankMoney);
							Day09_6_은행계좌프로그램.계좌리스트[j].setBankmoney(temp2.getBankmoney()+bankMoney);
							return 2;
						}
					}
					j++;
				}				
			}
			i++;
		}
		return 4;}
	
		// 5. 내계좌목록(R)
	public Bank[] 계좌목록(String bankid) {
	// 입력받은 계좌주의 계좌목록 만들어서 반환	
		//동일한 계좌주의 계좌를 찾아서 배열담아 넘기기
		Bank[] myBankList = new Bank[100];
		
		for (Bank temp : Day09_6_은행계좌프로그램.계좌리스트) {
			if(temp!=null && temp.getBankid().equals(bankid)) {
				// 해당 계좌내 계좌주와 인수의 계좌주와 동일하면
				// 내계좌목록 배열내 빈공간을 찾아서 내계좌목록에 넣기
				int i = 0;
				for(Bank temp2 : myBankList) {
					if(temp2 == null) {
						myBankList[i]=temp; break;
					}
					i++;
				}
			}
		}
		return myBankList;
	}
		// 6. 대출(U)
	public boolean 대출() {return false;}
	
}
