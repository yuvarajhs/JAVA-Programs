package com.dataStructure.circularQueue;

public class CircularQueue
{
	private int cq[];
	private int size;
	private int rear=-1;
	private int front=0;
	private int count=0;
	
	public CircularQueue(int n)
	{
		cq=new int[n];
		size=n;
	}
	
	public void insert(int element)
	{
		if(count==size)
			System.out.println("Insertion is not possible.");
		else
		{
			rear = (rear+1)%size;
			cq[rear] = element;
			System.out.println(cq[rear]+" is inserted into CircularQueue.");
			++count;
		}
	}
	
	public void delete()
	{
		if(count==0)
			System.out.println("Deletion is not possible.");
		else
		{
			System.out.println(cq[front]+" is deleted from the CircularQueue.");
			front = (front+1)%size;
			--count;
		}
	}
	
	public void display() 
	{
		if(count == 0)
		{
			System.out.println("Display is not possible.");
		}
		else
		{
			int f=front;//Never ever change the front and rear value for display. So we assign it to the new variable 'f'.
			System.out.print("The elements in the CircularQueue are ----->");
			for(int i=1;i<=count;i++)
			{
				System.out.print(cq[f]+" ");
				f = (f+1)%size;
				
			}
			System.out.println();
		}
	}

}