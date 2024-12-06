package ss1;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nam: ");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Nam " + year + " la nam nhuan");
        } else {
            System.out.println("Nam " + year + " khong phai la nam nhuan");
        }
    }
}
