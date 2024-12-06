package ss1;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        float width = sc.nextFloat();
        System.out.print("Enter the height of the rectangle: ");
        float height = sc.nextFloat();
        float area = width * height;
        System.out.println("The area of the rectangle is " + area);
    }
}
