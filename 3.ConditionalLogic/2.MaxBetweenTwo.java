
import java.util.Scanner;

public class Driver {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int numOne, numTwo;

                // taking input from console
                System.out.println("Enter the first number");
                numOne = scan.nextInt();

                System.out.println("Enter the second number");
                numTwo = scan.nextInt();

                if (numOne > numTwo) {
                        System.out.println(numOne + " is Maximum");
                } else if (numOne < numTwo) {
                        System.out.println(numTwo + " is Maximum");
                } else {
                        System.out.println("Both are equal");
                }

        }
}


/*
* This code determines max between two
* */