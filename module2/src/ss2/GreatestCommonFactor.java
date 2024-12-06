package ss2;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        a = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("UCLN: " + a);
    }
}
