
import java.awt.*;
import java.awt.event.*;

public class Exam2Listener implements ActionListener {
	private MainWindow mainFrame;

	public Exam2Listener(MainWindow f) {
		mainFrame = f;
	}

	public void actionPerformed(ActionEvent e) {
		String chosenItem = ((MenuItem) e.getSource()).getLabel();
		if (chosenItem.equals("Pass")) {
			System.out.println("Hooray! You passed!");
		} else if (chosenItem.equals("Fail")) {
			System.out.println("Too Bad! You failed!");
		} else if ( chosenItem.equals("Quit")) {
			System.exit(0);
		}
	}
}