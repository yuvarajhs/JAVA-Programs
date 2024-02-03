import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//array size
		System.out.println("Enter the Array size");
		int n=sc.nextInt();
	
		//creating an array
		int a[]=new int[n];
		
		//storing array element
		System.out.println("Enter the "+n+" array element");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		//printing before sorting
		System.out.println("Array element before sorting");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
		System.out.println("");
		
		int c=1;
		//sorting operation
		System.out.println("-----Process of sorting------");
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
				System.out.print(c++ +"---->");
				for(int k=0;k<n;k++)
					System.out.print(a[k]+" ");
				
				System.out.println("");
			}
				
		}
		//System.out.println();
		//after sorting
		System.out.println("Array element after sorting");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
		System.out.println("");
	}

}
