import javax.swing.JOptionPane;

class Driver {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Here, we will collecting your personal information");

		String name = JOptionPane.showInputDialog("Enter your name: ");

		String sex;
		int input = JOptionPane.showConfirmDialog(null, "Are you male?");

		if (0 == input) {
			sex = "Male";
		} else if (1 == input) {
			sex = "Female";
		} else {
			sex = "N/A";
		}


		// this extra effort is to make the code not to fail
		double dNum = Double.valueOf(JOptionPane.showInputDialog("Enter your age: "));
		int age = (int) dNum;

		String personDetails = "Name: " + name + "\n" +
				       "Age: " + age + "\n" +
				       "Sex: " + sex;

		JOptionPane.showMessageDialog(null, "Person Details - \n" + personDetails);
	}
}
