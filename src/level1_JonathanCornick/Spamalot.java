package level1_JonathanCornick;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot {
	static final String FAKE_USERNAME = "xxdoggosforlifexx@gmail.com";
	static final String FAKE_PASSWORD = "pa$$w0rd12";

	JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JTextField text = new JTextField();
		JButton badEmail = new JButton();
		JButton goodEmail = new JButton();
		public static void main(String[] args) {
			Spamalot spamalot = new Spamalot();
			spamalot.run();
		}
		public void run() {
			panel.add(text);
			frame.add(panel);
			panel.add(badEmail);
			panel.add(goodEmail);
			
			
			
			
			
			frame.pack();
			frame.setVisible(true);
			

		}
}
