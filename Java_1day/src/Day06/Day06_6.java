package Day06;

import java.util.Scanner;

public class Day06_6 {//cs

	public static void main(String[] args) {//ms
		
		//�غ� [��� {} �ȿ��� ���Ǵ� ���� ����]
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100];
				//* Board ��ü�� 100���� ������ �� �ִ� 1���� �迭 ����
		
		while(true) {
			
			System.out.println("--------------------Ŀ�´�Ƽ------------------");
			//////////////////////////////////��� �Խù� ��ȸ/////////////////////////////////////
			System.out.println("��ȣ\t�ۼ���\t����");
				//�迭�� ��� ��ü(�Խù�) ��� �ݺ���
				int index=0; // �ε��� ����[�迭�� ��ü �� üũ]
				for(Board board:boardlist) {// �迭�� ��� ��ü(�Խù�) ��� �ݺ���
					if(board!=null) {// ���࿡ �ش� board ��ü�� ���빰�� ������ ���
						System.out.printf("%d\t%s\t%s \n",index,board.writer,board.title);
					}
					index++; // �ε��� ����
				}
				///////////////////////////////////////////////////////////////////////
			System.out.println("1. �۾��� 2.�ۺ���");
			int ch = scanner.nextInt();
			
			if(ch==1) { // 1. �۾���
				//////////////////////////////////�۾���/////////////////////////////////////
				System.out.println("-----------------------�۾��� ������-----------------------");
				System.out.println("title :"); 				String title = scanner.next();
				System.out.println("content :"); 		String content = scanner.next();
				System.out.println("writer :"); 			String writer = scanner.next();
				System.out.println("password :"); 	String password = scanner.next();
				//2. 4�� ������ ��üȭ[��ü�� ���� 4�������� ��ü�� �ʵ忡 ����]
				Board board = new Board(title, content, writer, password);
										// 4�� �ʵ带 ���� ������ ���
				// 3. �迭�� ������� ã�Ƽ� ������� ��ü ����
				int i = 0;
				for( Board temp:boardlist) {
					if(temp==null) { 
						boardlist[i] = board;
						break;
					}
					i++;
				}
				///////////////////////////////////////////////////////////////////////////			
			}
			else if(ch==2) {// 2. �� ����
				System.out.println("�Խù� ��ȣ ���� : "); int bno = scanner.nextInt();
				System.out.println("-------------------------��ù� ��������-----------------------");
				// �ݺ��� ��� ����X -> �������ġ[�ε���] �Է� �޾ұ� ������ -> �Է¹��� �ε��� ��ġ�� ��
				System.out.printf("�ۼ���: %s	���� : %s \n", boardlist[bno].writer, boardlist[bno].title);
				
				System.out.printf("���� : %s \n", boardlist[bno].content);
				System.out.println("--------------------------------------------------------------");
				System.out.print("1. ��Ϻ���(�ڷΰ���) 2.�ۻ��� 3. �ۼ��� ���� : "); int ch2 =scanner.nextInt();
				
				if(ch2==1) { }
				else if(ch2==2) {// 2. �� ����
			////////////////////////////////�� ����///////////////////////////////////////////			

					System.out.println("�� �Խù� ��й�ȣ: "); String password = scanner.next();
					// �ݺ���X �˻�X=> ������ �ε��� ��ġ�� �Է¹޾ұ� ������
					if(boardlist[bno].password.equals(password)) {
						System.out.println("�˸�) ���� ����");
						boardlist[bno]=null;
						// �����Ŀ� ������ �ε��� �ڷ� ��ĭ�� ������ �̵�
						// ��? ���࿡ �ش� �ڵ尡 ���� ��� �迭�� ���� �߻�
						for(int i =bno;i<boardlist.length;i++) {
												// �迭���� = 100 �ε���: 0~99
							//* �˻��� �Խù����� �ε������� �������ε������� 1������
							if(i==boardlist.length-1) boardlist[boardlist.length-1] =null;
							//i�� �������ε����� ������ �������ε������� null ����
							else	boardlist[i] = boardlist[i+1]; // ������ �Խù� ���� �Խù�
						// i�� �������ε�����  ������ ������ �ε������� null ����
						}
					}
					else {
						System.err.println("�˸�) ��й�ȣ�� �ٸ��ϴ�.[��������]");
					}
				
			///////////////////////////////////////////////////////////////////////////////			

				}
				else if(ch2==3) {// 3. �� ���� 

					System.out.println("�� �Խù� ��й�ȣ: "); String password = scanner.next();
					// �ݺ���X �˻�X=> ������ �ε��� ��ġ�� �Է¹޾ұ� ������
					if(boardlist[bno].password.equals(password)) {
						System.out.println("�˸�) ������ ���� : "); boardlist[bno].title = scanner.next();
						System.out.println("�˸�) ������ ���� : "); boardlist[bno].content = scanner.next();
						System.err.println("�˸�) ���� �����Ǿ����ϴ�.");
					}
					else {
						System.err.println("�˸�) ��й�ȣ�� �ٸ��ϴ�.[��������]");
					}
					
				}
				else {
					System.err.println("�˸�) �˼� ���� ��ȣ�Դϴ�.");
				}
				
				
			}
			else {
				System.err.println("�˸�) �˼� ���� ��ȣ�Դϴ�.");
			}
			
		}
		
	}//me
}//ce
