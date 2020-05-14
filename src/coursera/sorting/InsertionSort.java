package coursera.sorting;

public class InsertionSort {

	// insertion sort -- starts

	public void insertionSort(int[] arr) {

		// get the array length
		int arrLen = arr.length;

		// loop over array
		for (int i = 0; i < arrLen; i++) {

			// consider first pointer as sorted one
			int num = arr[i];
			
			// assign value to j for looping further
			int j = i - 1;

			// loop through array till j >= 0 and current num is less then this number
			while (j >= 0 && arr[j] > num) {
				// swap values
				arr[j + 1] = arr[j];
				j--;
			}
			
			// assign num to this value
			arr[j + 1] = num;
		}

	}

	// insertion sort -- ends

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String[] args) {

		int arr[] = { 12, 11, 13, 5, 6 };

		InsertionSort sort = new InsertionSort();
		sort.insertionSort(arr);

		printArray(arr);

	}

}
