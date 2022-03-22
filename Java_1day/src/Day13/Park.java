package Day13;

import java.util.Scanner;

public class Park {
	
	private String carNum;
	private int inTime;
	private int outTime;

// 빈칸에 차량번호를 Empty 로 정해줌으로써 
// 빈칸찾기를 할때 carNum String이 
// Empty인지 비교해준다. 

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

// 파크 배열을 준비하고 메뉴를 보여주는 showMenu 
// 메소드를 실행한다. 
	public static void init() {
		int size = 3;
		Park[] parkList = new Park[size];
		for (int i = 0; i < parkList.length; i++) {
			parkList[i] = new Park();
		}
		showMenu(parkList);
	}

// 무한루프로 메뉴를 보여주고 
// 사용자의 선택에 따라서 
// 입차를 담당하는 method, 
// 출차를 담당하는 method, 
// 종료를 선택할 수 있게 한다. 
	private static void showMenu(Park[] parkList) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("=========================");
			System.out.println("주차장관리프로그램");
			System.out.println("=========================");
			System.out.println("1. 입차 2. 출차 3. 종료");
			System.out.print("선택: ");
			int choice = scan.nextInt();
			if (choice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			} else if (choice == 1) {
				startPark(parkList, scan);
			} else if (choice == 2) {
				endPark(parkList, scan);
			} else {
				System.out.println("잘못 누르셨습니다.");
			}
		}
		scan.close();
	}

// 입차를 시작하는 메소드 
	private static void startPark(Park[] parkList, Scanner scan) {
// 먼저 빈 공간이 존재하는지 체크하고 
// 빈 공간이 존재하면 입고를 시작한다. 
		if (checkEmptySpot(parkList)) {
//Park의 객체 newCar를 insertCarNum 메소드와 insertInTime 메소드에서  
//각각 받아온 유효한 String carNum과 int inTime을 이용하여 초기화한다. 
//초기화 시에는 parameter가 있는 생성자로 초기화 해준다. 
			Park newCar = new Park(insertCarNum(parkList, scan), insertInTime(scan));
//park 배열인 parkList의 빈 공간에 윗줄에서 생성된 newCar를 넣어준다. 
			insertPark(newCar, parkList);

		} else {
// 빈 공간이 존재하지 않으므로 사용자에게 알려주고 
// 메뉴로 돌아간다. 
			System.out.println("자리가 꽉찼습니다.");
		}
	}

// 배열을 돌면서 carNum이 empty인 곳이 있는지 찾는다 
	private static boolean checkEmptySpot(Park[] parkList) {
		boolean isEmpty = false;
		for (int i = 0; i < parkList.length; i++) {
//해당 칸의 carNum 이 Empty, 즉 빈 공간이므로 
//isEmpty 를 true로 바꿔주고 break를 통해 
//for 반복문을 종료한다. 
			if (parkList[i].carNum.equals("Empty")) {
				isEmpty = true;
				break;
			}
		}
		return isEmpty;
	}

// 차량 번호가 입고된 기록이 있는지 체크해서 
// 없으면 해당 번호를 리턴해주고 
// 있으면 계속 루프를 돌면서 입력을 받는다. 
	private static String insertCarNum(Park[] parkList, Scanner scan) {
		scan.nextLine();
		System.out.print("차량 번호를 입력해 주세요: ");
		String carNum = scan.nextLine();
//입력받은 carNum을 validateCarNum 메소드를 통해서 
//이미 입고된 번호인지를 체크를 하여 
//입고가 된 기록이 없는 번호가 들어올 때까지 
//사용자에게 입력을 요구한다. 
		while (validateCarNum(carNum, parkList)) {
			System.out.println("이미 입고된 차량입니다.");
			System.out.print("차량 번호를 다시 입력해 주세요: ");
			carNum = scan.nextLine();
		}
//while문을 통과하면 carNum이 중복된 번호가 아니므로 
//리턴하여 Park(String, int) 의 String으로 쓸 수 있게 한다. 
		return carNum;
	}

