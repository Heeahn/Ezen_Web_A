package Day08;

import java.util.Scanner;

public class Day08_5 {

	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[1000];
	static Bank[] banks = new Bank[1000];
	static Loan[] loans = new Loan[1000];
	
	// ����� ��ũ ���α׷�[2�� ����]
	
	public static void main(String[] args) {
		Day08_5 bank = new Day08_5();
		bank.menu();
	}
	// �ʱ� �޴� �޼ҵ�
	
	void menu() {
		Member member = new Member();
			while(true) {
				System.out.println("----------------------------------------------");
				System.out.println("1. ȸ������ 2 . �α��� 3. ���̵�ã�� 4. ��й�ȣã�� :");
				int ch = scanner.nextInt();		

				if(ch==1) {
					boolean result = member.ȸ������();// ȸ������ �޼ҵ� ȣ��
					if(result) System.err.println("ȸ������ ����");
					else System.err.println("ȸ������ ����");
				}
				
				else if(ch==2) {// �α��� �޼ҵ� ȣ��
					String result = member.�α���();
					if(result == null) {
						System.out.println("������ ȸ�������� �����ϴ�.");
					}
					else {
						if(result != null && result.equals("admin")) {
							System.out.println("�ȳ��ϼ���."+result+"��"); 
							loanadmin();
						}
						else {
							System.out.println("�ȳ��ϼ���."+result+"��"); 
							bankmenu(result);
							}
					}
				}
				else if(ch==3) {member.���̵�ã��();}
					// ���̵� ã�� �޼ҵ� ȣ��	
				else if(ch==4) {member.��й�ȣã��();}
					// ��й�ȣ ã�� �޼ҵ� ȣ��
				else {System.err.println("�˸�) �˼� ���� ��ȣ�Դϴ�.");}
		}
	}
	
	// ���� �޼ҵ�
	void bankmenu(String loginid) {
		while(true) {
			System.out.println("----------------------------------------------");
			System.out.println("1. ���»��� 2 .���¸�� 3. �Ա� 4. ��� 5. ��ü 6.����  ����:");
			int ch = scanner.nextInt();		
			Bank bank = new Bank();
			
			// ���»���
			if(ch==1) {
				bank.���»���(loginid);
			}
			// ���¸��
			else if(ch==2) {
				bank.���¸��(loginid);				
			}
			// �Ա�
			else if(ch==3) {
				bank.�Ա�(loginid);
			}
			
			// ���
			else if(ch==4) {
				bank.���(loginid);
			}
			
			// ��ü
			else if(ch==5) {
				bank.��ü(loginid);
			}
			
			// ����
			else if(ch==6) {
				loan(loginid);
			}
			
			// �� ��
			else {System.err.println("�˸�) �˼� ���� ��ȣ�Դϴ�.");}
		}
	}
	
	void loan(String loginid) {
		while(true) {
			System.out.println("----------------------���� ������------------------------");
			System.out.println("1.�������� 2. �����ȯ 3. �α׾ƿ�  ����:");
			int ch = scanner.nextInt();	
			Loan loan = new Loan();
			
			if(ch==1) {
				loan.��������(loginid);
			}
			else if(ch==2) {
				loan.�����ȯ(loginid);
			}
			else if(ch==3) {
				return;
			}
			else {
				System.out.println("�˼����� ��ȣ�Դϴ�.");
			}
			
			
		}
	}
	
	void loanadmin() {
		while(true) {
			System.out.println("----------------------���� ������------------------------");
			System.out.println("1.���� ��� 2. ���� �� ��� 3.������� 4. �α׾ƿ� ����: ");
			int ch = scanner.nextInt();	
			Loan loan = new Loan();
			
			if(ch==1) {
				loan.������();
			}
			else if(ch==2) {
				loan.��������();
			}
			else if(ch==3) {
				loan.�������();
			}
			else if(ch==4) {
				return;
			}
			else {
				System.out.println("�˼����� ��ȣ�Դϴ�.");
			}
		
		
		}
	}
}
