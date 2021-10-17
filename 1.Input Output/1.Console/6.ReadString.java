import java.util.Scanner;

class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a String");
		// this will take input until it found any space
		String word = scan.next();
		System.out.println("Entred first word is: " + word);

		// this nextLine() is for escaping the new line character error
		scan.nextLine();

		System.out.println("\nEnter a String");
		// this will take input until it found new line
		// this can take space character as input
		String text = scan.nextLine();
		System.out.println("Entred String is: " + text);
	}
}