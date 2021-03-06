package sorts;

public class InsertionSort {
	//taken with permission from https://github.com/Jythonscript/Visual-Sort
	public void insertionSort(int[] array) {

		int unsortedIndex = 0;

		while (unsortedIndex < array.length) {
			for (int i = unsortedIndex; i > 0; i--) {
				if (array[i] < array[i - 1]) {
					int temp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = temp;
				}

			}
			unsortedIndex++;
		}

	}
}
