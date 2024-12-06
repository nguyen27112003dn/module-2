package ss6_shape;

import java.util.Arrays;
import java.util.Comparator;


public class Test {
    public static void main(String[] args) {
//        Test Shape
//        Shape shape = new Shape();
//        System.out.println(shape);
//        shape = new Shape("red", false);
//        System.out.println(shape);

//        Test Circle
//        Circle circle = new Circle();
//        System.out.println(circle);
//        circle = new Circle(3.5);
//        System.out.println(circle);
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);

//        Test Rectangle
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);

//        Test Square
//        Square square = new Square();
//        System.out.println(square);
//        square = new Square(2.3);
//        System.out.println(square);
//        square = new Square(5.8, "yellow", true);
//        System.out.println(square);

//        Comparable
//        ComparableCircle[] circles = new ComparableCircle[3];
//        circles[0] = new ComparableCircle(3.6);
//        circles[1] = new ComparableCircle();
//        circles[2] = new ComparableCircle(3.5, "indigo", false);
//        System.out.println("Pre-sorted:");
//        for (ComparableCircle circle : circles) {
//            System.out.println(circle);
//        }
//        Arrays.sort(circles);
//        System.out.println("After-sorted:");
//        for (ComparableCircle circle : circles) {
//            System.out.println(circle);
//        }

//        Comparator
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);
        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
