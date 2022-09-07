package com.oyakovenko.assignment8.shape;

import java.awt.Color;

public class Circle extends Shape {
    private Point center;
    private double radius;
    private Color color;

    public Circle(Point center, double radius) {
        this(center, radius, DEFAULT_COLOR);
    }

    public Circle(Point center, double radius, Color color) {
        if (center != null && radius > 0 && color != null) {
            this.center = center;
            this.radius = radius;
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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
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
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                ", color=" + color +
                '}';
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName().toLowerCase();
    }
}
