

public class Driver {
        public static void main(String[] args) {

                // converting int to char
                int number = 67;

                // converting int to char
                char ch = (char) number;

                // Here, for 67, C will be print as character
                // Cause 67 is the decimal ASCII value of C
                System.out.println("Int " + number + " converted to character " + ch);

                // converting char to int
                ch = 'I';

                // converting char to int
                number = (int) ch;

                // Here, for C, 73 will be printed as int
                // Cause 73 is the decimal ASCII value of I
                System.out.println("Character " + ch + " converted to int " + number);
        }
}


/*
* This code demonstrate conversion between int to char
* */