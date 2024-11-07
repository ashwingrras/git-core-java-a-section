package org.example.java_control_statements;

public class SwitchExample1
{
    public static void main(String[] args) 
    {
        // int, String, char
        
        // a, e, i, o, u

        char c = 'd';
        switch (c) {
            case 'a','e','i','o','u':
                System.out.println("  this is vowel ");
                break;
            //
            default:
                System.out.println("  this is not vowel ");
        }

        short a = 1;
        // old way of switch
        switch (a) // expression
        {
            case 1, 4:
                System.out.println(" inside case 1");
                break;
            //
            case 2:
                System.out.println(" inside case 2");
                break;
            //
            case 3:
                System.out.println(" inside case 3");
                break;
            default:
                System.out.println(" default case");
        }
        // new way of switch 
        //rule switch
        /*
        switch (a) // expression
        {
            case 1 -> 
                {
                    System.out.println(" inside case 1");
                    System.out.println(" now we find the case 1");
                }
            case 2 -> 
            {
                System.out.println(" inside case 2");
                System.out.println(" case 2 ");
            }
            case 3 -> System.out.println(" inside case 3");
            default -> System.out.println(" default case rule switch");
        }
        */
        //
        //
                
    }    
}
