// First Occurance of Uppercase in String recursive solution

import java.util.*;

public class FirstUppercaseLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  your string : ");
        String s = sc.nextLine();
         sc.close();
        char first = firstUpper(s, 0);
        System.out.print("First Uppercase letter in string is :" + first);
    }

    static char firstUpper(String s, int i) {
        if (i == s.length()) {
            return '0';

        }
        if (Character.isUpperCase(s.charAt(i))) {
            return s.charAt(i);
        }
        return firstUpper(s, i + 1);
    }

}
