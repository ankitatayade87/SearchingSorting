package com.gratlearning.sorting;

import java.util.Scanner;

public class BubbleSort {
	
	public static void sort(int arr[])
	{
		int j ,k = 0, temp;
		
		for(int i=0; i<arr.length; i++)
		{
			for(k=1; k<(arr.length-i);k++)
			{
				if(arr[k-1] > arr[k])
				{
					temp = arr[k-1];
					arr[k-1] = arr[k];
					arr[k] = temp;
				}
				
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




















