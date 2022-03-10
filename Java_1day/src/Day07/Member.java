package Day07;

import java.util.Scanner;

public class Member {
	// 1.필드
	int mno;					// 회원번호 [자동번호, 중복X]
	String id;					// 아이디 [ 중복X]
	String password;	// 비밀번호
	String name;			// 이름
	String phone;			// 연락처
	
	// 2. 생성자
		// 1. 빈생성자[기본생성자]
	public Member() {}
		// 2. 모든 필드를 받는 생성자  : 회원가입용 객체생성시
	public Member(int mno, String id, String password, String name, String phone) {
	this.mno = mno;
	this.id = id;
	this.password = password;
	this.name = name;
	this.phone = phone;
	}
	
	// 3. 메소드
		// 1. 회원가입 메소드[인수x반환o : 가입성공 true/ 가입실패 false]
	boolean 회원가입() {
		System.out.println("----------------------회원가입 페이지----------------------");
		
		// 1. 입력받는다[id,pw,name,phone]
		System.out.println("아이디 :"); 		String id = Day07_5_BookApplication.scanner.next();
		System.out.println("비밀번호 :"); 	String password = Day07_5_BookApplication.scanner.next();
		System.out.println("이름 :"); 		String name = Day07_5_BookApplication.scanner.next();
		System.out.println("연락처 :"); 		String phone = Day07_5_BookApplication.scanner.next();
			// *scanner 객체가 다른 클래스내 static 선언되어있음.		// *클래스명.필드명.함수명();
			// *static 필드, 메소드는 객체없이 호출가능
		
		//* 아이디중복체크
		for(Member temp : Day07_5_BookApplication.members) {
			if(temp != null && temp.id.equals(id)) {
				System.out.println("알림) 현재 사용중인 아이디입니다.");
				return false; // 아이디가 중복되었기 때문에 false[가입실패]
			}
		}		
		
		//* 회원번호 자동주입[가장 최근에 가입한 회원의 번호+1]
		int bno =0; // 회원번호 저장하는 변수
		int j = 0; // 반복횟수[인덱스]
		for(Member temp : Day07_5_BookApplication.members) {
			if(temp == null) { // null 찾기[null 찾았을때 null-1 하면 마지막회원]
				if(j==0) {
					bno = 1;  break;
				}  // 첫번째 인덱스[0번인덱스]가 null => 첫회원번호 =1부여
				else {
					bno =Day07_5_BookApplication.members[j-1].mno+1; 
					break;
				}				
			}
			j++;
		}
		
		// 2. 4개변수 -> 객체화 -> 1개
		Member member = new Member(bno, id, password, name, phone); // 모든 필드 받는 생성자로 객체 생성
		
		// 3. 배열내 빈 공간을 찾아서 새로운 회원[객체] 넣기
		int i = 0;
		for(Member temp : Day07_5_BookApplication.members) {//fs
			if(temp==null) {
				Day07_5_BookApplication.members[i] = member;
				System.out.println("회원님의 회원번호: " +bno);
				return true; // 회원가입 메소드 종료 ~~~~[반환 : true]
			}
			i++;
		}
		return false;
	}
	// 2. 로그인 메소드[인수x반환o ]
			// 로그인 성공시 성공한 아이디반환 / 실패시 NULL 반환
	String 로그인() {
		System.out.println("----------------------로그인 페이지----------------------");
		// 1. 입력받기
		System.out.println("아이디 :"); 		String id = Day07_5_BookApplication.scanner.next();
		System.out.println("비밀번호 :"); 	String password = Day07_5_BookApplication.scanner.next();
		
		//2. 배열내 객체 id와 password가 입력한 값과 동일하면
		for(Member temp : Day07_5_BookApplication.members) {
			if(temp!=null &&temp.id.equals(id) && temp.password.equals(password) ) {
					return temp.id;	
				}				
			}
			return null;
	}
		// 3. 아이디찾기 메소드[인수x반환x] : 이름, 연락처
	void 아이디찾기() {
		System.out.println("----------------------아이디 찾기 페이지----------------------");		
		//1. 입력받기
		System.out.println("이름 :"); String name = Day07_5_BookApplication.scanner.next();
		System.out.println("연락처 :"); String phone = Day07_5_BookApplication.scanner.next();
		// 2. 입력받은 값을 배열에 찾기
		for(Member temp : Day07_5_BookApplication.members) {
			if(temp!=null && temp.name.equals(name) && temp.phone.equals(phone)) {
				System.out.println("회원님 아이디: " + temp.id);
				return;
			}
		}
		// 3. 찾았으면 찾은 id 출력하고 못찾았으면 없음 출력
		System.out.println("알림 동일한 회원정보가 없습니다.");
	}
	
		// 4. 비밀번호첮가 메소드[인수x반환x] : 아이디, 연락처
	void 비밀번호찾기() {
		System.out.println("----------------------비밀번호 찾기 페이지----------------------");
		//1. 입력받기
		System.out.println("아이디 :"); String id = Day07_5_BookApplication.scanner.next();
		System.out.println("연락처 :"); String phone = Day07_5_BookApplication.scanner.next();
		// 2. 입력받은 값을 배열에 찾기
		for(Member temp : Day07_5_BookApplication.members) {
			if(temp!=null && temp.id.equals(id) && temp.phone.equals(phone)) {
				System.out.println("회원님 비밀번호: " + temp.password);
				return;
			}
		}
	
	// 3. 찾았으면 찾은 id 출력하고 못찾았으면 없음 출력
	System.out.println("알림) 동일한 회원정보가 없습니다.");
	}
		// 5. 회원탈퇴 메소드
		// 6. 회원수정 메소드
}
