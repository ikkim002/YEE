import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Server extends JFrame {
	
	
	JTextArea ta;
	JTextField tf;

	public Server() {
		setSize(400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("a");
		setLayout(new BorderLayout());

		JLabel label = new JLabel("This is a server !");
		ta = new JTextArea(20, 40);
		tf = new JTextField(25);

		add(label, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);
		setVisible(true);

	}
}

class GuiMultiChat_Tcpserver {
	HashMap clients;

	GuiMultiChat_Tcpserver() {
		clients = new HashMap();
		Collections.synchronizedMap(clients);
	}

	public static void main(String args[]) {
		Socket f = new Socket();
		new GuiMultiChat_Tcpserver().start();

	}

	public void start() {
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(1000);
			System.out.println("���� ����");

			while (true) {
				socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress() + "]" + "���� �����ϼ̽��ϴ�.");

				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();

				System.out.println("������ ���� : " + thread.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	void sendToAll(String nick) {
		
		Iterator it = clients.keySet().iterator();

		while (it.hasNext()) {
			try {
				DataOutputStream out = (DataOutputStream) clients.get(it.next());
				out.writeUTF(nick);
			} catch (IOException e) {
				System.out.println("sendToall ����� ����");
			}
		}
	}

	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;

		ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				System.out.println("���� ���ù� ���� IO ����");
			}
		}

		public void run() {
			String name = "";

			try {
				name = in.readUTF();
				sendToAll("#" + name + "���� �����̾��ϴ�.");

				clients.put(name, out);
				System.out.println("���� ������ ���� " + clients.size() + "�Դϴ�");
				System.out.println("���� ������ ��� : ");

				while (in != null) {
					sendToAll(in.readUTF());
				}
			} catch (IOException e) {
				System.out.println("���ù� ���� io����");
			} finally {
				sendToAll("#" + name + "���� �����̽��ϴ�~");
				clients.remove(name);
				System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "] ���� ������ ������");
				System.out.println("���� ������ ���� " + clients.size() + "�Դϴ�");
			}
		}
	}
}