import java.util.Scanner;

public class RectangleArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of row and column");
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		//creating a array
		int arr[][]=new int[row][col];
		int sum=0;
		
		
		System.out.println("Enter the "+row*col+" elements");
		//Storing element in array
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=sc.nextInt();
		
		System.out.println("The elements in Matrix  is");
		//Storing element in array
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
			{
				
				System.out.print(arr[i][j]+"	");
			}
			System.out.println("");
		}
		System.out.println("");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==0||i==(row-1)||j==0||j==(col-1))
					System.out.print(arr[i][j]+"	");
				else
					System.out.print("	");
					
			}
			
			System.out.println("");
		}
//		System.out.println("The sum of All Elements in matrix is "+sum);
	}

}
