package Day12;

import java.util.Random;
import java.util.Scanner;

public class Day12_4 {

	// ������ȣ ���� ���α׷�
	// ����
		// 1. ���� 0000~9999 ������ ���� 10�� �����ؼ� �迭�� ����
		// 2. ��� ���� ��ȣ�� �迭�� ����
		// 3. ���ڸ� ��ȣ�� Ȧ/¦ ����
		// 4. ���� ���ڸ��� ��ȣ�� Ȧ�� ���� �迭�� ����
		// 5. ���� ���ڸ��� ��ȣ�� ¦�� ���� �迭�� ����
		// 6. Ȧ������ �迭 ��� // ¦�� ���� �迭 ��� 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] carlist = new String[10];
		String[] evenlist = new String[10];
		String[] oddlist = new String[10];
		
		
		while(true){
			
			// ��� ���� ��ȣ ���
			System.out.println("\n*** �������� ��� ������ȣ ***");
			for(String temp : carlist) {
				if(Integer.parseInt(temp)%2==0) {
					for(int i =0;i<evenlist.length;i++) {
						if(evenlist[i]==null) {evenlist[i]=temp; break;}
					}
				}
				else {
					if(oddlist[i]==null) {oddlist[i]=temp; break;}
				}
			}
			
			// Ȧ������ ��ȣ ���
			System.out.println("*** �������� ��� Ȧ�� ������ȣ ***");
			
			// ¦������ ��ȣ ���
			System.out.println("*** �������� ��� ¦�� ������ȣ ***");
			
			System.out.println("1. ��������"); int ch = scanner.nextInt();
			
			if(ch==1) {
				Random random = new Random();
				int rn = random.nextInt(10000);
				String carNumber=String.format("%04d", rn);
				
				boolean full = false;
				for(int i =0;i<carlist.length;i++) { 
					if(carlist[i]==null) {carlist[i]=carNumber; full = true; break;}
				}
				if(full==false)System.err.println("����[�����Ұ�]");
			}
			
		}
				
	}
}
