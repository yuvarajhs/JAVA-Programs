package com.dataStructure.circularQueue;
 
import java.util.Scanner;

public class CircularQueueApp
{
	public static void main(String ...args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of CircularQueue.");
		CircularQueue circularQueue = new CircularQueue(sc.nextInt());
		
		while(true)
		{
			System.out.println("Press 1 ---------->Insert\nPress 2 ---------->Delete\nPress 3 --------->DisPlay");
			System.out.println("Press other NO's --------->EXIT");
			System.out.println("Enter your choice.");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Enter the element for insert.");
					circularQueue.insert(sc.nextInt());
					break;
			case 2: circularQueue.delete();
					break;
			case 3: circularQueue.display();
					break;
			default :System.exit(0);
			}
		}
	}

}