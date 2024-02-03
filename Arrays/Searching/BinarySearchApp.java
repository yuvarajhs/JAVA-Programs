package com.ArrayProject.Search.Binary_Search;

import java.util.Scanner;

import com.ArrayProject.Sort.Bubble_Sort.BubbleSort;//Importing from different package

public class BinarySearchApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements");
		int n=sc.nextInt();

		int a[]=new int [n];


		System.out.println("Enter the "+n+" elements to array");
		for(int i=0;i<n;i++) 
			a[i]=sc.nextInt();
		

		System.out.println("Enter the element you want to search");
		int ele=sc.nextInt();

		int index=search(a,ele);
		if(index!=-1)
			System.out.println("The key "+ele+" is found at the index "+index);
		else
			System.out.println("The key "+ele+" is not found at index ");
			
	}
	
	public static int search(int arr1[],int key)
	{
		//calling sorting method
		int arr[]=BubbleSort.sort(arr1);//calling method in importing package
		
		//sorted array
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		int low=0,high=arr.length-1,mid=0;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			
			if(arr[mid]==key)
				return mid;
			
			else if(key<arr[mid])
				high=mid-1;
			
			else
				low=mid+1;
		}
		
		return -1;
	}

}
