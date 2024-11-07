package org.example.java_control_statements;

public class MaxFromFourValue
{

    public static void main(String[] args) 
    {
        int a = 24;
        int b = 25;
        int c = 22;
        int d = 29;
        String maxVariable = null;
        // find max  from 4 values
        if (a > b && a > c && a > d) 
        {
            maxVariable = "a";    
        }
        //else if (b > a && b > c && b > d) 
        else if (b > c && b > d) 
        {
            maxVariable = "b";
        }
        else if (c > d) 
        {
            maxVariable = "c";    
        }
        else 
        {
            maxVariable = "d";
        }
        System.out.println(" max variable = "+maxVariable);
    }
    
}
