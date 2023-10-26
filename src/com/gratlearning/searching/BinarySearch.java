package com.gratlearning.searching;

import java.util.Scanner;

public class BinarySearch {

	public static int Search(int arr[], int left, int right, int search_val)
	{		
		if(right >= left)
		{
			int mid = left + (right - left)/2;

			if(arr[mid] == search_val)
			{
				System.out.println("Enter value is present in array");
				return mid;
			}
			if(arr[mid] > search_val)
			{
				right = mid - 1;
				return Search(arr ,left ,right, search_val);
			}

			return Search(arr, mid+1, right, search_val);		
	
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int size;
		BinarySearch obj = new BinarySearch();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array");
		size = sc.nextInt();		
		int arr[]= 	new int[size];
		System.out.println("Enter the values of array");
		
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the value to be search.");
		int value = sc.nextInt();
		
		int index = obj.Search(arr,0, size - 1, value);
		if(index != -1)
		{
			System.out.println(value+" is present in array at index "+ index);
		}
		else
		{
			System.out.println("Value is not present in array.");
		}
		
	}
}
