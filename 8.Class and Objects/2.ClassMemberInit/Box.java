package com.company;

/*
* class member initialization can be done in 3 ways
* 1. using constructor
* 2. class in place default init (while declaring them)
* 3. There is an if here, if class has some public properties  we can set from outside by directly accessing them
* */
public class Box {
        // case 1
        // in place default init
        private int length = 0;
        private int width = 0;
        private int height = 0;

        // default constructor
        Box() { }

        // constructor
        // special type of member method
        // constructor have no return type
        // constructor have no access specifier
        // constructor calls when object is created
        // case 2
        // using constructor
        Box(int length, int width, int height) {
                this.length = length;
                this.width = width;
                this.height = height;
        }

        public void setLength(int length) {
                this.length = length;
        }


        public int getLength() {
                return length;
        }

        public void setWidth(int width) {
                this.width = width;
        }

        public int getWidth() {
                return width;
        }

        public void setHeight(int height) {
                this.height = height;
        }

        public int getHeight() {
                return height;
        }

        public int Area() {
                return  length * width;
        }

        public int Volume() {
                return length * width * height;
        }

        public void displayProperties() {
                System.out.println("length " + length);
                System.out.println("width " + width);
                System.out.println("height " + height);
                System.out.println("Area " + Area());
                System.out.println("Volume " + Volume());
        }
}
