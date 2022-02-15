package com.company;

public class Main {

    public static void main(String[] args) {
        // declaring Box type object
        Box myBox = new Box(2, 2 ,2);
        // calling public methods from box
        myBox.displayProperties();

        // this is just for a new line
        System.out.println();

        // setting Box's private property through public methods
        myBox.setLength(10);
        myBox.displayProperties();

        // this is just for a new line
        System.out.println();

        // setting Box's private property through public methods
        myBox.setHeight(5);

        // printing Box's private properties by using getter methods
        System.out.println("Box height is " + myBox.getHeight());
        System.out.println("Box Area is " + myBox.Area());
        System.out.println("Box Volume is " + myBox.Volume());
    }
}

