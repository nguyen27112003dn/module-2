package ss4_OOP;

import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public String display() {
        return "Width: " + width + "; " + "Height: " + height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = sc.nextDouble();
        System.out.print("Enter the height: ");
        double height = sc.nextDouble();
        Rectangle r = new Rectangle(width, height);
        System.out.println(r.display());
        System.out.println("Perimeter of the Rectangle: " + r.getPerimeter());
        System.out.println("Area of the Rectangle: " + r.getArea());
    }
}

