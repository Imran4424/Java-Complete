import java.util.Scanner;

class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter an Integer number");
		int number = scan.nextInt();
		System.out.println("Entred Integer number is: " + number);

		System.out.println("\nEnter an Integer number");
		number = scan.nextInt();
		System.out.println("Entred Integer number is: " + number);
	}
}