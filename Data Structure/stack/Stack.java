package com.dataStructure.stack;

public class Stack 
{
	private int s[];
	private int size;
	private int top=-1;
	
	public Stack(int n)
	{
		s=new int[n];
		size=n;
	}
	
	public void push(int element)
	{
		if(top==size-1)
			System.out.println("PUSH is not possible(Stack Overflow).");
		else
		{
			++top;
			s[top]=element;
			System.out.println(s[top]+" is inserted into Stack.");
		}
	}
	
	public void pop()
	{
		if(top==-1)
			System.out.println("POP is not possible(Stack Underflow).");
		else
		{
			System.out.println(s[top]+" is POP from the Stack.");
			--top;
		}
	}
	
	public void display() 
	{
		if(top==-1)
		{
			System.out.println("Display is not possible.");
		}
		else
		{
			System.out.print("The elements in the stack are ----->");
			for(int i=top;i>=0;i--)
			{
				System.out.print(s[i]+" ");
			}
			System.out.println();
		}
	}

}
