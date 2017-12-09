package level1_JonathanCornick;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ListenerExample implements ActionListener {
     public static void main(String[] args) {
	//2. start run from main
    	 ListenerExample ex = new ListenerExample();
    	 ex.run();
    	 
    	 
    	 
	}
   //1. make a run method
     public void run() {
    	 //3. make GUI
    	 JFrame frame = new JFrame();
    	 JPanel panel = new JPanel();
    	 JButton button = new JButton("CLICK ME!!!  [ :");
    	 frame.add(panel);
    	 panel.add(button);
    	 frame.pack();
    	 frame.setVisible(true);
    	 //.add action listener
    	 button.addActionListener(this);
    	 //5. addd implement option
    	 //6. hover on red and add unimplement methods
    	 
    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	//7. add code that runs when event happens
	System.out.println("Event detected•ªº¶∞∞¢£¡™¢∞∞§¶•ªªº–≠");
	
}
     
}
