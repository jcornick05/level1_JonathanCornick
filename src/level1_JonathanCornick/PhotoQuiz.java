package level1_JonathanCornick;

// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
int score = 0;
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image URL”)
		String s = "https://i.ytimg.com/vi/0BQzsNatQOY/maxresdefault.jpg";
		// 2. create a variable of type "Component" that will hold your image
         Component c;
		// 3. use the "createImage()" method below to initialize your Component
        c = createImage(s);
		// 4. add the image to the quiz window
        quizWindow.add(c);
		// 5. call the pack() method on the quiz window
        quizWindow.pack();
		// 6. ask a question that relates to the image
        String a = JOptionPane.showInputDialog("What kind of shark is this?");
		// 7. print "CORRECT" if the user gave the right answer
       if (a.equalsIgnoreCase("Great White Shark")) {
    	   JOptionPane.showMessageDialog(null, "Correct");
    	   score+=10;
	}
		// 8. print "INCORRECT" if the answer is wrong
       else {
		JOptionPane.showMessageDialog(null, "Incorrect");
		score-=10;
	}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
       quizWindow.remove(c);

		// 10. find another image and create it (might take more than one line of code)
String q = "https://images.earthtouchnews.com/media/1516447/squid.jpg?width=500&height=300";
Component x;
x = createImage(q);
		// 11. add the second image to the quiz window
quizWindow.add(x);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String j = JOptionPane.showInputDialog("Is the Collosal Squid real?");
		// 14+ check answer, say if correct or incorrect, etc.
if (j.equalsIgnoreCase("Yes")) {
	   JOptionPane.showMessageDialog(null, "Correct");
	   score+=10;
}
else {
	JOptionPane.showMessageDialog(null, "Incorrect");
	score-=10;
}
System.out.println(score);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
