package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
	
	//중첩클래스[Client : 클래스안에 클래스가 선언되면] 
	public class Client {
		// 서버에 들어오는 클라이언트의 클래스
		
		//1. 필드[소켓]
		public Socket socket;
		
		// 2. 생성자
		public Client(Socket socket) {
			this.socket = socket;
			recive(); // 서버와 연결된 클라이언트 객체가 생성될때 받기 메소드(무한루프)
		}
		
		 // 3. 서버로 메시지 받는 메소드
		public void recive() {
			// 멀티스레드[Thread 클래스 vs Runnable 인터페이스]
				// run 메소드를 필수적으로 구현해야함.
			Runnable runnable = new Runnable() { // 익명 구현객체
				@Override
				public void run() {
					// 계속적으로 메시지 받는 상태
					try {
						while(true) {
							InputStream inputStream = socket.getInputStream(); 	 	 // 1.  입력스트림
							byte[] bytes = new byte[1000]; 										 // 2. 바이트 배열 선언
							inputStream.read(bytes);													 // 3. 입력스트림으로 바이트 읽어오기
							String msg = new String(bytes); 										 // 4. 바이트열 -> 문자열 변환
							//* 서버가 받은 메시지를 현재 서버에 접속된 모든 클라이언트에게 받은 메시지 보내기
							for(Client client : clientlist) {
								client.send(msg); // 받은 메시지를 서버에 접속된[clientlist] 모든 클라이언트에게 메시지 보내기
							}
						}
					} catch (Exception e) {}
				}
			}; // 멀티스레드 구현 끝
			
			// 해당 멀티스레드를 스레드풀에 넣어주기
			threadpool.submit(runnable);
		}
		
		// 4. 서버가 메시지 보내는 메소드
		public void send(String msg) {
			
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					try {
						OutputStream outputStream = socket.getOutputStream(); 	// 1. 출력스트림
						outputStream.write(msg.getBytes());	 								// 2. 내보내기
					} catch (Exception e) {}
				}
			}; // 멀티스레드 구현 끝
			threadpool.submit(runnable);
		}
	} // 중첩클래스 end
	
    //* 서버의 연결된 클라이언트를 저장하는 리스트
    public  Vector<Client> clientlist = new Vector<>();
    				// Vector 사용하는 이유 : 동기화 지원(O)
    //* 멀티스레드를 관리해주는 스레드풀
    public  ExecutorService threadpool;
    				//ExecutorService : 스레드풀 구현 인터페이스
    // 1. 서버 소켓 선언
    ServerSocket serverSocket;
    // 2. 서버 실행 메소드[인수로 ip와 port 받아서 받은 ip와 port로 서버소켓 바인딩(생성)]
    public void serverstart(String ip, int port) {
    	try {
    		serverSocket = new ServerSocket(); // 1. 서버소켓 메모리할당	
    		serverSocket.bind(new InetSocketAddress(ip , port)); // 2. 서버소켓 바인딩 [ip와 port 설정]
		} catch (Exception e) {}
    		// 3. 클라이언트의 요청 대기[멀티스레드 사용하는 이유 : 1. 클라이언트 연결, 2. 보내기 , 3. 받기 동시 처리]
    	Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
				while(true) {
					Socket socket = serverSocket.accept();	// 1. 요청 수락후에 수락된 소켓을 저장
					clientlist.add(new Client(socket)); 		// 2. 연결된 클라이언트(연결된소켓) 생성후에 리스트에 저장
				}
				}catch (Exception e) {}
			}
		}; // 멀티스레드 구현 끝
		// 스레드풀에 메모리 초기화
		threadpool = Executors.newCachedThreadPool(); // 스레드풀에 메모리 초기화[할당]
		threadpool.submit(runnable); // 위에서 구현된 멀티스레드를 스레드풀에 넣어주기
    }
    // 3. 서버 종료 메소드
    public void serverstop() {
    	try {
	    	for(Client client : clientlist ) {// 1. 접속된 모든 클라이언트들의 소켓 닫기
	    		client.socket.close();
	    	}
	    	serverSocket.close(); // 2. 서버소켓 닫기
	    	threadpool.shutdown();// 3. 스레드풀 닫기
    	}catch (Exception e) {}
    }    
}
