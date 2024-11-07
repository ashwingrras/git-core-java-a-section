package org.example.java_data_types;

/*
  Data Types in java : primitive & non-primitive

  Primitive Data Types:    ( where value assign ) 
                            Size         range            default                     value type
 
  1. int                    4 byte                         0             number value / without decimal values   
  2. float                  4 byte                         0.0F           number, fraction / decimal value
  3. double   				8 byte                         0.0d           number, fraction / decimal value
  4. char					2 byte                         '\u0000'      single character, number ( ASCII ), '\u0000'
  5. long					8 byte	                       0L
  6. short					2 byte      -32768 to 32767    0
  7. boolean				1 bit			               false
  8. byte          			1 byte      -128 to 127        0

    double d = 10.00F;
    int a = 1234567890;
    long l = 123456789012L;

  Non-Primitive Data Types: ( where References assign )
                                                            null
  1. String
  2. Array
  3. Class , Object and Interface
 */
public class JavaDataTypesExample 
{
    public static void main(String[] args) 
    {
        // Primitive data type
        long a = 123456789013121L;
        byte b = (byte)-12999999938888L;
        float f = 10.0F;
        double d = 10.0;
        System.out.println("b : "+b);
        char c = 20; //'\u0000';
        System.out.println("c: "+c);
        boolean bool = false;
        short sh = (short) 32770;
        System.out.println("short sh value: "+sh);
        long ll = (long) 12345678901L;

        System.out.println(Integer.toBinaryString(12));

        // Non Primitive
        // String is immutable
        // First way of initialize String
        String stringOne = "aman".intern(); // new object, @123sa!
        System.out.println("stringOne: "+stringOne);
        //stringOne = "rohit"; // new object
        System.out.println("stringOne: "+stringOne);
        // Second way of initialize String
        String stringTwo = "aman"; // here java will check from string pool
        // if same value found then it will gives that value reference to this variable
        // in case of new it will not going to check value at string pool, it always
        // creating new reference 
        String stringThree = new String("aman").intern(); // new object / reference
        // below checking reference not value
        System.out.println("stringOne == stringTwo");
        System.out.println(stringOne == stringTwo); // true
        System.out.println("stringOne == stringThree");
        System.out.println(stringOne == stringThree); // false

        String stringFour = new String("aman").intern();
        System.out.println("stringOne == stringFour");
        System.out.println(stringOne == stringFour); // false
        System.out.println("stringThree == stringFour");
        System.out.println(stringThree == stringFour); // 
        System.out.println("-----------------");
        // below checking value using .equals() method
        System.out.println(stringOne.equals(stringTwo)); // true
        System.out.println(stringOne.equals(stringThree)); // true
        //String is immutable ( non changable )
        String collegeName = "GIT"; // new object / reference
        collegeName = "NIT"; // new object / reference
        System.out.println("collegeName : "+collegeName);
        String name = "aman";
        String name2 = name.concat(" ,");
        System.out.println("name: "+name);
        System.out.println("name2: "+name2);
        System.out.println(name == name2);

    }    
}