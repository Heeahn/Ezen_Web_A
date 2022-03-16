package Day11;

import java.util.Scanner;

public class Day11_4_BoardApp {//cs
	/*
	 * ��ȸ���� �Խ���/��� ���α׷� [ ����ó��, ����ó��, ����Ʈ]
	 * 	// [m]�Խù� Ŭ����
	 * 		// ����, ����, �ۼ���, �ۼ���, ��ȸ��, ��۸���Ʈ
	 * 	// [m]��� Ŭ����
	 * 		// ����, �н�����, �ۼ���, �ۼ���
	 * 	//[c]��Ʈ�ѷ� Ŭ����
	 * 		// 1. ��� 2. ���� 3. ���� 4. ���� 5. ���� 6. ��۾���
	 * 		// 7. �Խù����� 8. �Խù��ҷ����� 9. ������� 10.��ۺҷ�����
	 *		//[v]Day11_4_BoardApp Ŭ����
	 *			// �����[�Է¹޾� ��Ʈ�ѷ����� �Է¹��� �� ����]
	 */
	public static void main(String[] args) {//ms
		
		Scanner scanner = new Scanner(System.in);
		Controller.load();
		
		while(true) {
			try { // ���ܹ߻� : ����� �����Է½� ���ܹ߻�!! -> catch �̵�
				// ��� �Խù� ���
				System.out.printf("%2s\t%10s\t%10s\t%10s\t%2s\t \n", "��ȣ","����","�ۼ���","�ۼ���","��ȸ��");
				
				int i = 0;
				for(Board board : Controller.boardlist) {
					System.out.printf("%2s\t%10s\t%10s\t%10s\t%2s\t \n",
							i,board.getTitle(),board.getWriter(),board.getDate(),board.getViewcount());
					i++;
				}
				
				System.out.println("1.���� 2. ����  ���� :");
				int ch = scanner.nextInt();
				if(ch==1) {
					System.out.println("***�Խù� ���***");
						// nextLine() : �������� �Է°���[ ����! : nextLine �տ� �ϴ� next �ϳ��� ���]
						// �ذ��� : �Ϲ�next �� nextLine ���̿� nextLine() �߰�
					scanner.nextLine();
					System.out.println("���� :");							String title = scanner.nextLine();
					System.out.println("���� :");							String content = scanner.nextLine();
					System.out.println("�ۼ��� :");							String writer = scanner.next();
					System.out.println("��й�ȣ[����/������] :"); 	String password = scanner.next();
					Controller.write(title,content,writer,password); // �μ�����
					
				}
				else if(ch==2){
					// �ش� �Խù� ��ȣ[�ε���] �� �Է¹޾� �Խù����� ��� ���
					System.out.println("��ù� ��ȣ :"); int index = scanner.nextInt();
					
					Board temp = Controller.boardlist.get(index); // �ش� �ε����� ��ü�� �ӽ� ��ü[�ڵ� ���̱�]
					System.out.println("*** �Խù� ���� ***");
					System.out.println("���� :"+temp.getTitle());
					System.out.println("�ۼ��� :"+temp.getWriter()+"�ۼ��� :"+temp.getDate()+"��ȸ�� :"+temp.getViewcount());
					System.out.println("���� :"+temp.getContent());
					
					// ��� ���[����]
					
					// �޴�
					System.out.println("1.�ڷΰ��� 2.���� 3.���� 4.��۾��� ���� :");
					int ch2 = scanner.nextInt();
					
					if(ch2==1) {}
					else if(ch2==2) {
						System.out.println("*** ���� ������ ***");
						System.out.println("�� �Խù� �н����� :"); String password = scanner.next();
						scanner.nextLine(); // [�Ϲ�next �������� nextLine ����ϰ� �Ǹ� �����߻�[���� ���]
						System.out.println("���� ���� :"); String title = scanner.nextLine();
						System.out.println("���� ���� :"); String content = scanner.nextLine();
						
						boolean result = Controller.update(index,password,title,content); // ������ �ε�����ȣ, �н����� üũ, ������ ����, ������ ���� => �μ�
						if(result) System.err.println("�˸�]] ���� ����");
						else System.err.println("�˸�]] ���� ����[�н����尡 �ٸ��ϴ�.]");
						}
					else if(ch2==3) {
						System.out.println("*** ���� ������ ***");
						System.out.println("�� �Խù� �н����� :"); String password = scanner.next();
						
						boolean result = Controller.delete(index,password); //������ �ε�����ȣ, �н����� üũ => �μ�
						if(result) System.err.println("�˸�]] �Խù��� �����Ǿ����ϴ�.");
						else System.err.println("�˸�]] ���� �����߽��ϴ�.(�н����尡 �ٸ��ϴ�.)");
					
					}
					else if(ch2==4) {
						Controller.replywrite(); // �ε��� ��ȣ, ��۳���, ��� �н�����, ��� �ۼ��� => �μ�
						}
					else {
						System.err.println("�˸�]]�ùٸ� ��ȣ�� �ƴմϴ�.");
					}
				}
				else {
					System.err.println("�˸�]]�ùٸ� ��ȣ�� �ƴմϴ�.");
				}
			}
			catch(Exception e) {
				System.err.println("�޽���]] ����� �� ���� �Է��Դϴ�.[�ٽ��Է�]");
				scanner = new Scanner(System.in); // �ٽ� �޸��Ҵ�
			}
		}
		
	}//me

}//ce
