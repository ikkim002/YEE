import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class seongjunu {

	static class you extends JFrame {
		you () {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���� ���� ���α׷�");

		String dat[] = {"�̸�","���� ����","���� ����","���� ����","����","���"};
		
		Object det[][] = {};
		
		DefaultTableModel Model = new DefaultTableModel(det,dat);
		JTable q1 = new JTable(Model);
		JScrollPane a = new JScrollPane(q1);
		a.setBounds(320,10,550,200);
		setLayout(null);
		
		JButton a1 = new JButton("�߰�");
		JTextField b1 = new JTextField(10);
		a1.setBounds(210,10,100,50);
		b1.setBounds(110,10,100,50);
	a1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			a1.setBackground(Color.yellow);
				
		}
	
		});
	
		JButton a2 = new JButton("����");
		JTextField b2 = new JTextField(10);
		a2.setBounds(210,61,100,50);
		b2.setBounds(110,61,100,50);
			
		JButton a3 = new JButton("����");
		JTextField b3 = new JTextField(10);
		a3.setBounds(210,112,100,50);
		b3.setBounds(110,112,100,50);
				
		JLabel c1 = new JLabel("�̸�");
		c1.setBorder(new BevelBorder(BevelBorder.RAISED));
		c1.setHorizontalAlignment(SwingConstants.CENTER);
		c1.setBounds(10,10,100,50);
		
		JLabel c2 = new JLabel("���� ����");
		c2.setBounds(10,61,100,50);
		c2.setBorder(new BevelBorder(BevelBorder.RAISED));
		c2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel c3 = new JLabel("���� ����");
		c3.setBounds(10,112,100,50);
		c3.setBorder(new BevelBorder(BevelBorder.RAISED));
		c3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel c4 = new JLabel("���� ����");
		c4.setBounds(10,163,100,50);
		c4.setBorder(new BevelBorder(BevelBorder.RAISED));
		c4.setHorizontalAlignment(SwingConstants.CENTER);
		
		JTextField b4 = new JTextField(10);
		b4.setBounds(110,163,100,50);
			
		add(a);
		add(a1);
		add(a2);
		add(a3);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		
	setSize(900,300);
	setVisible(true);	
		}
	}
	public static void main(String[] args) {
		new you();
	}
}
