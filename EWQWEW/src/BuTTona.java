import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
public class BuTTona  extends JFrame{
	
	JButton a1 = new JButton("1");
	JButton a2 = new JButton("2");
	JButton a3 = new JButton("3");



	public BuTTona()
	{
		super("¤±");
		
		this.setLayout(new FlowLayout());
		this.add(a1);
		this.add(a2);
		this.add(a3);
		
		this.setSize(400,500);
		
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		public static void main(String[] args) {
			
		
		new BuTTona();

		
		}
	}