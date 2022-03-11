package Day08;

public class Member {
	
	//1. 필드
	private String id;
	private String password;
	private String name;
	private String phone;
	
	//2. 생성자
		// 1. 빈생성자
	public Member() { }
		// 2. 2개
	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}
		// 3. 풀
	public Member(String id, String password, String name, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	//3. 메소드
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	// 1. 회원가입 메소드[가입성공 true/ 가입실패 false]
	boolean 회원가입() {
		System.out.println("----------------------회원가입 페이지----------------------");
		
		// 1. 입력받는다[id,pw,name,phone]
		System.out.println("아이디 :"); 		String id = Day08_5.scanner.next();
		System.out.println("비밀번호 :"); 	String password = Day08_5.scanner.next();
		System.out.println("이름 :"); 		String name = Day08_5.scanner.next();
		System.out.println("연락처 :"); 		String phone = Day08_5.scanner.next();
		//* 아이디중복체크
		for(Member temp : Day08_5.members) {
			if(temp != null && temp.id.equals(id)) {
				System.out.println("알림) 현재 사용중인 아이디입니다.");
				return false; // 아이디가 중복되었기 때문에 false[가입실패]
			}
		}		
		
		Member member2 = new Member(id,password,name,phone);// 모든 필드 받는 생성자로 객체 생성
		
		// 3. 배열내 빈 공간을 찾아서 새로운 회원[객체] 넣기
		int i = 0;
		for(Member temp : Day08_5.members) {//fs
			if(temp==null) {
				Day08_5.members[i] = member2;
				System.out.println("회원가입에 성공했습니다.");
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
		System.out.println("아이디 :"); 		String id = Day08_5.scanner.next();
		System.out.println("비밀번호 :"); 	String password = Day08_5.scanner.next();
		
		//2. 배열내 객체 id와 password가 입력한 값과 동일하면
		for(Member temp : Day08_5.members) {
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
		System.out.println("이름 :"); String name = Day08_5.scanner.next();
		System.out.println("연락처 :"); String phone = Day08_5.scanner.next();
		// 2. 입력받은 값을 배열에 찾기
		for(Member temp : Day08_5.members) {
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
		System.out.println("아이디 :"); String id = Day08_5.scanner.next();
		System.out.println("연락처 :"); String phone = Day08_5.scanner.next();
		// 2. 입력받은 값을 배열에 찾기
		for(Member temp : Day08_5.members) {
			if(temp!=null && temp.id.equals(id) && temp.phone.equals(phone)) {
				System.out.println("회원님 비밀번호: " + temp.password);
				return;
			}
		}
	System.out.println("알림) 동일한 회원정보가 없습니다.");
	}

}
