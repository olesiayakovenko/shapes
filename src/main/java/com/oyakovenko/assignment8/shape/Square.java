package com.oyakovenko.assignment8.shape;

import java.awt.Color;

public class Square extends Shapes {
    private Point a;
    private double size;
    private Color color;

    public Square(Point a, double size) {
        this(a, size, DEFAULT_COLOR);
    }

    public Square(Point a, double size, Color color) {
        if (a != null && size > 0 && color != null) {
            this.a = a;
            this.size = size;
            this.color = color;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        if (a != null) {
            this.a = a;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size > 0) {
            this.size = size;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color != null) {
            this.color = color;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", size=" + size +
                ", color=" + color +
                '}';
    }

    @Override
    public void printName() {
        System.out.println(this.getClass().getSimpleName().toLowerCase());
    }
}
