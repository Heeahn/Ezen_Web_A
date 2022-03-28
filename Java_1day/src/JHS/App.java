package JHS;

import java.util.Scanner;

public class App {//cs
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {//ms
		Controller controller = new Controller();
		GameTimer gameTimer = new GameTimer();

		try {//ts
			while(true) {//ws
				//�޴�[ 1. ȸ������ 2. �α��� 3. ��ŷ���� 4. ���̵� ã�� 5. ��й�ȣ ã�� 6. ����]
				System.out.println(" ===================================");
				System.out.println(" \t\t\t\t�����ձ� ����");
				System.out.println(" ===================================");
				System.out.println(" \t\t\t\t1. ȸ������");
				System.out.println(" \t\t\t\t2. �α���");
				System.out.println(" \t\t\t\t3. ��ŷ����");
				System.out.println(" \t\t\t\t4. ���̵� ã��");
				System.out.println(" \t\t\t\t5. ��й�ȣ ã��");
				System.out.println(" \t\t\t\t6. ����");
				System.out.println(" ===================================");
				int ch = scanner.nextInt();
				//ȸ������
				if(ch==1) {
					System.out.println(" ===================================");
					System.out.println(" \t\t\t\t1. ȸ������");
					System.out.println(" ===================================");
					System.out.println("ID�� 12���� ���� / PW�� 8���� �̻� ����, ����, Ư������ �ݵ�� ����");
					System.out.println("Id :"); String id = scanner.next();
					System.out.println("Password :"); String pw = scanner.next();
					System.out.println("�̸� :"); String name = scanner.next();
					System.out.println("��ȭ��ȣ :"); String phone = scanner.next();
					
					if (Controller.id_valid(id) == 0) {
						System.err.println("\n���̵�� 12���� ���Ϸ� �Է����ּ���.\n");
					} else if (Controller.id_valid(id) == 1 && Controller.pw_valid(pw) == 0) {
						System.err.println("\n��й�ȣ�� 8���� �̻� ����, ����, Ư�����ڸ� �ݵ�� ������ �ּ���.");
					} else if (Controller.id_valid(id) == 1 && Controller.pw_valid(pw) == 1) {
						Controller.sign_up(id, pw, name, phone);
						System.out.println("\nȸ������ ����");
					}
				}
				//�α���
				else if(ch==2) {
					System.out.println(" ===================================");
					System.out.println(" \t\t\t\t �α���");
					System.out.println(" ===================================");
					System.out.print("ID : ");			String id = scanner.next();
					System.out.print("PW : ");			String pw = scanner.next();
					Controller.load();
					int result = Controller.login(id, pw);
					if (result == 1) {
						System.out.println("\n�α��� ����\n");
						System.out.println("1. ���� ���� 2. �α׾ƿ�");
						int ch1 = scanner.nextInt();
						//���ӽ���
						if(ch1==1) {game(id);}
						else if(ch1==2) {
							System.out.println("�α׾ƿ��Ǿ����ϴ�.");
						}
						else System.out.println("�߸��Է��Ͽ����ϴ�.");
					}
					else if (result == 2) {System.err.println("\n��й�ȣ ����\n");} 
					else if (result == 3) {System.err.println("\n���̵� ����\n");}
				}
				//��ŷ����
				else if(ch==3) {
					Controller.ranking();
				}
				
				//���̵� ã��
				else if(ch==4) {
					System.out.println("===============================");
					System.out.println(" \t\t\t\t4. ���̵� ã��");
					System.out.println("===============================");
					System.out.println("�̸� �Է� : "); String name = scanner.next();
					System.out.println("��ȭ��ȣ �Է� : "); String contact = scanner.next();
					String id=Controller.idsearch(name, contact);
					if(id==null) { // ���ϰ��� null�̸�
						System.err.println("��ġ�ϴ� ȸ�� ������ �����ϴ�.");
					}else { // null���� ����� ��ȯ�ϸ�
						System.out.println("ȸ������ ���̵�� "+id+"�Դϴ�.");
					}
				}
				
				//��й�ȣ ã��
				else if(ch==5) {		
					System.out.println("===============================");
					System.out.println(" \t\t\t\t5. ��й�ȣ ã��");
					System.out.println("===============================");
					System.out.println("���̵� �Է� : "); String id = scanner.next();
					System.out.println("��ȭ��ȣ �Է� : "); String contact = scanner.next();
					String pw=Controller.pwsearch(id, contact);
					if(pw==null) { // ���ϰ��� null�̸�
						System.err.print("��ġ�ϴ� ȸ�� ������ �����ϴ�.");
					}
					else { // null���� ����� ��ȯ�ϸ�
						System.out.print("ȸ������ ��й�ȣ�� "+pw+"�Դϴ�.");}
				}
				
				//����
				else if(ch==6) {
					System.exit(0);
				}
				else {
					System.err.println("�߸��Է��Ͽ����ϴ�.");
				}
			}//we
		}//te
		catch(Exception e) {scanner = new Scanner(System.in);}
	}//me
	
	private static void game(String id) {
		try {
			while(true) {
				System.out.println("---------�����ձ� ����---------");
				System.out.println("1. ���� 2. �� �������� 3.�α׾ƿ�");
				System.out.println("----------------------------");
				System.out.print(">>>>>: "); int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("---------���̵� ����---------");
					System.out.println("1. �ʱ� 2. �߱� 3.���");
					int ch1 = scanner.nextInt();
					if(ch1==1) {
						System.out.println("[�ʱ� ���]���� ����");
						String firstword = Controller.randomfirstword();
						System.out.print("ù��° ���� : " + firstword + "\n");
					
						while(true) {
							GameTimer gameTimer = new GameTimer();
							
							gameTimer.start();
							System.out.print("�Է� > "); 	String word = scanner.next();
							gameTimer.interrupt();
							
							boolean result = Controller.gameStart(id, word);
							if(result) {	}
							else {
								System.err.println("���� ����");
								Controller.initialization(id);
								break;
							}
						}
					}
					else if(ch1==2) {
						System.out.println("[�߱� ���]���� ����");
						String firstword = Controller.randomfirstword();
						System.out.print("ù��° ���� : " + firstword + "\n");
					
						while(true) {
							Timer2 timer2 = new Timer2();
							
							timer2.start();
							System.out.print("�Է� > "); 	String word = scanner.next();
							timer2.interrupt();
							
							boolean result = Controller.gameStart(id, word);
							if(result) {	}
							else {
								System.err.println("���� ����");
								Controller.initialization(id);
								break;
							}
						}
					}
					else if(ch1==3) {
						System.out.println("[��� ���]���� ����");
						String firstword = Controller.randomfirstword();
						System.out.print("ù��° ���� : " + firstword + "\n");
					
						while(true) {
							Timer3 timer3 = new Timer3();
							
							timer3.start();
							System.out.print("�Է� > "); 	String word = scanner.next();
							timer3.interrupt();
							
							boolean result = Controller.gameStart(id, word);
							if(result) {	}
							else {
								System.err.println("���� ����");
								Controller.initialization(id);
								break;
							}
						}
					}
				}
				else if(ch == 2) {
					System.out.println("---------���� ����---------");
					Controller.seeScore(id);
				}
				else if(ch == 3) {break;}
				else System.out.println("�ùٸ� ���� �Է�");
			}
		}catch(Exception e) {scanner = new Scanner(System.in);}
	}
}//ce
