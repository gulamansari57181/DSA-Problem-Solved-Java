/*  Program to find peak element in mountain array 
arr=[1,2,5,9,6,2,1]     here the peak element is 9 which is present at location 3*/

import java.util.*;

class PeakInMountain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of sorted array ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter element of mountain array :");
        for (int i = 0; i < size; i++) {

            array[i] = sc.nextInt();

        }

        // Call to find peak element in mountain array
        int peak = peakIndexInMountainArray(array);
        System.out.println("Peak element is present at index :" + peak);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        if (low == high) {
            return arr[low];
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // We are in decreasing part of the array array
                // so mid can be our potential answer therefore we are not considering
                // high=mid-1;

                high = mid;

            } else {
                low = mid + 1;
            }

        }
        return low; // high because both will point to peak element only when loop breaks

    }
}