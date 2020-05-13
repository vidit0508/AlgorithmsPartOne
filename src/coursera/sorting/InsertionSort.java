package coursera.sorting;

public class InsertionSort {

	// insertion sort -- starts

	public void insertionSort(int[] arr) {

		// get the array length
		int arrLen = arr.length;

		for (int i = 0; i < arr.length; i++) {

			int num = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > num) {
				arr[j + 1] = arr[j];
				j--;
			}
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
