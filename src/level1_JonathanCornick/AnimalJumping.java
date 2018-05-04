package level1_JonathanCornick;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AnimalJumping {

	 public static void main(String[] args) throws MalformedURLException {

	        /* We want to show an animation of an animal sucking at jumping inside a JFrame.
	         * Once you have chosen from http://animalssuckingatjumping.tumblr.com/, right click and "Copy Image URL" or “Copy Image Address”
	         * Your program must:
	         * 		- show the animation in full without any user interaction. You don’t need a JPanel since it’s only one JComponent.
	         * 		- show the animation in the center of the screen. Clue: frame.setLocationRelativeTo(null)
	         * 		- have a title such as "Gerbil Fail"
	         */
			JFrame frame = new JFrame();
            frame.setTitle("CAT-astrophe");
			String urlOfAnimalSuckingAtJumping = "https://78.media.tumblr.com/7723fa136215fe6a9f195ff7ec94fc88/tumblr_nd2v4dH49Z1s612eao1_400.gif";
	       JLabel label = createImage(urlOfAnimalSuckingAtJumping);
	       frame.add(label);
	      frame.setLocationRelativeTo(null);
	      frame.pack();
	      label.setSize(750, 750);
	       frame.setVisible(true);
	    }
	 
	 static JLabel createImage(String imageURL) throws MalformedURLException {
		 	URL url = new URL(imageURL);
	        Icon icon = new ImageIcon(url);
	        return new JLabel(icon);
	 }
}

