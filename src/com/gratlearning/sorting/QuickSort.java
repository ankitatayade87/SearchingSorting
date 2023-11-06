package com.gratlearning.sorting;

import java.util.Scanner;

public class QuickSort {
	
	
	public static void quickSort(int arr[], int low, int high)
	{
		if(low < high)
		{
			int p_index = partition(arr, low, high);
			quickSort(arr, low, p_index - 1);
			quickSort(arr, p_index + 1, high);
		}
	}
	
	public static int partition(int arr[], int low, int high)
	{
		int pivot = arr[high];
		
		int i = low - 1;;
		
		for(int j = low; j < high; j++)
		{
			if(arr[j] < arr[high])
			{
				i++;
				swap(arr, j , i);
			}
		}
		
		swap(arr, i+1, high);
		
		return i+1;
		
	}

	private static void swap(int[] arr, int j, int i) {
		// TODO Auto-generated method stub
		
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		
	}

	public static void main(String[] args) {
		int size;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of array");
		size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter elements in array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		quickSort(arr, 0, arr.length - 1);

		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}
}
