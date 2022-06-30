import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter term number whose fibbonaci value is to be find :");
        int n = sc.nextInt();
        sc.close();
        System.out.println(fibonacci(n));

    }

    static int fibonacci(int n) {
        if (n < 2) {
            // if n==1 or n==0 return that value itself;
            return n;
        }
        // Because fibonacci value of nth term is equal to sum of fibonacci value n-1
        // amd n-2 th term.
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
