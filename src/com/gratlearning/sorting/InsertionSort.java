package com.gratlearning.sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void InsertSort(int arr[])
	{
		for(int i = 1; i < arr.length; i++)
		{
			int keyElement = arr[i];
			int j = i;
			
			while(j>=1 && arr[j-1] > keyElement)
			{
				arr[j] = arr[j-1];
				j--;
			}
			
			//arr[j] = keyElement;			
		}
	}

	public static void main(String[] args) {
		int size;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of array");
		size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter elements in array");
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();			
		}

		InsertSort(arr);

		for(int i=0; i<size; i++)
		{
			System.out.println(arr[i]);		
		}


	}
}
