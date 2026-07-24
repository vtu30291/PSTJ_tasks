import java.util.Scanner;

/**
 * Task 3: Search for a given element in a sorted array using Binary Search.
 * Using Notepad and Command Prompt – Solve 5 Problems
 */
public class Task3_BinarySearch {

    /**
     * Performs binary search on a sorted array.
     *
     * @param arr    the sorted array to search in
     * @param target the element to search for
     * @return the index of the target if found, otherwise -1
     */
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the sorted array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " elements in SORTED (ascending) order:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        int result = binarySearch(array, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }
}
