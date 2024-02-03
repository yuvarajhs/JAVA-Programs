package com.Arrays.BubbleSort;

import java.util.Scanner;

public class BubbleSort {
	
	public int[] createArray(int n)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the "+n+" Array elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		return a;
	}
	
	public int[] bubbleSort(int a[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		
		return a;
	}
	
	public void displayArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	

}
