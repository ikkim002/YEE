import java.awt.*;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;


import javax.swing.*;

public class roto  {
		static class MyGUI extends JFrame {
			MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("���� �������α׷�");
			this.setLayout(null);
			
			String dat[][]= { { "10"},
					{ "10"},
					{"10"},
					{"10"},
					{"10"},
					{"10"}};		}
			
			JTextField h = new JTextField("");
			h.setBounds(120,10,100,50);
			
			//JTable sd = new JTable();
			//JScrollPane asd = new JScrollPane(table);
			
			JTextField g = new JTextField("");
			g.setBounds(120,70,100,50);
			
			JButton c = new JButton("����");
			c.setBounds(10,70,100,50);
			
			JTextField i = new JTextField("");
			i.setBounds(120,130,100,50);
			
			JButton b = new JButton("����");
			b.setBounds(10,130,100,50);
			
			JButton dd = new JButton("����");
			dd.setBounds(10,130,100,50);
			
			JTextField qq = new JTextField("");
			qq.setBounds(120,130,100,50);
			
			JButton q = new JButton("�߰�");
			q.setBounds(230,10,100,50);
			
			JButton w = new JButton("����");
			w.setBounds(230,70,100,50);
			
			JButton e = new JButton("����");
			e.setBounds(230,130,100,50);
			
			
			JLabel m = new JLabel("�̸�");
			m.setBounds(360,10,100,50);
			
			JLabel as = new JLabel("����");
			as.setBounds(430,10,100,50);
			
			JLabel ad = new JLabel("����");
			ad.setBounds(500,10,100,50);
			
			JLabel qe = new JLabel("����");
			qe.setBounds(570,10,100,50);
			
			JLabel qt = new JLabel("����");
			qt.setBounds(640,10,100,50);
			
			JLabel qr = new JLabel("���");
			qr.setBounds(710,10,100,50);
			
			
			
			
			
			add(qq);
			add(dd);
			add(qr);
			add(qt);
			add(as);
			add(ad);
			add(qe);
			add(m);
			add(q);
			add(w);
			add(e);
			add(h);
			add(b);
			add(c);
			add(i);
			add(g);
			

			setSize(800,400);
			setVisible(true);
			
			
			}
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
		
	}

}
