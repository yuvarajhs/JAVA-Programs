package com.ArrayProject.Sort.Selection_Sort;
import java.util.Scanner;

public class SelectionSortApp {

	public static void main(String[] args) {
		//Creating Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//Array size
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		
		//creating array
		int a[] = new int [n];
		
		//storing array element
		System.out.println("Enter the "+n+" array element");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println();
		
		//printing before sort
		System.out.println("Array element before sorting");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		
		//Calling sort method
		int sortedArr[]=SelectionSort.sort(a);
		
		
		//Printing array element After sorting
		System.out.println("Array element After sorting");
		for(int i=0;i<sortedArr.length;i++)
			System.out.print(sortedArr[i]+" ");
		System.out.println();
	}

}
