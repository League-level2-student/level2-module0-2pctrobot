/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.jointheleague.graphical.robot.Robot;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	JButton button00;
	JButton button01;
	JButton button02;
	JButton button03;
	JButton button04;
	JButton button05;
	JButton button06;
	JButton button07;
	JButton button08;
	JButton button09;
	JButton button10;
	JButton button11;
	JButton button12;
	JButton button13;
	JButton button14;
	JButton button15;
	JButton button16;
	JButton button17;
	JButton button18;
	JButton button19;
	JButton button20;
	JButton button21;
	JButton button22;
	JButton button23;
	JButton button24;
	int helper;
	Random rand = new Random();
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] pushthe = { button00,button01,button02,button03,button04,button05,button06,button07,button08,button09,button10,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,button23,button24 };
	//2 create an int variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		String diffLevel = JOptionPane.showInputDialog("Enter a positive number with a max of 25.");
		int numOfButtons = Integer.parseInt(diffLevel);
		if (numOfButtons <= 0) {
			JOptionPane.showMessageDialog(null,"Yeah no, I'm not doing that.");
			System.exit(0);
		} else if (numOfButtons >= 26) {
			JOptionPane.showMessageDialog(null,"Yeah no, I'm not doing that.");
			System.exit(0);
		}
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		
		//5. Make a for loop to iterate through the JButton array
		for (int i = 0; i < numOfButtons; i++) {
			pushthe[i] = new JButton();
			pushthe[i].addActionListener(this);
			pushthe[i].setText(String.valueOf(i));
			panel.add(pushthe[i]);
		}
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		
		//9 add the panel to the window
		window.add(panel);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setSize(50*numOfButtons, 110);
		//11. set the JFrame to visible.
		window.setVisible(true);
		//12. Give the user the instructions for the game.
		
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		
		int hiddenButton = rand.nextInt(numOfButtons);
		
		//14. Set the text of the JButton located at hiddenButton to  "ME"
		pushthe[hiddenButton].setText("ME");
		//15. Use Thread.sleep(1000); to pause the program.
		//    Surround it with a try/catch - use Eclipse helper for this
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//16. Set the text of the JButton located at hiddenButton to be blank.
		pushthe[hiddenButton].setText(String.valueOf(hiddenButton));
		helper = hiddenButton;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(buttonClicked.getText().equals(String.valueOf(helper))) {
			JOptionPane.showMessageDialog(null, "Correct!");
			System.exit(0);		
		}else {
			JOptionPane.showMessageDialog(null, "Incorrect!");
			System.exit(0);
		}
		//18. else tell them to try again
	}
}
