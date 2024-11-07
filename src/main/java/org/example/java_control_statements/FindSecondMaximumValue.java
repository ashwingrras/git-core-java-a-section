package org.example.java_control_statements;

public class FindSecondMaximumValue 
{
    public static void main(String[] args) 
    {
        int a = 21;
        int b = 20;
        int c = 21;
        // maximum and second maximum,
        // maximum      = a
        // secondMax    = c    
        String maximum = null;
        String secondMaximum = null;
        if (a > b) 
        {
            if (a > c) 
            {
                maximum = "a"; 
                if (b > c) 
                {
                    secondMaximum = "b";                   
                }
                else
                {
                    secondMaximum = "c";               
                }
            }
            else
            {   
                secondMaximum = "a";
                //
                if (c > b) 
                {

                    maximum = "c"; 
                }
            }
        }
        else
        {
            if (b > c) 
            {
                maximum = "b"; 
                if (c > a) 
                {
                    secondMaximum = "c";    
                }   
                else
                {
                    secondMaximum = "a";
                }
            }
            else
            {
                maximum = "c";
                secondMaximum = "b";
            }
        }
        System.out.println(" maximum = "+maximum);
        System.out.println(" secondMaximum = "+secondMaximum);
    }    
}
