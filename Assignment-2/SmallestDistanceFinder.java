public class SmallestDistanceFinder {
    // Method to find the smallest distance between neighboring elements
    public int findSmallestDistance(int[] numbers) {
        if (numbers.length < 2) return -1;

        int minDistance = Math.abs(numbers[1] - numbers[0]);
        int index = 0;

        for (int i = 1; i < numbers.length - 1; i++) {
            int distance = Math.abs(numbers[i + 1] - numbers[i]);
            if (distance < minDistance) {
                minDistance = distance;
                index = i;
            }
        }        
        return index;
    }
}