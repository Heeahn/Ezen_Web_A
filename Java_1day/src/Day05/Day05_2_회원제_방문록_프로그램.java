package Day05;

import java.util.Scanner;

import javax.swing.border.Border;

public class Day05_2_ȸ����_�湮��_���α׷� {
	
	// ȸ���� �湮�� ���α׷� 
		//1. ȸ�� �ʱ�޴� [ 1. ȸ������ 2. �α��� ]
			// 1. ȸ������ [ ���̵�, ��й�ȣ, �̸� ]
			//	 2. �α���[ ���̵�, ��й�ȣ �����ϸ� �α���ó�� ]
		//2. �α��ν� �޴� [ 1. �湮�Ͼ��� 2. �α׾ƿ� ]
			// 1. �湮�Ͼ��� [ ����,����,�ۼ���(�α��εȾ��̵�) ]
			// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
	
	public static void main(String[] args) {
	
		// �غ� [ 
		Scanner scanner = new Scanner(System.in); // �Է°�ü
			// ȸ�� 100��[id,pw,name] �����ϴ� �迭
		String[][] memberlist = new String[100][3]; // 100�� 3�� => ȸ���� 1�� [1�� =id][2��=pw][3��=�̸�]
			// �湮�� 100��[title, contents, writer ] �����ϴ� �迭
		String[][] boardlist = new String[100][3]; // �Խù��� 1��
		
		while(true) { // ���ѷ���x[�������� : x]
			
			System.out.println("----------------------------------------------------");
			System.out.println("--------------------ȸ���� �湮��--------------------");
			System.out.print("1. ȸ������ 2. �α��� ����: "); int ch = scanner.nextInt();
			
			//ȸ������
			if(ch==1) {
				System.out.println("----------------ȸ������ ������-------------------");
				System.out.print("MEMBER ID : "); 					String id = scanner.next();
				System.out.print("MEMBER PASSWORD : "); 	String password = scanner.next();
				System.out.print("MEMBER NAME : "); 			String name = scanner.next();
				System.out.println("-------------------------------------------------");
				// string 3�� ������ �Է¹޾� memberlist 2���� �迭�� ����
					// 1. �����[����=0, ��ü(���ڿ�) = null]�� ã�Ƽ� ����[���࿡ ������� ������ ȸ������ 
					// 2. ���̵� �ߺ�üũ
				
				// ���̵� �ߺ�üũ[ ã�� / ���� ȸ���� id�� �����ϸ� ȸ�����ԺҰ�]
				boolean idcheck = true;
				for(int i=0; i<memberlist.length; i++) {
					if(memberlist[i][0] !=null && memberlist[i][0].equals(id)){
						System.err.println("������ ID�� �����մϴ�");
						idcheck = false; // ����X
						break;
					}
				}
				
				// ����κ�
				if(idcheck) { 
					for(int i=0; i<memberlist.length;i++) {
						if(memberlist[i][0]==null) {// i���� �࿡ id�� ������ = �����
							memberlist[0][0] = id;	memberlist[0][1] = password;	memberlist[0][2] = name;
							System.err.println("�˸�) ȸ������ �Ϸ�.");
							break; // ���������� �� [ 1������]
						}
					}			
				}
			}

			//�α���
			else if(ch==2) {

				System.out.println("----------------�α��� ������-------------------");
				System.out.print("MEMBER ID : "); 					String id = scanner.next();
				System.out.print("MEMBER PASSWORD : "); 	String password = scanner.next();
				System.out.println("-------------------------------------------------");
				
				//�迭�� �����Ͱ� �Է¹��� id�� password�� �����ϸ� �α���ó��
				for(int i=0; i<memberlist.length;i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)&&memberlist[i][0].equals(password)) {
						// i��° �࿡ id�� password �� �Է¹��� ���� equals ������ 
							// null �� ��ü�� �ƴϱ� ������ equals �� �Ұ��� => == ����
						System.err.println("�α��μ���");
						
						System.out.println("-------------------------------------");
						System.out.println("--------------�湮��-----------------");
						System.out.println("��ȣ\t�ۼ���\t����\t����");
							//
							for(int j=0;j<boardlist.length;j++) {
								if(boardlist[j][0] != null) {
									System.out.printf("%d\t%s\t%s\t%s \n",
											j, 
											boardlist[j][2], 
											boardlist[j][0], 
											boardlist[j][1]);
								}
							}
						
						System.out.println("1. �湮�ϳ���� 2. �α׾ƿ� ���� : "); int ch2 = scanner.nextInt();
						
						if(ch2==1) {
							System.out.println("-----------�۾���------------------");
							System.out.println("title : "); 			String title = scanner.next();
							System.out.println("content : ");		String content = scanner.next();
							
							for(int j=0;j<boardlist.length;j++) {
								if(boardlist[j][0]==null) { // �迭�� j��° �ε��� ��ù��� �����̸�
									boardlist[j][0] = title;	boardlist[j][1] = content;	
									boardlist[j][2] = id; // �α��ν� ���� id�� ����
									System.err.println("�湮���� �ۼ��Ǿ����ϴ�.");
									break;
								}
							}
							
						}
						else if(ch2==2) {
							System.err.println("�α׾ƿ�");
							break;
						}
						else System.err.println(" �˸�) �˼� ���� ��ȣ�Դϴ�!");
						 						
					}//ie= login e
				}//fe								
			}// ch==2 ie
			else System.err.println(" �˸�) �˼� ���� ��ȣ�Դϴ�!");					
		}//w1e		
	}//me
}//ce
