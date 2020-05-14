package coursera.sorting;

public class MergeSort {

	public void sort(int[] arr, int left, int right) {

		if (left < right) {
			int middle = (left + right) / 2;

			// recursively call sort method
			sort(arr, left, middle);
			sort(arr, middle + 1, right);
			merge(arr, left, middle, right);
		}
	}

	public void merge(int[] arr, int left, int middle, int right) {

		// get length of two arrays
		int lLen = middle - left + 1;
		int rLen = right - middle;

		// create two new arrays
		int[] lArr = new int[lLen];
		int[] rArr = new int[rLen];

		// copy data to arrays
		for (int i = 0; i < lLen; i++)
			lArr[i] = arr[left + i];
		for (int j = 0; j < rLen; j++)
			rArr[j] = arr[middle + 1 + j];

		// pointer for lArr
		int i = 0;
		// pointer for rArr
		int j = 0;
		// pointer for main array
		int k = left;

		// evaluation
		while (i < lLen && j < rLen) {
			if (lArr[i] <= rArr[j]) {
				arr[k] = lArr[i];
				i++;
			} else {
				arr[k] = rArr[j];
				j++;
			}
			k++;
		}

		// filling remaining elements
		while (i < lLen) {
			arr[k] = lArr[i];
			i++;
			k++;
		}

		while (j < rLen) {
			arr[k] = rArr[j];
			k++;
			j++;
		}

	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String[] args) {

		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);

	}

}
