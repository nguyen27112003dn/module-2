package ss2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = -1;
        int month = 0;
        double interestRate = -1;
        double totalInterest = 0;
        DecimalFormat df = new DecimalFormat("#");
        while (money < 0) {
            System.out.print("Nhap so tien gui: ");
            money = sc.nextDouble();
            if (money < 0) {
                System.out.println("So tien khong hop le. Vui long nhap lai");
            }
        }
        while (month < 1) {
            System.out.print("Nhap so thang gui: ");
            month = sc.nextInt();

            if (month < 1) {
                System.out.println("So thang khong hop le. Vui long nhap lai (tu 1 den 12).");
            }
        }
        while (interestRate < 0) {
            System.out.print("Nhap lai suat (%): ");
            interestRate = sc.nextDouble();
            if (interestRate < 0) {
                System.out.println("Lai suat khong hop le. Vui long nhap lai.");
            }
        }
        System.out.println("So tien gui: " + df.format(money));
        System.out.println("So thang gui: " + month);
        System.out.println("Nhap lai suat: " + interestRate);
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Lai suat: " + df.format(totalInterest));
    }
}
