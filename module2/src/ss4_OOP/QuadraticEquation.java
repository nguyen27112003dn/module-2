package ss4_OOP;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - (4 * a * c);
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot3() {
        return -b / (2 * a);
    }

    public double getRoot4() {
        return -c / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        QuadraticEquation q = new QuadraticEquation(a, b, c);
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                System.out.println("Phuong trinh co mot nghiem (phuong trinh bac nhat): " + q.getRoot4());
            }
        } else {
            System.out.println("Delta: " + q.getDiscriminant());
            if (q.getDiscriminant() > 0) {
                System.out.println("Phuong trinh co 2 nghiem phan biet: ");
                System.out.println("X1 = " + q.getRoot1());
                System.out.println("X2 = " + q.getRoot2());
            } else if (q.getDiscriminant() == 0) {
                System.out.println("Phuong trinh co nghiem kep: ");
                System.out.println("X = " + q.getRoot3());
            } else {
                System.out.println("Phuong trinh vo nghiem thuc");
            }
        }
    }
}
