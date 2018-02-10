package level1_JonathanCornick;

import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardGameX {
	public void run() {
		// TODO Auto-generated method stub
		int characterHealth = 100;
		int enemyHealth = 100;
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel character = new JLabel();
		JLabel enemy = new JLabel();
		JLabel a = new JLabel();
		JLabel b = new JLabel();
		JButton attack = new JButton();
		frame.add(panel);
		character = loadImageFromComputer("Player.png");
		enemy = loadImageFromComputer("Enemy.png");
		panel.add(character);
		panel.add(enemy);
		panel.add(a);
		panel.add(b);
		panel.add(attack);
		frame.setVisible(true);
		frame.setTitle("Hyeped Beasts");
		attack.setText("ATTACK!!!");

		
		
		
		frame.pack();
	}

	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
}
