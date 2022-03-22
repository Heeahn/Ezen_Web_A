package Day13;

import java.util.Scanner;

public class Park {
	
	private String carNum;
	private int inTime;
	private int outTime;

// ��ĭ�� ������ȣ�� Empty �� ���������ν� 
// ��ĭã�⸦ �Ҷ� carNum String�� 
// Empty���� �����ش�. 

	private Park() {
		this.carNum = "Empty";
		this.inTime = 0;
		this.outTime = 0;
	}

	private Park(String carNum, int inTime) {
		this.carNum = carNum;
		this.inTime = inTime;
	}

	private Park(Park park) {
		this.carNum = park.carNum;
		this.inTime = park.inTime;
	}

// ��ũ �迭�� �غ��ϰ� �޴��� �����ִ� showMenu 
// �޼ҵ带 �����Ѵ�. 
	public static void init() {
		int size = 3;
		Park[] parkList = new Park[size];
		for (int i = 0; i < parkList.length; i++) {
			parkList[i] = new Park();
		}
		showMenu(parkList);
	}

// ���ѷ����� �޴��� �����ְ� 
// ������� ���ÿ� ���� 
// ������ ����ϴ� method, 
// ������ ����ϴ� method, 
// ���Ḧ ������ �� �ְ� �Ѵ�. 
	private static void showMenu(Park[] parkList) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("=========================");
			System.out.println("������������α׷�");
			System.out.println("=========================");
			System.out.println("1. ���� 2. ���� 3. ����");
			System.out.print("����: ");
			int choice = scan.nextInt();
			if (choice == 3) {
				System.out.println("������ּż� �����մϴ�.");
				break;
			} else if (choice == 1) {
				startPark(parkList, scan);
			} else if (choice == 2) {
				endPark(parkList, scan);
			} else {
				System.out.println("�߸� �����̽��ϴ�.");
			}
		}
		scan.close();
	}

// ������ �����ϴ� �޼ҵ� 
	private static void startPark(Park[] parkList, Scanner scan) {
// ���� �� ������ �����ϴ��� üũ�ϰ� 
// �� ������ �����ϸ� �԰� �����Ѵ�. 
		if (checkEmptySpot(parkList)) {
//Park�� ��ü newCar�� insertCarNum �޼ҵ�� insertInTime �޼ҵ忡��  
//���� �޾ƿ� ��ȿ�� String carNum�� int inTime�� �̿��Ͽ� �ʱ�ȭ�Ѵ�. 
//�ʱ�ȭ �ÿ��� parameter�� �ִ� �����ڷ� �ʱ�ȭ ���ش�. 
			Park newCar = new Park(insertCarNum(parkList, scan), insertInTime(scan));
//park �迭�� parkList�� �� ������ ���ٿ��� ������ newCar�� �־��ش�. 
			insertPark(newCar, parkList);

		} else {
// �� ������ �������� �����Ƿ� ����ڿ��� �˷��ְ� 
// �޴��� ���ư���. 
			System.out.println("�ڸ��� ��á���ϴ�.");
		}
	}

// �迭�� ���鼭 carNum�� empty�� ���� �ִ��� ã�´� 
	private static boolean checkEmptySpot(Park[] parkList) {
		boolean isEmpty = false;
		for (int i = 0; i < parkList.length; i++) {
//�ش� ĭ�� carNum �� Empty, �� �� �����̹Ƿ� 
//isEmpty �� true�� �ٲ��ְ� break�� ���� 
//for �ݺ����� �����Ѵ�. 
			if (parkList[i].carNum.equals("Empty")) {
				isEmpty = true;
				break;
			}
		}
		return isEmpty;
	}

// ���� ��ȣ�� �԰�� ����� �ִ��� üũ�ؼ� 
// ������ �ش� ��ȣ�� �������ְ� 
// ������ ��� ������ ���鼭 �Է��� �޴´�. 
	private static String insertCarNum(Park[] parkList, Scanner scan) {
		scan.nextLine();
		System.out.print("���� ��ȣ�� �Է��� �ּ���: ");
		String carNum = scan.nextLine();
//�Է¹��� carNum�� validateCarNum �޼ҵ带 ���ؼ� 
//�̹� �԰�� ��ȣ������ üũ�� �Ͽ� 
//�԰� �� ����� ���� ��ȣ�� ���� ������ 
//����ڿ��� �Է��� �䱸�Ѵ�. 
		while (validateCarNum(carNum, parkList)) {
			System.out.println("�̹� �԰�� �����Դϴ�.");
			System.out.print("���� ��ȣ�� �ٽ� �Է��� �ּ���: ");
			carNum = scan.nextLine();
		}
//while���� ����ϸ� carNum�� �ߺ��� ��ȣ�� �ƴϹǷ� 
//�����Ͽ� Park(String, int) �� String���� �� �� �ְ� �Ѵ�. 
		return carNum;
	}

