import java.util.Scanner;

public class AdditionOfTwoMatrix  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of row and column");
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		//creating a array
		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		int c[][]=new int[row][col];
		int d[][]=new int[row][col];
		
		
		System.out.println("Enter the "+row*col+" elements for array 1");
		//Storing element in array
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
				a[i][j]=sc.nextInt();
		
		System.out.println("Enter the "+row*col+" elements for array 2");
		//Storing element in array
				for(int i=0;i<b.length;i++)
					for(int j=0;j<b[i].length;j++)
						b[i][j]=sc.nextInt();
		
		System.out.println("Enter the "+row*col+" elements for array 3");
				//Storing element in array
				for(int i=0;i<c.length;i++)
					for(int j=0;j<c[i].length;j++)
						c[i][j]=sc.nextInt();				
				
				//adding
				
				for(int i=0;i<a.length;i++) {
					for(int j=0;j<a[i].length;j++)
					{
						d[i][j]=a[i][j]+b[i][j]+c[i][j];
							
					}
					
					System.out.println("");
				}		
				
				
		
		System.out.println("The elements in Matrix 1  is");
		//printing the Storing element in array1
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
			{
				
				System.out.print(a[i][j]+"	");
			}
			System.out.println("");
		}
		System.out.println("");
		
		///////////////
		
		System.out.println("The elements in Matrix 2  is");
		//printing the Storing element in array2
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[i].length;j++)
			{
				
				System.out.print(b[i][j]+"	");
			}
			System.out.println("");
		}
		System.out.println("");
		
		//////////////
		System.out.println("The elements in Matrix 3  is");
		//printing the Storing element in array2
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[i].length;j++)
			{
				
				System.out.print(c[i][j]+"	");
			}
			System.out.println("");
		}
		System.out.println("");
		
		
		
		//printing the result
		System.out.println("The sum of two  Matrix  is");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(d[i][j]+"	");
					
			}
			
			System.out.println("");
		}
//		System.out.println("The sum of All Elements in matrix is "+sum);
	}

}
