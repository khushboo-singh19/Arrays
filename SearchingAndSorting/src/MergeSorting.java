public class MergeSorting {
	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		int l = arr.length;
		mergeSort(arr, 0, l - 1);
		printArr(arr);
	}

	private static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static void mergeSort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int l = mid - start + 1;
		int r = end - mid;
		int[] L = new int[l];
		int[] R = new int[r];
		int k = start;
		for (int i = 0; i < l; i++) {
			L[i] = arr[start + i];
		}
		for (int j = 0; j < r; j++) {
			R[j] = arr[mid + 1 + j];
		}
		int i = 0, j = 0;
		k = start;
		while (i < l && j < r) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < l) {
			arr[k] = L[i];
			k++;
			i++;
		}
		while (j < r) {
			arr[k] = R[j];
			k++;
			j++;
		}
	}
}
