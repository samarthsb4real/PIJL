// Name: Samarth Sandesh Bhadane
// PRN: 24070126503
// Batch: A2

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for numbers using for loop
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Even and Odd Separator
        EvenOddSeparator separator = new EvenOddSeparator();
        separator.separate(numbers);
    }
}