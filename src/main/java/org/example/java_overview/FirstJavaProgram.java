package org.example.java_overview;

import java.util.*;

// FirstJavaProgram.main(new String[]{"GIT"})
public class FirstJavaProgram
{
	int a = 10;
	static int b = 5;
	// this is a method, name as main
	// static method
	public static void main(String args[])
	{
		System.out.println("This is my first java program");
		FirstJavaProgram firstJavaProgram = new FirstJavaProgram(); // new object creating
		System.out.println("firstJavaProgram object as: "+firstJavaProgram);
		FirstJavaProgram firstJavaProgramTwo = new FirstJavaProgram(); // new object creating
		System.out.println("firstJavaProgramTwo object as: "+firstJavaProgramTwo);
		int result = firstJavaProgram.sum(10,5);
		System.out.println("sum result is: "+result);
		int multiplyResult = FirstJavaProgram.multiply(5,6);
		System.out.println("multiply result is: "+multiplyResult);
		String[] names = {"aman","chetan"};
		main(names,names);

	}

	public static void main(String args[], String vargs[])
	{
	  System.out.println("names array "+ Arrays.toString(args));
	}

	// non-static method
	public int sum(int a, int b)
	{
		return a + b;
	}
	// static method
	public static int multiply(int a, int b)
	{
		return a * b;
	}

}
