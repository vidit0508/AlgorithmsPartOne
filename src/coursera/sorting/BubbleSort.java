package coursera.sorting;

public class BubbleSort {

	public void doBubbleSort(int[] arr) {
		
		// get array length
		int arrLen = arr.length;

		// for optimization solution check inner loop did swap or not
		boolean swapped;

		// loop over array
		for (int i = 0; i < arrLen - 1; i++) {

			swapped = false;

			for (int j = i + 1; j < arrLen; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			if (swapped == false)
				break;
		}
	}

	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String[] args) {

		BubbleSort sort = new BubbleSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		sort.doBubbleSort(arr);
		System.out.println("Sorted array");
		sort.printArray(arr);

	}

}
