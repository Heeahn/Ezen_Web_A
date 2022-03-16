package Day11;

public class Day11_2 {//cs

	//p. 422
		// ��ǻ���� �ϵ���� ������ ���� [����Ұ���]
		// ������� �߸��� ���� or �������� �߸��� �ڵ��� ������ ����
		// ���� : 1. �Ϲݿ��� 2. ���࿹��
			// �Ϲݿ��� : ������[����]���� ���� �˻� [ �����ڿ��� ���� ����ó�� �ȳ�(������)]
			// ���࿹�� : ������[����]�Ŀ� ���� �˻� [ �������� ������ ���� �Ǵ��ؼ� ����ó��]
		// ����ó��
			//���� : ������ �߻��ϸ� ���α׷��� ����ȴ�. ! [����������]
			// ���࿡ ������ �߻��ϸ� ��ü �ڵ尡 ����[ ���α׷��� ������� �ʰ�]
	
	public static void main(String[] args) {//ms
		
		//p. 423[NullPointerException]
		try { // ts
			String data = null;
			System.out.println(data.toString()); // ObjectŬ���� �޼ҵ� : toString() : ��ü�������
					// ���������� ���� ����.
			// ������ �߻��ϴ� ���� : null�� �޸𸮰� ���� ������ ��ü���� ��� �Ұ�
		} // t e
		catch(NullPointerException exception) {//cs
			System.out.println("���ܹ߻� :"+exception);
		}//ce
		
		// p.424 [ArrayIndexOutOfBoundsException]
		try {
			String[] �迭 = new String[2]; //String 2���� ������ �� �ִ� �迭
			�迭[0] = "a";
			�迭[1] = "b";
			�迭[2] = "c";
		}catch(ArrayIndexOutOfBoundsException e) {
							//���ܹ߻��� ����Ŭ������ ��ü�� = ��ü�� ���� ������ �����
			// ���࿡ ���ܰ� �߻��ϸ� ���صǴ��ڵ�
			System.out.println("���ܹ߻� :" + e);
		}
		
		// p.426
		try {
			String data1 = "100";
			String data2 = "a100";
			int value1 = Integer.parseInt(data1); // "100" -> 100
			int value2 = Integer.parseInt(data2);  // "a100" -> X[a�� ������ ǥ���Ұ���]
							//Integer.parseInt(���ڿ�);  ���ڿ� -> ����
			// �����߻� ���� : ���ڿ��� ���������� ��ȯ�� ���������� ���ڿ��� �������� ��ȯ�� �Ұ���
			// ������ �߻��ϸ� catch�� �̵� [���� �߻� ���� �ڵ� ����x]
			int result = value1 + value2;
			System.out.println(data1+"+"+data2+"="+result);
		}catch(NumberFormatException e) {
			System.out.println("�����߻� :"+e);
		}
		
		//p. 428
		String ���ڿ� = "���缮";	// �ڹ� Ŭ������ �ϳ� [ ������ Object ���]
		Object ���۰�ü;				// �ڹ� Ŭ������ �ֻ��� Ŭ����
			
		���۰�ü = ���ڿ�;				// �ڽ� --> �θ�[����]
		���ڿ� = (String)���۰�ü;	// �θ� --> �ڽ�[�Ұ���]
					// ��������ȯ
					// �����߿� ����ȯ
		// ����ó�� �Ǵ�
			// �����(����� ����) ���õ� �ڵ� [������ ����ó��]
		
	}//me
}//ce
