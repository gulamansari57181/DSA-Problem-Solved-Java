
// Program to print 1) 1234 -> One Two Three Four , 2 ) 56 -> Five Six ,etc.
import java.util.*;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :");
        int n = sc.nextInt();
        sc.close();
        printToWord(n);

    }

    static void printToWord(int n) {

        String[] digitToWord = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        if (n == 0) {

            return;
        }
        // Here we make call first because we want to print value in order of left to
        // right otherwise it will get printed in reverse order if we firs print then
        // make call
        printToWord(n / 10);
        // Printing respectiv value of didgit from digitToWord array
        System.out.print(digitToWord[n % 10] + " ");
    }

}
