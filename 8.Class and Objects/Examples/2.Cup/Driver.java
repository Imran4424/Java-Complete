
class Driver {
	public static void main(String[] args) {
		Cup obj = new Cup(32, "Soda");

		System.out.println(obj.getSize());
		System.out.println(obj.getContent());


		Cup objTwo = new  Cup(30, "Soda");

		System.out.print(objTwo.getSize());
		System.out.print(objTwo.getContent());
	}
}