import java.util.Arrays;
import java.util.Scanner;

/**
 * Task 5: Given an array of integers and a positive integer K,
 * find the Kth smallest element.
 * Using Notepad and Command Prompt – Solve 5 Problems
 */
public class Task5_KthSmallestElement {

    /**
     * Finds the Kth smallest element in an integer array.
     * Approach: Sort the array and return element at index (K-1).
     *
     * @param arr the array of integers
     * @param k   the position K (1-based)
     * @return the Kth smallest element
     */
    public static int findKthSmallest(int[] arr, int k) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        return sorted[k - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be a positive integer.");
            scanner.close();
            return;
        }

        int[] array = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of K (1 to " + n + "): ");
        int k = scanner.nextInt();

        if (k < 1 || k > n) {
            System.out.println("Invalid K. K must be between 1 and " + n);
        } else {
            int result = findKthSmallest(array, k);
            System.out.println("The " + k + " smallest element is: " + result);
        }

        scanner.close();
    }
}
