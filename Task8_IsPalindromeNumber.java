import java.util.Scanner;
import java.util.function.Predicate;

/**
 * Task 9: Is Palindrome Number? using Functional Interfaces & Method References.
 * Functional Interfaces & Method References
 *
 * Checks whether a given number is a palindrome using a Predicate
 * functional interface with a method reference.
 */
public class Task9_IsPalindromeNumber {

    /**
     * Helper method to check if a number is a palindrome.
     * This method is referenced via a method reference.
     *
     * @param number the number to check
     * @return true if the number is a palindrome, false otherwise
     */
    public static boolean checkPalindrome(int number) {
        int original = Math.abs(number);
        int reversed = 0;
        int temp = original;

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to check if it is a palindrome: ");
        int number = scanner.nextInt();

        // Using a Predicate functional interface with a method reference
        Predicate<Integer> isPalindrome = Task9_IsPalindromeNumber::checkPalindrome;

        if (isPalindrome.test(number)) {
            System.out.println(number + " IS a palindrome number.");
        } else {
            System.out.println(number + " is NOT a palindrome number.");
        }

        // Demonstrate with a few examples using method reference
        System.out.println("\n--- Palindrome check for sample numbers ---");
        int[] samples = {121, 123, 1221, 12321, 456, 0, 9};
        for (int sample : samples) {
            System.out.println(sample + " -> " + (isPalindrome.test(sample) ? "Palindrome" : "Not Palindrome"));
        }

        scanner.close();
    }
}
