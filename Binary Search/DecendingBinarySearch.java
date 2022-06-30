
/*  Element are sorted in reverse or we can say in decending order. Here we have to find our key element*/
import java.util.*;

public class DecendingBinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of sorted array ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elemnt of decending sorted array.");
        for (int i = 0; i < size; i++) {

            array[i] = sc.nextInt();

        }
        System.out.println("Enter key element to search");
        int key = sc.nextInt();
        int flag = 0;
        int low = 0;
        int mid = 0;
        int high = size - 1;

        // Binary search to find element in rdecending sorted array.

        while (low <= high) {
            // To Tackle integer overflow problem

            mid = low + (high - low) / 2;
            if (array[mid] == key) {
                flag = 1;
                break;
            }

            else if (array[mid] > key)
                low = mid + 1;
            else
                high = mid - 1;

        }
        if (flag == 1) {
            System.out.println("Element is found at : " + (mid + 1) + " Position.");
        } else {
            System.out.println("Element is not present");
        }

    }
}
