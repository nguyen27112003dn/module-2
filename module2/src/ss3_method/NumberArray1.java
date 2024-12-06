package ss3_method;

public class NumberArray1 {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = minValue(arr);
        System.out.println("Gia tri nho nhat trong mang: " + min);
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
