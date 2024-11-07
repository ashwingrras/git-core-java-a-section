package org.example.java_variable_types;

public class JavaVariableTypesExample2
{

    int a = 10; // instance
    static int b = 5;
    public static void main(String[] args) 
    {
        JavaVariableTypesExample2 object1 = new JavaVariableTypesExample2();
        System.out.println(object1.a); // instance
        System.out.println(b); // static
        int a = 15; // local
    }

    public void testNonStaticMethod()
    {
        System.out.println(a); // instance
        System.out.println(b); // static
        int a = 14; // local
        testStaticMethod(); // calling static method direclty
    }

    static public void testStaticMethod()
    {
        JavaVariableTypesExample2 object1 = new JavaVariableTypesExample2();
        System.out.println(object1.a); // instance
        System.out.println(b); // static
        int a = 14; // local
        //object1.testNonStaticMethod(); // calling non-static method using object reference
    }

    
}
