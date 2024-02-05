package com.dataStructure.linkedlist;

import java.util.Scanner;

import com.dataStructure.linkedlist.SinglyLinkedList.Node;

public class DoublyLinkedList 
{
	class Node
	{
		Node preLink;
		int data;
		Node nextLink;
	}
	
	private Node first;

	private Scanner sc = new Scanner(System.in);
	
	public void insertRear()
	{
		Node temp;
		System.out.println("Enter the element to insert.");
		int elem = sc.nextInt();
		
		Node newNode = new Node();   // creating a node
		newNode.data = elem;		// inserting data to node
		newNode.preLink = null;		// 1st make link to null
		newNode.nextLink = null;
		
		if(first == null)
		{
			first = newNode;
			System.out.println(elem + " is inserted at Rear.");
		}	
		else
		{
			temp=first;
			 while(temp.nextLink!=null)
			 {
				 temp=temp.nextLink;
			 }
			 temp.nextLink=newNode;
			 newNode.preLink=temp;
			 System.out.println(elem + " is inserted at Rear.");
		}
		
	}
	
	public void deleteRear()
	{
		Node temp;
		if(first == null)
			System.out.println("Deletion not possible.");
		
		else if(first.nextLink==null)
		{
			System.out.println(first.data +" is deleted at Rear.");
			first=null;
		}
		else
		{
			temp=first;
			while(temp.nextLink.nextLink!=null)
			{
				temp=temp.nextLink;
			}
			System.out.println(temp.nextLink.data+" is deleted at Rear");
			temp.nextLink=null;
		}
		
	}
	
	public void insertFront()
	{
		System.out.println("Enter the element to insert");
		int elem = sc.nextInt();
		
		Node newNode = new Node();
		newNode.data=elem;
		newNode.preLink=null;
		newNode.nextLink=null;
		
		if(first==null)
		{
			first=newNode;
			System.out.println(elem +" is inserted at Front.");
		}
		else
		{
			newNode.nextLink=first;
			first.preLink=newNode;
			first=newNode;
			System.out.println(elem+" is inserted at Front.");
		}
	}

	public void deleteFront()
	{
		if(first==null) {
			System.out.println("Deletion is not possible.");
		}
		else if(first.nextLink==null)
		{
			System.out.println(first.data+" is deleted at Front.");
			first=null;
		}
		else
		{
			System.out.println(first.data+" is deleted at Front.");
			first=first.nextLink;
			first.preLink=null;
		}
		
	}
	
	public void displayForward()
	{
		Node temp;
		
		if(first==null)
		{
			System.out.println("Display Not possible.");
		}
		else if(first.nextLink==null) 
		{
			System.out.println("Element in the list is "+ first.data);
		}
		else
		{
			temp=first;
			System.out.print("Elements in the list are ");
			while(temp!=null)
			{
				System.out.print(temp.data + " ");
				temp=temp.nextLink; 
			}
			System.out.println();
		}
		
	}
	
	public void displayBackward()
	{
		Node temp;
		
		if(first==null)
		{
			System.out.println("Display Not possible.");
		}
		else if(first.nextLink==null) 
		{
			System.out.println("Element in the list is "+ first.data);
		}
		else
		{
			temp=first;
			while(temp.nextLink!=null)
			{
				temp=temp.nextLink; 
			}
			System.out.print("Elements in the list are ");
			while(temp!=null)
			{
				System.out.print(temp.data + " ");
				temp=temp.preLink; 
			}
			System.out.println();
		}
		
	}
}