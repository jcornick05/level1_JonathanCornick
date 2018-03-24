package level1_JonathanCornick;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JFrame;

 public class SensitiveKeyboard implements KeyListener {
	JFrame frame = new JFrame();
	
public static void main(String[] args) {
SensitiveKeyboard keyboard = new SensitiveKeyboard();
keyboard.run();
}
public void run() {
	System.out.println("Test1");
	frame.addKeyListener(this);
	frame.setVisible(true);
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("TEST2");
	speak("ouch!");
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
static void speak(String words) {
  	 try {
  		 Runtime.getRuntime().exec("say " + words).waitFor();
  	 } catch (Exception e) {
  		 e.printStackTrace();
  	 }
   }

}
