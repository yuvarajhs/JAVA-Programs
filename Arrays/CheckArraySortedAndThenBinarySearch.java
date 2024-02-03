import java.util.Scanner;

public class CheckArraySortedAndThenBinarySearch {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		//Creating the Array
		int arr[]=new int[sc.nextInt()];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();   //Storing array elements
		
		System.out.println("Enter the Key for searching");
		int key=sc.nextInt();
		
		
		//check Array is in sorted order or not.
		int flag=1;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])  //check 1st element is greater than 2nd element
			{
				flag=0;
				break;
			}
				
		}
		
		
		
		if(flag==1)
		{
			//"Array is in sorted order and array is : 
			System.out.println("Array is Sorted & array is :  ");
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+" ");
			
			System.out.println();
		}
		
		else
		{
			//Array is not in sorted order, So we have to Apply selection sort Algorithm for sort the Array
			
			System.out.println("Array is Not Sorted and array is :");
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+" ");
			System.out.println();
			arr=selectionSort(arr);
			
			System.out.println("After applying selection sort then array is :");
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+" ");
			System.out.println();
			
		}
			
		
		int index=binarySearch(arr,key);
		
		if(index!=-1)	
			System.out.println(arr[index]+" is found at index "+index);
		else
			System.out.println(key+" is not found");
		
	}
	
	public static int binarySearch(int a[],int key)
	{
		int low=0,high=a.length-1,mid=0;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(key==a[mid])
			{
				return mid;
			}
			else if(key>mid)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return -1;
		
	}
	
	public static int[] selectionSort(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}

}
