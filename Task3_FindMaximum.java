import java.util.Scanner;

/**
 * Task 4: Find the maximum element in an array of n integers.
 * Using Notepad and Command Prompt – Solve 5 Problems
 */
public class Task4_FindMaximum {

    /**
     * Finds the maximum element in an integer array.
     *
     * @param arr the array to search
     * @return the maximum element
     */
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
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

        int maximum = findMax(array);
        System.out.println("The maximum element in the array is: " + maximum);

        scanner.close();
    }
}
