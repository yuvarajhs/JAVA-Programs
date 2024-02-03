import java.util.Scanner;

public class SwapArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter the "+n+" array Elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Enter 2 index you want Swap those element");
		int i1=sc.nextInt();
		int i2=sc.nextInt();
		
		System.out.println("Before Swaping");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
		System.out.println("");
		
		int temp=a[i1];
		a[i1]=a[i2];
		a[i2]=temp;
		
		System.out.println("After Swaping");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");

	}

}
