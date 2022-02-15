package com.company;

// class
public class Box {
        // class members
        // everyone inside the class is a class member

        // member variables
        // private is class member access specifier
        private int length;
        private int width;
        private int height;

        // constructor
        // special type of member method
        // constructor have no return type
        // constructor have no access specifier
        // constructor calls when object is created
        Box(int length, int width, int height) {
                this.length = length;
                this.width = width;
                this.height = height;
        }

        // member methods
        // setter for private variable
        // cause private variables can't be accessed directly from outside
        public void setLength(int length) {
                this.length = length;
        }

        // member methods
        // getter for private variable
        // cause private variables can't be accessed directly from outside
        public int getLength() {
                return length;
        }

        // member methods
        // setter for private variable
        // cause private variables can't be accessed directly from outside
        public void setWidth(int width) {
                this.width = width;
        }

        // member methods
        // getter for private variable
        // cause private variables can't be accessed directly from outside
        public int getWidth() {
                return width;
        }

        // member methods
        // setter for private variable
        // cause private variables can't be accessed directly from outside
        public void setHeight(int height) {
                this.height = height;
        }

        // member methods
        // getter for private variable
        // cause private variables can't be accessed directly from outside
        public int getHeight() {
                return height;
        }

        // member methods
        public int Area() {
                return  length * width;
        }

        // member methods
        public int Volume() {
                return length * width * height;
        }

        // member methods
        public void displayProperties() {
                System.out.println("length " + length);
                System.out.println("width " + width);
                System.out.println("height " + height);
                System.out.println("Area " + Area());
                System.out.println("Volume " + Volume());
        }
}
