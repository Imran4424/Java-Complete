
class Driver {
	public static void main(String[] args) {
		int a = 100;
		int b = 0;
		int result;

		try{
			System.out.println("Here, we are trying to divide 100 with 0");

			// this line of code will through exception
			result = a / b;

			System.out.println("this statement will never run");
		} catch(Exception e) {
			System.out.println(e);
			
			// resolving the exception
			result = a / (b + 4);
			System.out.println("Resolved result is - " + result);
		}

		System.out.println();
		System.out.println("this statement will run even after exception happen");
		System.out.println("rest of the code will run even after exception happen");
	}
}