package com.gratlearning.driver;
import java.util.Scanner;
import com.gratlearning.searching.LinearSearch;

public class Main {
	
	public static void main(String[] args) {
		
		int size;
		LinearSearch obj = new LinearSearch();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array");
		size = sc.nextInt();		
		int arr[]= {0};
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
