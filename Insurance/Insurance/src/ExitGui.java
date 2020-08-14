import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ExitGui extends JFrame {
		public ExitGui() {
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			int a = JOptionPane.showConfirmDialog( null, "Are you sure you wish to exit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (a == JOptionPane.YES_OPTION )
			System.exit(0);
		else
			dispose();
		}}

		
	
	
