package org.example.java_control_statements;

public class FindMinMaxWithEqualOfTwoValue
{
    public static void main(String[] args) 
    {
        int a = 9;
        int b = 10;
        String result;
        // case 1: a = 10, b= 10
        // result = both are equal    

        // case 2: a = 10, b= 9
        // result = a is maximum and b is minimum

        // case 3: a = 9, b= 10
        // result = b is maximum and a is minimum
        if (a > b) 
        {
            result = " a is maximum and b is minimum";
        }
        else
        {
            if (a != b) 
            {
                result = " b is maximum and a is minmum";    
            }
            else
            {
                result = " both a & b are equal";
            }
        }
        System.out.println(" result = "+result);
    }    

}
