
import java.util.*;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int decimalNo = sc.nextInt();
        int octal = toBinary(decimalNo);
        System.out.println("Octal eqivalent is " + octal);

    }

    public static int toBinary(int number) {
        int value = 0;
        int power = 1;
        while (number > 0) {

            // frequentb reduce to find remainder

            int r = number % 8;

            // reduced number by dividing it 2
            number = number / 8;

            // Forming the number in binary form
            value += r * power;
            power *= 10;

        }
        return value;

    }

}