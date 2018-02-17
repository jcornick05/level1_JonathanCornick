package level1_JonathanCornick;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CardGameX implements ActionListener {
	int characterHealth = 100;
	int enemyHealth = 100;
	JFrame frame = new JFrame();
	JPanel mainPanel = new JPanel();
	JPanel characterPanel = new JPanel();
	JPanel attackPanel = new JPanel();
	JPanel enemyPanel = new JPanel();
	JLabel character = new JLabel();
	JLabel enemy = new JLabel();
	JLabel a = new JLabel();
	JLabel b = new JLabel();
	JButton attack = new JButton();
    JLabel cHealth = new JLabel();
    JLabel eHealth = new JLabel();
	public void run() {
		// TODO Auto-generated method stub
		mainPanel.setLayout(new BorderLayout(5,5));
		characterPanel.setLayout(new BoxLayout(characterPanel,BoxLayout.PAGE_AXIS));
		enemyPanel.setLayout(new BoxLayout(enemyPanel,BoxLayout.PAGE_AXIS));
		frame.add(mainPanel);
		mainPanel.add(characterPanel,BorderLayout.LINE_START);
		mainPanel.add(enemyPanel,BorderLayout.LINE_END);
		mainPanel.add(attackPanel,BorderLayout.SOUTH);
		character = loadImageFromComputer("Player.png");
		enemy = loadImageFromComputer("Enemy.png");
		characterPanel.add(character);
		enemyPanel.add(enemy);
		characterPanel.add(a);
		enemyPanel.add(b);
		attackPanel.add(attack);
		frame.setVisible(true);
		frame.setTitle("Hyeped Beasts");
		attack.setText("ATTACK!!!");
	    cHealth.setText("HP: " + characterHealth );
	    eHealth.setText("HP: " + enemyHealth );
		characterPanel.add(cHealth);
		cHealth.setAlignmentX(Component.CENTER_ALIGNMENT);
		character.setAlignmentX(Component.CENTER_ALIGNMENT);
		enemyPanel.add(eHealth);
		eHealth.setAlignmentX(Component.CENTER_ALIGNMENT);
		enemy.setAlignmentX(Component.CENTER_ALIGNMENT);
		attack.addActionListener(this);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int cAttack = new Random().nextInt(25);
		cAttack+=10;
		int eAttack = new Random().nextInt(25);
		eAttack+=10;
		enemyHealth-=cAttack;
		characterHealth-=eAttack;
		cHealth.setText("HP: " + characterHealth);
		eHealth.setText("HP: " + enemyHealth);
		if (characterHealth<0) {
			JOptionPane.showMessageDialog(null, "YOU DIED!!");
		}
		if (enemyHealth<0) {
			JOptionPane.showMessageDialog(null, "YOU WON!!");
		}
		if (characterHealth==0 && enemyHealth==0) {
		if (characterHealth>enemyHealth) {
	         JOptionPane.showMessageDialog(null, "YOU WON!!");
			}else {
				JOptionPane.showMessageDialog(null, "YOU DIED");
		}
	}
}
}
