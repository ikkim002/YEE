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
		nick = JOptionPane.showInputDialog("����� ��ȭ����?");
		FrClient f = new FrClient(nick);
		Socket socket;
		try {
			String serverIp = "127.0.0.1";

			socket = new Socket(serverIp, 7777);
			System.out.println("������ ���ɵǾ����ϴ�.");

			Thread receiver = new ClientReceiver(socket);
			receiver.start();
			Thread sender = new ClientSender(socket, nick);
			sender.start();
		} catch (ConnectException e) {
			e.printStackTrace();
			System.out.println("���ӿ���");
		} catch (Exception e) {
			System.out.println("������ ����");
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
				System.out.println("Ŭ���̾�Ʈ ������ �� ����");

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
				System.out.println("Ŭ���̾�Ʈ ���� ������ io ����");
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
				System.out.println("Ŭ���̾�Ʈ ���ù� ������ ����¿���");

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
