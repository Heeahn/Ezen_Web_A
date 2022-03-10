package Day07;

import java.util.Scanner;

public class Member {
	// 1.�ʵ�
	int mno;					// ȸ����ȣ [�ڵ���ȣ, �ߺ�X]
	String id;					// ���̵� [ �ߺ�X]
	String password;	// ��й�ȣ
	String name;			// �̸�
	String phone;			// ����ó
	
	// 2. ������
		// 1. �������[�⺻������]
	public Member() {}
		// 2. ��� �ʵ带 �޴� ������  : ȸ�����Կ� ��ü������
	public Member(int mno, String id, String password, String name, String phone) {
	this.mno = mno;
	this.id = id;
	this.password = password;
	this.name = name;
	this.phone = phone;
	}
	
	// 3. �޼ҵ�
		// 1. ȸ������ �޼ҵ�[�μ�x��ȯo : ���Լ��� true/ ���Խ��� false]
	boolean ȸ������() {
		System.out.println("----------------------ȸ������ ������----------------------");
		
		// 1. �Է¹޴´�[id,pw,name,phone]
		System.out.println("���̵� :"); 		String id = Day07_5_BookApplication.scanner.next();
		System.out.println("��й�ȣ :"); 	String password = Day07_5_BookApplication.scanner.next();
		System.out.println("�̸� :"); 		String name = Day07_5_BookApplication.scanner.next();
		System.out.println("����ó :"); 		String phone = Day07_5_BookApplication.scanner.next();
			// *scanner ��ü�� �ٸ� Ŭ������ static ����Ǿ�����.		// *Ŭ������.�ʵ��.�Լ���();
			// *static �ʵ�, �޼ҵ�� ��ü���� ȣ�Ⱑ��
		
		//* ���̵��ߺ�üũ
		for(Member temp : Day07_5_BookApplication.members) {
			if(temp != null && temp.id.equals(id)) {
				System.out.println("�˸�) ���� ������� ���̵��Դϴ�.");
				return false; // ���̵� �ߺ��Ǿ��� ������ false[���Խ���]
			}
		}		
		
		//* ȸ����ȣ �ڵ�����[���� �ֱٿ� ������ ȸ���� ��ȣ+1]
		int bno =0; // ȸ����ȣ �����ϴ� ����
		int j = 0; // �ݺ�Ƚ��[�ε���]
		for(Member temp : Day07_5_BookApplication.members) {
			if(temp == null) { // null ã��[null ã������ null-1 �ϸ� ������ȸ��]
				if(j==0) {
					bno = 1;  break;
				}  // ù��° �ε���[0���ε���]�� null => ùȸ����ȣ =1�ο�
				else {
					bno =Day07_5_BookApplication.members[j-1].mno+1; 
					break;
				}				
			}
			j++;
		}
		
		// 2. 4������ -> ��üȭ -> 1��
		Member member = new Member(bno, id, password, name, phone); // ��� �ʵ� �޴� �����ڷ� ��ü ����
		
		// 3. �迭�� �� ������ ã�Ƽ� ���ο� ȸ��[��ü] �ֱ�
		int i = 0;
		for(Member temp : Day07_5_BookApplication.members) {//fs
			if(temp==null) {
				Day07_5_BookApplication.members[i] = member;
				System.out.println("ȸ������ ȸ����ȣ: " +bno);
				return true; // ȸ������ �޼ҵ� ���� ~~~~[��ȯ : true]
			}
			i++;
		}
		return false;
	}
	// 2. �α��� �޼ҵ�[�μ�x��ȯo ]
			// �α��� ������ ������ ���̵��ȯ / ���н� NULL ��ȯ
	String �α���() {
		System.out.println("----------------------�α��� ������----------------------");
		// 1. �Է¹ޱ�
		System.out.println("���̵� :"); 		String id = Day07_5_BookApplication.scanner.next();
		System.out.println("��й�ȣ :"); 	String password = Day07_5_BookApplication.scanner.next();
		
		//2. �迭�� ��ü id�� password�� �Է��� ���� �����ϸ�
		for(Member temp : Day07_5_BookApplication.members) {
			if(temp!=null &&temp.id.equals(id) && temp.password.equals(password) ) {
					return temp.id;	
				}				
			}
			return null;
	}
		// 3. ���̵�ã�� �޼ҵ�[�μ�x��ȯx] : �̸�, ����ó
	void ���̵�ã��() {
		System.out.println("----------------------���̵� ã�� ������----------------------");		
		//1. �Է¹ޱ�
		System.out.println("�̸� :"); String name = Day07_5_BookApplication.scanner.next();
		System.out.println("����ó :"); String phone = Day07_5_BookApplication.scanner.next();
		// 2. �Է¹��� ���� �迭�� ã��
		for(Member temp : Day07_5_BookApplication.members) {
			if(temp!=null && temp.name.equals(name) && temp.phone.equals(phone)) {
				System.out.println("ȸ���� ���̵�: " + temp.id);
				return;
			}
		}
		// 3. ã������ ã�� id ����ϰ� ��ã������ ���� ���
		System.out.println("�˸� ������ ȸ�������� �����ϴ�.");
	}
	
		// 4. ��й�ȣ�R�� �޼ҵ�[�μ�x��ȯx] : ���̵�, ����ó
	void ��й�ȣã��() {
		System.out.println("----------------------��й�ȣ ã�� ������----------------------");
		//1. �Է¹ޱ�
		System.out.println("���̵� :"); String id = Day07_5_BookApplication.scanner.next();
		System.out.println("����ó :"); String phone = Day07_5_BookApplication.scanner.next();
		// 2. �Է¹��� ���� �迭�� ã��
		for(Member temp : Day07_5_BookApplication.members) {
			if(temp!=null && temp.id.equals(id) && temp.phone.equals(phone)) {
				System.out.println("ȸ���� ��й�ȣ: " + temp.password);
				return;
			}
		}
	
	// 3. ã������ ã�� id ����ϰ� ��ã������ ���� ���
	System.out.println("�˸�) ������ ȸ�������� �����ϴ�.");
	}
		// 5. ȸ��Ż�� �޼ҵ�
		// 6. ȸ������ �޼ҵ�
}
