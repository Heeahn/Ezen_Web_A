package Day07;

//Ŭ���� ����
	// 1. book
		// �ʵ�: ISBN(������ȣ), ������, �۰�, �����뿩����, �뿩ȸ��
		// �޼ҵ�: 1. �����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5. ������� 6. ��������

public class Book { 

	// 1. �ʵ�
	String ISBN;				// ISBN
	String bname;		// ������
	String bwriter;		// �۰�
	boolean brental;	// �����뿩����
	String mid;				// �뿩ȸ��
	
	// 2. ������
		// 1. �������[�⺻������] : �޼ҵ�ȣ���
	public Book() {}
		// 2. Ǯ������[��� �ʵ�޴� ������] : �������
	public Book(String isbn, String bname, String bwriter, boolean brental, String mid) {
		this.ISBN = isbn;
		this.bname = bname;
		this.bwriter = bwriter;
		this.brental = brental;
		this.mid = mid;
	}
	// 3. �޼ҵ�
		// 1. �����˻�
	void �����˻�() {
		System.out.println("----------------------���� �˻� ������----------------------");
		System.out.println("ISBN �Է� : "); String isbn = Day07_5_BookApplication.scanner.next();
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp!=null&&temp.ISBN.equals(isbn)) {
				System.out.printf("������\t�۰�\t�뿩�߿���");
				System.out.println(temp.bname+"\t"+temp.bwriter+"\t"+temp.brental+"\t");
			}
			else {
				System.out.println("�˼� ���� �����Դϴ�.");
			}
		}
	}
		// 2. �������
	void �������() {
		System.out.println("----------------------���� ��� ������----------------------");
		System.out.printf("ISBN\t������\t�۰�\t�뿩���ɿ���");
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp!=null) {
				if(temp.brental) // �ش絵���� �����뿩���ΰ� true �̸�
					System.out.println(temp.ISBN+"\t"+temp.bname+"\t"+temp.bwriter+"\t"+"�뿩����");
				else // �ش絵���� �����뿩���ΰ� false
					System.err.println(temp.ISBN+"\t"+temp.bname+"\t"+temp.bwriter+"\t"+"�뿩��");
			}	
		}

	}
		// 3. �����뿩
	void �����뿩(String loginid) {
		System.out.println("----------------------���� �뿩 ������----------------------");
		System.out.println("���� ISBN :"); String isbn = Day07_5_BookApplication.scanner.next();
		
		int i= 0;
		for(Book temp: Day07_5_BookApplication.books) {
			if(temp !=null && temp.ISBN.equals(isbn)) {
				if(temp.brental) {
					System.out.println("�ش� ���� �뿩 �մϴ�.");
					Day07_5_BookApplication.books[i].brental = false;
					Day07_5_BookApplication.books[i].mid = loginid;
					return;
				}
				else {
					System.err.println("�ش� ���� �뿩�� �����Դϴ�.[�뿩�Ұ�]");
					return;
				}
			}
		}
		i++;
		System.out.println("������ ������ �����ϴ�.");
	}
		// 4. �����ݳ�
	void �����ݳ�(String loginid) {
		System.out.println("----------------------���� �ݳ� ������----------------------");
		�����뿩���(loginid);
		System.out.println("���� ISBN "); String isbn = Day07_5_BookApplication.scanner.next();
		
		int i =0;
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp !=null && temp.ISBN.equals(isbn)) { // �Է��� isbn�� ������
				if(temp.mid.equals(loginid)) {//�뿩�ΰ� ���� �α��ε� ����� �����ϸ�
					if(temp.brental) {// �뿩���� �ƴϸ�
						System.err.println("�˸�) ���� ������ �뿩���� �ƴմϴ�.");
					}
					else { // �뿩���̸�
						System.out.println("�˸�) �ݳ� �Ϸ�!!");
						Day07_5_BookApplication.books[i].brental = true;
						Day07_5_BookApplication.books[i].mid = null;
						return;
					}
				}
				else {
					System.out.println("ȸ������ �뿩�� ������ �ƴմϴ�.");
				}
			}
		}
		i++;
	}
	
	void �����뿩���(String loginid) {
		System.out.println("----------------------�����뿩 ��� ������----------------------");
		System.out.printf("ISBN\t������\t�۰�\t�뿩���ɿ���");
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp!=null && temp.mid.equals(loginid)) {
					System.err.println(temp.ISBN+"\t"+temp.bname+"\t"+temp.bwriter+"\t"+"�뿩��");
			}	
		}
	}
	
		// 5. �������
	void �������() {
		System.out.println("----------------------���� ��� ������----------------------");
		// 1. �Է¹޴´�[ISBN(������ȣ), ������, �۰�, �����뿩����, �뿩ȸ��]
		System.out.println("������ȣ :"); 		String isbn = Day07_5_BookApplication.scanner.next();
		// �ߺ�üũ
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp != null && temp.ISBN.equals(isbn)) {
				System.out.println("�˸�) ���� ������� ������ȣ�Դϴ�.");
				return; // ���̵� �ߺ��Ǿ��� ������ false[���Խ���]
			}
		}	
		System.out.println("������ :"); 	String bname = Day07_5_BookApplication.scanner.next();
		System.out.println("�۰� :"); 		String bwriter = Day07_5_BookApplication.scanner.next();
		
		// 2. ��üȭ[�����뿩���� = true, �뿩ȸ��id =null]
		Book book = new Book(ISBN, bname, bwriter, true, null);
		
		// 3. �迭 ����[�ֱ�]
		int i = 0;
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp == null) {
				Day07_5_BookApplication.books[i] = book;
				return; // ��� ������ �޼ҵ� ����
			}
			i++;
		}
	}		
		// 6. ��������
	void ��������() {
		System.out.println("----------------------���� ���� ������----------------------");

	}
	
}
