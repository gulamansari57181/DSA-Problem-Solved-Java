
//This progrm is to toggle kth bit of given no i.e convert kth bit to 1 from 0 and vice versa. 
import java.util.Scanner;

public class ToggleKthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        System.out.println("Enter which bit you want to toggle");
        int k = sc.nextInt();
        // kth bit 1 and rest 0 then X-Or this no with given no
        n = (n ^ (1 << (k - 1)));
        System.out.println(n);

        sc.close();

    }

}
