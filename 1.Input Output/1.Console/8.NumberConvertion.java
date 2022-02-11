

public class Driver {
        public static void main(String[] args) {

                // converting int to fraction
                int number = 100;
                // float type casting
                float fractionFloatCast  = (float) number;

                System.out.println("Int " + number + " converted to float " + fractionFloatCast);

                // double type casting
                double fractionDoubleCast = (double) number;

                System.out.println("Int " + number + " converted to double " + fractionDoubleCast);

                // multiply to double
                double multiplyIntToDouble = number * 1.0;
                System.out.println("Int " + number + " converted to double " + multiplyIntToDouble);

                // converting fraction to int
                // this is float variable initialization
                // if we don't put f at the end it will show error as double
                float fractionFloat = 3.1416f;

                // type casting the float to int
                number = (int) fractionFloat;

                System.out.println("float " + fractionFloat + " converted to int " + number);

                // for double data types you don't have to put anything
                // after entering the fraction number
                double fractionDouble = 3.1416;

                // type casting double to int
                number = (int) fractionDouble;

                System.out.println("double " + fractionDouble + " converted to int " + number);
        }
}


/*
* This code demonstrate int to float conversion
* */