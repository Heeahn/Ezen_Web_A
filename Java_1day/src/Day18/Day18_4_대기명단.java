package Day18;

import java.util.ArrayList;
import java.util.Scanner;

public class Day18_4_대기명단 {
	
	public static void main(String[] args) {
		
		// 대기명단 프로그램
			// 메뉴 :[고객] 1.대기추가 2.대기취소[관리자] 3.대기자입장
				// 대기추가 : 인원수를 입력받아 대기번호 반환
				// 대기취소 : 대기번호 입력받아 명단 취소
				// 대기장입장 : 첫번째 대기중인 대기번호 호출
		int waitNum = 1;
		ArrayList<Waiting> waitings = new ArrayList<>();
			// 여러개의 대기 객체를 저장할 수 있는 리스트객체 선언
		Scanner scanner = new Scanner(System.in);
		
		try {
		while(true) {
				// 반복문을 이용한 리스트내 모든 객체 호출
				System.out.println("대기번호\t 인원수 \t 대기예약시간");
				for(Waiting temp: waitings) {
					if(waitings.indexOf(temp)==0) System.out.println(temp.waitNum+"\t\t"+temp.number+"\t\t 입장");
					else System.out.println(temp.waitNum + "\t\t"+temp.number+"\t\t"+waitings.indexOf(temp)*3+"분");
				}
				System.out.println("[고객] 1.대기추가 2.대기취소 [관리자] 3.대기자입장");
				int ch = scanner.nextInt();
				
				if(ch==1) {
					// 1. 입력받은 값을 변수에 저장
					System.out.println("*전화번호 : "); String phone = scanner.next();
					System.out.println("*인원수 : "); int number = scanner.nextInt();
					// 2. 3개변수 -> 1개 객체화
					Waiting temp = new Waiting(waitNum, phone, number);
					// 3. 대기 인원들을 리스트에 저장
					waitings.add(temp);
					waitNum++; //* 대기번호 증가
				}
				else if(ch==2) {
					System.out.println("대기번호 :"); int 삭제대기번호 = scanner.nextInt();
					//리스트내 객체 필드 검색
					for(Waiting temp : waitings) {if(temp.waitNum == 삭제대기번호) {waitings.remove(temp); break;}
					// * 대기명단 리스트에 하나식 temp 호출하는데 만약에 temp내 대기번호가 입력받은 삭제대기번호와 같으면 해당 temp는 삭제후 반복문종료
					}
				}
				else if(ch==3) {
					System.out.println("가장 앞에 있는 대기명단을 입장 시킵니다."); waitings.remove(0); // 0번째 인덱스 삭제
				}
				else {System.out.println("입력이 잘못되었습니다.");}
			}
		}catch (Exception e) {	}
	}
}
