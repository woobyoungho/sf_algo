package com.wbh.algo;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int[] array = { 9, 10, 1, 4, 77, 100, 20, 12, 4 };

		System.out.println("<변경 전>");
		System.out.println(Arrays.toString(array));
		System.out.println();
		// Arrays.toString(array) 중요 처음보는 문법

		/*
		 * selectSort(array); System.out.println("<변경 후>");
		 * System.out.println(Arrays.toString(array));
		 */

		bubbleSort(array);
		System.out.println("<변경 후>");
		System.out.println(Arrays.toString(array));

	}

	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				int left = j;
				int right = j + 1;
				
				if (array[left] > array[right]) {
					int temp = array[left];
					array[left] = array[right];
					array[right] = temp;
				}
			}
		}
	}

	public static void selectSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

}
