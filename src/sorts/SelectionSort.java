package sorts;

public class SelectionSort {
	//taken with permission from https://github.com/Jythonscript/Visual-Sort
	public void selectionSort(int[] array) {	
		
		for (int i = 0; i < array.length; i++) {

			int startmin = array[i];
			int minIndex = i;

			//finds the minimum value after i
			for (int j = i; j < array.length; j++) {

				if (array[j] < array[minIndex]) {
					minIndex = j;					
				}				
			}
			//swap values
			array[i] = array[minIndex];
			array[minIndex] = startmin;
		}

	}
}
