package ss2;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while (n < 2) {
            System.out.print("Nhap so: ");
            n = sc.nextInt();
            if (n < 2) {
                System.out.println("Phai la so nguyen duong (>=2). Vui long nhap lai");
            } else {
                int i = 2;
                boolean check = true;
                while (i <= Math.sqrt(n)) {
                    if (n % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check)
                    System.out.println(n + " la so nguyen to");
                else
                    System.out.println(n + " khong phai la so nguyen to");
            }
        }
        sc.close();
    }
}
