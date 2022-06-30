import java.util.*;

public class CyclicSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter element of an array in the range 1 to N");
        for (int index = 0; index < array.length; index++) {

            array[index] = sc.nextInt();

        }
        // Sorting
        int i = 0;
        while (i < array.length) {
            int correctIndex = array[i] - 1;
            if (array[i] != array[correctIndex]) {
                // Swap these two values
                int temp = array[i];
                array[i] = array[correctIndex];
                array[correctIndex] = temp;

            } else {
                i++;
            }
        }
        // Printing sorted array
        for (int index = 0; index < array.length; index++) {

            System.out.print(array[index] + " ");

        }

    }
}
