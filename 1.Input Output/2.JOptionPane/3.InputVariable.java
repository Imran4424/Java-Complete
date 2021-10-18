import javax.swing.JOptionPane;

class Driver {
	public static void main(String[] args) {
		// this extra effort is to make the code not to fail
		double dNum = Double.valueOf(JOptionPane.showInputDialog("Enter an Integer number: "));
		int number = (int) dNum;

		JOptionPane.showMessageDialog(null, "Entered number's Integer part is: " + number);
	}
}
