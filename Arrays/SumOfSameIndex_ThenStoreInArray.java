import java.util.Scanner;

public class SumOfSameIndex_ThenStoreInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements for ARRAY ");
		int n1=sc.nextInt();
//		System.out.println("Enter the no. of elements for ARRAY 2");
//		int n2=sc.nextInt();
		
		int a[]=new int[n1];
		int b[]=new int[n1];
		int []c=new int[n1];
		
		System.out.println("Enter the "+n1+" elements for 1st array");
		for(int i=0;i<n1;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Enter the "+n1+" elements for 2nd array");
		for(int i=0;i<n1;i++)
			b[i]=sc.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
		}
		
		System.out.println("Sum of two Array elements are ");
		for(int i=0;i<a.length;i++)
			System.out.print(c[i]+" ");
	}
		

	}


