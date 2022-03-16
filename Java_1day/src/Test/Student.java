package Test;

public class Student {
	public static Student[] students = new Student[100];

	//필드
	private String name;
	private int korean;
	private int english;
	private int math;
	private int total;
	private double average;
	
	//생성자
	public Student() {}

	public Student(String name, int korean, int english, int math, int total, double average) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.total = total;
		this.average = average;
	}

	// 메소드
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
//		// 리스트내 모든 게시물을 파일에 저장
//		try {
//			Test test = new Test();
//			// 1. 파일출력 클래스
//			FileOutputStream outputStream = new FileOutputStream("D:/java/javaTest.txt");
//			// 2. 파일에 작성할 내용[한줄씩 = 게시물1개씩 = 객체 1개씩]
//			int i= 0;
//			for(Student student :students) {
//				String scoreBoard = i+","+student.getName()+","+student.getKorean()+","+student.getEnglish()+","+
//						student.getMath()+","+student.getTotal()+","+student.getAverage()++"\n"; i++;		
//			// 3. 내용[문자열] -> 바이트열 변환 [ 외부통신(스트림) : 통신단위 : 바이트]
//			outputStream.write(scoreBoard.getBytes());// 4. 내보내기[write()]			
//			}
//		}
//		catch(Exception e) {System.err.println("알림]] 파일저장 실패(관리자에게 문의)");}
//	}
//	// 8. 게시물불러오기 메소드[프로그램 시작] 파일 ---> 리스트
//	public static void load() {	
//		try {
//			FileInputStream inputStream = new FileInputStream("D:/java/javaTest.txt");// 1. 파일 입력 클래스
//			byte[] bytes = new byte[1024]; // 2. 바이트배열 선언
//			inputStream.read(bytes); // 3. 모든 바이트 읽어와서 바이트에 저장
//			String file = new String(bytes);// 4. 바이트 -> 문자열 변환
//			String[] boards = file.split("\n");// 5. 문자열 자르기[한줄씩 [\n] -> 1개객체]
//			int i=0;
//			for(String temp:boards) {// 배열내 문자열 하나씩 꺼내기
//				if(i+1 == boards.length) break;
//				String[] field = temp.split(","); // 6. 문자열 자르기[한줄[,] -> 각필드]
//				Board board = new Board(Integer.parseInt(field[0]), field[1],Integer.parseInt(field[2]),Integer.parseInt(field[3]), Integer.parseInt(field[4]),Integer.parseInt(field[5]), null); // 7. 객체화
//																													// 조회수는 필드는 정수형이므로 정수형으로 형변환[Integer.parseInt(문자열)]				
//				students[i]=board; // 8. 리스트 담기
//				i++;
//			}
//		}
//		catch(Exception e) {System.err.println("알림]] 파일로드 실패(관리자에게 문의)");}
//	}
}
