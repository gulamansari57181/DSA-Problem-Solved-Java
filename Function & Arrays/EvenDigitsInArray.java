
/* Count total number of even digits in an array */
import java.util.*;

public class EvenDigitsInArray {

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter element of an array :");
        System.out.println((int) (Math.log10(123)) + 1);
        for (int i = 0; i < array.length; i++) {

            array[i] = sc.nextInt();

        }

        for (int i = 0; i < array.length; i++) {

            if (isEvenDigit(array[i])) {
                count++;
            }

        }

        System.out.println("Total number of elements that contains even digits in an array is :" + count);

    }

    static boolean isEvenDigit(int num) {
        // return true if no contains even n of digits
        int totalDigit = (int) (Math.log10(num)) + 1;
        if (totalDigit % 2 == 0) {
            return true;
        }
        return false;

    }

}
