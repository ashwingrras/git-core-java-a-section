package org.example.java_variable_types;


/*
	java variable types:
	1. local variable :  			method level scope
	2. non-static / instance variable :			class level scope
	3. static variable / global		only class and project level scope

	instance variable:
	1. we can use in non-static method directly
	2. we can't use in static method directly, if want to use we have to create object
	and using created object reference we can use instance variable

	static variable:
	1. we can create only class level static variable, it not allow to create
	inside any type of method
	2. we can use inside any type of method ( Both static & non-static)

	non-static method:
	1. we can use all type ( local, instance and  static) variable 
	inside non-static method

	static method:
	1. we can use static variable of class and local variable we can use inside static method
	2. we can call directly static method of same class without creating object
	3. we can call non-static method using class object ( we have to create new object
	 to call non-static method)
	4. we can't use instance variable directly on static method

 */

 
public class JavaVariableTypesExample
{
	int a = 15; // instance variable / non-static variable
	static int b = 5; // static variable
	int c = 14; // instance
	static  int d = 9; // static
	public static void main(String args[])
	{
		System.out.println("at java variable type example");
		//System.out.println("a: "+a); not allow bcz  it is an instance variable, 
		int a = 10;  // local variable
		System.out.println("a: "+a);
		System.out.println("b: "+b); // static variable value
		int b = 8; // local variable
		System.out.println("b: "+b);
		testVariable();
		JavaVariableTypesExample object1 = new JavaVariableTypesExample();
		object1.showVariableValue();
	}

	public  int sum(int a, int b) // local variable
	{
		System.out.println("c: "+c);
		System.out.println("d: "+d);
		int total = a + b; // total is also a local variable
		return  total;
	}

	// only static variable and local variable
	public static void testVariable()
	{
		System.out.println(b);	// static variable
		//System.out.println(a); // we can't use instance variable inside static method
		int b = 6; // local 
		System.out.println(b); // local
		//static int c = 10; // static not allow inside any method
		JavaVariableTypesExample object1 = new JavaVariableTypesExample();
		System.out.println(object1.a); // instance variable
		////object1.showVariableValue(); // calling non-static method using object
	}

	// non-static
	// local, instance and static variable
	public void showVariableValue()
	{
		System.out.println(a); // instance
		System.out.println(b); // static
		int a = 14; // local
		System.out.println(a); // local
		//static int f = 13; //// static not allow inside any method
		//testVariable(); // call directly static method from non-static method

		// getting other class static variable
		System.out.println(ClassTwoVariableType.b); // other class static variable
		ClassTwoVariableType object1 = new ClassTwoVariableType();
		// getting other class instance varialbe using object reference
		System.out.println(object1.a); // other class instance variable

		// calling other class static method
		int divideResult = ClassTwoVariableType.divide(10, 5); // calling other class static method
		System.out.println("divideResult : "+divideResult);

		// calling other class non-static method
		int multiplyResult = object1.multiply(5, 3);// calling other class method using object reference
		System.out.println("multiplyResult : "+multiplyResult);

	}

}

class ClassTwoVariableType
{
	int a = 5; // instance
	static int b = 8; // static variable
	int c = JavaVariableTypesExample.d;
	JavaVariableTypesExample obj1 = new JavaVariableTypesExample();
	int d =  obj1.a; //new JavaVariableTypesExample().a;
	// non-static method
	int e = c + d;
	public int multiply(int a, int b)
	{
		int result = a * b; // local 
		return result;
	}

	// static method
	public static int divide(int a, int b)
	{
		int result = a / b; // local
		return result;
	}

}



