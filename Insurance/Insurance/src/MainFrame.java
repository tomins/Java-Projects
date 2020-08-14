import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;


public class MainFrame extends JFrame {
	ArrayList <Cars> list;
	Scanner scan = new Scanner(System.in);

	public MainFrame() {
		//arraylist
		list = new ArrayList<Cars>();
		//panel
		JPanel main = new JPanel(new GridLayout(4,1));
		//Buttons
		JButton addCars = new JButton("Add Cars!");
		JButton viewCars = new JButton("View Existing cars!");
		JButton SearchCars = new JButton("Search Existing cars!"); 
		JButton exit = new JButton("Exit Application!");
		//Add to panel
    	main.add(addCars);
    	main.add(viewCars);
    	main.add(SearchCars);
    	main.add(exit);
    	//Add panel to Frame
		add(main, BorderLayout.CENTER);
		
		//Add Cars Button
		addCars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCarsGui custframe = new AddCarsGui(list);
				custframe.setTitle("Add Cars to the list");
				custframe.setSize(400, 300);
				custframe.setVisible(true);
			}
		});
		
		//View Cars Button
		viewCars.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ViewCarsGui custframe = new ViewCarsGui(list);
			custframe.setTitle("View the Cars on the list");
			custframe.pack();
			custframe.setVisible(true);
		}
		});
		
		//Search Cars Button
		SearchCars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchCarsGui custframe = new SearchCarsGui(list);
				custframe.setTitle("Search for cars on the list");
				custframe.pack();
				custframe.setVisible(true);
			}
			});
		
		//Exit Button
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ExitGui();
			}
			
			});
	}
	
	public static void main(String[] args) {
		MainFrame main = new MainFrame();
		main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		main.pack();
		main.setTitle("Main Menu");
		main.setVisible(true);
		
	}

}
