import java.util.*;

public class ArrayConverter {
    // Convert array to ArrayList
    public ArrayList<Integer> arrayToArrayList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        return list;
    }

    // Convert ArrayList back to array
    public int[] arrayListToArray(ArrayList<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}