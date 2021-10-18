import javax.swing.JOptionPane;

class Driver {
	public static void main(String[] args) {
		int stringCount = 0;
		boolean status = true;
		String message = "Enter a string\n" +
				 "You can enter STOP to end the sesstion\n";

		while(status) {
			String inputString = JOptionPane.showInputDialog(message);

			if (inputString.equalsIgnoreCase("stop")) {
				status = false;
			} else if (!inputString.isEmpty()) {
				stringCount++;
			}
		}


		JOptionPane.showMessageDialog(null, "Total number of strings: " + stringCount);
	}
}
