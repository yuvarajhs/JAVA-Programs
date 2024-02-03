import java.util.Scanner;

public class SwapingArrayElements {

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
		
		System.out.println("Enter the 2 index for swaping both the no.s");
		int i1=sc.nextInt();
		int i2=sc.nextInt();
		
		
		System.out.print("Befor Swaping : Arr--->");
		for(int x:arr)
			System.out.print(x+" ");
		System.out.println();
		
	    ///////////////////////////////////////
		int temp=arr[i1];
		arr[i1]=arr[i2];
		arr[i2]=temp;
		
			
		System.out.print("After Swaping : Arr--->");
		for(int x:arr)
			System.out.print(x+" ");
		System.out.println();

	}

}
