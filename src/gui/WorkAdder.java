package gui;

import javax.swing.*;

import layout.SpringUtilities;

public class WorkAdder {
	
	public WorkAdder() {
		JFrame frame=new JFrame();
		
		JPanel panel=new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelworkKind=new JLabel("workKind : ", JLabel.TRAILING);
		JTextField fieldworkKind=new JTextField(10);
		labelworkKind.setLabelFor(fieldworkKind);
		panel.add(labelworkKind);
		panel.add(fieldworkKind);
		
		JLabel labelname=new JLabel("name : ", JLabel.TRAILING);
		JTextField fieldname=new JTextField(10);
		labelname.setLabelFor(fieldname);
		panel.add(labelname);
		panel.add(fieldname);
		
		JLabel labeldate=new JLabel("date : ", JLabel.TRAILING);
		JTextField fielddate=new JTextField(10);
		labeldate.setLabelFor(fielddate);
		panel.add(labeldate);
		panel.add(fielddate);
		
		JLabel labeldescription=new JLabel("description : ", JLabel.TRAILING);
		JTextField fielddescription=new JTextField(10);
		labeldescription.setLabelFor(fielddescription);
		panel.add(labeldescription);
		panel.add(fielddescription);
		
		SpringUtilities.makeCompactGrid(panel,4,2,6,6,6,6);
		
		frame.setSize(300, 300);
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
