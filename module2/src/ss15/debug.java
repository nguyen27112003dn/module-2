package ss15;

import java.util.Scanner;

public class debug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem!!!");
            } else {
                System.out.println("Phuong trinh vo nghiem!!!");
            }
        } else {
            double X = -b / a;
            System.out.println("Nghiem cua phuong trinh la: " + X);
        }
    }
}
