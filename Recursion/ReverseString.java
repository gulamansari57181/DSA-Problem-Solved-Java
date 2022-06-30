import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string :");
        String s = sc.nextLine();
        char[] c = s.toCharArray();
         reverse(c, 0, c.length - 1);
        sc.close();
        // To find palindrome or not
        // String rs = new String(reversString);
        // if (s.equals(rs)) {
        // } else {
        // System.out.println("Not Palindrome");
        // }

    }

    // Recursive function
    static char[] reverse(char[] array, int start, int end) {
        // base case
        if (start >= end) {
            System.out.println(array);
            return array;
        }
        // swapping
        char temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        // recursive call
        return reverse(array, start + 1, end - 1);

    }
}