package Day13;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Day13_4 {

	public static void main(String[] args) throws InterruptedException {		
	
	//p.544 DecimalFormat Ŭ���� : ���� �����͸� ���ϴ� �������� ǥ��
		// ���� ����
			// 0 : �ڸ���[���ڸ��� 0���� ä��]
			// # : �ڸ���[���ڸ��� ä���]
	double num = 1234567.89;
	
	DecimalFormat df = new DecimalFormat("0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("0.0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("0000000000.00000");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#.#");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("##########.#####");
	System.out.println(df.format(num));
	
	df=new DecimalFormat("#.0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("+#.0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("-#.0");
	System.out.println(df.format(num));
	
	// ***** õ���� ���� ��ǥ *****[#,##0]
	df = new DecimalFormat("�ݾ� #,##0��");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("0.0E0"); // E : ��������
	System.out.println(df.format(num));
	
	df = new DecimalFormat("+#,### ; -#.###"); // ��� ; ����
	System.out.println(df.format(num));
	
	// ***** ��ǻ�ʹ� �����X [  ���� 1:100%	0.5:50% 0.05:5%]
	df = new DecimalFormat("#.#%");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("\u00A4 #,###");
	System.out.println(df.format(num));
	
	// p.544 : DecimalFormat Ŭ���� : �������� ��ȯ
	// p.545 : SimpleDateFormat Ŭ���� : ��¥ ���� ��ȯ
	// p.547 : MessageFormat Ŭ���� : ���� ���� ��ȯ
	
	String id = "java";
	String name = "�ſ��";
	String te1 = "010-123-5678";
									// {  } ���� ���� ��ġ
	String text = "ȸ�� ID : {0} \nȸ�� �̸� : {1} \nȸ�� ��ȭ : {2}";
	String result1 = MessageFormat.format(text, id,name,te1);
																	// ����, {0}, {1}, {2}
	System.out.println(result1); System.out.println();
	
	// *** �����ͺ��̽����� ����� ���� ***
	String sq1 = "insert into member values({0}, {1}, {2})";
	Object[] �迭 = {id,name,te1};
	String result2 = MessageFormat.format(sq1, �迭);
	System.out.println(result2);
	
	// JAVA 7���� ���� Date ���Ŀ��� �������� ��¥ API �߰���
	LocalDate currDate = LocalDate.now();
	System.out.println("���� ��¥ :"+currDate);
	
	LocalTime currTime = LocalTime.now();
	System.out.println("���� �ð�:"+currTime);

	// Date ���糯¥/�ð� [������ �ȵǰų� �񱳱�� �����]
	// vs
	// LocalDate : ���糯¥ 		LocalTime : ����ð�
	
	LocalDateTime currDateTime = LocalDateTime.now();
	System.out.println("���糯¥/�ð�"+currDateTime);
	
	// �ð� ���
	Instant instant1 = Instant.now();
	Thread.sleep(1000); // 1�� ��� [ �ڵ��帧 1�ʰ� ����] // �Ϲݿ���
	Instant instant2 = Instant.now();
	
	if(instant1.isBefore(instant2)) {
		System.out.println("instant1 �� ����");
	}
	else if(instant1.isAfter(instant2)) {
		System.out.println("instant2 �� �� �ʽ��ϴ�.");
	}
	else System.out.println("������ �ð��Դϴ�.");
	
	System.out.println("�ð� �� : " + instant1.until(instant2, ChronoUnit.NANOS));
					// �и��� = 1000/1��	����ũ���� = 1000000(100��)/1��	������ = 1000000000(10��)/1��
	
	
	
	
	
	
	}
}