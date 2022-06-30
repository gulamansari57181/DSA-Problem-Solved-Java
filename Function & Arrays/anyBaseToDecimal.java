import java.util.*;

public class AnyBaseToDecimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number");

        int number = scn.nextInt();
        System.out.println("Enter base of this  number");
        int base = scn.nextInt();
        int d = getValueIndecimal(number, base);
        System.out.println("Decimal conversion of your number is : " + d);
    }

    public static int getValueIndecimal(int n, int b) {
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
            p = p * b;

        }
        return value;

    }
}