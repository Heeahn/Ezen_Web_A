package Day06;

import java.util.Scanner;

public class Day06_3 {//cs
	
	// 회원제 프로그램 [ 클래스 ]
	
		// 0. 회원 설계 => 회원 클래스 만들기
			// 1. 필드
				// 1. 아이디 2. 비밀번호 3. 이름 4. 전화번호
	
		// 1. 초기메뉴[ 1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기]
			// 1.회원가입시 입력받아 저장
			// 2. 로그인시 아이디와 비밀번호가 동일하면 로그인처리
			// 3. 아이디찾기는 이름과 전화번호가 동일하면 아이디 출력
			// 4. 비밀번호찾기는 아이디와 전화번호가 동일하면 비밀번호 출력
	
	public static void main(String[] args) {//ms
		Scanner scanner = new Scanner(System.in);
		Member[] memberlist = new Member[100];
		// Member 클래스로 만들어진 객체(id.pw,name,phone) 100개 저장할 수 있는 배열 선언
		
		
		while(true) {//프로그램 실행 무한루프 [종료조건: x]
			
			System.out.println("-------------------회원제------------------");
			System.out.println("1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기");
			System.out.println("선택 :"); int ch = scanner.nextInt();

			// 1. 회원가입
			if(ch==1) {//is
				//1. id, password, name, phone 입력받기 => 변수4
				System.out.println("-------------------회원가입 폐이지-------------------");
				System.out.println("아이디 :"); 		String id = scanner.next();
				System.out.println("비밀번호 :"); 	String password = scanner.next();
				System.out.println("이름 :"); 		String name = scanner.next();
				System.out.println("연락처 :"); 		String phone = scanner.next();
				
				//2. 객체 생성
				Member member = new Member();
				
				//3. 입력받은 변수4개를 객체내 필드에 저장하기
				member.id = id;
				member.password = password;
				member.name = name;
				member.phone= phone;	
				
				//* 아이디 중복체크
					// 1. 배열내 객체중 입력한 id와 동일한 id 찾기
				boolean idcheck = false;
				for(Member temp : memberlist) {//fs
					//*memberlist 배열내 객체들을 하나씩 temp에 대입 반복
					if(temp!=null&&temp.id.equals(id)) {//is
						//만약에 해당 객체내 id가 입력받은 id와 같으면
						System.err.println("알림) 사용중인 아이디 입니다.");
						idcheck = true;
						break;
					}//ie
				}//fe
				
				// 아이디가 중복이 없을경우 저장
				if(idcheck==false) { // 중복이 없을경우 저장
					//4. 여러개 객체를 저장하는 배열에 저장
						// 1. 공백 인덱스 찾기 [ 공백이 아니면 기존회원이 존재]
					int i = 0; // 인덱스 위치변수;						
					for(Member temp : memberlist) {//fs
						if(temp == null) {//if s //만약에 해당 객체가 공백이면
							memberlist[i] = member; // 해당 인덱스에 새로 만들어진 객체 저장
							System.err.println("알림) 회원 가입 성공!");
							break; // for 나가기 [ 안나가면 모든 공백에 동일한 객체 저장되기 떄문에]
						}//if e
							i++;
					}//fe				
				}//ie
			}// 회원가입 if e
		
			
			// 2. 로그인
			else if(ch==2) {//else if 1s
				// 1. 입력받기
				System.out.println("-------------------로그인 페이지 ---------------------");
				System.out.println("아이디 :"); 		String loginid = scanner.next();
				System.out.println("비밀번호 :");	 	String loginpassword = scanner.next();
				
				// 2. 기존 배열[회원리스트] 내 입력받은 값과 비교
				boolean logincheck = false;
				for(Member temp:memberlist) {//fs
					//* memberlist 내 0번 인덱스부터 끝 인덱스까지 하나씩 temp에 대입
					if(temp != null && 
						temp.id.equals(loginid) && 
						temp.password.equals(loginpassword)){//is
						System.err.println(" 알림) 로그인 성공");
						logincheck = true;
					}//ie
				}//fe
				if(logincheck==false) {
					System.err.println("알림) 동일한 회원정보가 없습니다.");
				}
			}//else if 1e			
			else if(ch==3) {//else if 2s
			// 3. 아이디 찾기
				//1. 이름과 연락처를 입력받는다
				System.out.println("------------------- 아이디찾기 페이지 ---------------------");
				System.out.println("이름 :"); 		String name = scanner.next();
				System.out.println("전화번호 :");	 	String phone = scanner.next();				

				//2. 배열내 동일한 이름과 연락처가 있는지 확인한다.
				boolean findcheck = false;
				for(Member temp : memberlist) {//fs
					if(temp != null && temp.name.equals(name)&&temp.phone.equals(phone)) {//is
						//3. 동일한 객체가 있으면 해당 아이디를 출력
						System.err.println("알림) 아이디 찾기 성공");
						System.out.println("회원 ID: "+temp.id);
						findcheck = true;
						break;						
					}//ie
				}//fe				
				//4. 없으면 없다고 출력
				if(findcheck==false) {
					System.err.println("알림) 동일한 회원정보가 없습니다.[ 찾기 실패 ]");
				}				
			}//else if 2e
			
			// 4. 비밀번호 찾기
			else if(ch==4) {//else if 3s
				// 4. 비밀번호 찾기
				//1. 아이디와 연락처를 입력받는다
				System.out.println("-------------------비밀번호 찾기 페이지 ---------------------");
				System.out.println("아이디 :"); 		String id = scanner.next();
				System.out.println("전화번호 :");	 	String phone = scanner.next();				

				//2. 배열내 동일한 아이디와 연락처가 있는지 확인한다.
				boolean findcheck = false;
				for(Member temp : memberlist) {//fs
					if(temp != null && temp.id.equals(id)&&temp.phone.equals(phone)) {//is
						//3. 동일한 객체가 있으면 해당 아이디를 출력
						System.err.println("알림) 비밀번호 찾기 성공");
						System.out.println("회원 Password: "+temp.password);
						findcheck = true;
						break;						
					}//ie
				}//fe				
				//4. 없으면 없다고 출력
				if(findcheck==false) {
					System.err.println("알림) 동일한 회원정보가 없습니다.[ 찾기 실패 ]");
				}					
			}//else if 3e
			else {
				System.out.println("알수없는 행동입니다.");
			}//else e
		}// 프로그램 실행 we		
	}//me
}//ce
