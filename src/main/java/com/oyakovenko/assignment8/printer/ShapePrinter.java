package com.oyakovenko.assignment8.printer;

import com.oyakovenko.assignment8.shape.Shape;

public class ShapePrinter {
    public static void printShapeName(Shape shape) {
        System.out.print("Shape name is ");
        shape.printName();
    }
}
