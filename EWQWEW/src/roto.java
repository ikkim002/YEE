
//http://nakzzi.xyz/ < 고웁

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class roto  {
		static class MyGUI extends JFrame {
			MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("성적 관리프로그램");
			this.setLayout(null);
			
			
			JTextField h = new JTextField("");
			h.setBounds(120,10,100,50);
			
			JButton a = new JButton("이름");
			a.setBounds(10,10,100,50);
			
			JTextField g = new JTextField("");
			g.setBounds(120,70,100,50);
			
			JButton c = new JButton("국어");
			c.setBounds(10,70,100,50);
			
			JTextField i = new JTextField("");
			i.setBounds(120,130,100,50);
			
			JButton b = new JButton("영어");
			b.setBounds(10,130,100,50);
			
			JButton dd = new JButton("수학");
			dd.setBounds(10,130,100,50);
			
			JTextField qq = new JTextField("");
			qq.setBounds(120,130,100,50);
			
			JButton q = new JButton("추가");
			q.setBounds(230,10,100,50);
			
			JButton w = new JButton("제어");
			w.setBounds(230,70,100,50);
			
			JButton e = new JButton("수정");
			e.setBounds(230,130,100,50);
			
			
			JLabel m = new JLabel("이름");
			m.setBounds(360,10,100,50);
			
			JLabel as = new JLabel("국어");
			as.setBounds(430,10,100,50);
			
			JLabel ad = new JLabel("영어");
			ad.setBounds(500,10,100,50);
			
			JLabel qe = new JLabel("수학");
			qe.setBounds(570,10,100,50);
			
			JLabel qt = new JLabel("총점");
			qt.setBounds(640,10,100,50);
			
			JLabel qr = new JLabel("평균");
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
			add(a);
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
