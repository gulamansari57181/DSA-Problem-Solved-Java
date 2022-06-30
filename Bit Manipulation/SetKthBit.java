// This program is to set kth bit of any  number and provide its ouptput

import java.util.Scanner;

public class SetKthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        System.out.println("Enter which bit you want to set");
        int k = sc.nextInt();
        n = n | (1 << (k - 1));
        System.out.println(n);

        sc.close();

    }

}
