import java.util.Scanner;

public class PrintPositiveNo {

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
		
		System.out.print("The positive array elements are : ");
		for(int x:arr)
		{
			if(x>0)
				System.out.print(x+" ");	
		}

	}

}

