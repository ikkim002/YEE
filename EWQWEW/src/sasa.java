import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JApplet;
import java.awt.FlowLayout;
public class sasa extends JApplet{
	JButton a1 = new JButton ("연락");
	JButton a2 = new JButton ("수정");
	JButton a3 = new JButton ("삭제");
	JButton a4 = new JButton ("끝");
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
