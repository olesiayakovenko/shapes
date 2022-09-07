package com.oyakovenko.assignment8.shape;

import java.awt.Color;

public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Color color;

    public Triangle(Point a, Point b, Point c) {
        this(a, b, c, DEFAULT_COLOR);
    }

    public Triangle(Point a, Point b, Point c, Color color) {
        if (a != null && b != null && c != null && color != null) {
            this.a = a;
            this.b = b;
            this.c = c;
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

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        if (b != null) {
            this.b = b;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        if (c != null) {
            this.c = c;
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
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", color=" + color +
                '}';
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName().toLowerCase();
    }
}
