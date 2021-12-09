package ss6_inheritance_java.bai_tap;

import java.util.Scanner;

public class testCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0,"green");
        System.out.println(circle);
        circle.setRadius(5.0);
        System.out.println(circle.getRadius());
        circle.setColor("yellow");
        System.out.println(circle.getColor());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

    }
}
