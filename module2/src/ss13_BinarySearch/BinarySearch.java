package ss13_BinarySearch;

public class BinarySearch {
    static int[] list = {1, 2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (list[mid] > key) {
                high = mid - 1;
            } else if (list[mid] == key) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 79));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 80));
    }
}
