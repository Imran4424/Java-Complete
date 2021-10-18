import javax.swing.JOptionPane;

class Driver {
	public static void main(String[] args) {
		// this extra effort is to make the code not to fail
		double numOne = Double.valueOf(JOptionPane.showInputDialog("Enter first number: "));
		double numTwo = Double.valueOf(JOptionPane.showInputDialog("Enter second number: "));
		
		double result = numOne + numTwo;

		JOptionPane.showMessageDialog(null, "Sum is: " + result);
	}
}
