import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter element of an array");
        for (int index = 0; index < array.length; index++) {

            array[index] = sc.nextInt();

        }
        obj.InsertionSortFun(array);

    }

    public void InsertionSortFun(int[] array) {

        for (int i = 1; i < array.length; i++) {

            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {

                array[j + 1] = array[j];
                j--;

            }
            array[j + 1] = temp;

        }
        for (int index = 0; index < array.length; index++) {

            System.out.print(array[index] + " ");

        }

    }

}
