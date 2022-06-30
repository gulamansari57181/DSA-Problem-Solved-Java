import java.util.Scanner;

public class NoOfBitsOne {

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a no.");
        int n = sc.nextInt();
        while (n != 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }

        System.out.println(count);

        sc.close();

    }
}
