import java.util.Scanner;

public class KthBitSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        System.out.println("Enter which bit you want to check is set or not");
        int k = sc.nextInt();

        // tempNo = 1 << (k - 1);
        // if ((n & tempNo) > 0) {
        // System.out.println("Set");
        // } else {
        // System.out.println("Not set");
        // }
        // Shorthand code
        if ((n & (1 << (k - 1))) > 0) {
            System.out.println("Set");

        } else {
            System.out.print("Not Set");
        }

        sc.close();

    }
}