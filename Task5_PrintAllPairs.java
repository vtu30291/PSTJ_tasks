import java.util.Scanner;

/**
 * Task 6: Print all possible pairs of elements from an array of size n.
 * Using Notepad and Command Prompt – Solve 5 Problems
 */
public class Task6_PrintAllPairs {

    /**
     * Prints all possible pairs (i, j) where i != j from the given array.
     *
     * @param arr the array of integers
     */
    public static void printAllPairs(int[] arr) {
        int count = 0;
        System.out.println("All possible pairs:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                count++;
            }
        }
        System.out.println("Total number of pairs: " + count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array (n): ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Array must have at least 2 elements to form pairs.");
            scanner.close();
            return;
        }

        int[] array = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        printAllPairs(array);

        scanner.close();
    }
}
