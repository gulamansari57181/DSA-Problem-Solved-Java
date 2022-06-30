
// Program to find first occurance of element in an array using recursion
import java.util.*;

public class FirstIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element of an array:");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element whose index is to be find: ");
        int x = sc.nextInt();
        int index = firstIndex(arr, 0, x);
        System.out.println("First occurance at index:" + (index + 1));
        sc.close();
    }

    public static int firstIndex(int[] arr, int idx, int x) {
        // Base case
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == x) {
            return idx;
        }
        return firstIndex(arr, idx + 1, x);

    }

}