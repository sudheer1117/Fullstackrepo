package com.nt.main;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.A;
import com.nt.sbeans.B;
public class CyclicInjectionTest
{
	public static void main(String[] args)
	{
		//create IOC container
		try(FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationcontext.xml");)
		{
		
		//get spring bean class obj ref
		A a=(A)ctx.getBean("a1");
		System.out.println("a="+a);
		System.out.println("=============");
		
		B b=(B)ctx.getBean("b1");
		System.out.println("b="+b);
		}      //try---> since IOC container is Auto closable object and created inside try with source,
				//so it will be closed here automatically
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
