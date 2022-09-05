package com.oyakovenko.assignment8.shape;

import java.awt.Color;

public class Oval extends Shapes {
    private Point center;
    private double width;
    private double height;
    private Color color;

    public Oval(Point center, double width, double height) {
        this(center, width, height, DEFAULT_COLOR);
    }

    public Oval(Point center, double width, double height, Color color) {
        if (center != null && width > 0 && height > 0 && color != null) {
            this.center = center;
            this.width = width;
            this.height = height;
            this.color = color;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        if (center != null) {
            this.center = center;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
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
        return "Oval{" +
                "center=" + center +
                ", width=" + width +
                ", height=" + height +
                ", color=" + color +
                '}';
    }

    @Override
    public void printName() {
        System.out.println(this.getClass().getSimpleName().toLowerCase());
    }
}
