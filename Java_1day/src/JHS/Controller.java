package JHS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Controller {

	//리스트
	static ArrayList<Member> memberlist = new ArrayList<Member>();
	static String[] wordList = new String[100];
	Scanner scanner = new Scanner(System.in);
	GameTimer gt = new GameTimer();
	
	//메소드
		// 회원가입
			// id_valid test
	public static int id_valid (String id) {
		// id 정규식  "/^[a-zA-Z0-9]{1,12}$/"  -> 12글자 이하 숫자, 영문
		String regex = "^[a-zA-Z0-9]{1,12}$"; 
		boolean result = Pattern.matches(regex, id);
		
		if (result) {return 1;} 
		else {return 0;}
	}
			// pw_valid text
	public static int pw_valid (String pw) {
		// pw 정규식 "/^(?=.*[A-Za-z])(?=.*\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\d~!@#$%^&*()+|=]{8,}/" -> 8글자 이상 숫자, 영문, 특수문자 반드시 포함
		String regex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\\d~!@#$%^&*()+|=]{8,}$";
		boolean result = Pattern.matches(regex, pw);
		
		if (result) {return 1;} 
		else {return 0;}
	}
	
	// duplication test 
	public static boolean duplication_test (String id) {
		for(Member temp : memberlist) {
			if (temp.getId().equals(id)) {
				return false;
			} 
		}
		return true;
	}
	
		// sign_up method
	public static void sign_up (String id, String pw, String name, String phone) {
		Member member = new Member(id, pw, name, phone);
		memberlist.add(member);
		save();
	}

		// login method
	public static int login(String id, String pw) {
		for (Member temp : memberlist) {
			if (temp.getId().equals(id) && temp.getPassword().equals(pw)) {
				return 1;
			} else if (temp.getId().equals(id) && !temp.getPassword().equals(pw)) {
				return 2;
			} else if (!temp.getId().equals(id) && temp.getPassword().equals(pw)) {
				return 3;
			} 
		}
		return 0;
	}
	
	
	//김선제 - gameStart 메소드 작성//
	public static boolean gameStart(String id, String word) {
		
		if(wordList[0] == null) {
			wordList[0] = word;
			System.out.println("입력받은 단어: " + word);
			return true;
		}
		else {	
			int index = -1;
			
			for(String temp : wordList) {
				if(temp != null) {index ++;}
				if(temp != null && temp.equals(word)) {
					return false;
				}
			}
	        
			char lastChar = wordList[index].charAt(wordList[index].length() - 1);
	        char firstChar = word.charAt(0);
	        
	        if(lastChar == firstChar ) {
	        	System.out.println("입력받은 단어: " + word);
	        	wordList[index + 1] = word;
	        }
	        else return false;	
		}
		return true;
	}
	//김선제- 점수 저장
	public static void gameSave(String id, int index) {
		for(Member temp : memberlist) {
			if(temp != null && temp.getId().equals(id)) {
				if(index > temp.getCount())
					temp.setCount(index);
			}
		}
		
	}
	
	// wordList 초기화
	public static void initialization(String id) {
		int index = 0;
		for(String temp : wordList) {
			if(temp != null) {
				Controller.wordList[index] = null;
				index++;
			}
		}
		System.out.println("내 점수: " + (index -1));
		Controller.gameSave(id, index -1);
	}
	
	//김선제- 점수 보기

	public static void seeScore(String id) {
		for(Member temp : memberlist) {
			if(temp != null && temp.getId().equals(id)) {
			System.out.println( temp.getCount());

			}
		}
	}
	
	public static void save() { // 정준영 저장 s
        FileOutputStream fileOutputStream;
        try {
           fileOutputStream = new FileOutputStream("c:/temp/java/test/test.txt",true);
           for(Member temp : memberlist) {
              String output = (temp.getId()+","+temp.getPassword()+","+temp.getName()+","+temp.getPhone()+","+temp.getCount());
           
           fileOutputStream.write(output.getBytes()); // 바이트화 해서 기록
              }
           } catch (Exception e) {}
        
     } // 저장 e
     
     public static void load() { // 정준영 불러오기 s
        try {
           FileInputStream fileInputStream = new FileInputStream("C:/temp/java/test/test.txt");
           byte[] bytes = new byte[1024]; // 바이트 배열 선언
           fileInputStream.read(bytes);
           String file = new String(bytes); // 파일내용 선언
           String[] list = file.split("\n"); // \n 기준으로 자르기
           for(int i = 0; i<list.length; i++) { // list 끝까지 한번씩 차례차례
               String[] ma = file.split(",",5); // , 를 기준으로 5개까지 잘라서 저장
                        Member member = new Member(ma[0], ma[1], ma[2], ma[3], Integer.parseInt(ma[4]));
                        // 아이디, 비밀번호, 이름, 전화번호, 점수
                        // 문자열 --> 정수형 변환 
               memberlist.add(member);   // 리스트 저장
           } // for e
        } catch (Exception e) {
           e.printStackTrace();
        }
        
        
     } // 불러오기 e
	// 랭킹
	
	// 아이디찾기
 	//id찾기 정준영
 	public static String idsearch(String name, String contact) { // 이름, 연락처 받기
 		for(Member temp : memberlist) {
 			if(temp.getName().equals(name) && temp.getPhone().equals(contact)) {
 				return temp.getId(); // 이름, 연락처 일치하면
 			}
 		} return null; //일치하는 값이 없이 for문이 끝나면
 	} // id찾기 e
 	
 	// 비밀번호찾기 
	//pw찾기 정준영
	public static String pwsearch(String id, String contact) {
		for(Member temp : memberlist) {
			if(temp.getId().equals(id) && temp.getPhone().equals(contact)) {
				return temp.getPassword(); // 이름, 연락처 일치하면
				}
			} return null; //일치하는 값이 없이 for문이 끝나면
		}
	}
