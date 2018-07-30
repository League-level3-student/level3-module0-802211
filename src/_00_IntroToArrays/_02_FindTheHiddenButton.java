package _00_IntroToArrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] jb;
	//2 create an integer variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		String s = JOptionPane.showInputDialog("Type a positive number");
		int St = Integer.parseInt(s);
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		jb = new JButton[St];
		JPanel p = new JPanel();
		//5. Make a for loop to iterate through the JButton array

		for(int i = 0; i < jb.length; i++) {
		
			jb[i] = new JButton();
			jb[i].addActionListener(this);
			p.add(jb[i]);
		
		}
		
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		
		//9 add the panel to the window
		JFrame f = new JFrame();
		f.add(p);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		f.setExtendedState(f.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		f.setVisible(true);
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "Try to click on random buttons and find the one that is 'hidden' ");
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		int hiddenButton = new Random().nextInt(St);
		//14. Set the text of the JButton located at hiddenButton to read "ME"
			jb[hiddenButton].setText("ME");
		//15. Use Thread.sleep(100); to pause the program.
		//Thread.sleep(100);
		//16. Set the text of the JButton located at hiddenButton to be blank.
			jb[hiddenButton].setText(" ");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
			if(buttonClicked == jb[hiddenButton]) {
				JOptionPane.showMessageDialog(null, "YoU wIn!¡!");
			}
		//18. else tell them to try again
			else {
				JOptionPane.showMessageDialog(null, "Try Again :(");
			}
	}
}
