
class Circle extends Shape {
	Circle(int color) {
		super(color);
	}

	void draw() {
		System.out.println("Circle is drawn by " + color + " colors");
	}
}