package org.example.java_control_statements;

public class FindMinMaxValue {
    
    public static void main(String[] args) 
    {
        int a = 14;
        int b = 14;
        int c = 14;
        String maximum = null;
        String minimum = null;
        if (a > b && a > c) 
        {
            // 
            maximum = "a";
            if (b  < c) 
            {
                minimum = "b";
            }    
            else 
            {
                minimum = "c";
            }
        }
        else 
        {
            if (b > c) 
            {
                maximum = "b";
                if (c < a) 
                {
                    minimum = "c";    
                }       
                else
                {
                    minimum = "a";
                }
            }
            else 
            {
                maximum = "c";
                if (a < b) 
                {
                    minimum = "a";    
                }
                else
                {
                    minimum = "b";
                }
            }
        }
        
        System.out.println(" maximum "+maximum);
        System.out.println(" minimum "+minimum);
    }
}
