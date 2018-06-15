import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class roto  {
		static class MyGUI extends JFrame {

			MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("성적 관리프로그램");
			this.setLayout(null);
			JFrame ssss = new JFrame();
			String dat[][]= { { "10"},
					{"10"},
					{"10"},
					{"10"},
					{"10"},
					{"10"}};		
			
			String[] det = {"이름","국어 점수", "영어 점수", "수학 점수", "총합", "평균" };
			
			DefaultTableModel Model = new DefaultTableModel(dat,det);
			JTable aaa = new JTable(Model);
			JScrollPane abc = new JScrollPane(aaa);
			
			JPanel g1 = new JPanel();
					
			JPanel g2 = new JPanel();
			
			JPanel g3 = new JPanel();
		
			JButton a = new JButton("이름");
			a.setBounds(10,10,100,50);
			
			JButton a1 = new JButton("국어");
			a1.setBounds(10,70,100,50);
			
			JButton a2 = new JButton("영어");
			a2.setBounds(10,130,100,50);
		
			JButton a3 = new JButton("수학");
			a3.setBounds(10,190,100,50);
			
			//
			JTextField q1 = new JTextField("");
			q1.setBounds(120,10,100,50);
			
			JTextField q2 = new JTextField("");
			q2.setBounds(120,70,100,50);
			
			JTextField q3 = new JTextField("");
			q3.setBounds(120,130,100,50);
			
			JTextField q4 = new JTextField("");
			q4.setBounds(120,190,100,50);
			//
			
			JButton c1 = new JButton("추가");
			c1.setBounds(230,10,100,50);
			
			JButton c2 = new JButton("제거");
			c2.setBounds(230,70,100,50);
			
			JButton c3 = new JButton("수정");
			c3.setBounds(230,130,100,50);
			//
			
			JLabel b1 = new JLabel("이름");
			b1.setBounds(360,10,100,50);
			
			JLabel b2 = new JLabel("국어");
			b2.setBounds(430,10,100,50);
			
			JLabel b3 = new JLabel("영어");
			b3.setBounds(500,10,100,50);
			
			JLabel b4 = new JLabel("수학");
			b4.setBounds(570,10,100,50);
			
			JLabel b5 = new JLabel("총점");
			b5.setBounds(640,10,100,50);
			
			JLabel b6 = new JLabel("평균");
			b6.setBounds(710,10,100,50);
			
			g1.add(a);
			g1.add(a1);
			g1.add(a2);
			g1.add(a3);
			
			add(b1);
			add(b2);
			add(b3);
			add(b4);
			add(b5);
			add(b6);
			
			add(c1);
			add(c2);
			add(c3);
			
			g3.add(q1);
			g3.add(q2);
			g3.add(q3);
			g3.add(q4);
			
			add(abc);

			setSize(800,400);
			
			setVisible(true);
			
			}
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
		
	}

}