package com.sort.compare0810;

import java.util.Arrays;

import QuickSort.QuickSort;

public class TestQuickSort {

	public static void main(String[] args) {
		QuickSort qs=new QuickSort();
		int[] arr={17,29,45,68,38,100,234};
		qs.quickSort(arr, 0, arr.length-1);
		
			System.out.println(Arrays.toString(arr));
	}

}
