class Driver {
	public static void main(String[] args) {
		int programYear = 2015;

		// java print method will print any string
		System.out.print("I am a Programmer\n");
		
		// we can concate strings with '+' operator
		System.out.print("I love " + "programming\n");
		
		// we can also interpolate string with other data types just usign '+' operator
		System.out.print("I started programming at " + programYear + "\n");


		String farcy = "Farcry";
		String assassin = "Assassin's Creed";

		// this is the most used print statement in java
		// this method by default print a newline at the end
		System.out.println("I also love playing games");

		// we can also interpolate string with other data types just usign '+' operator
		System.out.println("My favourite Game franchises are " + farcy + " and " + assassin);
		
		// we can concate strings with '+' operator
		System.out.println("Creating games with programming " + "is my passion");

		int gameProgramYear = 2017;
		String ubisoft = "Ubisoft";

		// java printf method work like c printf method
		// this is least popular console output method for java
		// this method use format specifier for string interpolation with variables and constants
		System.out.printf("I started game programming in %d\n", gameProgramYear);
		System.out.printf("My favourite game industry is %s, I want to work there some day as a Programmer.\n", ubisoft);
	}
}