import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 


class HandPon extends JFrame {

 JButton b1;      
 private JButton b2, b3;     
 public HandPon() {         
	 setTitle("Absolute Position Test");            
 setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE );           
 setSize(300, 200);
 JPanel p = new JPanel();     
 p.setLayout(null);      
 b1 = new JButton("Button #1");       
 p.add(b1);      
 b2 = new JButton("Button #2");
 p.add(b2);              
 b3 = new JButton("Button #3"); 
 p.add(b3); 
 
z
 b2.setBounds(55, 45, 105, 70); 
 
 
 add(p);       
 setVisible(true); 

 }



     
	public static void main(String args[]) {
		HandPon f=new HandPon(); 
	}



}