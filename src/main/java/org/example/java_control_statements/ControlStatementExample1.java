package org.example.java_control_statements;
/*
    control statement
    1. if
    2. else
    3. nested if else
    4. else if
    5. switch

 */

public class ControlStatementExample1  
{
    public static void main(String[] args) 
    {
        System.out.println(" at ControlStatementExample1 ");
        
        int a = 30;
        int b = 27;
        int c = 31;
        String maxNumber;
        if(a > b)
        {
            if (a > c) 
            {
                maxNumber = "a";
            }
            else
            {
                maxNumber = "c";
            }
        }
        else
        {
            if (b > c) 
            {
                maxNumber = "b";    
            }
            else
            {
                maxNumber = "c";
            }
        }
        System.out.println(" maximum no = "+maxNumber);
        System.out.println(" end of main method");
    }    
}
