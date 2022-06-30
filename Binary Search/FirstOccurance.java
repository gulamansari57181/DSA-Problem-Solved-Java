
/* To Find First occurance of an element in  sorted array */

import java.util.*;

public class FirstOccurance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of sorted array ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter element  of sorted array ");

        for (int i = 0; i < size; i++) {

            array[i] = sc.nextInt();

        }
        System.out.println("Enter key element to search");
        int key = sc.nextInt();
        int low = 0;
        int high = size - 1;

        int ans = BinarySearch(array, key, low, high);
        System.out.println("Element is found at location :" + ans);

    }

    // Recursive logic for Binary Search to find first occurance of an element

    public static int BinarySearch(int[] array, int key, int low, int high) {

        int location = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == key) {
                location = mid + 1;
                // This line of code is the main link logic think out loud.
                high = mid - 1;
            }

            else if (array[mid] > key) {
                high = mid - 1;

            }

            else if (array[mid] < key) {
                low = mid + 1;
            }
        }
        return location;

    }

}
