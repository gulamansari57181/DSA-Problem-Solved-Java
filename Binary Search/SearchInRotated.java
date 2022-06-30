
import java.util.*;

class SearchInRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of  rotated  sorted array ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter element  of rortated  sorted array ");

        for (int i = 0; i < size; i++) {

            array[i] = sc.nextInt();

        }
        System.out.println("Enter element to search");
        int target = sc.nextInt();

        int partition = findMin(array);
        // System.out.println(partition);

        int left = BinarySearch(array, 0, partition - 1, target);
        // System.out.println(left);

        int right = BinarySearch(array, partition, array.length - 1, target);
        // System.out.println(right);

        if (left == right) {

            // Element is is not present in array of both returns -1

            System.out.println(left);
        } else {
            if (left == -1) {

                // Element is not present in left part of partition
                System.out.println(right + 1);

            } else {

                System.out.println(left + 1);

            }

        }
        sc.close();

    }

    // Finding minimum in rotated sorted array
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        if (nums[low] <= nums[high]) {

            // Array is not rotatated at all thus min is present ar first location.
            return low;
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[mid + 1]) {

                // if mid is last element of first part the just next value is minimum

                return mid + 1;

            } else if (nums[mid] < nums[mid - 1]) {

                // if mid's value is less than left index value then it is first element of
                // unsorted array which is our desired answer.

                return mid;
            } else if (nums[low] <= nums[mid]) {

                // Element always present in unsorted array so discarding sorted part.
                low = mid + 1;
            } else if (nums[mid] <= nums[high]) {
                // Element always present in unsorted array so discarding sorted part.

                high = mid - 1;
            }

        }
        return -1;

    }

    // Binary Search Implementation

    public static int BinarySearch(int[] nums, int low, int high, int target) {

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            else if (target < nums[mid]) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }
        return -1;

    }

}
