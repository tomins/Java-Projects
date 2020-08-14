import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class AddCarsGui extends JFrame{
	ArrayList<Cars> car;
	
	 public AddCarsGui(ArrayList<Cars> list) {
		 car = list;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			//Labels
				JLabel regLab = new JLabel("Car Reg Number");
				JLabel yearLab = new JLabel("Car Year");
			    JLabel crashLab = new JLabel("Has the car been crashed?");	
			    //TextField
			    JTextField regTxt = new JTextField();
			    //Spinner
			   SpinnerNumberModel years = new SpinnerNumberModel(2000, 1900, 2020, 1);  
			   JSpinner yearSpin = new JSpinner(years);
			   //RadioButton
			   JRadioButton crashBut1 = new JRadioButton("Yes");
			   JRadioButton crashBut2 = new JRadioButton("No");
			   //Button
			   JButton b1 = new JButton("Enter");
			   JButton can = new JButton("Cancel");
			   ButtonGroup group = new ButtonGroup();
			   group.add(crashBut1);
			   group.add(crashBut2);
			   //Panels
			   JPanel p1 = new JPanel(new GridLayout(9, 1));
			   
			   //add labels and Text Fields
			   p1.add(regLab);
			   p1.add(regTxt);
			   p1.add(yearLab);
			   p1.add(yearSpin);
			   p1.add(crashLab);
			   p1.add(crashBut1);
			   p1.add(crashBut2);
			   
			  //add button
			   p1.add(b1);
			   p1.add(can);
			  
			   //add panel to frame
				add(p1);
				
				//When button 1 is pressed "Enter"
				b1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String num = regTxt.getText();
						int year = (int) yearSpin.getValue();
						boolean crashed = false;
						if (crashBut1.isSelected() == true)
							crashed = true;
						else
							crashed = false;
						Cars aCar = new Cars(num,year,crashed);
				        car.add(aCar);
				        dispose();
					}
					
});
				//cancel button
				can.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				        dispose();
}});		
}
}
