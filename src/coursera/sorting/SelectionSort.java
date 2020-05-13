/**
 * 
 */
package coursera.sorting;

/**
 * @author edsivha This sorting was not taught as it part of DIY time complexity
 *         O(n2)
 *
 */
public class SelectionSort {

	// selection sort -- start

	public void doSelectionSort(int[] arr) {

		// first take length
		int arrLen = arr.length;

		// loop over array
		for (int i = 0; i < arrLen - 1; i++) {

			// assign current i as minIndex
			int minIndex = i;

			// loop through complete array to check any no. less then minIndex no.
			for (int j = i + 1; j < arrLen; j++)
				if (arr[j] < arr[minIndex])
					minIndex = j;

			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}

	}
	// selection sort -- ends

	public void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort selectionSort = new SelectionSort();
		int arr[] = { 64, 25, 12, 22, 11 };
		selectionSort.doSelectionSort(arr);
		selectionSort.printArray(arr);

	}

}
