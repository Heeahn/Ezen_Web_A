package Day14;

public class Day14_3 {
	
	public static void main(String[] args) {
			
		// �޼ҵ� = �Լ� 
			// �޼ҵ� ȣ���� [ 1.��ü , 2.static ]
		//1. ��ü
		��Ʈ�ѷ� ��Ʈ�ѷ���ü = new ��Ʈ�ѷ�(); // 1.��ü�����
		��Ʈ�ѷ���ü.����1("1234");
		//2. static
		��Ʈ�ѷ�.����2("1234");
			// �μ� : �޼ҵ� ������ ���� ������ [ �޼ҵ� ������ �ڷ������� ���� ]
			// ��ȯ : �޼ҵ� ������ ������ ������ [ �޼ҵ� ȣ���� ��ȯ ���� ]
			// 1. �μ�o ��ȯo
		boolean ��� = ��Ʈ�ѷ�.����2("1234"); 
			//* �޼ҵ忡 1234���ڸ� �μ��� ������ �޼ҵ� 
			// ������ ��ȯ���� ��� ���� �� ����
			
			// 2. �μ�o ��ȯx
		��Ʈ�ѷ���ü.����("1234");
			//* �޼ҵ忡 1234���ڸ� �μ��� ������ �޼ҵ� 
			// ������ ��ȯ���� ���⶧���� ��� ����X 
		
			// 3. �μ�X ��ȯO
		String ���2 = ��Ʈ�ѷ���ü.����();
			// * �޼ҵ忡 �μ� ���� ������ �޼ҵ� 
			// ������ ��ȯ���� ���2 ������ ���� 
		
			// 4. �μ�X ��ȯX
		��Ʈ�ѷ���ü.��������Ʈ();
			// * �޼ҵ忡 �μ� ���� ������ �޼ҵ� 
			// ������ ��ȯ���� ���⶧���� ��� ����x
		
			// * @Override : 
				// ������ �޼ҵ�� , ������ �μ� �� �޼ҵ尡 
				// ����Ŭ����or�������̽��� �����Ұ�� ������
				// ��� : �޼ҵ带 �����޾Ҵµ� -> �޼ҵ� �籸�� 
				//		�θ� ���� �����޾Ҵµ� -> �� ���𵨸�
				//			extends : �����ϴ�[���]
				// �������̽� : �߻�޼ҵ忡 �����ϱ� -> ������ �޼ҵ忡 ����
				//			 ���̶�� �߻�[���] -> �� ����[�����]
				//			implements : �����ϴ�[�߻��� ���������ϱ�]
			// * �߻�޼ҵ� 
				// ����� �����ϰ� ������(   {}�� ����.   )����.
				// �߻�[ ��󸸵�� ] -> Ŭ���������� ���� �߻�ȭ�� �����ϱ� 
			// * static , final
		
		
	}
}









