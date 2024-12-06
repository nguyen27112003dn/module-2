package ss3_method;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 20;
        int[] arr = new int[max];
        int n = 0;
        while (n < 1 || n > max) {
            System.out.print("Nhap so luong phan tu cua mang: ");
            n = sc.nextInt();
            if (n < 1 || n > max) {
                System.out.println("So luong khong hop le. Vui long nhap lai");
            }
        }
        System.out.println("Nhap phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("*** Mang vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("*** Mang dao nguoc cua cac phan tu la: ");
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
