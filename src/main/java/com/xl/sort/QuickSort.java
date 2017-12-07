package com.xl.sort;

public class QuickSort {

	private int[] arr;

	public QuickSort(int[] arr) {
		this.arr = arr;
	}

	public void sort() {
		sort(0, arr.length-1);
	}

	public void sort(int start, int end) {
		if (start < end) {
			int key = arr[start];
			int low = start;
			int high = end;
			while (low < high) {
				while (low < high && arr[high] > key) {
					high--;
				}
				arr[low] = arr[high];
				while (low < high && arr[low] < key) {
					low++;
				}
				arr[high] = arr[low];
			}
			arr[low] = key;
			sort(start, low - 1);
			sort(low + 1, end);
		}

	}

	public void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) { }

}
