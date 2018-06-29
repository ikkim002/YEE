import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuiMultiChat_TcpClient {

	static String nick = null;

	static JTextArea ta;
	static JTextField tf;

	static DataOutputStream out;

	public static void main(String args[]) {
		nick = JOptionPane.showInputDialog("당신의 대화명은?");
		FrClient f = new FrClient(nick);
		Socket socket;
		try {
			String serverIp = "127.0.0.1";

			socket = new Socket(serverIp, 7777);
			System.out.println("서버에 연걸되었습니다.");

			Thread receiver = new ClientReceiver(socket);
			receiver.start();
			Thread sender = new ClientSender(socket, nick);
			sender.start();
		} catch (ConnectException e) {
			e.printStackTrace();
			System.out.println("접속에러");
		} catch (Exception e) {
			System.out.println("에러는 에러");
		}
	}

	static class ClientSender extends Thread {
		Socket socket;

		String name;

		ClientSender(Socket socket, String name) {
			this.socket = socket;
			try {
				out = new DataOutputStream(null);
				this.name = name;
			} catch (Exception e) {
				System.out.println("클라이언트 생성자 중 에러");

			}
		}

		public void run() {

			Scanner scanner = new Scanner(System.in);
			try {
				if (out != null) {
					out.writeUTF(name);
				}
				while (out != null) {
					out.writeUTF("[" + name + "]" + scanner.nextLine());

				}
			} catch (IOException e) {
				System.out.println("클라이언트 센터 실행중 io 에러");
			}
		}

	}

	static class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream in;

		public ClientReceiver(Socket socket) {
			this.socket = socket;

			try {
				in = new DataInputStream(socket.getInputStream());
			} catch (IOException e) {
				System.out.println("클라이언트 리시버 실행중 입출력에러");

			}
		}

	public void run(){
		while(in!=nill){
			try{
				String s= in readUTF();
				System.out.println(s);
				ta.append(s+"\n");
			
			}
		}
	}

	}
}