// �Է��� carNum�� �԰�� ����� �ִ��� Ȯ���Ѵ�. 
	private static boolean validateCarNum(String carNum, Park[] parkList) {
		boolean isAlreadyIn = false;
		for (int i = 0; i < parkList.length; i++) {
//�迭�� ���鼭 parameter�� �Ѿ�� carNum�� 
//�ش� ĭ�� carNum�� ���� �ÿ��� 
//�ߺ��� ��ȣ �̹Ƿ� isAlreadyIn�� true�� �ٲٰ� 
//�������ش�. 
			if (parkList[i].carNum.equals(carNum)) {
				isAlreadyIn = true;
				break;
			}
		}
		return isAlreadyIn;
	}

// �ð��� �Է¹޾� ��ȿ�� �ð��� �������ش�. 
	private static int insertInTime(Scanner scan) {
		System.out.print("�԰� �ð��� �Է����ּ���: ");
		int inTime = scan.nextInt();
//�Է¹��� inTime�� validateTime �޼ҵ��  
//�ùٸ� �ð����� Ȯ���Ѵ�. 
//�� validateTime �޼ҵ尡 �ùٸ� �ð��� ��� 
//true�� �����ϹǷ� ������������ ! �����ڸ� �ٿ��� 
//true�� false��, false�� true�� �������Ѽ� 
//�߸� �Էµ� �ð��� ��쿡�� while �ݺ����� ���� �Ѵ�. 
		while (!validateTime(inTime)) {
			System.out.println("�߸��� �ð� �����Դϴ�.");
			System.out.print("�԰� �ð��� �Է����ּ���: ");
			inTime = scan.nextInt();
		}
		return inTime;
	}

// �ð��� �ùٸ� �������� Ȯ���ϴ� �޼ҵ� 
	private static boolean validateTime(int inTime) {
		boolean isTimeCorrect = false;

//4�ڸ� ���ڰ� �Ѿ� �ý� 
//���� ���ڸ��� ���� ���ڸ��� �и��Ϸ��� 
//���� ���ڸ��� 100���� ���� ����, 
//���� ���ڸ��� 100���� ���� ������ ���� 
//�־��ش�. 
//���� ���ڸ��� �ð���, ���� ���ڸ��� ���� �ȴ�. 
		int hour = inTime / 100;
		int min = inTime % 100;

//�ð��� ���� ��ȿ���� üũ�Ѵ�. 
//�ð��� 0~23, ���� 0~59 �� ��ȿ�ϱ� ������ 
//&& ������ ���� hour�� -1���� ũ�� 24 ���� ����(0~23) ��쿡�� 
//���� -1���� ũ�� 60���� ����(0~59) ��츦 ��� ������ ������ 
//isTimeCorrect�� true�� �ٲ۴�. 
		if (hour > -1 && hour < 24 && min > -1 && min < 60) {
			isTimeCorrect = true;
		}
		return isTimeCorrect;
	}

//������ �԰��ϴ� �޼ҵ� 
	private static void insertPark(Park newCar, Park[] parkList) {
		for (int i = 0; i < parkList.length; i++) {
//parameter�� �Ѿ�� newCar�� parkList�� ��� �߿��� carNum�� 
//Empty �� ���� �ִ´�. 
			if (parkList[i].carNum.equals("Empty")) {
				parkList[i] = newCar;
//�� ���⼭ ���ڸ��� break�� �ؾ��ϴµ� 
//break�� ������ ���� ���Ŀ��� �ݺ� �Ǹ鼭 
//��� ��ĭ�� newCar�� �ֱ� ������ 
//1���� �����ص� ��� ĭ�� �� ������ 
//���̻� ������ �� �� ���� �ȴ�. 
				break;
			}
		}
	}

// ���� ��� �޼ҵ��� ��������. 
	private static void endPark(Park[] parkList, Scanner scan) {
// �������� ����ִ��� Ȯ���Ѵ�. 
		if (checkParkExist(parkList)) {
// ������ ������ 1��� �����ϹǷ� ���� ��ȣ�� ���� 
// �ش� ������ ������ �޾ƿ´�. 
			Park outCar = new Park(retrievePark(parkList, scan));
// ������ �����ð��� ����Ѵ�. 
			outCar.outTime = insertOutTime(outCar, scan);
// ��� ��� 
			calcRate(outCar);
// ���� ������ �ڸ��� ����ش�. 
			removeOutCar(parkList, outCar);
		} else {
// ������ ������ �����Ƿ� ����ڿ��� �޽����� ���� 
// �޴��� ���ư���. 
			System.out.println();
			System.out.println("������ ������ �����ϴ�.");
			System.out.println();
		}
	}

