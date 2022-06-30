import java.util.*;

class MinElementRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of  rotated  sorted array ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter element  of rortated  sorted array ");

        for (int i = 0; i < size; i++) {

            array[i] = sc.nextInt();

        }

        int ans = findMin(array);
        System.out.println("Minimum element in an array is :" + ans);

    }

    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        if (nums[low] <= nums[high]) {
            System.out.println("Number of time arrasy is rotaed : 0");
            // Array is not rotatated at all thus min is present ar first location.
            return nums[0];
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[mid + 1]) {

                // if mid is last element of first part the just next value is minimum
                System.out.println("Number of time array is rotated :" + (mid + 1));
                return nums[mid + 1];

            } else if (nums[mid] < nums[mid - 1]) {

                // if mid's value is less than left index value then it is first element of
                // unsorted array which is our desired answer.
                System.out.println("Number of time array is rotated :" + (mid + 1));
                return nums[mid];
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
}