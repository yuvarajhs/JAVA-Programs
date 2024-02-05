package com.dataStructure.queue;

public class Queue
{
	private int q[];
	private int size;
	private int rear=-1;
	private int front=0;
	
	public Queue(int n)
	{
		q=new int[n];
		size=n;
	}
	
	public void insert(int element)
	{
		if(rear==size-1)
			System.out.println("Insertion is not possible.");
		else
		{
			++rear;
			q[rear]=element;
			System.out.println(q[rear]+" is inserted into Queue.");
		}
	}
	
	public void delete()
	{
		if(rear==-1 || front>rear)
			System.out.println("Deletion is not possible.");
		else
		{
			System.out.println(q[front]+" is deleted from the Queue.");
			++front;
		}
	}
	
	public void display() 
	{
		if(rear==-1 || front>rear)
		{
			System.out.println("Display is not possible.");
		}
		else
		{
			System.out.print("The elements in the Queue are ----->");
			for(int i=front;i<=rear;i++)
			{
				System.out.print(q[i]+" ");
			}
			System.out.println();
		}
	}

}