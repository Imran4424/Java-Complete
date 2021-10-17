
class Driver {
	public static void main(String[] args) {
		try{
			System.out.println("Here, we are trying to divide 100 with 0");

			// this line of code will through exception
			int result = 100/0;

			System.out.println("this statement will never run");
		} catch(ArithmeticException e) {
			System.out.println(e);
		}

		System.out.println();
		System.out.println("this statement will run even after exception happen");
		System.out.println("rest of the code will run even after exception happen");
	}
}