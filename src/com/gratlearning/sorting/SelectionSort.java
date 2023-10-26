package com.gratlearning.sorting;

import java.util.Scanner;

public class SelectionSort {
	
	public static void Swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void sort(int arr[])
	{
		int min = 0;
		boolean flag = false;
		for(int i=0; i<arr.length-1; i++)
		{
			min = i;
			
			for(int j =i+1; j<arr.length; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
					flag = true;
				}
			}
			
			if(flag == true)
			{
				Swap(arr,i, min);
			}
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
		
		sort(arr);
		
		for(int i=0; i<size; i++)
		{
			System.out.println(arr[i]);		
		}
	}
}
