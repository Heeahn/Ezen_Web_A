package Day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day10_6 {
	// �ֱ����ġ : �޸� : RAM : ���α׷� ����ÿ��� ������ �� �ִ� �޸�
	// ���������ġ : c����̺�, USB, CD : (���α׷�) ����[��������]
	// ����ó��[�ڹٳ� �޸𸮸� --> ���������ġ]
	// DBó��[ �ڹٳ� �޸� --> DB ����[PC]]
		// ��Ʈ��(stream) : ���α׷��� �ܺ�[Ű����,����,��Ʈ��ũ��] ���
				//��� ����
		// FileOutputStream : ���� ��� Ŭ����
			// ��ü��.write(����Ʈ��);
		// FileInputStream : ���� �Է� Ŭ����
			// ��ü��.read(����Ʈ�迭);
		// String Ŭ����
			// ���ڿ�.equals() : ���ڿ� �� �޼ҵ�
			// ���ڿ�.getBytes() : ���ڿ� -> ����Ʈ�� ��ȯ
			// new String(����Ʈ�迭) : ����Ʈ�迭 -> ���ڿ� �迭
	public static void main(String[] args) throws IOException {
		
		// ���� ���[���� -> �ڹ�] 
		FileOutputStream fileOutputStream = new FileOutputStream("D:/java/java1.txt");
		//FileInputStream : ��������� Ŭ����
		//FileInputStream(���ϰ��/���ϸ�.Ȯ����); // txt : �޸���
		String ���� = "�ڹٿ��� �Էµ� ������";
		fileOutputStream.write(����.getBytes()); // ����[����]
		
		//���� �Է�[�ڹ� -> ����]
		FileInputStream fileInputStream = new FileInputStream("D:/java/java1.txt");
		byte[] bytes = new byte[1000];
		fileInputStream.read(bytes);
		System.out.println("���ϳ��� :"+new String(bytes));
	}
}










