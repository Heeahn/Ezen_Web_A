package Day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Day10_5_��������_����Ʈ���� {
	
	public static void main(String[] args) {
		// 1. ����Ʈ[��ü] ����
		ArrayList<Book> booklist = new ArrayList<>();
//	����ƮŬ����<����Ʈ�ȿ� ������ Ŭ����>
		//<Ŭ����> : �ش� Ŭ������ ���� ��ü�� ����Ʈ�� ����
		// ���̴� ���� [�⺻ : 10]
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1.��� 2.��� 3.���� 4.����");	
			int ch = scanner.nextInt();
			if(ch==1) {
				// 1. �Է¹ޱ�
				System.out.println("������ :"); String bookname = scanner.next();
				System.out.println("���� :"); String writer = scanner.next();
				// 2. ��üȭ[������ ���� ---> 1�� ��ü]
				Book book = new Book(bookname,writer);
				
				// 3. �迭����[������ ã�Ƽ�] vs ����Ʈ
				booklist.add(book); // ����Ʈ�� ����
				// ?????? : .add(��ü��) 
					// ������ �ε����� �ڵ������� ��ü�� �߰�
				
			}
			else if(ch==2) {
				// 1. �迭[null ����] vs ����Ʈ
				System.out.println("������ \t ����");
				for(Book book : booklist) {
					System.out.println(book.getBookName()+"\t"+book.getWriter());
				}
			}
			else if(ch==3) {
				// 1. �迭[ �����Ŀ� �� �ε��� ����] vs �ε���[�ڵ�]
				// 	1 2 3 [2����] 1 null 3			vs 1234 [2����] 134
				System.out.println("������ ������ :"); String bookName = scanner.next();
				// ����ã��
				for(Book book : booklist) {
					if(book.getBookName().equals(bookName)) {
						booklist.remove(book); 
						break; // ���� ���������� �ݺ��� Ż��
					}
				}
			}
			else if(ch==4) {
				System.out.println("������ ������ : "); String bookName = scanner.next();
				for(Book book : booklist) {
					if(book.getBookName().equals(bookName)) {
						System.out.println("���� ����: "); String writer = scanner.next();
						book.setWriter(writer);
					}
				}
			}
		}		
	}
}
