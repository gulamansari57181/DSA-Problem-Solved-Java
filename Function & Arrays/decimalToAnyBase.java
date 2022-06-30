import java.util.*;

public class DecimalToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your decimal number :");

        int n = scn.nextInt();

        System.out.println("Enter base value to convert :");

        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b) {

        // Considering lowest power of ten
        int power = 1;
        int value = 0;
        while (n > 0) {

            int lastDigit = n % b;
            // Reduce the number by base(frequent division)
            n = n / b;
            value = value + power * lastDigit;

            power *= 10;
        }
        return value;

    }
}