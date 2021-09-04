package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Shape shape = new Shape(100, new Point[]{ new Point(), new Point(), new Point()});

        System.out.println(shape);

        BoundaryBox boundary = new BoundaryBox(shape);

        System.out.println(boundary);

        boundary.getShape().setColor(101);

        System.out.println(shape);

    }
}
