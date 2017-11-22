package com.xl.AlgorithmDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Permutations {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(permute(arr).size());
	}

	public static List<List<Integer>> permute(int[] nums) {
		LinkedList<List<Integer>> queue = new LinkedList<List<Integer>>();
		List<Integer> list = new LinkedList<Integer>();
		List<Integer> listCopy = new LinkedList<Integer>();
		int factorial = 1;
		list.add(nums[0]);
		queue.offer(list);
		for (int i = 1; i < nums.length; i++) {
			factorial = factorial * i;
			for (int k = 0; k < factorial; k++) {
				list = queue.poll();
				for (int j = 0; j < i + 1; j++) {
					listCopy = copyList(list);
					listCopy.add(j, nums[i]);
					queue.offer(listCopy);
				}
			}
		}

		return queue;
	}

	private static List<Integer> copyList(List<Integer> list) {
		return new LinkedList<Integer>(list);
	}

	// private static List<List<Integer>> queueTOList(Queue<List<Integer>>
	// queue) {
	// List<List<Integer>> listAll = new LinkedList<List<Integer>>();
	// List<Integer> listTemp;
	// while ((listTemp = queue.poll()) != null) {
	// listAll.add(listTemp);
	// }
	// return listAll;
	// }

}
