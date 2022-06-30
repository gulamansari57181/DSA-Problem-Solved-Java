/*  Implementation of Bianary Search Algorithm */

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of sorted array ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {

            array[i] = sc.nextInt();

        }
        System.out.println("Enter key elemnt to search");
        int key = sc.nextInt();
        int flag = 0;
        int low = 0;
        int mid = 0;
        int high = size - 1;

        // Binary search logic start here

        while (low <= high) {
            // To Tackle integer overflow problem

            mid = low + (high - low) / 2;
            if (array[mid] == key) {
                flag = 1;
                break;
            }

            else if (array[mid] > key)
                high = mid - 1;
            else
                low = mid + 1;

        }
        if (flag == 1) {
            System.out.println("Element is found at :" + (mid + 1) + "th Position.");
        } else {
            System.out.println("Element is not present");
        }

    }
}
