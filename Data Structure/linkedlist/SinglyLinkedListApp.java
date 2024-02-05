package com.dataStructure.linkedlist;

import java.util.Scanner;

public class SinglyLinkedListApp 
{
	public static void main(String ...args)
	{
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList sll = new SinglyLinkedList();
		
		while(true)
		{
			System.out.println("Press 1 ------> InsertRear");
			System.out.println("Press 2 ------> DeleteRear");
			System.out.println("Press 3 ------> InsertFront");
			System.out.println("Press 4 ------> DeleteFront");
			System.out.println("Press 5 ------> Display");
			System.out.println("Press Other Number ------> Exit");
			System.out.println("Enter Your Choice.");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: sll.insertRear(); 
					break;
			case 2: sll.deleteRear();
					break;
			case 3: sll.insertFront();
					break;
			case 4: sll.deleteFront();
					break;
			case 5: sll.display();
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
//Press 5 ------> Display
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
//Press 5 ------> Display
//Press Other Number ------> Exit
//Enter Your Choice.
//5
//Element in the list is 10
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> Display
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
//Press 5 ------> Display
//Press Other Number ------> Exit
//Enter Your Choice.
//5
//Elements in the list are 10 20 
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> Display
//Press Other Number ------> Exit
//Enter Your Choice.
//3
//Enter the element to insert
//5
//5 is inserted at Front.
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> Display
//Press Other Number ------> Exit
//Enter Your Choice.
//5
//Elements in the list are 5 10 20 
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> Display
//Press Other Number ------> Exit
//Enter Your Choice.
//2
//20 is deleted at Rear
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> Display
//Press Other Number ------> Exit
//Enter Your Choice.
//4
//5 is deleted at Front.
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> Display
//Press Other Number ------> Exit
//Enter Your Choice.
//5
//Element in the list is 10
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> Display
//Press Other Number ------> Exit
//Enter Your Choice.
//2
//10 is deleted at Rear.
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> Display
//Press Other Number ------> Exit
//Enter Your Choice.
//5
//Display Not possible.
//Press 1 ------> InsertRear
//Press 2 ------> DeleteRear
//Press 3 ------> InsertFront
//Press 4 ------> DeleteFront
//Press 5 ------> Display
//Press Other Number ------> Exit
//Enter Your Choice.
