package com.gratlearning.searching;
import java.util.Scanner;

/*  
 * Linear Search 
 * Time Complexity:
 * 
 * Best TC: O(1)
 * Average TC: O(n/2)
 * Worst TC: O(n)
 * 
 * Space Complexity: O(1)
 * 
 */
public class LinearSearch {
	
	public static int Search(int []arr, int value)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == value)
			{
				return i;
			}
		}
		return -1;
	}
	
			
	public static void main(String[] args) {
		
		int size;
		LinearSearch obj = new LinearSearch();
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
		
		int index = obj.Search(arr,value);
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

