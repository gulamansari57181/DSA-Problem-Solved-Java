
/* To serach an element in sorted array, but we don't know the order in which the element is sorted i.e. Ascending or decending */
import java.util.*;

public class UnknownBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of sorted array ");
        int size = sc.nextInt();
        int[] array = new int[size];
        int i = 0;
        System.out.println("Enter element  of sorted array ");
        for (i = 0; i < size; i++) {

            array[i] = sc.nextInt();

        }
        System.out.println("Enter key element to search");
        int key = sc.nextInt();
        int location = -1;

        if (array[0] > array[1]) {
            location = DecendingBinarySearch(array, key, 0, size - 1);

        } else {
            location = AscendingBinarySearch(array, key, 0, size - 1);

        }

        System.out.println("Element is found at location :" + location);

    }

    // Ascending Binary Search
    public static int AscendingBinarySearch(int[] array, int key, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == key) {
                return mid + 1;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return -1;

    }

    // Desending Binary Search
    public static int DecendingBinarySearch(int[] array, int key, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == key) {
                return mid + 1;
            } else if (array[mid] > key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;

    }

}
