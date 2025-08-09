package com.nt.sbeans;

public class A
{
	private B b;
	
	public A(B b)
	{
		this.b=b;
		System.out.println("B::1-param constructor");
		
	}
	public String toString()
	{
		//updating comment
		System.out.println("updated");
		//returning
		return "from A";
	}

}
