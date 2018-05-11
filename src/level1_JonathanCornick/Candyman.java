package level1_JonathanCornick;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Candyman implements ActionListener {
	int i = 0;
	static final int CREEPY = 0;
	static final int SCREAM = 1;

	public static void main(String[] args) {
		Candyman candyman = new Candyman();
		candyman.run();
	}

	public void run() {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		frame.add(panel);
		panel.add(button);
		button.setText("CAnDyMAn!?");
		button.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public static void playSound(int whichSound) {
		File soundFile = null;
		if (whichSound == CREEPY)
			soundFile = new File("/Users/league/Desktop/level1_JonathanCornick/src/level1_JonathanCornick/SOUND.wav");
		else if (whichSound == SCREAM)
			soundFile = new File("/Users/league/Desktop/level1_JonathanCornick/src/level1_JonathanCornick/SOUND2.wav");
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		i += 1;
		if (i<5) {
		playSound(1);
		}
		if (i == 5) {
			showPictureFromTheInternet(
					"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSIhdTf91zYk5q71O8yjufUtdSe_f2Z_LVjv8n06UMXWevbJjSs_g");
		playSound(0);
		
		}
	
	}

}
