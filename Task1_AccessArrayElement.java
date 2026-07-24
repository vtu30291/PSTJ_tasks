import java.util.Scanner;

/**
 * Task 2: Access and print the element at a given index in an array.
 * Using Notepad and Command Prompt – Solve 5 Problems
 */
public class Task2_AccessArrayElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the index to access (0 to " + (n - 1) + "): ");
        int index = scanner.nextInt();

        if (index >= 0 && index < n) {
            System.out.println("Element at index " + index + " is: " + array[index]);
        } else {
            System.out.println("Error: Index " + index + " is out of bounds for array of size " + n);
        }

        scanner.close();
    }
}
