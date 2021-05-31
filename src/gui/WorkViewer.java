package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class WorkViewer {
	
	public WorkViewer() {
		JFrame frame=new JFrame();
		
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("workKind");
		model.addColumn("name");
		model.addColumn("date");
		model.addColumn("description");
		
		JTable table=new JTable(model);
		JScrollPane sp=new JScrollPane(table);
		
		frame.add(sp);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
