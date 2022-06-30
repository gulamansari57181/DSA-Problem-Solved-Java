
// Program to solve tower of hanoi 
import java.util.*;

public class TowerOfHanoi {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of disk in tower :");
        int n = sc.nextInt();
        System.out.println("Give number to first tower:");
        int t1id = sc.nextInt();
        System.out.println("Give number to second tower:");
        int t2id = sc.nextInt();
        System.out.println("Give number to third tower:");
        int t3id = sc.nextInt();
        sc.close();
        toh(n, t1id, t2id, t3id);

    }

    public static void toh(int n, int t1id, int t2id, int t3id) {

        if (n == 0) {
            return;
        }

        toh(n - 1, t1id, t3id, t2id);
        System.out.println(n + "[" + t1id + " -> " + t2id + "]");
        toh(n - 1, t3id, t2id, t1id);

    }

}