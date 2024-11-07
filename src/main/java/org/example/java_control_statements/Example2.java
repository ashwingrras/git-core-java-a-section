package org.example.java_control_statements;

public class Example2
{
    public static void main(String[] args) 
    {
        int a = 30;
        int b = 27;
        int c = 31;
        String maxNumber = null;
        if (a > b && a > c) 
        {
            maxNumber = "a";   
        }
        else if (b > c) 
        {
            maxNumber = "b";
        }
        else 
        {
            maxNumber = "c";
        }    
        System.out.println(" maximum no = "+maxNumber);
    }    
}
