package com.xl.sort;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 1, 3, 5 };
		new MergeSort().sort(arr);
		System.out.println(arr);
	}

	public void sort(int[] arr) {
		sort(arr, 0, arr.length);
	}

	public void sort(int[] arr, int left, int right) {
		if (left >= right)
			return;

		int mid = (left + right) / 2;

		sort(arr, left, mid);
		sort(arr, mid + 1, right);
		merge(arr, left, right);
	}

	private void merge(int[] arr, int left, int right) {
		// 1,3,6
		// 5,8,9
		int[] arrTemp = new int[right - left + 1];
		int mid = (left + right) / 2;

		int firstArr = left;
		int secondArr = mid + 1;
		int k = 0;
		while (firstArr <= mid && secondArr <= right) {
			if (arr[firstArr] < arr[secondArr]) {
				arrTemp[k] = arr[firstArr];
				firstArr++;
				k++;
			} else {
				arrTemp[k] = arr[secondArr];
				secondArr++;
				k++;
			}
		}

		while (firstArr <= mid) {
			arrTemp[k] = arr[firstArr];
			firstArr++;
			k++;
		}

		while (secondArr <= right) {
			arrTemp[k] = arr[secondArr];
			secondArr++;
			k++;
		}

		System.arraycopy(arrTemp, 0, arr, left, right - left + 1);
	}

}
