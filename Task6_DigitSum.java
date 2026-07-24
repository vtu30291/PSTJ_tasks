import java.util.Scanner;
import java.util.function.BiFunction;

/**
 * Task 7: digitSum opt – Sum of even or odd digits using Lambda Expressions.
 * Lambda Expressions
 *
 * The program computes the sum of either even or odd digits of a given number
 * using a lambda expression (BiFunction).
 */
public class Task7_DigitSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        long number = Math.abs(scanner.nextLong());

        System.out.print("Enter 'even' to sum even digits or 'odd' to sum odd digits: ");
        String choice = scanner.next().trim().toLowerCase();

        // Lambda expression: takes the number and a parity flag (0=even, 1=odd)
        // returns the sum of digits that match the parity
        BiFunction<Long, Integer, Long> digitSumLambda = (num, parity) -> {
            long sum = 0;
            long temp = num;
            while (temp > 0) {
                int digit = (int) (temp % 10);
                if (digit % 2 == parity) {
                    sum += digit;
                }
                temp /= 10;
            }
            return sum;
        };

        long result;
        if (choice.equals("even")) {
            result = digitSumLambda.apply(number, 0);
            System.out.println("Sum of EVEN digits of " + number + " = " + result);
        } else if (choice.equals("odd")) {
            result = digitSumLambda.apply(number, 1);
            System.out.println("Sum of ODD digits of " + number + " = " + result);
        } else {
            System.out.println("Invalid choice. Please enter 'even' or 'odd'.");
        }

        scanner.close();
    }
}
