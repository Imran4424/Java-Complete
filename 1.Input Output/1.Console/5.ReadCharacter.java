import java.util.Scanner;

class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a character");
		char inputChar = scan.next().charAt(0);
		System.out.println("Entred character is: " + inputChar);

		System.out.println("\nEnter a character");
		inputChar = scan.next().charAt(0);
		System.out.println("Entred character is: " + inputChar);
	}
}