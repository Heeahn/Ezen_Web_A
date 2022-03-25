package Day18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day18_3 {
	
	public static void main(String[] args) {
	
	// p.731 ~ 732 : LinkedList Ŭ����
	
	//						ArrayList							vs			LinkedList
	// 							�迭												��ũ
	// ���α�������		�ε����������� �޸𸮿���[��]				���� �ٸ� �޸��ּ� ����
	// 	�ӵ�����		
	//	add[�߰�]			����
	//add[����=�߰�]															����
	// 	�˻�					����
	// 	����																		����
	
		//1.ArrayList ��ü ����[���׸� : String]
		ArrayList<String> list1 = new ArrayList<>();
		//2.LinkedList ��ü ����[���׸� : String]
		LinkedList<String> list2 = new LinkedList<>();
		
		// 3. �ð�����
		Long starttime;	// ���� �ð�
		Long endtime;	// ������ �ð�
		
		// 4. Arraylist ��ü�� 10000�� ��ü�� �����ϴµ� �ɸ��½ð� üũ
			starttime = System.nanoTime();
		for(int i=0;i<100000;i++) {
				list1.add(0,i+""); 	// ������ -> ���ڿ� ��ȯ : 1. String.valueof(����) 2. ����+""
												// ���ڿ� -> ������ ��ȯ : 1. Integer.parseInt(���ڿ�)
		}
			endtime = System.nanoTime();
		System.out.println("Arraylist�� 100000�� �����ϴµ� �ɸ��� �ð�  :"+(endtime-starttime)+"ns");
		
		// 5. LinkedList ��ü�� 10000�� ��ü�� �����ϴµ� �ɸ��½ð� üũ
		starttime = System.nanoTime();
		for(int i=0;i<100000;i++) {
			list2.add(0,i+""); }
		endtime = System.nanoTime();
		System.out.println("LinkedList�� 100000�� �����ϴµ� �ɸ��� �ð�  :"+(endtime-starttime)+"ns");
		
		
		
	}
}
