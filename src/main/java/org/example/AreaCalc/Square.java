package org.example.AreaCalc;

import org.example.Shapes;

public class Square implements Shapes {
    private double height, width;

    public Square(double height, double width) {
        this.height = height;
        this.width = width;
    }


    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
