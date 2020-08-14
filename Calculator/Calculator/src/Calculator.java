/*Thomas Cummins	
 * Calculator Swing Gui Project
 * C18473984
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.*;
import net.miginfocom.swing.MigLayout;
public class Calculator extends JFrame  
{
	String multiplier;//Defines if it a plus, minus,mulitiply or divide
	double sum1 = 0;//The first set of numbers in a sum		
	double sum2 = 0;//The second set of numbers
	double answer = 0;//The answer to the sum
	double memory = 0;
	
	public Calculator() 
	{
		
	//Panel declaration
	JPanel panel = new JPanel();
	
	//TextField declaration
	JTextField display = new JTextField();
	
	display.setEditable(false);//making the text field not editable by the keyboard
	
	//Buttons declaration
	JButton back = new JButton("←");
	JButton CE = new JButton("CE");
	JButton C = new JButton("C");
	JButton plus = new JButton("+");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton divide = new JButton("/");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton multiply = new JButton("*");
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton minus = new JButton("-");
	JButton zero = new JButton("0");
	JButton point = new JButton(".");
	JButton equals = new JButton("=");
	
	//Extra pt.1
	JButton MC = new JButton("MC");
	JButton MR = new JButton("MR");
	JButton MS = new JButton("MS");
	JButton Mplus = new JButton("M+");
	JButton Mminus = new JButton("M-");
	
	//Extra pt.2
	JButton oppose = new JButton("+/-");
	JButton root = new JButton("√ _");
	JButton percentage = new JButton("%");
	JButton power = new JButton("^");
	JButton inverse = new JButton("1/x");
	
	//setting the layout
	panel.setLayout(new MigLayout());
	
	//adding the text field to the panel
	panel.add(display, "span, pushx, growx");
	
	//adding extra pt.1 to the panel
	panel.add(MC,"growx");
	panel.add(MR,"growx");
	panel.add(MS,"growx");
	panel.add(Mplus,"growx");
	panel.add(Mminus,"growx, wrap");
	
	//adding all the other buttons to the panel
	panel.add(back, "growx");
	panel.add(CE, "growx");
	panel.add(C, "growx");
	panel.add(oppose, "growx");//extra pt.2
	panel.add(root, "growx, wrap");//extra pt.2
	panel.add(seven, "growx");
	panel.add(eight, "growx");
	panel.add(nine, "growx");
	panel.add(divide, "growx");
	panel.add(percentage, "growx, wrap");//extra pt.2
	panel.add(four, "growx");
	panel.add(five, "growx");
	panel.add(six, "growx");
	panel.add(multiply, "growx");
	panel.add(power,"growx, wrap");//extra pt.2
	panel.add(one, "growx");
	panel.add(two, "growx");
	panel.add(three, "growx");
	panel.add(minus, "growx");
	panel.add(inverse, "growx, wrap");//extra pt.2
	panel.add(zero, "span2, pushx, growx");
	panel.add(point, "growx");
	panel.add(plus, "growx");
	panel.add(equals, "growx");
	
	//adding the panel to the frame
	add(panel);
	
	//Action Listeners
	//numbers
	//Zero button
	zero.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			if(!display.getText().isEmpty()) {
			display.setText(display.getText()+ "0");//set display to add 0
			}
		}});
	
	//one button
	one.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			display.setText(display.getText()+ "1");//set display to add 1
		}});
	
	//two button
	two.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			display.setText(display.getText()+ "2");//set display to add 2
		}});
	//three  same as above
	three.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			display.setText(display.getText()+ "3");
		}});
	//four  same as above
	four.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			display.setText(display.getText()+ "4");
		}});
	//five  same as above
	five.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			display.setText(display.getText()+ "5");
		}});
	//six  same as above
	six.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			display.setText(display.getText()+ "6");
		}});
	//seven  same as above
	seven.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			display.setText(display.getText()+ "7");
		}});
	//eight  same as above
	eight.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			display.setText(display.getText()+ "8");
		}});
	//nine  same as above
	nine.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			display.setText(display.getText()+ "9");
		}});
	//multipliers
	//multiply
	multiply.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			if(!display.getText().isEmpty()) {//if the textbox isn't empty
			sum1 = Double.parseDouble(display.getText());//make the text on screen into a double and make it sum1
			multiplier = "X";//set the multiplier to X
			display.setText("");//empty the text box
			}
		}});
	//divide
	divide.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			if(!display.getText().isEmpty()) {//if the textbox isn't empty
			sum1 = Double.parseDouble(display.getText());//make the text on screen into a double and make it sum1
			multiplier = "/";//set the multiplier to /
			display.setText("");//empty the text box
			}
		}});
	//minus  same as above
	minus.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			if(!display.getText().isEmpty()) {
			sum1 = Double.parseDouble(display.getText());
			multiplier = "-";
			display.setText("");
			}
		}});
	//plus  same as above
	plus.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			if(!display.getText().isEmpty()) {
			sum1 = Double.parseDouble(display.getText());
			multiplier = "+";
			display.setText("");
			}
			}});
	//Others
	//point
	point.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			if(!display.getText().isEmpty()) {//if the textbox isn't empty
			display.setText(display.getText()+ ".");//Set the display text to what it was plus a point
			}
		}});
	//backspace
	back.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			if(!display.getText().isEmpty()) {//if the textbox isn't empty
			display.setText(display.getText().substring(0, display.getText().length() - 1));//set the text to what it was minus the last charachter
			}
		}});
	//C
	C.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			display.setText("");//empty the text box
			multiplier = "";//empty the multiplier, hence cancelling the operations
			memory = 0;//also emptying the memory hence resetting the entire calculator
		}});
	//CE
	CE.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			display.setText("");//empty the text box
		}});
	//equals
	equals.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			if (!(sum1 == 0) && !multiplier.isEmpty()) {//does the operations only once the rest of the fields have been filled in
			sum2 = Double.parseDouble(display.getText());//set the text on the screen to sum2
			if (multiplier == "X")//if X was pressed
				answer = sum1*sum2;//set the answer to sum1 multiplied by sum2
			else if (multiplier == "/")//if / was pressed
				answer = sum1/sum2;// set answer to sum1 divided by sum2
			else if (multiplier == "-")//if - was pressed
				answer = sum1-sum2;//set answer to sum1 minus sum 2
			else if (multiplier == "+")//if + was pressed
				answer = sum1+sum2;//set answer to sum1 plus sum 2
			else if(multiplier == "%") {//if % was pressed
				double percentage = sum2/sum1;//get the percentage
				answer = sum1 + sum1*percentage;//make the asnwer = sum1 + sum1 times the percntage
				}
			else if(multiplier == "^")
				answer = Math.pow(sum1, sum2);
			
			display.setText(Double.toString(answer));//set the textfield to answer
			}
		}});
	//extra pt.1 action listeners
	//MC
	MC.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			
			memory = 0;//make memory 0
		}});
	//MR
		MR.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(memory != 0)//once memory is not 0
				display.setText(Double.toString(memory));//set the text to the value of memory
			}});
		//MS
		MS.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(!display.getText().isEmpty())
				memory = Double.parseDouble(display.getText());//make the text on screen into a double and make it memory
			}});
		//Mplus
		Mplus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(!display.getText().isEmpty()) {
				memory = memory + Double.parseDouble(display.getText());//make the value in memory = to itself plus the number on screen
				display.setText(Double.toString(memory));//display the answer
				}
			}});
		//Mminus
		Mminus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(!display.getText().isEmpty()) {
				memory = memory - Double.parseDouble(display.getText());//make the value in memory = to itself minus the number on screen
				display.setText(Double.toString(memory));//display the answer
				}
			}});
		//Extra pt.2
		//root
		root.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				double rootx = Double.parseDouble(display.getText());//take in the text on screen
				if(rootx >= 0)//check if it is less then 0
					rootx = Math.sqrt(rootx);//get the square root
				display.setText(Double.toString(rootx));//set the answer as text
			}});
		//oppose
		oppose.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				double opposeX =  Double.parseDouble(display.getText());//take in the text on screen
				opposeX = opposeX * -1;//mutiply the inputted number by -1
				display.setText(Double.toString(opposeX));//display the answer
			}});
		//percentage
		percentage.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(!display.getText().isEmpty()) {//check if the display is empty
					sum1 = Double.parseDouble(display.getText());//set sum1 to the display
					multiplier = "%";//set the multiplier
					display.setText("");//empty the text
				}
			}});
		//power
		power.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(!display.getText().isEmpty()) {//check if the display is empty
					sum1 = Double.parseDouble(display.getText());//set sum1 to the display
					multiplier = "^";//set the multiplier
					display.setText("");//empty the text
				}
			}});
		inverse.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				double inverseX =  Double.parseDouble(display.getText());//take in the text on screen
				inverseX = inverseX/1;//divide the inputted number by 1
				display.setText(Double.toString(inverseX));//display the answer
			}});
		
	}
	
public static void main(String[] args) {
		
		Calculator calc = new Calculator();//new JFrame
		calc.setVisible(true);//set visability
		calc.setTitle("Calculator");//set title
		calc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//close all on close
		calc.pack();
	}

}