// 입력한 carNum이 입고된 기록이 있는지 확인한다. 
	private static boolean validateCarNum(String carNum, Park[] parkList) {
		boolean isAlreadyIn = false;
		for (int i = 0; i < parkList.length; i++) {
//배열을 돌면서 parameter로 넘어온 carNum이 
//해당 칸의 carNum과 같을 시에는 
//중복된 번호 이므로 isAlreadyIn을 true로 바꾸고 
//리턴해준다. 
			if (parkList[i].carNum.equals(carNum)) {
				isAlreadyIn = true;
				break;
			}
		}
		return isAlreadyIn;
	}

// 시간을 입력받아 유효한 시간을 리턴해준다. 
	private static int insertInTime(Scanner scan) {
		System.out.print("입고 시간을 입력해주세요: ");
		int inTime = scan.nextInt();
//입력받은 inTime을 validateTime 메소드로  
//올바른 시간인지 확인한다. 
//단 validateTime 메소드가 올바른 시간인 경우 
//true를 리턴하므로 반전연산자인 ! 연산자를 붙여서 
//true는 false로, false는 true로 반전시켜서 
//잘못 입력된 시간일 경우에만 while 반복문에 들어가게 한다. 
		while (!validateTime(inTime)) {
			System.out.println("잘못된 시간 형식입니다.");
			System.out.print("입고 시간을 입력해주세요: ");
			inTime = scan.nextInt();
		}
		return inTime;
	}

// 시간이 올바른 형태인지 확인하는 메소드 
	private static boolean validateTime(int inTime) {
		boolean isTimeCorrect = false;

//4자리 숫자가 넘어 올시 
//앞의 두자리와 뒤의 두자리를 분리하려면 
//앞의 두자리는 100으로 나눈 값을, 
//뒤의 두자리는 100으로 나눈 나머지 값을 
//넣어준다. 
//앞의 두자리는 시간이, 뒤의 두자리는 분이 된다. 
		int hour = inTime / 100;
		int min = inTime % 100;

//시간과 분이 유효한지 체크한다. 
//시간은 0~23, 분은 0~59 만 유효하기 때문에 
//&& 연산을 통해 hour는 -1보다 크고 24 보다 작은(0~23) 경우에만 
//분은 -1보다 크고 60보다 작은(0~59) 경우를 모두 만족할 때에만 
//isTimeCorrect를 true로 바꾼다. 
		if (hour > -1 && hour < 24 && min > -1 && min < 60) {
			isTimeCorrect = true;
		}
		return isTimeCorrect;
	}

//차량을 입고하는 메소드 
	private static void insertPark(Park newCar, Park[] parkList) {
		for (int i = 0; i < parkList.length; i++) {
//parameter로 넘어온 newCar를 parkList의 요소 중에서 carNum이 
//Empty 인 곳에 넣는다. 
			if (parkList[i].carNum.equals("Empty")) {
				parkList[i] = newCar;
//단 여기서 넣자마자 break를 해야하는데 
//break가 없으면 넣은 이후에도 반복 되면서 
//모든 빈칸에 newCar를 넣기 때문에 
//1번만 실행해도 모든 칸이 다 꽉차서 
//더이상 주차를 할 수 없게 된다. 
				break;
			}
		}
	}

// 차량 출고 메소드의 시작지점. 
	private static void endPark(Park[] parkList, Scanner scan) {
// 주차장이 비어있는지 확인한다. 
		if (checkParkExist(parkList)) {
// 주차된 차량이 1대라도 존재하므로 차량 번호를 통해 
// 해당 차량의 정보를 받아온다. 
			Park outCar = new Park(retrievePark(parkList, scan));
// 차량의 출차시간을 기록한다. 
			outCar.outTime = insertOutTime(outCar, scan);
// 요금 계산 
			calcRate(outCar);
// 나간 차량의 자리를 비어준다. 
			removeOutCar(parkList, outCar);
		} else {
// 주차된 차량이 없으므로 사용자에게 메시지를 띄우고 
// 메뉴로 돌아간다. 
			System.out.println();
			System.out.println("주차된 차량이 없습니다.");
			System.out.println();
		}
	}

