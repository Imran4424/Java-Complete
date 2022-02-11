

public class Driver {
        public static void main(String[] args) {

                for (int i = 0; i < 16; i++) {
                        for (int j = 0; j < 16; j++) {
                                int value = 16 * j + i;
                                // 4 is defining variable output space
                                System.out.printf("%4d    %4c    ", value, value);
                        }
                        System.out.println();
                }
        }
}


/*
* This code generates 8 bit ASCCI Table
* In a grid 16 * 16
* */