import java.util.Scanner;

public class ReplaceNegativeNoByZero {

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
		
		System.out.print("The array elements are : ");
		for(int x:arr)
		{
			System.out.print(x+" ");	
		}
		System.out.println();
		////////////////////
		arr=replace(arr);
		////////////////////
		
		System.out.print("After replacing negative no. by Zero then array elements are : ");
		for(int x:arr)
		{
			System.out.print(x+" ");	
		}

	}
	
	public static int[] replace(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
				a[i]=0;
		}
		
		return a;
	}

}
