package Day08;

public class Day08_2 {
	
	public static void main(String[] args) {
		
		// p.245 : final
			// ������ ��.
			// ������ �����
			// ���Ǵ� ��� : 1. �ʵ� ����� 2. �����ڿ���
		
		Person p1 = new Person("123123-123123", "���");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "USA";
		//p1.ssn = "654321-7654321";
		p1.name = "��������";
		
	}

}
