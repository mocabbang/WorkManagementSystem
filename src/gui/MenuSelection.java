package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection {
	
	public MenuSelection() {
		JFrame frame=new JFrame();
		
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		
		
		
		JLabel label=new JLabel("Menu Selection");
		JButton button1=new JButton("Add Work");
		JButton button2=new JButton("Delete Work");
		JButton button3=new JButton("Edit Work");
		JButton button4=new JButton("View Work");
		JButton button5=new JButton("Exit Program");
		
		
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		
		
		frame.getContentPane().add(BorderLayout.NORTH, panel1);
		frame.getContentPane().add(BorderLayout.CENTER, panel2);
		
		
		
		frame.setTitle("My Frame");
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
