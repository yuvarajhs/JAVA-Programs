package com.ArrayProject.Search.LinearSearch;

import java.util.Scanner;

public class LinearSearchApp {

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

		System.out.println(search(a,ele));



	}

	public static String search(int arr[],int ele)
	{

		for (int i = 0; i < arr.length; i++) {
			if(ele == arr[i]) {
				return ("Key "+ele+" is found at index "+(i+1));
			}
		}
		return ("Key "+ele+" is not found at index ");
	}

}
