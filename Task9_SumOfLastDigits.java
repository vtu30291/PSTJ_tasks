import java.util.Scanner;
import java.util.function.BiFunction;

/**
 * Task 10: Sum of last digit of two given numbers
 * using Functional Interfaces & Method References.
 * Functional Interfaces & Method References
 *
 * Extracts the last digit of each of two given numbers and returns their sum
 * using a BiFunction functional interface with a method reference.
 */
public class Task10_SumOfLastDigits {

    /**
     * Computes the sum of the last digits of two integers.
     * This method is used as a method reference.
     *
     * @param a the first integer
     * @param b the second integer
     * @return sum of the last digits of a and b
     */
    public static int sumLastDigits(int a, int b) {
        int lastDigitA = Math.abs(a) % 10;
        int lastDigitB = Math.abs(b) % 10;
        return lastDigitA + lastDigitB;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Using a BiFunction functional interface with a method reference
        BiFunction<Integer, Integer, Integer> sumOfLastDigits = Task10_SumOfLastDigits::sumLastDigits;

        int lastDigit1 = Math.abs(num1) % 10;
        int lastDigit2 = Math.abs(num2) % 10;
        int result = sumOfLastDigits.apply(num1, num2);

        System.out.println("\nFirst number  : " + num1 + " → Last digit: " + lastDigit1);
        System.out.println("Second number : " + num2 + " → Last digit: " + lastDigit2);
        System.out.println("Sum of last digits: " + lastDigit1 + " + " + lastDigit2 + " = " + result);

        scanner.close();
    }
}
