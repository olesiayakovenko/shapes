package com.oyakovenko.assignment8.shape;

import java.awt.Color;

public class Quad extends Shapes {
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private Color color;

    public Quad(Point a, Point b, Point c, Point d) {
        this(a, b, c, d, DEFAULT_COLOR);
    }

    public Quad(Point a, Point b, Point c, Point d, Color color) {
        if (a != null && b != null && c != null && d != null && color != null) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
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

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        if (d != null) {
            this.d = d;
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
        return "Quad{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", color=" + color +
                '}';
    }

    @Override
    public void printName() {
        System.out.println(this.getClass().getSimpleName().toLowerCase());
    }
}
