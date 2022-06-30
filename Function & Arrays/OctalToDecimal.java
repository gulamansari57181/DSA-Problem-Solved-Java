
import java.util.*;

public class OctalToDecimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a octal number");

        int number = scn.nextInt();

        int d = getValueIndecimal(number);
        System.out.println("Decimal conversion of your number is : " + d);
    }

    public static int getValueIndecimal(int n) {
        int value = 0;
        int p = 1;
        while (n > 0) {
            // Get last digit
            int digit = n % 10;
            // Rdeuce or remove the last digit of number
            n = n / 10;
            // Computing the value
            value += digit * p;
            // increment power from 1, 8,8^2,8^3......
            p = p * 8;

        }
        return value;

    }
}