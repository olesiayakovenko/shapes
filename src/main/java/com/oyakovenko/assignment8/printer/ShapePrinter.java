package com.oyakovenko.assignment8.printer;

import com.oyakovenko.assignment8.shape.Shapes;

public class ShapePrinter {
    public static void printShapeName(Shapes shape) {
        System.out.print("Shape name is ");
        shape.printName();
    }
}
