
class Driver {
	public static void main(String[] args) {
		Pen obj = new Pen(5.00f, "black");

		System.out.println(obj.getPrice());
		System.out.println(obj.getColor());


		Pen objTwo = new Pen(-5.00f, "invalid");

		System.out.print(objTwo.getPrice());
		System.out.print(objTwo.getColor());
	}
}