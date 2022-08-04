package org.example.AreaCalc;

import org.example.Shapes;

public class Triangle implements Shapes {
    private double height, width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return (height*width)/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
