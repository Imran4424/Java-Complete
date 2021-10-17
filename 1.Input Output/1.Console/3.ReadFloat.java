import java.util.Scanner;

class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter an Float number");
		float number = scan.nextFloat();
		System.out.println("Entred Float number is " + number);

		System.out.println("\nEnter an Float number");
		number = scan.nextFloat();
		System.out.println("Entred Float number is " + number);
	}
}