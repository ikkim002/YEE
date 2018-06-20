import java.io.*;
import java.net.*;

public class TranslationServer {
	public static void main(String[] args) throws Exception {
		System.out.println("����");
		int clientId = 0;
		ServerSocket ss = new ServerSocket(9101);
		
		try {
			while (true) {
				clientId++;
				Translator t = new Translator(ss.accept(), clientId);
				t.start();
			}
		} finally {
			ss.close();
		}
	}

	private static class Translator extends Thread {
		private java.net.Socket socket;
		private int myId;

		public Translator(java.net.Socket socket2, int clientId) {
			this.socket = socket2;
			this.myId = clientId;
		}

		public void run() {
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				out.println("�ȳ��ϼ���? Ŭ���̾�Ʈ ��ȣ�� " + myId + "�Դϴ�.");
				out.println("�ܾ �Է��ϼ���");
				while (true) {
					String input = in.readLine();
					if (input == null) {
						break;
					}
					if (input.equals("�ȳ�") == true)
						out.println("�氡��");
					else
						out.println("���� ��.");
				}
			} catch (IOException e) {
				System.out.println("Ŭ���̾�Ʈ ��ȣ: " + myId + "ó�� ����" + e);
			} finally {
				try {
					((Closeable) socket).close();
				} catch (IOException e) {
					System.out.println("���� ���� ����" + e);
				}
				System.out.println("Ŭ���̾�Ʈ ��ȣ: " + myId + "ó�� ó�� ����");
			}
		}
	}
}