// 주차장이 비어있는지 확인하는 메소드 
	private static boolean checkParkExist(Park[] parkList) {
		boolean isExist = false;
// parkList 배열을 쭉 돌면서 carNum이 "Empty"가 아닌 
// 요소가 존재하는지를 찾는다. 
		for (int i = 0; i < parkList.length; i++) {
			if (!parkList[i].carNum.equals("Empty")) {
				isExist = true;
			}
		}
		return isExist;
	}

// 입고된 차량의 정보를 받아오는 메소드 
	private static Park retrievePark(Park[] parkList, Scanner scan) {
		scan.nextLine();
		Park outCar = new Park();
		System.out.print("출고할 차량번호를 입력해주세요: ");
		String carNum = scan.nextLine();
// validateCarNum 메소드를 통해서 입력한 차량 번호가 
// 리스트에 없으면 없다고 말해주고 다시 입력하라고 
// 사용자에게 지시한다. 
		while (!validateCarNum(carNum, parkList)) {
			System.out.println("입고된 기록이 없는 번호입니다.");
			System.out.print("출고할 차량번호를 다시 입력해주세요: ");
			carNum = scan.nextLine();
		}
// while문을 통과할 시에는 해당 번호가 리스트에 존재하므로 
// 그 번호와 같은 parkList의 요소를 outCar에 담아서 
// 리턴해준다. 
		for (int i = 0; i < parkList.length; i++) {
			if (parkList[i].carNum.equals(carNum)) {
				outCar = parkList[i];
			}
		}
		return outCar;
	}

// 출고 시간을 저장하는 메소드 
	private static int insertOutTime(Park outCar, Scanner scan) {
		System.out.print("출고 시간을 입력해주세요: ");
		int outTime = scan.nextInt();
// 출고 시간이 올바른 형태인지 확인하고 
// 올바른 형태가 아니면 다시 입력하라고 
// 사용자에게 시킨다. 
		while (!validateTime(outCar, outTime)) {
			System.out.println("잘못된 시간 형식입니다.");
			System.out.print("출고 시간을 입력해주세요: ");
			outTime = scan.nextInt();
		}
		return outTime;
	}

// 출고 시간이 유효한지 체크하는 메소드 
	private static boolean validateTime(Park outCar, int outTime) {
		boolean isOutTimeCorrect = false;
// 아까 전 inTime의 유효성을 체크했던 메소드로 outTime도 
// 체크를 하고 거기에 && 연산자를 통해서 outTime이 outCar에 
// 저장된 inTime보다 큰지도 같이 확인한다. 
		if (validateTime(outTime) && outTime > outCar.inTime) {
			isOutTimeCorrect = true;
		}
		return isOutTimeCorrect;
	}

// 요금을 계산하는 메소드 
	private static void calcRate(Park outCar) {
// 시간의 차이를 계산한다 
		int hourDiff = outCar.outTime / 100 - outCar.inTime / 100;
// 분의 차이를 계산한다. 
		int minDiff = outCar.outTime % 100 - outCar.inTime % 100;

// 총 분의 시간을 계산하고 10분당 1000원으로 계산한 후 
// 출력한다. 
		int totDiff = hourDiff * 60 + minDiff;
		int rateStd = 1000;
		int rate = totDiff / 10 * rateStd;
		System.out.println("총 주차요금은 " + rate + "원입니다.");
	}

// 나간 차의 자리를 비어주는 메소드 
	private static void removeOutCar(Park[] parkList, Park outCar) {
// parkList 배열을 돌면서 해당 칸의 carNum이 
// outCar(나가는 차)의 번호와 같으면 
// 해당칸에 기본 생성자를 호출해서 
// carNum은 "Empty", inTime과 outTime은 0으로 초기화해준다. 
		for (int i = 0; i < parkList.length; i++) {
			if (parkList[i].carNum.equals(outCar.carNum)) {
				parkList[i] = new Park();
			}
		}

	}
}
	