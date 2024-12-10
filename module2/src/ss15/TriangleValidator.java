package ss15;

import java.util.Scanner;

public class TriangleValidator {
    public void side(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Cạnh của tam giác không được âm hoặc bằng 0");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Tổng 2 cạnh bất kỳ phải lớn hơn cạnh còn lại");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TriangleValidator t = new TriangleValidator();
        try {
            System.out.print("Enter a: ");
            double a = sc.nextDouble();
            System.out.print("Enter b: ");
            double b = sc.nextDouble();
            System.out.print("Enter c: ");
            double c = sc.nextDouble();
            t.side(a, b, c);
            System.out.println("Đây là một tam giác hợp lệ!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Không hợp lệ. Vui lòng nhập lại: " + e.getMessage());
        }
    }
}
