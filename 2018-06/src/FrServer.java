import javax.swing.*;
import java.awt.*;
import java.net.Socket;
class FrServer extends JFrame {

	JTextArea ta;
	JTextField tf;

	public FrServer() {
		setSize(400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("클라이언트 서버");
		setLayout(new BorderLayout());

		JLabel label = new JLabel("This is a server !");
		ta = new JTextArea(20, 40);
		tf = new JTextField(25);

		add(label, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);
		
		setVisible(true);

		
	}
	public static void main(String args[]) {
		Socket f = new Socket();
		new FrServer();
		

	}
}