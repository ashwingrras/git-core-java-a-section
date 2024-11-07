package org.example.java_control_statements;

public class FindMinMaxWithSameValue
{
    public static void main(String[] args) 
    {
        int a = 13;
        int b = 14;
        int c = 13;

        // case 1 : a = 13, b = 14, c = 13
        // b : maximum
        // a & c  : minimum    

        // case 2 : a = 14, b = 14, c = 13
        // a & b : maximum
        // c  : minimum    

        // case 3 : a = 14, b = 14, c = 15
        // c : maximum
        // a & b  : minimum  
        
        // case 4 : a = 14, b = 13, c = 13
        // a : maximum
        // b & c  : minimum  
        if (a > b && a > c) 
        {

        }
        else
        {

        }
    }    
}
