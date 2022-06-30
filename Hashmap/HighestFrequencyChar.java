
// To find highest frequency character
import java.io.*;
import java.util.*;

public class HighestFrequencyChar {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();

        HashMap<Character, Integer> freqmap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freqmap.containsKey(ch)) {
                int of = freqmap.get(ch);
                int nf = of + 1;
                freqmap.put(ch, nf);

            } else {
                freqmap.put(ch, 1);
            }

        }
        System.out.println(freqmap);

        // iterate all the values and print maximum frequency Chatracter
        char mfc = str.charAt(0);
        for (Character key : freqmap.keySet()) {
            if (freqmap.get(key) > freqmap.get(mfc)) {
                mfc = key;
            }
        }
        System.out.println(" Maximum frequency character is :" + mfc);

    }
}