package com.ArrayProject.Sort.Selection_Sort;

import java.util.Scanner;

public class SelectionSort {

	public static int[] sort(int a[])
	{
		int temp,min,pos;
		//sort operation
		for(int i=0;i<a.length-1;i++)
		{
			min=a[i];
			pos=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(min>a[j])
				{
					min=a[j];
					pos=j;
				}
			}
			
			if(a[i]!=min)
			{
				temp=a[i];
				a[i]=a[pos];
				a[pos]=temp;
			}
		}
		
		return a;
	}

}
