import java.util.*;

public class BinarySearchRecursion {

    // Recursive logic foe Binary Search

    public static int BinarySearch(int[] array, int key, int low, int high) {

        int mid = low + (high - low) / 2;
        if (array[mid] == key) {
            return mid + 1;
        }

        else if (array[mid] > key) {
            return BinarySearch(array, key, low, mid - 1);

        }

        else if (array[mid] < key) {
            return BinarySearch(array, key, mid + 1, high);
        }

        else {
            return -1;
        }

    }

}
