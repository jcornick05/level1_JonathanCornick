package level1_JonathanCornick;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingExample {
	public static void main(String[] args) {
//1.make components
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Out of service!");
		JLabel label = new JLabel();
	    label.setText("Leave a reveiw here --->");
//2. add them together
		frame.add(panel);
		panel.add(label);
		panel.add(button);
	    
//3. pack the frame
		frame.pack();
		
//4.set visible
		
		frame.setVisible(true);
		
		
		
	}

}
