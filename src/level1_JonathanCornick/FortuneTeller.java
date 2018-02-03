package level1_JonathanCornick;
import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FortuneTeller extends JPanel implements Runnable, MouseListener {

    JFrame frame = new JFrame();

    int frameWidth = 600;
    int frameHeight = 460;

    FortuneTeller() throws Exception {
   	 // 1. Choose an image for your fortune teller and put it in your default package
   	 fortuneTellerImage = ImageIO.read(getClass().getResource("fortune_teller.jpg"));
   	 // 2. Adjust the frameWidth and frameHeight variables to fit your image nicely (doesn’t need a new line of code)
   	 // 4. add a mouse listener to the frame
   	 frame.addMouseListener(this);

    }

    static void begin() {
   	 // 3. Welcome the user. Give them a hint for the secret location.
JOptionPane.showMessageDialog(null, "Welcome, the key is hidden in a dark and mysterious place.");
    }

    @Override
    public void mousePressed(MouseEvent e) {
   	 int mouseX = e.getX();
   	 int mouseY = e.getY();
   	 // 5. Print the mouseX variable
System.out.println(mouseX+" "+mouseY);
   	 // 6. Add the mouseY variable to the previous line so that it prints out too (no new line)
   	 // 7. Adjust your secret location co-ordinates here:
   	 int secretLocationX = 338;
   	 int secretLocationY = 280;
   	 /** If the mouse co-ordinates and secret location are close, we'll let them ask a question. */
   	 if (areClose(mouseX, secretLocationX) && areClose(mouseY, secretLocationY)) {
   		 // 8. Get the user to enter a question for the fortune teller
JOptionPane.showInputDialog("What knowledge do you seek");
   		 // 9. Find a spooky sound and put it in your default package (freesound.org)
   		 // AudioClip sound = JApplet.newAudioClip(getClass().getResource("spooky.aif"));
   		 // 10. Play the sound
AudioClip sound = JApplet.newAudioClip(getClass().getResource("spooky.wav"));
sound.play();
   		 // 11. Use the pause() method below to wait until your music has finished
pause(14);
   		 // 12. Insert your completed Magic 8 ball recipe (http://bit.ly/Zdrf6d) here
// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int r = new Random().nextInt(4);
// 3. Print out this variable
System.out.println(r);
// 5. If the random number is 0
if (r==0) {
	JOptionPane.showMessageDialog(null, "Yes");
}
// -- tell the user "Yes"
// 6. If the random number is 1
if (r==1) {
	JOptionPane.showMessageDialog(null, "No");
}
// -- tell the user "No"
if (r==2) {
	JOptionPane.showMessageDialog(null, "Mabye you should ask Google?");
}
// 7. If the random number is 2

// -- tell the user "Maybe you should ask Google?"
if (r==03) {
	JOptionPane.showMessageDialog(null, "Madame Fortuneteller has no time for petty questions like that!!");
}
// 8. If the random number is 3

// -- write your own answer

   	 }

    }

    private boolean areClose(int mouseX, int secretLocationX) {
   	 return mouseX < secretLocationX + 15 && mouseX > secretLocationX - 15;
    }

    private void pause(int seconds) {
   	 try {
   		 Thread.sleep(1000 * seconds);
   	 } catch (InterruptedException e) {
   		 e.printStackTrace();
   	 }
    }
    
    /**************** don't worry about the stuff under here *******************/
    
    BufferedImage fortuneTellerImage;

    public static void main(String[] args) throws Exception {
   	 SwingUtilities.invokeLater(new FortuneTeller());
   	 begin();
    }

    @Override
    public void run() {
   	 frame.add(this);
   	 setPreferredSize(new Dimension(frameWidth, frameHeight));
   	 frame.pack();
   	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 frame.setResizable(false);
   	 frame.setVisible(true);
    }

private void showAnotherImage(String imageName) {
   	 try {
   		 fortuneTellerImage = ImageIO.read(getClass().getResource(imageName));
   	 } catch (Exception e) {
   		 System.err.println("Couldn't find this image: " + imageName);
   	 }
   	 repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
   	 g.drawImage(fortuneTellerImage, 0, 0, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

}

// Copyright The League, 2016



