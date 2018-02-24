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
	JLabel character2 = new JLabel();
	JLabel enemy2 = new JLabel();
	JLabel a = new JLabel();
	JLabel b = new JLabel();
	JButton attack = new JButton();
    JLabel cHealth = new JLabel();
    JLabel eHealth = new JLabel();
    int p = 0;
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
		character2 = loadImageFromComputer("Player2.png");
		enemy2 = loadImageFromComputer("Enemy2.png");
		characterPanel.add(character);
		enemyPanel.add(enemy);
		characterPanel.add(a);
		enemyPanel.add(b);
		attackPanel.add(attack);
		frame.setVisible(true);
		frame.setTitle("Fallout Card Game");
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
		int cAttack = new Random().nextInt(10);
		cAttack+=10;
		int eAttack = new Random().nextInt(10);
		eAttack+=10;
		enemyHealth-=cAttack;
		characterHealth-=eAttack;
		cHealth.setText("HP: " + characterHealth);
		eHealth.setText("HP: " + enemyHealth);
		if (characterHealth<=0 && enemyHealth<=0) {
			cHealth.setText("Game Over");
			eHealth.setText("Game Over");
			cHealth.setText(""+p);
			eHealth.setText(""+p);
				JOptionPane.showMessageDialog(null, "YOU BOTH DIED");
				attackPanel.removeAll();
				JOptionPane.showMessageDialog(null, "Play again??");
				characterPanel.removeAll();
				characterPanel.add(character2);
				enemyPanel.removeAll();
				enemyPanel.add(enemy2);
	}
		else if (characterHealth<=0) {
			cHealth.setText("Game Over");
			
			JOptionPane.showMessageDialog(null, "YOU DIED!!");
			attackPanel.removeAll();
			JOptionPane.showMessageDialog(null, "Play again??");
			characterPanel.removeAll();
			characterPanel.add(character2);
		}
		else if (enemyHealth<=0) {
		    eHealth.setText("Game Over");
			JOptionPane.showMessageDialog(null, "YOU WON!!");
			attackPanel.removeAll();
			JOptionPane.showMessageDialog(null, "Play again??");
			enemyPanel.removeAll();
			enemyPanel.add(enemy2);
		}
		
		
}
}
