package Day05;

import java.util.Scanner;

public class Day05_3_p181 {
	public static void main(String[] args) {
		
		//p.181
			// 1.
			// 2.
			// 3. 2 : ��ü �񱳽� equals  �޼ҵ� ���
			// 4. 2 : ���̰� ���� ��� �� ���� �Ұ�
			// 5. 3 : boolean �ʱⰪ�� false
			// 6. 3,5
			// 		{1��},	{2��},	{3��}
			//		{78 83 93 87 88} => 5
			// 7. 
		
		int max = 0;// �ִ밪 �����ϴ� ����
		int[] array = {1,5,3,8,2}; // ����+�ʱⰪ ����
		
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) max=array[i];
		}
		
		System.out.println("max :"+max);
		
			//8.
		int[][] array2 = {	
				{95,86}, 
				{83,92,96}, 
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int count = 0;
		
		//Ǯ��
		for(int i=0; i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++) {
				sum+=array2[i][j];
			}
			count += array2[i].length;
		}
		
		avg= (double)sum/count;
		
		System.out.println("sum :"+sum);
		System.out.println("avg :"+avg);
		
			//9.
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.�л��� 2. �����ӷ� 3. ��������Ʈ 4. �м� 5. ����");
			System.out.println("-------------------------------------------------");
			System.out.println("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) { // �л��� �Է¹ޱ�
				System.out.println("�л���>"); studentNum = scanner.nextInt(); // �л��� �Է¹ޱ�
				scores = new int[studentNum];	// �Է¹��� �л�����ŭ �迭���� ����
				
			}
			else if(selectNo == 2) {// �л� ���� �Է¹ޱ�
				for(int i=0;i<scores.length;i++) { // �迭�� ��� �ε�����ŭ �ݺ�ó��
					System.out.printf("����[%d] : \n", i);
					scores[i] = scanner.nextInt(); // �Է¹޾� i��° �Է¹޾� ���
				}
			}
			else if(selectNo == 3) { // �л� ���� ����ϱ�
				for(int i=0;i<scores.length;i++) {
					System.out.printf("scores[%d] : %d \n",i,scores[i]);
				}
			}
			else if(selectNo == 4) {
				int max1 = 0;
				int score =0;
				double avg1 = 0.0;
				
				for(int i=0;i<scores.length;i++) {
					//�ְ��������ϱ�
					if(max1<scores[i]) max1 = scores[i];	
					score +=scores[i];
				}
				
			//����������ϱ�
				avg1 = (double)score/scores.length;
				
				System.out.println("�ְ� ���� :"+max1);
				System.out.println("��� ���� :"+avg1);
				
			}
			else if(selectNo == 5) {
				run=false;
			}
			
		}
		
		System.out.println("���α׷� ����");
		
	}
}
