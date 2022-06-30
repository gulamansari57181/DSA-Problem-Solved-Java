// Maximum element in array using recursion

import java.util.*;

public class Maximum {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element of an array :");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        int max = maxOfArray(arr, 0);
        System.out.println("Maximum element is : " + max);
        sc.close();

    }

    public static int maxOfArray(int[] arr, int idx) {

        // Base case
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        // Maximum in samallest array misa , imagine tail recursion
        int misa = maxOfArray(arr, idx + 1);
        // Maximum between index and maximum in smallest array
        if (misa > arr[idx]) {
            return misa;
        }

        else {
            return arr[idx];

        }

    }
}