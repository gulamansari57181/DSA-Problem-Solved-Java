import java.util.*;

public class BinaryToDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number :");
        int binary = sc.nextInt();
        int decimal = toDecimal(binary);
        System.out.println("Decimal equivalent is " + decimal);
        sc.close();
    }

    public static int toDecimal(int number) {
        int power = 1;
        int value = 0;
        while (number > 0) {

            int last_digit = number % 10;
            value += last_digit * power;
            number /= 10;
            power *= 2;
        }
        return value;

    }

}
