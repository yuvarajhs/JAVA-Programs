import java.util.Scanner;

public class PrintArrayForwardAndReverseDirection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		
		int arr[]=new int [n];
		
		System.out.println("Enter the "+n+" Element for storing into the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		printArray(arr);
	}
	
	public static void printArray(int a[])
	{
		System.out.println("Printing Array Elements in Forword Direction :");
		for(int x : a)
			System.out.print(x+" ");
		System.out.println();
		
		System.out.println("Printing Array Elements in Reverse Direction :");
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]+" ");
	}

}
