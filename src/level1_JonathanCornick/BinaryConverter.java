package level1_JonathanCornick;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	 JPanel panel = new JPanel();
	JTextField x = new JTextField(20);
	JButton button = new JButton();
	JTextField y = new JTextField(20);
	
public static void main(String[] args) {
BinaryConverter BC = new BinaryConverter();
BC.run();

}public void run() {
	frame.add(panel);
	panel.add(x);
	panel.add(button);
	panel.add(y);
	button.setText("CONVERT!!");
	frame.setVisible(true);
	frame.pack();
button.addActionListener(this);
}
int convert1(String binary) {
	if(binary.length() != 8){
		JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
		return 0;
	}
	 if(!binary.matches("[01]+")) {
		 JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
	 }
	try {
		int asciiValue = Integer.parseInt(binary, 2);
		return asciiValue;
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
		//question.setText("");
		return 0;
	}
}
String convert(int asciiValue) {
	 char theLetter = (char) asciiValue;
	 return "" + theLetter;
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String in = x.getText();
	int IN = Integer.parseInt(in);
	String out = convert(IN);
	y.setText(out);
}


}
