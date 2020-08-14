

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


public class SearchCarsGui extends JFrame {
	ArrayList<Cars> car;
	public SearchCarsGui(ArrayList<Cars> list) {
		car = list;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//TextField
		JTextField Search = new JTextField();
		//Buttons
		JButton s = new JButton("Search");
		JButton can = new JButton("Cancel");
		//Pane;
		JPanel p1 = new JPanel(new GridLayout(5,1));
		//TextArea
		JTextArea found = new JTextArea();
		//Label
		JLabel regLab = new JLabel("Please enter the Car Reg Number");
		//add to pane;
		p1.add(regLab);
		p1.add(Search);
		p1.add(s);
		p1.add(can);
		//add to frame
		add(p1, BorderLayout.CENTER);
		
		//Button 1
		s.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String search = Search.getText();
				
				for(int i=0;i<car.size();i++){
			         if(car.get(i).getNum().equalsIgnoreCase(search)){
			        	p1.add(found);
				          found.setText(car.get(i).toString());
				          }
			         else {
			        	 JOptionPane.showMessageDialog(null,"Car not found!", "Error", JOptionPane.INFORMATION_MESSAGE);
			        	
			         }}}});
		//Button cancel
	can.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			         }});	
	}	
	}
