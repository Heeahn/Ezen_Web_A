package Day06;

import java.util.Scanner;

public class Day06_3 {//cs
	
	// ȸ���� ���α׷� [ Ŭ���� ]
	
		// 0. ȸ�� ���� => ȸ�� Ŭ���� �����
			// 1. �ʵ�
				// 1. ���̵� 2. ��й�ȣ 3. �̸� 4. ��ȭ��ȣ
	
		// 1. �ʱ�޴�[ 1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣã��]
			// 1.ȸ�����Խ� �Է¹޾� ����
			// 2. �α��ν� ���̵�� ��й�ȣ�� �����ϸ� �α���ó��
			// 3. ���̵�ã��� �̸��� ��ȭ��ȣ�� �����ϸ� ���̵� ���
			// 4. ��й�ȣã��� ���̵�� ��ȭ��ȣ�� �����ϸ� ��й�ȣ ���
	
	public static void main(String[] args) {//ms
		Scanner scanner = new Scanner(System.in);
		Member[] memberlist = new Member[100];
		// Member Ŭ������ ������� ��ü(id.pw,name,phone) 100�� ������ �� �ִ� �迭 ����
		
		
		while(true) {//���α׷� ���� ���ѷ��� [��������: x]
			
			System.out.println("-------------------ȸ����------------------");
			System.out.println("1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣã��");
			System.out.println("���� :"); int ch = scanner.nextInt();

			// 1. ȸ������
			if(ch==1) {//is
				//1. id, password, name, phone �Է¹ޱ� => ����4
				System.out.println("-------------------ȸ������ ������-------------------");
				System.out.println("���̵� :"); 		String id = scanner.next();
				System.out.println("��й�ȣ :"); 	String password = scanner.next();
				System.out.println("�̸� :"); 		String name = scanner.next();
				System.out.println("����ó :"); 		String phone = scanner.next();
				
				//2. ��ü ����
				Member member = new Member();
				
				//3. �Է¹��� ����4���� ��ü�� �ʵ忡 �����ϱ�
				member.id = id;
				member.password = password;
				member.name = name;
				member.phone= phone;	
				
				//* ���̵� �ߺ�üũ
					// 1. �迭�� ��ü�� �Է��� id�� ������ id ã��
				boolean idcheck = false;
				for(Member temp : memberlist) {//fs
					//*memberlist �迭�� ��ü���� �ϳ��� temp�� ���� �ݺ�
					if(temp!=null&&temp.id.equals(id)) {//is
						//���࿡ �ش� ��ü�� id�� �Է¹��� id�� ������
						System.err.println("�˸�) ������� ���̵� �Դϴ�.");
						idcheck = true;
						break;
					}//ie
				}//fe
				
				// ���̵� �ߺ��� ������� ����
				if(idcheck==false) { // �ߺ��� ������� ����
					//4. ������ ��ü�� �����ϴ� �迭�� ����
						// 1. ���� �ε��� ã�� [ ������ �ƴϸ� ����ȸ���� ����]
					int i = 0; // �ε��� ��ġ����;						
					for(Member temp : memberlist) {//fs
						if(temp == null) {//if s //���࿡ �ش� ��ü�� �����̸�
							memberlist[i] = member; // �ش� �ε����� ���� ������� ��ü ����
							System.err.println("�˸�) ȸ�� ���� ����!");
							break; // for ������ [ �ȳ����� ��� ���鿡 ������ ��ü ����Ǳ� ������]
						}//if e
							i++;
					}//fe				
				}//ie
			}// ȸ������ if e
		
			
			// 2. �α���
			else if(ch==2) {//else if 1s
				// 1. �Է¹ޱ�
				System.out.println("-------------------�α��� ������ ---------------------");
				System.out.println("���̵� :"); 		String loginid = scanner.next();
				System.out.println("��й�ȣ :");	 	String loginpassword = scanner.next();
				
				// 2. ���� �迭[ȸ������Ʈ] �� �Է¹��� ���� ��
				boolean logincheck = false;
				for(Member temp:memberlist) {//fs
					//* memberlist �� 0�� �ε������� �� �ε������� �ϳ��� temp�� ����
					if(temp != null && 
						temp.id.equals(loginid) && 
						temp.password.equals(loginpassword)){//is
						System.err.println(" �˸�) �α��� ����");
						logincheck = true;
					}//ie
				}//fe
				if(logincheck==false) {
					System.err.println("�˸�) ������ ȸ�������� �����ϴ�.");
				}
			}//else if 1e			
			else if(ch==3) {//else if 2s
			// 3. ���̵� ã��
				//1. �̸��� ����ó�� �Է¹޴´�
				System.out.println("------------------- ���̵�ã�� ������ ---------------------");
				System.out.println("�̸� :"); 		String name = scanner.next();
				System.out.println("��ȭ��ȣ :");	 	String phone = scanner.next();				

				//2. �迭�� ������ �̸��� ����ó�� �ִ��� Ȯ���Ѵ�.
				boolean findcheck = false;
				for(Member temp : memberlist) {//fs
					if(temp != null && temp.name.equals(name)&&temp.phone.equals(phone)) {//is
						//3. ������ ��ü�� ������ �ش� ���̵� ���
						System.err.println("�˸�) ���̵� ã�� ����");
						System.out.println("ȸ�� ID: "+temp.id);
						findcheck = true;
						break;						
					}//ie
				}//fe				
				//4. ������ ���ٰ� ���
				if(findcheck==false) {
					System.err.println("�˸�) ������ ȸ�������� �����ϴ�.[ ã�� ���� ]");
				}				
			}//else if 2e
			
			// 4. ��й�ȣ ã��
			else if(ch==4) {//else if 3s
				// 4. ��й�ȣ ã��
				//1. ���̵�� ����ó�� �Է¹޴´�
				System.out.println("-------------------��й�ȣ ã�� ������ ---------------------");
				System.out.println("���̵� :"); 		String id = scanner.next();
				System.out.println("��ȭ��ȣ :");	 	String phone = scanner.next();				

				//2. �迭�� ������ ���̵�� ����ó�� �ִ��� Ȯ���Ѵ�.
				boolean findcheck = false;
				for(Member temp : memberlist) {//fs
					if(temp != null && temp.id.equals(id)&&temp.phone.equals(phone)) {//is
						//3. ������ ��ü�� ������ �ش� ���̵� ���
						System.err.println("�˸�) ��й�ȣ ã�� ����");
						System.out.println("ȸ�� Password: "+temp.password);
						findcheck = true;
						break;						
					}//ie
				}//fe				
				//4. ������ ���ٰ� ���
				if(findcheck==false) {
					System.err.println("�˸�) ������ ȸ�������� �����ϴ�.[ ã�� ���� ]");
				}					
			}//else if 3e
			else {
				System.out.println("�˼����� �ൿ�Դϴ�.");
			}//else e
		}// ���α׷� ���� we		
	}//me
}//ce
