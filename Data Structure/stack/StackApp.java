package com.dataStructure.stack;

import java.util.Scanner;

public class StackApp 
{
	public static void main(String ...args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Stack.");
		Stack stack = new Stack(sc.nextInt());
		
		while(true)
		{
			System.out.println("Press 1 ---------->PUSH\nPress 2 ---------->POP\nPress 3 --------->DisPlay");
			System.out.println("Press any other NO's --------->EXIT");
			System.out.println("Enter your choice.");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Enter the element for PUSH.");
					stack.push(sc.nextInt());
					break;
			case 2: stack.pop();
					break;
			case 3: stack.display();
					break;
			default :System.exit(0);
			}
		}
	}

}
