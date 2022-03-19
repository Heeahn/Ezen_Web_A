package Day12;

public class Student {

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

	//메소드
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
	
	
	
}
