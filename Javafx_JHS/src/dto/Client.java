package dto;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import controller.Server;

public class Client {
	// ������ ������ Ŭ���̾�Ʈ�� Ŭ����
	
	//1. �ʵ�[����]
	public Socket socket;
	
	// 2. ������
	public Client(Socket socket) {
		this.socket = socket;
		recive();
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
						InputStream inputStream = socket.getInputStream(); 	 // 1.  �Է½�Ʈ��
						byte[] bytes = new byte[1000]; 											 // 2. ����Ʈ �迭 ����
						inputStream.read(bytes);														 // 3. �Է½�Ʈ������ ����Ʈ �о����
						String msg = new String(bytes); 											 // 4. ����Ʈ�� -> ���ڿ� ��ȯ
						//* ������ ���� �޽����� ���� ������ ���ӵ� ��� Ŭ���̾�Ʈ���� ���� �޽��� ������
						for(Client client : Server.clientlist) {
							client.send(msg); // ���� �޽����� ������ ���ӵ�[clientlist] ��� Ŭ���̾�Ʈ���� �޽��� ������
						}
					}
				} catch (Exception e) {}
			}
		}; // ��Ƽ������ ���� ��
		
		// �ش� ��Ƽ�����带 ������Ǯ�� �־��ֱ�
		Server.threadpool.submit(runnable);
	}
	
	// 4. ������ �޽��� ������ �޼ҵ�
	public void send(String msg) {
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
					OutputStream outputStream = socket.getOutputStream(); 	// 1. ��½�Ʈ��
					outputStream.write(msg.getBytes());	 										// 2. ��������
				} catch (Exception e) {}
			}
		}; // ��Ƽ������ ���� ��
		Server.threadpool.submit(runnable);
	}
}
