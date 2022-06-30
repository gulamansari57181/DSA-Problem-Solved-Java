
/* Implement binary search to find first and last occurance of an element in an sorted array */
import java.util.*;

class FirstAndLastOccurance {
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
        int[] answer = searchRange(array, key);
        System.out.println("First Ocuurance:" + answer[0]);
        System.out.println("Last Occurance :" + answer[1]);

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        // To find first occurance
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            // To find last occurance
            ans[1] = search(nums, target, false);

        }
        return ans;
    }

    // This function will reyurn first occurance and last occurance one after the
    // another
    public static int search(int[] nums, int target, boolean firstOccurance) {
        int ans = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target < nums[mid]) {

                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            }

            else {

                // Possible answer
                ans = mid;
                if (firstOccurance) {

                    // Potential answer of first occurance

                    high = mid - 1;
                } else {
                    // Potential answer of last occurance
                    low = mid + 1;
                }

            }

        }
        return ans;

    }

}
