package org.jsp.classcast;

public class D extends C
{
	public void test()
	{
		System.out.println("D class Called test method");
	}
	public void test1()
	{
		System.out.println("D class Called test1 method");
	}
	@Override
	public void print()
	{
		System.out.println("A Claa Print Method overriden D class");
	}

}
