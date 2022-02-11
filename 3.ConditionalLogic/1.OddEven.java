
import java.util.Scanner;

public class Driver {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int number;

                // taking input from console
                System.out.println("Enter an integer number");
                number = scan.nextInt();

                if (number % 2 == 0) {
                        System.out.println("Number is Even");
                } else {
                        System.out.println("Number is Odd");
                }

        }
}


/*
* This code determines if a number is Odd or even
* */