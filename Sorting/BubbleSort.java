import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter element of an array");
        for (int index = 0; index < array.length; index++) {

            array[index] = sc.nextInt();

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    // Swapping array[j] and array[i] element & after complete iteration largest
                    // element will be placed at last index thus array will be sorted in adcending
                    // order
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }

            }

        }
        // printing sorted array
        for (int index = 0; index < array.length; index++) {

            System.out.print(array[index] + " ");

        }

    }

}
