
// Java program for implementation of Selection Sort

import java.util.*;

class SelectionSort {
    void sort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Prints the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter element of an array");
        for (int index = 0; index < array.length; index++) {

            array[index] = sc.nextInt();

        }
        ob.sort(array);
        System.out.println("Sorted array");
        ob.printArray(array);
    }
}
