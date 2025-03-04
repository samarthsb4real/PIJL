//ArrayFunctions.java
import java.util.*;

class ArrayFunctions {

	UserInput in = new UserInput();

	void display(ArrayList<Integer> array) {
		System.out.println("Array is: " + array);
	}

	void OddEven(int[] array)
	{
		// int[] even = new int[array.length];
		// int[] odd = new int[array.length];
		// int ODD_INDEX = 0;
		// int EVEN_INDEX = 0;

		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				// even[EVEN_INDEX] = array[i];
				// EVEN_INDEX++;
				even.add(array[i]);
			} else {
				// odd[ODD_INDEX] = array[i];
				// ODD_INDEX++;
				odd.add(array[i]);
			}
		}
		display(even);
		display(odd);
	}
}