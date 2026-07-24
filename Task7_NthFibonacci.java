import java.util.Scanner;
import java.util.function.Function;

/**
 * Task 8: Nth Fibonacci using Lambda Expressions.
 * Lambda Expressions
 *
 * Computes the Nth Fibonacci number using an iterative approach
 * wrapped in a lambda expression (Function interface).
 */
public class Task8_NthFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N to find the Nth Fibonacci number: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("N must be a non-negative integer.");
            scanner.close();
            return;
        }

        // Lambda expression using Function<Integer, Long> to compute Nth Fibonacci
        Function<Integer, Long> fibonacci = (num) -> {
            if (num == 0) return 0L;
            if (num == 1) return 1L;
            long prev = 0, curr = 1;
            for (int i = 2; i <= num; i++) {
                long next = prev + curr;
                prev = curr;
                curr = next;
            }
            return curr;
        };

        long result = fibonacci.apply(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);

        // Display the Fibonacci sequence up to N
        System.out.print("Fibonacci sequence up to F(" + n + "): ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci.apply(i));
            if (i < n) System.out.print(", ");
        }
        System.out.println();

        scanner.close();
    }
}
