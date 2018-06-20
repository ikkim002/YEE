import java.io.*;
import java.net.*;

public class TranslationServer {
	public static void main(String[] args) throws Exception {
		System.out.println("이응");
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
				out.println("안녕하세요? 클라이언트 번호는 " + myId + "입니다.");
				out.println("단어를 입력하세요");
				while (true) {
					String input = in.readLine();
					if (input == null) {
						break;
					}
					if (input.equals("안녕") == true)
						out.println("방가워");
					else
						out.println("제발 쫌.");
				}
			} catch (IOException e) {
				System.out.println("클라이언트 번호: " + myId + "처리 실패" + e);
			} finally {
				try {
					((Closeable) socket).close();
				} catch (IOException e) {
					System.out.println("소켓 종료 오류" + e);
				}
				System.out.println("클라이언트 번호: " + myId + "처리 처리 종료");
			}
		}
	}
}