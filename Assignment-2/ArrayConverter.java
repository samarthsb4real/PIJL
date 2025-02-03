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
}
