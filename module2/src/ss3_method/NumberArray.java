package ss3_method;

import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong gia tri tai san: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri thu " + (i + 1) + ":  ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Cac gia tri tai san: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int max = arr[0];
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j + 1;
            }
        }
        System.out.println();
        System.out.println("Gia tri tai san lon nhat: " + max);
        System.out.println("Vi tri gia tri tai san lon nhat: " + index);
    }
}
