import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JApplet;
import java.awt.FlowLayout;
public class sasa extends JApplet{
	JButton a1 = new JButton ("����");
	JButton a2 = new JButton ("����");
	JButton a3 = new JButton ("����");
	JButton a4 = new JButton ("��");
	public sasa() 
	{
		
		
		this.setLayout(new FlowLayout());
		this.add(a1);
		this.add(a2);
		this.add(a3);
		this.add(a4);
		
		this.setSize(400,500);
			
		this.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new sasa() ;
	}

}