// �������� ����ִ��� Ȯ���ϴ� �޼ҵ� 
	private static boolean checkParkExist(Park[] parkList) {
		boolean isExist = false;
// parkList �迭�� �� ���鼭 carNum�� "Empty"�� �ƴ� 
// ��Ұ� �����ϴ����� ã�´�. 
		for (int i = 0; i < parkList.length; i++) {
			if (!parkList[i].carNum.equals("Empty")) {
				isExist = true;
			}
		}
		return isExist;
	}

// �԰�� ������ ������ �޾ƿ��� �޼ҵ� 
	private static Park retrievePark(Park[] parkList, Scanner scan) {
		scan.nextLine();
		Park outCar = new Park();
		System.out.print("����� ������ȣ�� �Է����ּ���: ");
		String carNum = scan.nextLine();
// validateCarNum �޼ҵ带 ���ؼ� �Է��� ���� ��ȣ�� 
// ����Ʈ�� ������ ���ٰ� �����ְ� �ٽ� �Է��϶�� 
// ����ڿ��� �����Ѵ�. 
		while (!validateCarNum(carNum, parkList)) {
			System.out.println("�԰�� ����� ���� ��ȣ�Դϴ�.");
			System.out.print("����� ������ȣ�� �ٽ� �Է����ּ���: ");
			carNum = scan.nextLine();
		}
// while���� ����� �ÿ��� �ش� ��ȣ�� ����Ʈ�� �����ϹǷ� 
// �� ��ȣ�� ���� parkList�� ��Ҹ� outCar�� ��Ƽ� 
// �������ش�. 
		for (int i = 0; i < parkList.length; i++) {
			if (parkList[i].carNum.equals(carNum)) {
				outCar = parkList[i];
			}
		}
		return outCar;
	}

// ��� �ð��� �����ϴ� �޼ҵ� 
	private static int insertOutTime(Park outCar, Scanner scan) {
		System.out.print("��� �ð��� �Է����ּ���: ");
		int outTime = scan.nextInt();
// ��� �ð��� �ùٸ� �������� Ȯ���ϰ� 
// �ùٸ� ���°� �ƴϸ� �ٽ� �Է��϶�� 
// ����ڿ��� ��Ų��. 
		while (!validateTime(outCar, outTime)) {
			System.out.println("�߸��� �ð� �����Դϴ�.");
			System.out.print("��� �ð��� �Է����ּ���: ");
			outTime = scan.nextInt();
		}
		return outTime;
	}

// ��� �ð��� ��ȿ���� üũ�ϴ� �޼ҵ� 
	private static boolean validateTime(Park outCar, int outTime) {
		boolean isOutTimeCorrect = false;
// �Ʊ� �� inTime�� ��ȿ���� üũ�ߴ� �޼ҵ�� outTime�� 
// üũ�� �ϰ� �ű⿡ && �����ڸ� ���ؼ� outTime�� outCar�� 
// ����� inTime���� ū���� ���� Ȯ���Ѵ�. 
		if (validateTime(outTime) && outTime > outCar.inTime) {
			isOutTimeCorrect = true;
		}
		return isOutTimeCorrect;
	}

// ����� ����ϴ� �޼ҵ� 
	private static void calcRate(Park outCar) {
// �ð��� ���̸� ����Ѵ� 
		int hourDiff = outCar.outTime / 100 - outCar.inTime / 100;
// ���� ���̸� ����Ѵ�. 
		int minDiff = outCar.outTime % 100 - outCar.inTime % 100;

// �� ���� �ð��� ����ϰ� 10�д� 1000������ ����� �� 
// ����Ѵ�. 
		int totDiff = hourDiff * 60 + minDiff;
		int rateStd = 1000;
		int rate = totDiff / 10 * rateStd;
		System.out.println("�� ��������� " + rate + "���Դϴ�.");
	}

// ���� ���� �ڸ��� ����ִ� �޼ҵ� 
	private static void removeOutCar(Park[] parkList, Park outCar) {
// parkList �迭�� ���鼭 �ش� ĭ�� carNum�� 
// outCar(������ ��)�� ��ȣ�� ������ 
// �ش�ĭ�� �⺻ �����ڸ� ȣ���ؼ� 
// carNum�� "Empty", inTime�� outTime�� 0���� �ʱ�ȭ���ش�. 
		for (int i = 0; i < parkList.length; i++) {
			if (parkList[i].carNum.equals(outCar.carNum)) {
				parkList[i] = new Park();
			}
		}

	}
}
	