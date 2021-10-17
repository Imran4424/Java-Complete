import java.util.Scanner;

class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter an Double number");
		double number = scan.nextDouble();
		System.out.println("Entred Double number is " + number);

		System.out.println("\nEnter an Double number");
		number = scan.nextDouble();
		System.out.println("Entred Double number is " + number);
	}
}