
import java.util.ArrayList;
import java.util.List;

public class NumberOperations {

    public static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int countDigits(int number) {
        return (int) (Math.log10(number) + 1);
    }

    public static List<Integer> getDigits(int number) {
        List<Integer> digits = new ArrayList<>();

        do {
            int digit = number % 10;
            digits.add(0,digit);
            number /= 10;

        } while (number > 0);

        return digits;

    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

         do {
            int digit = number % 10;
            reversedNumber = reversedNumber*10 + digit;
            number /= 10;

        } while (number > 0);

        return originalNumber == reversedNumber;
    }
}
