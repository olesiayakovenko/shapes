package com.oyakovenko.assignment8;

import com.oyakovenko.assignment8.printer.ShapePrinter;
import com.oyakovenko.assignment8.shape.*;

import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        Point c = new Point(2, 2);
        Point d = new Point(3, 3);

        double size = 5.0;

        try {
            shapes.add(new Circle(a, size, Color.RED));
            shapes.add(new Oval(a, size, size * 2.0));
            shapes.add(new Quad(a, b, c, d));
            shapes.add(new Square(a, size, Color.WHITE));
            shapes.add(new Triangle(a, b, c));
        } catch (IllegalArgumentException e) {
            System.err.println("Unacceptable value!");
        }

        for (Shape shape : shapes) {
            ShapePrinter.printShapeName(shape);
            System.out.println(shape + "\n");
        }
    }
}
