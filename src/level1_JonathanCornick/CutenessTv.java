package level1_JonathanCornick;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton duck = new JButton();
	JButton frog = new JButton();
	JButton unicorn = new JButton();

public static void main(String[] args) {
	CutenessTv ctv = new CutenessTv();
	ctv.run();
	
}
void run() {
	frame.add(panel);
	panel.add(duck);
	panel.add(frog);
	panel.add(unicorn);
	duck.addActionListener(this);
	frog.addActionListener(this);
	unicorn.addActionListener(this);
	
	duck.setText("DUCK");
	frog.setText("FROG");
	unicorn.setText("UNICORN");
	frame.setVisible(true);
	panel.setVisible(true);
	frame.pack();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}
	
	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		
		try {
	URI uri = new URI("https://www.youtube.com/watch?v="+ videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed==duck) {
		showDucks();
	}
	if (buttonPressed==frog) {
		showFrog();
	}
	if (buttonPressed==unicorn) {
		showFluffyUnicorns();
	}
	
	}

}
