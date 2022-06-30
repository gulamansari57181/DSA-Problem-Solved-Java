
// Print First natural numbers using recursion in  order.
import java.util.*;

public class FirstNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number upto which value is to be printed :");
        int n = sc.nextInt();
        sc.close();
        printNumbers(n);
    }

    static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.print(n + " ");

        // printNumbers(n-1); to print in decreasing order firsr print then make call

    }

}
