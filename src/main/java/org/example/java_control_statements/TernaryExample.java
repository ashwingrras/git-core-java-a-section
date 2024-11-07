package org.example.java_control_statements;

public class TernaryExample 
{
 
    public static void main(String[] args) 
    {
        int a = 30;
        int b = 28;
        int c = 20;
        int d = 32;
        String maxValue;
        if (a > b && a > c && a > d) 
        {
            maxValue = "a";
        }
        else
        {
            if (b > c && b > d) 
            {
                maxValue = "b";
            }
            else
            {
                if (c > d)
                {
                    maxValue = "c";    
                }
                else
                {
                    maxValue = "d";
                }
            }
        }


        System.out.println("using if else, maxValue = "+maxValue);
        String maxNumber = a > b  &  a > c ?  "a"     :   b > c  ?   "b" : "c";
        System.out.println(" using turnary, maxNumber = "+maxNumber); 
        
        int maxOfFour = a > b & a > c & a > d ? a : b > c & b > d ? b : c > d ? c : d;
        System.out.println(" using turnary, maxOfFour = "+maxOfFour); 
    }
}
