import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of Company");
		int row=sc.nextInt();
		
		String arr[][]=new String[row][];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the no. of player in company "+(i+1));
			int col=sc.nextInt();
			arr[i]=new String[col];
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the name of Employee "+(j+1)+" in Company "+(i+1));
				arr[i][j]=sc.next();
			}
		}
		
		for(int i=0;i<=arr.length-1;i++)
			for(int j=0;j<=arr[i].length-1;j++)
				System.out.println("The name of Employee "+j+1+" in Company "+i+1+" is "+arr[i][j]);
				
			
	}

}
