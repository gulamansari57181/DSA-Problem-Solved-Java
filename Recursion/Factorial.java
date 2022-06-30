
// Recursive program to find factorial of a number
import java.util.*;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number whose factorial is to be find :");
        long n = sc.nextInt();
        sc.close();
        System.out.println(factorialCalc(n));

    }
    // Here we have used long datatype to store latger value.

    static long factorialCalc(long n) {
        if (n == 0 || n == 1) {
            // since factorial of 0 or 1 is equal to 1.

            return 1;
        }

        return n * factorialCalc(n - 1);
    }

}
