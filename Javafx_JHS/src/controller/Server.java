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
	
	//��øŬ����[Client : Ŭ�����ȿ� Ŭ������ ����Ǹ�] 
	public class Client {
		// ������ ������ Ŭ���̾�Ʈ�� Ŭ����
		
		//1. �ʵ�[����]
		public Socket socket;
		
		// 2. ������
		public Client(Socket socket) {
			this.socket = socket;
			recive(); // ������ ����� Ŭ���̾�Ʈ ��ü�� �����ɶ� �ޱ� �޼ҵ�(���ѷ���)
		}
		
		 // 3. ������ �޽��� �޴� �޼ҵ�
		public void recive() {
			// ��Ƽ������[Thread Ŭ���� vs Runnable �������̽�]
				// run �޼ҵ带 �ʼ������� �����ؾ���.
			Runnable runnable = new Runnable() { // �͸� ������ü
				@Override
				public void run() {
					// ��������� �޽��� �޴� ����
					try {
						while(true) {
							InputStream inputStream = socket.getInputStream(); 	 	 // 1.  �Է½�Ʈ��
							byte[] bytes = new byte[1000]; 										 // 2. ����Ʈ �迭 ����
							inputStream.read(bytes);													 // 3. �Է½�Ʈ������ ����Ʈ �о����
							String msg = new String(bytes); 										 // 4. ����Ʈ�� -> ���ڿ� ��ȯ
							//* ������ ���� �޽����� ���� ������ ���ӵ� ��� Ŭ���̾�Ʈ���� ���� �޽��� ������
							for(Client client : clientlist) {
								client.send(msg); // ���� �޽����� ������ ���ӵ�[clientlist] ��� Ŭ���̾�Ʈ���� �޽��� ������
							}
						}
					} catch (Exception e) {}
				}
			}; // ��Ƽ������ ���� ��
			
			// �ش� ��Ƽ�����带 ������Ǯ�� �־��ֱ�
			threadpool.submit(runnable);
		}
		
		// 4. ������ �޽��� ������ �޼ҵ�
		public void send(String msg) {
			
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					try {
						OutputStream outputStream = socket.getOutputStream(); 	// 1. ��½�Ʈ��
						outputStream.write(msg.getBytes());	 								// 2. ��������
					} catch (Exception e) {}
				}
			}; // ��Ƽ������ ���� ��
			threadpool.submit(runnable);
		}
	} // ��øŬ���� end
	
    //* ������ ����� Ŭ���̾�Ʈ�� �����ϴ� ����Ʈ
    public  Vector<Client> clientlist = new Vector<>();
    				// Vector ����ϴ� ���� : ����ȭ ����(O)
    //* ��Ƽ�����带 �������ִ� ������Ǯ
    public  ExecutorService threadpool;
    				//ExecutorService : ������Ǯ ���� �������̽�
    // 1. ���� ���� ����
    ServerSocket serverSocket;
    // 2. ���� ���� �޼ҵ�[�μ��� ip�� port �޾Ƽ� ���� ip�� port�� �������� ���ε�(����)]
    public void serverstart(String ip, int port) {
    	try {
    		serverSocket = new ServerSocket(); // 1. �������� �޸��Ҵ�	
    		serverSocket.bind(new InetSocketAddress(ip , port)); // 2. �������� ���ε� [ip�� port ����]
		} catch (Exception e) {}
    		// 3. Ŭ���̾�Ʈ�� ��û ���[��Ƽ������ ����ϴ� ���� : 1. Ŭ���̾�Ʈ ����, 2. ������ , 3. �ޱ� ���� ó��]
    	Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
				while(true) {
					Socket socket = serverSocket.accept();	// 1. ��û �����Ŀ� ������ ������ ����
					clientlist.add(new Client(socket)); 		// 2. ����� Ŭ���̾�Ʈ(����ȼ���) �����Ŀ� ����Ʈ�� ����
				}
				}catch (Exception e) {}
			}
		}; // ��Ƽ������ ���� ��
		// ������Ǯ�� �޸� �ʱ�ȭ
		threadpool = Executors.newCachedThreadPool(); // ������Ǯ�� �޸� �ʱ�ȭ[�Ҵ�]
		threadpool.submit(runnable); // ������ ������ ��Ƽ�����带 ������Ǯ�� �־��ֱ�
    }
    // 3. ���� ���� �޼ҵ�
    public void serverstop() {
    	try {
	    	for(Client client : clientlist ) {// 1. ���ӵ� ��� Ŭ���̾�Ʈ���� ���� �ݱ�
	    		client.socket.close();
	    	}
	    	serverSocket.close(); // 2. �������� �ݱ�
	    	threadpool.shutdown();// 3. ������Ǯ �ݱ�
    	}catch (Exception e) {}
    }    
}
