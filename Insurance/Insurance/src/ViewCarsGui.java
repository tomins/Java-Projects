import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ViewCarsGui extends JFrame {
	
	public ViewCarsGui(ArrayList<Cars> list) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//panel
		JPanel p1 = new JPanel();
		//text Area
		JTextArea area = new JTextArea(list.toString());
		//Button
		JButton b1 = new JButton("Exit");
		//add to panel
		p1.add(area);
		p1.add(b1);
		//add panel to frame
		add(p1);
		//Button 1
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}});		
}

}
