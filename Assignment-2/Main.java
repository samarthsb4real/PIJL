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

        // Finding Smallest Distance
        SmallestDistanceFinder distanceFinder = new SmallestDistanceFinder();
        int index = distanceFinder.findSmallestDistance(numbers);
        System.out.println("Smallest distance is between indices: " + index + " and " + (index + 1));

        // Array to ArrayList and Vice Versa
        ArrayConverter converter = new ArrayConverter();
        ArrayList<Integer> arrayList = converter.arrayToArrayList(numbers);
        System.out.println("Array converted to ArrayList: " + arrayList);
        int[] convertedArray = converter.arrayListToArray(arrayList);
        System.out.println("ArrayList converted back to Array: " + Arrays.toString(convertedArray));

        scanner.close();
    }
}