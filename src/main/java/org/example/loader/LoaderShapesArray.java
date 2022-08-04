package org.example.loader;

import org.example.AreaCalc.*;
import org.example.Shapes;

public class LoaderShapesArray {

    public static void calcAreas() {
        Square square1 = new Square(10, 10);
        Square square2 = new Square(3,18);
        Triangle triangle1 = new Triangle(5, 4);
        Circle circle1 = new Circle(2);
        Cylinder cylinder1 = new Cylinder(4.5, 7);
        Sphere sphere1 = new Sphere(7.32);

        Shapes[] shapes = {square1, square2, triangle1, circle1, cylinder1, sphere1};

        for (Shapes i : shapes) {
            System.out.println(i.toString() + " area is " + i.getArea());
        }
    }
}
