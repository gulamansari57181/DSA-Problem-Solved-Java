/*  A program to find GCD of two numbers in ecludien's algoritm in O(logn); */

import java.util.*;

public class GCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number ");
        int a = sc.nextInt();
        System.out.println("Enter your second number ");
        int b = sc.nextInt();
        // Function call to find gcd of two numbers
        int gcd = GCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);

    }

    public static int GCD(int a, int b){



    //     if (b == 0) {
    //         return a;
    //     }
    //     return GCD(b, a % b);

    // }

    while(b!=0){
            int rem = a%b;
            b=a;
            a=rem;

    }
    return rem;


   
}