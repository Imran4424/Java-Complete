
class Driver {
	public static void main(String[] args) {
		int a = 100;
		int b = 0;
		int result;

		try{
			System.out.println("Here, we are trying to divide 100 with 0");

			// this line of code will throw exception
			result = a / b;

			System.out.println("this statement will never run");

		// catching a different exception will also cause code run fail	
		} catch(ArrayStoreException e) {
			System.out.println(e);
		}

		// rest of the code will never run
		System.out.println();
		System.out.println("this statement will run even after exception happen");
		System.out.println("rest of the code will run even after exception happen");
	}
}