package Test;

public class Student {
	public static Student[] students = new Student[100];

	//�ʵ�
	private String name;
	private int korean;
	private int english;
	private int math;
	private int total;
	private double average;
	
	//������
	public Student() {}

	public Student(String name, int korean, int english, int math, int total, double average) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.total = total;
		this.average = average;
	}

	// �޼ҵ�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}
//	public static void save() {
//		// ����Ʈ�� ��� �Խù��� ���Ͽ� ����
//		try {
//			Test test = new Test();
//			// 1. ������� Ŭ����
//			FileOutputStream outputStream = new FileOutputStream("D:/java/javaTest.txt");
//			// 2. ���Ͽ� �ۼ��� ����[���پ� = �Խù�1���� = ��ü 1����]
//			int i= 0;
//			for(Student student :students) {
//				String scoreBoard = i+","+student.getName()+","+student.getKorean()+","+student.getEnglish()+","+
//						student.getMath()+","+student.getTotal()+","+student.getAverage()++"\n"; i++;		
//			// 3. ����[���ڿ�] -> ����Ʈ�� ��ȯ [ �ܺ����(��Ʈ��) : ��Ŵ��� : ����Ʈ]
//			outputStream.write(scoreBoard.getBytes());// 4. ��������[write()]			
//			}
//		}
//		catch(Exception e) {System.err.println("�˸�]] �������� ����(�����ڿ��� ����)");}
//	}
//	// 8. �Խù��ҷ����� �޼ҵ�[���α׷� ����] ���� ---> ����Ʈ
//	public static void load() {	
//		try {
//			FileInputStream inputStream = new FileInputStream("D:/java/javaTest.txt");// 1. ���� �Է� Ŭ����
//			byte[] bytes = new byte[1024]; // 2. ����Ʈ�迭 ����
//			inputStream.read(bytes); // 3. ��� ����Ʈ �о�ͼ� ����Ʈ�� ����
//			String file = new String(bytes);// 4. ����Ʈ -> ���ڿ� ��ȯ
//			String[] boards = file.split("\n");// 5. ���ڿ� �ڸ���[���پ� [\n] -> 1����ü]
//			int i=0;
//			for(String temp:boards) {// �迭�� ���ڿ� �ϳ��� ������
//				if(i+1 == boards.length) break;
//				String[] field = temp.split(","); // 6. ���ڿ� �ڸ���[����[,] -> ���ʵ�]
//				Board board = new Board(Integer.parseInt(field[0]), field[1],Integer.parseInt(field[2]),Integer.parseInt(field[3]), Integer.parseInt(field[4]),Integer.parseInt(field[5]), null); // 7. ��üȭ
//																													// ��ȸ���� �ʵ�� �������̹Ƿ� ���������� ����ȯ[Integer.parseInt(���ڿ�)]				
//				students[i]=board; // 8. ����Ʈ ���
//				i++;
//			}
//		}
//		catch(Exception e) {System.err.println("�˸�]] ���Ϸε� ����(�����ڿ��� ����)");}
//	}
}
