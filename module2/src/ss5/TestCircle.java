package ss5;

import java.util.Scanner;

public class TestCircle {
    double radius;
    String color;

    public TestCircle() {
    }

    public TestCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        TestCircle testCircle = new TestCircle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        testCircle.setRadius(sc.nextDouble());
        System.out.print("Enter the color of the circle: ");
        testCircle.setColor(sc.next());
        System.out.println("Area of the circle: " + testCircle.getArea() + ", Color of the circle: " + testCircle.getColor());
    }
}
