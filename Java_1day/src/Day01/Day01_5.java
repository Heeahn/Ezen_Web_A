package Day01;

import java.util.Scanner;

public class Day01_5 {

	public static void main(String[] args) {
		
		// 문제1: 회원가입 표 작성
		// 1. 아이디, 비밀번호, 성명, 이메일
		Scanner JS = new Scanner(System.in);
		
	System.out.println("아이디 : "); String 아이디 = JS.next();
	System.out.println("비밀번호 : "); String 비밀번호 = JS.next();
	System.out.println("성명 : "); String 성명 = JS.next();
	System.out.println("이메일 : "); String 이메일 = JS.next();

	System.out.println(">>>>>>>>>>>>>>>회원가입 완료 아래 정보를 확인해주세요<<<<<<<<<<<<<<");
	System.out.println("아이디\t비밀번호\t성명\t이메일");
	System.out.println(아이디+"\t"+비밀번호+"\t"+성명+"\t"+이메일);
		
	}
}
