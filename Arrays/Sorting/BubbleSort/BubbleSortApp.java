package com.Arrays.BubbleSort;

import java.util.Scanner;

public class BubbleSortApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BubbleSort b= new BubbleSort();
		//call createArray() and get the array
		
		System.out.println("Enter the Size of array");
		int n= sc.nextInt();
		int arr[] = b.createArray(n);
		
		//sort the array by calling bubbleSort()
		arr=b.bubbleSort(arr, n);
		
		//Display the sorted Array by calling displayArray()
		b.displayArray(arr);

	}

}
