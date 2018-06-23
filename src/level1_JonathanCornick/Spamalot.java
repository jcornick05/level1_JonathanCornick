package level1_JonathanCornick;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot implements ActionListener {
	static final String FAKE_USERNAME = "xxdoggosforlifexx@gmail.com";
	static final String FAKE_PASSWORD = "pa$$w0rd12";

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField(21);
	JButton badEmail = new JButton();
	JButton goodEmail = new JButton();

	public static void main(String[] args) {
		Spamalot spamalot = new Spamalot();
		spamalot.run();
	}

	public void run() {
		panel.add(text);
		frame.add(panel);
		panel.add(badEmail);
		panel.add(goodEmail);
		badEmail.setText("BAD");
		goodEmail.setText("GOOD");

		goodEmail.addActionListener(this);
		badEmail.addActionListener(this);

		frame.pack();
		frame.setVisible(true);

	}

	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		String emailEntered = text.getText();
		if (buttonPressed == badEmail) {
			for (int i = 0; i < 5; i++) {
				boolean didsend = sendSpam(emailEntered, "bad", "bad");
				if (!didsend) {
					text.setBackground(Color.RED);
				} else {
					text.setBackground(Color.GREEN);
				}
			}
		}
		if (buttonPressed == goodEmail) {
			for (int i = 0; i < 5; i++) {
				boolean didSend = sendSpam(emailEntered, "good", "good");
				if (didSend) {
					text.setBackground(Color.GREEN);
				} else {
					text.setBackground(Color.RED);
				}

			}

		}
	}
}
