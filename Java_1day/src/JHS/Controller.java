package JHS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class Controller {

	//����Ʈ
	static ArrayList<Member> memberlist = new ArrayList<Member>();
	static String[] wordList = new String[100];
	Scanner scanner = new Scanner(System.in);
 	static List<String> firstwordlist = Arrays.asList(
 			"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", 
 			"��", "��", "��", "��", "��", "Ȳ", "��","��", "��", "��",
 			"ȫ", "��", "��", "��", "��", "��", "��", "��", "��", "��", 
 			"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", 
 			"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", 
 			"ä", "��", "õ", "��", "��", "��", "��", "��", "��", "��", 
 			"��","��", "��", "��", "��", "��", "��", "��", "��", "��", 
 			"��", "��", "��", "��", "��", "��", "��", "ǥ", "��", "��", 
 			"��", "��", "��","��", "��", "��", "��", "��", "��", "��", 
 			"��", "Ź", "��", "��", "��", "��", "��", "��", "��", "��");
	
	//�޼ҵ�
		// ȸ������
	public static int id_valid (String id) {
		// id ���Խ�  "/^[a-zA-Z0-9]{1,12}$/"  -> 12���� ���� ����, ����
		String regex = "^[a-zA-Z0-9]{1,12}$"; 
		boolean result = Pattern.matches(regex, id);
		
		if (result) {return 1;} 
		else {return 0;}
	}
	public static int pw_valid (String pw) {
		// pw ���Խ� "/^(?=.*[A-Za-z])(?=.*\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\d~!@#$%^&*()+|=]{8,}/" -> 8���� �̻� ����, ����, Ư������ �ݵ�� ����
		String regex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\\d~!@#$%^&*()+|=]{8,}$";
		boolean result = Pattern.matches(regex, pw);
		
		if (result) {return 1;} 
		else {return 0;}
	}
	
	// id �ߺ� üũ
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
	
	public static String randomfirstword() {
		Collections.shuffle(firstwordlist);
		return firstwordlist.get(0);
	}
	
	
	//�輱�� - gameStart �޼ҵ� �ۼ�//
	public static boolean gameStart(String id, String word) {
		
		if(wordList[0] == null) {
			wordList[0] = word;
			System.out.println("�Է¹��� �ܾ�: " + word);
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
	        	System.out.println("�Է¹��� �ܾ�: " + word);
	        	wordList[index + 1] = word;
	        }
	        else return false;	
		}
		return true;
	}
	//�輱��- ���� ����
	public static void gameSave(String id, int index) {
		for(Member temp : memberlist) {
			if(temp != null && temp.getId().equals(id)) {
				if(index > temp.getCount())
					temp.setCount(index);
			}
		}
		
	}
	
	// wordList �ʱ�ȭ
	public static void initialization(String id) {
		int index = 0;
		for(String temp : wordList) {
			if(temp != null) {
				Controller.wordList[index] = null;
				index++;
			}
		}
		System.out.println("�� ����: " + (index -1));
		Controller.gameSave(id, index -1);
	}
	
	//�輱��- ���� ����

	public static void seeScore(String id) {
		for(Member temp : memberlist) {
			if(temp != null && temp.getId().equals(id)) {
			System.out.println( temp.getCount());

			}
		}
	}
	
	public static void save() { // ���ؿ� ���� s
        try {
           FileOutputStream fileOutputStream = new FileOutputStream("c:/temp/java/test/test.txt");
           for(Member temp : memberlist) {
              String output = (
            		  temp.getId()+","+temp.getPassword()+","+
              temp.getName()+","+temp.getPhone()+","+temp.getCount()+"\n");
           
           fileOutputStream.write(output.getBytes()); // ����Ʈȭ �ؼ� ���
              }
           } catch (Exception e) {}
        
     } // ���� e
     
     public static void load() { // ���ؿ� �ҷ����� s
        try {
           FileInputStream fileInputStream = new FileInputStream("C:/temp/java/test/test.txt");
           byte[] bytes = new byte[1024]; // ����Ʈ �迭 ����
           fileInputStream.read(bytes);
           String file = new String(bytes); // ���ϳ��� ����
           String[] list = file.split("\n"); // \n �������� �ڸ���
           int i=0;
           for(String temp : list) {
        	   if(i+1 == memberlist.size()) break;
        	   String[] ma = file.split(","); // , �� �������� 5������ �߶� ����
        	   String c = String.valueOf(ma[5].trim());
               Member member = new Member(ma[0], ma[1], ma[2], ma[3], Integer.parseInt(c));
                        // ���̵�, ��й�ȣ, �̸�, ��ȭ��ȣ, ����
                        // ���ڿ� --> ������ ��ȯ 
               memberlist.add(member);   // ����Ʈ ����
               i++;
           } // for e
        } catch (Exception e) {}
        
        
     } // �ҷ����� e
     //��ŷ ���ؿ�
     public static void ranking() {

    	 HashMap<Integer, String> rank = new HashMap<>();
    	 TreeSet<Integer> scores = new TreeSet<>();
    	 for(Member temp : memberlist) {
    		 scores.add(temp.getCount()); // ������ �ݺ� ����
    	 }
    	 
    	 NavigableSet<Integer> desc = scores.descendingSet(); // �������� �����ؼ� desc�� ����
    	 for(Member temp : memberlist) { // �������Ʈ ��ü����
    		 rank.put(temp.getCount(), temp.getId()); // ������ ���̵� ����(�ڵ� ����)
    	 }
    	 //�����Ʈ
    	 int i = 1;
    	 for(Integer d : desc) { System.out.println(i+"�� : "+rank.get(d)+", "+d+"��"); i++;}
     }
	
	// ���̵�ã��
 	//idã�� ���ؿ�
 	public static String idsearch(String name, String contact) { // �̸�, ����ó �ޱ�
 		for(Member temp : memberlist) {
 			if(temp.getName().equals(name) && temp.getPhone().equals(contact)) {
 				return temp.getId(); // �̸�, ����ó ��ġ�ϸ�
 			}
 		} return null; //��ġ�ϴ� ���� ���� for���� ������
 	} // idã�� e
 	
 	// ��й�ȣã�� 
	//pwã�� ���ؿ�
	public static String pwsearch(String id, String contact) {
		for(Member temp : memberlist) {
			if(temp.getId().equals(id) && temp.getPhone().equals(contact)) {
				return temp.getPassword(); // �̸�, ����ó ��ġ�ϸ�
				}
			} return null; //��ġ�ϴ� ���� ���� for���� ������
		}
	}
