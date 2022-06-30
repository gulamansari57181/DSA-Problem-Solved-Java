import java.util.*;

public class digitFrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n = scn.nextInt();
        System.out.println("Enter digit to find its frequency");
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    // To Compute the frequency of digit
    public static int getDigitFrequency(int n, int d) {
        // write code here
        int count = 0;

        while (n > 0) {
            if ((n % 10) == d) {
                count++;
            }
            n /= 10;

        }

        return count;

    }

}