import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int decimalNo = sc.nextInt();
        int binary = toBinary(decimalNo);
        System.out.println("Binary eqivalent is " + binary);

    }

    public static int toBinary(int number) {
        int value = 0;
        int power = 1;
        while (number > 0) {

            // frequentb reduce to find remainder

            int r = number % 2;

            // reduced number by dividing it 2
            number = number / 2;

            // Forming the number in binary form
            value += r * power;
            power *= 10;

        }
        return value;

    }

}
