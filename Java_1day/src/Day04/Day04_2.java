package Day04;

import java.util.Scanner;

public class Day04_2 {
	
	// Day01 : �����
	// Day02 : ����[����] ����[���]
	// Day03 : if[���] for[�ݺ���]
	
	// ���Ǳ� ���α׷�
		// 1. �޴��� [ 1.�ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.���� ] 
		// 		// 1.�޴��ǿ��� ��ǰ�����ϸ� ��ٱ��Ͽ� �ֱ� 
		//		// 2.����� �����ϸ� �˸�( ������� )
		// 2. �ʱ� ��� [ ��ǰ �� 10���� ]
		// 3. ������ �ݾ��Է¹޾� ������ ��ŭ ������ �ܵ� ��� 
				// 1. ������ �ݾ׺��� ���ž� �� �� ũ�� ���� ��� [ �ݾ׺��� ]
	
	
	public static void main(String[] args) {
		
		// ���뺯��[ ��� ��ȣ������ ����ϴ� ������ ]
		Scanner scanner = new Scanner(System.in); 			// 1. �Է°�ü
		int �ݶ���� =10; int ȯŸ��� =10; 	int ���̴����=10; // 2. �������
		int �ݶ󱸸ż�=0;	int ȯŸ���ż� = 0;int ���̴ٱ��ż�=0;	// 3. ��ٱ��� 
		
		while(true) { // ���α׷� ���� [ ���ѷ��� ]
			System.out.println("--------------------�޴�-------------------");
			System.out.println(" 1.�ݶ�[300] 2.ȯŸ[200] 3.���̴�[100] 4.���� ");
			System.out.println("------------------------------------------");
			System.out.print(">>>>>> ���� : "); int ���� = scanner.nextInt();
			
			if( ���� == 1 ) { // �ݶ� ����
				if( �ݶ���� == 0 ) { // �ݶ������ 0�̸� ���źҰ� 
					System.err.println(" �˸�)) ����� �����ϴ� .��� �غ���"); // �˸�
				}
				else { // �ݶ������ ������ ���Ű��� 
					System.err.println(" [[ �ݶ� ��ҽ��ϴ�.]]"); // �˸�
					�ݶ󱸸ż�++; // ��ٱ��Ͽ� �ݶ� ��� 
					�ݶ����--;	// �ݶ���� ����
				}
			}// �ݶ� ���� end 
			else if( ���� == 2 ) { // ȯŸ ���� 
				if( ȯŸ��� == 0 ) { 
					System.err.println(" �˸�)) ����� �����ϴ� .��� �غ���"); 
				}
				else { 
					System.err.println(" [[ ȯŸ ��ҽ��ϴ�.]]");
					ȯŸ���ż�++; 
					ȯŸ���--;	
				}
			}// ȯŸ ���� end 
			else if( ���� == 3 ) { // ���̴� ���� 
				if( ���̴���� == 0 ) { 
					System.err.println(" �˸�)) ����� �����ϴ� .��� �غ���"); 
				}
				else { 
					System.err.println(" [[ ���̴� ��ҽ��ϴ�.]]");
					���̴ٱ��ż�++; 
					���̴����--;	
				}
			}// ���̴� ���� end 
			else if( ���� == 4 ) { // ���� 
				System.out.println(" ------------- ���� ��ǰ��� -------------");
				System.out.println("��ǰ��\t����\t�ݾ�");
				if(�ݶ󱸸ż� !=0) System.out.println("�ݶ�\t"+�ݶ󱸸ż�+"\t"+(�ݶ󱸸ż�*300) );
				if(ȯŸ���ż� !=0) System.out.println("ȯŸ\t"+ȯŸ���ż�+"\t"+(ȯŸ���ż�*200) );
				if(���̴ٱ��ż� !=0) System.out.println("�ݶ�\t"+���̴ٱ��ż�+"\t"+(���̴ٱ��ż�*100) );
				int �Ѱ����� = ((�ݶ󱸸ż�*300)+ (ȯŸ���ż�*200) + (���̴ٱ��ż�*100)); 
				System.out.println(" ��ǰ �� ������ : " + �Ѱ����� );
				System.out.println("----------------------------------------");
				System.out.println(" 1.���� 2.���"); int ����2 = scanner.nextInt();
				
				if( ����2 == 1 ) { // 1.���� 
					// 1. �ݾ� �Է¹޴´� .
					// 2. �ݾ��� �����׺��� ������ �����Ұ� -> �ݾ� �� �Է�
					// 3. �ݾ��� �����׺��� ������ �������� -> ��ٱ��� �ʱ�ȭ
					while(true) { //w2
						System.out.println("�ݾ� �Է�: "); int �ݾ� = scanner.nextInt();
						
						if(�ݾ�<�Ѱ�����) { // �����Ұ� -> ���Է�
							System.err.println("�˸�) �ݾ��� �����մϴ�. �ٽ� �ݾ�����");
						}
						else {
							System.err.println("�˸�) �����Ϸ� �ֹ���ȣ: 0000��");
							�ݶ󱸸ż� = 0; ȯŸ���ż� = 0; ���̴ٱ��ż� = 0;
							System.err.println("�˸�) �ܵ���� :" + (�ݾ�-�Ѱ�����)+"��");
							break;
						}
					} // w2 e
				}
				else if( ����2 == 2 ) { // 2.��� 
					System.err.println(" �˸�)) ���Ÿ�� ��� ����� ");
					�ݶ���� += �ݶ󱸸ż�;	ȯŸ��� += ȯŸ���ż�; ���̴���� +=���̴ٱ��ż�; //  ���ż��� ����� �ű�� 
					�ݶ󱸸ż� =0; ȯŸ���ż�=0; ���̴ٱ��ż�=0;						// ���ż� �ʱ�ȭ 
				}
				else { // 3. �׿� 
					System.err.println(" �˸�)) �˼����� �ൿ�Դϴ�.");  // �˸�
				}
			} // ���� end 
			else {
				System.err.println(" �˸�)) �˼����� �ൿ�Դϴ�.");  // �˸�
			}
			
		} //  while end
		
		
		
		
	} // main end
} // class end 





