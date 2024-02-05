package com.dataStructure.linkedlist;

import java.util.Scanner;

public class SinglyLinkedList {
	class Node
	{
		int data;
		Node link;
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
		newNode.link = null;		// 1st make link to null
		
		if(first == null)
		{
			first = newNode;
			System.out.println(elem + " is inserted at Rear.");
		}	
		else
		{
			temp=first;
			 while(temp.link!=null)
			 {
				 temp=temp.link;
			 }
			 temp.link=newNode;
			 System.out.println(elem + " is inserted at Rear.");
		}
		
	}
	
	public void deleteRear()
	{
		Node temp;
		if(first == null)
			System.out.println("Deletion not possible.");
		else if(first.link==null)
		{
			System.out.println(first.data +" is deleted at Rear.");
			first=null;
		}
		else
		{
			temp=first;
			while(temp.link.link!=null)
			{
				temp=temp.link;
			}
			System.out.println(temp.link.data+" is deleted at Rear");
			temp.link=null;
		}
		
	}
	
	public void insertFront()
	{
		System.out.println("Enter the element to insert");
		int elem = sc.nextInt();
		
		Node newNode = new Node();
		newNode.data=elem;
		newNode.link=null;
		
		if(first==null)
		{
			first=newNode;
			System.out.println(elem +" is inserted at Front.");
		}
		else
		{
			newNode.link=first;
			first=newNode;
			System.out.println(elem+" is inserted at Front.");
		}
	}

	public void deleteFront()
	{
		if(first==null) {
			System.out.println("Deletion is not possible.");
		}
		else if(first.link==null)
		{
			System.out.println(first.data+" is deleted at Front.");
			first=null;
		}
		else
		{
			System.out.println(first.data+" is deleted at Front.");
			first=first.link;
		}
		
	}
	
	public void display()
	{
		Node temp;
		
		if(first==null)
		{
			System.out.println("Display Not possible.");
		}
		else if(first.link==null) 
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
				temp=temp.link; 
			}
			System.out.println();
		}
		
	}
}
