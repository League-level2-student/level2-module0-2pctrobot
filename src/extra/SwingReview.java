package extra;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 2
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SwingReview implements ActionListener, KeyListener {
	// Creates necessary Swing components to use for this program
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button1;
	JButton button2;
	int count1;
	int count2;

	public void run() throws Exception {
		// 1. Initialize your JFrame variable as an object of the JFrame class
		frame = new JFrame();
		// 2. Set your JFrame object to be visible
		// JFrames are hidden by default! Make sure you are telling it to set visible,
		// not asking if it is visible!
		frame.setVisible(true);
		// 3. Run your program. Do you see your window? It's probably very
		// small.
		//yes
		// 4. Set the default close operation to JFrame.EXIT_ON_CLOSE
		// This makes the program actually close when we hit the red X in the corner!
		// Without it, our program keeps
		// running in the background even after we hit the red X.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 5. Initialize your JPanel variable as an object of the JPanel class
		panel = new JPanel();
		// 6. Initialize your JLabel variable as an object of the JLabel class
		label = new JLabel();
		// 7. Set the text of the JLabel to a lovely greeting.
		label.setText("Good morrow.");
		// 8. Add the JPanel object to the JFrame
		frame.add(panel);
		// 9. Add the JLabel object to the JPanel
		panel.add(label);
		// 10. Pack your JFrame.
		frame.pack();
		// 11. Run your program again. Do you see your message?
		//yes
		// 12. Use the loadImage method to set the icon of the JLabel object.
		label.setIcon(loadImage("java.png"));
		// 13. Re-pack the JFrame object.
		frame.pack();
		// 14. Run your program again. Do you see the image?
		// yes
		// 15. Initialize your first JButton variable as an object of the JButton class
		button1 = new JButton();
		// 16. Add the JButton object to the JPanel
		panel.add(button1);
		// 17. Pack your JFrame
		frame.pack();
		// 18. Add an action listener to the button
		button1.addActionListener(this);
		// 19. Set the text of your button to "Click Me"
		button1.setText("Clicketh me!");
		// 20. Pack your JFrame
		frame.pack();
		// 21. Add a second JButton and action listener to the button
		button2 = new JButton();
		panel.add(button2);
		button2.addActionListener(this);
		button2.setText("Nein, clicketh me!");
		frame.pack();
		
		// 22. Set the text of your button to "No, Click Me"

		// 23. Uncomment the 2 lines below (Ignore what they do for now)
		 button1.setFocusable(false);
		 button2.setFocusable(false);

		// 29. Add a key listener to the frame
		 
frame.addKeyListener(this);
	}

	public ImageIcon loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		return new ImageIcon(imageURL);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 24. Uncomment the 2 lines below
		 JButton buttonClicked = (JButton)e.getSource();
		
		 //System.out.println(buttonClicked.getText());

		// 25. Check which button was clicked
		// 26. If the "Click Me" button was clicked, use JOptionPane pop-up to say "Good
		// Choice"
if(buttonClicked.getText() == "Clicketh me!" && count1<2) {
	JOptionPane.showMessageDialog(null, "A wise choice.");
	count1 ++;
}else if(buttonClicked.getText() == "Clicketh me!" && count1==2) {
	JOptionPane.showMessageDialog(null, "You have proven your loyalty. So you can stop clicking.");
	button1.setText("You are proven.");
	count1 ++;
}else if(buttonClicked.getText() == "Clicketh me!" && count1>=3) {
	JOptionPane.showMessageDialog(null, "Stop.");
	button1.setText("Stop.");
}
		// 27. If the "No, Click Me button" was clicked, say "A Better Choice"
if(buttonClicked.getText() == "Nein, clicketh me!" && count2<2) {
	JOptionPane.showMessageDialog(null, "A wiser choice.");
	count2 ++;
}else if(buttonClicked.getText() == "Nein, clicketh me!" && count2==2) {
	JOptionPane.showMessageDialog(null, "Thank you for your commitment. But you can stop clicking.");
	button2.setText("Thank you.");
	count2 ++;
}else if(buttonClicked.getText() == "Nein, clicketh me!" && count2>=3) {
	JOptionPane.showMessageDialog(null, "Halt.");
	button2.setText("Halt.");
}
		// 28. If the "Click Me" button is clicked 3 times, change the text of the button
		// to say "Stop Clicking Me"

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// 30. Save the key typed by the user to a variable
		// HINT: Look at the methods that KeyEvent e has
String key = KeyEvent.getKeyText(6);
		// 31. Use JOptionPane pop-up to tell the user which key they typed
JOptionPane.showMessageDialog(null, key);
	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}