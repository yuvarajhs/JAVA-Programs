package com.dataStructure.linkedlist;

import java.util.Scanner;

public class DoublyLinkedListApp  
{
	public static void main(String ...args)
	{
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList dll = new DoublyLinkedList();
		
		while(true)
		{
			System.out.println("Press 1 ------> InsertRear");
			System.out.println("Press 2 ------> DeleteRear");
			System.out.println("Press 3 ------> InsertFront");
			System.out.println("Press 4 ------> DeleteFront");
			System.out.println("Press 5 ------> DisplayForward");
			System.out.println("Press 6 ------> DisplayBackward");
			System.out.println("Press Other Number ------> Exit");
			System.out.println("Enter Your Choice.");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: dll.insertRear(); 
					break;
			case 2: dll.deleteRear();
					break;
			case 3: dll.insertFront();
					break;
			case 4: dll.deleteFront();
					break;
			case 5: dll.displayForward();
					break;
			case 6: dll.displayBackward();
					break;
			default : System.exit(0);
			
			}
		}
		
	}

}

//Output : 


//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> DisplayForward
//Press 6 ------> DisplayBackward
//Press Other Number ------> Exit
//Enter Your Choice.
//1
//Enter the element to insert.
//10
//10 is inserted at Rear.
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> DisplayForward
//Press 6 ------> DisplayBackward
//Press Other Number ------> Exit
//Enter Your Choice.
//5
//Element in the list is 10
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> DisplayForward
//Press 6 ------> DisplayBackward
//Press Other Number ------> Exit
//Enter Your Choice.
//6
//Element in the list is 10
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> DisplayForward
//Press 6 ------> DisplayBackward
//Press Other Number ------> Exit
//Enter Your Choice.
//1
//Enter the element to insert.
//20
//20 is inserted at Rear.
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> DisplayForward
//Press 6 ------> DisplayBackward
//Press Other Number ------> Exit
//Enter Your Choice.
//5
//Elements in the list are 10 20 
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> DisplayForward
//Press 6 ------> DisplayBackward
//Press Other Number ------> Exit
//Enter Your Choice.
//
//6
//Elements in the list are 20 10 
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> DisplayForward
//Press 6 ------> DisplayBackward
//Press Other Number ------> Exit
//Enter Your Choice.
//1
//Enter the element to insert.
//30
//30 is inserted at Rear.
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> DisplayForward
//Press 6 ------> DisplayBackward
//Press Other Number ------> Exit
//Enter Your Choice.
//5
//Elements in the list are 10 20 30 
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> DisplayForward
//Press 6 ------> DisplayBackward
//Press Other Number ------> Exit
//Enter Your Choice.
//6
//Elements in the list are 30 20 10 
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> DisplayForward
//Press 6 ------> DisplayBackward
//Press Other Number ------> Exit
//Enter Your Choice.
//2
//30 is deleted at Rear
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> DisplayForward
//Press 6 ------> DisplayBackward
//Press Other Number ------> Exit
//Enter Your Choice.
//5
//Elements in the list are 10 20 
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> DisplayForward
//Press 6 ------> DisplayBackward
//Press Other Number ------> Exit
//Enter Your Choice.
//4
//10 is deleted at Front.
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> DisplayForward
//Press 6 ------> DisplayBackward
//Press Other Number ------> Exit
//Enter Your Choice.
//5
//Element in the list is 20
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> DisplayForward
//Press 6 ------> DisplayBackward
//Press Other Number ------> Exit
//Enter Your Choice.
//9