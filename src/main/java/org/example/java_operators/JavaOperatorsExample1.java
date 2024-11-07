package org.example.java_operators;
/*
  Data Types:
  1. int
  2. float
  3. double
  4. short
  5. long
  6. byte
  7. char

  8. String:
      "5" + "1" ( concate)
      5 + 1 ( addition )

  Java Operators:
  1. Arthematic : +, -, *, /, %
  2. Assignment: =, +=, -=, *=, /=, %=
  3. Increment/Decrement  ( unary ), ++, -- ( prefix & postfix)  
  4. Logical: AND (&&), OR (||), NOT (!)
  5. BitWise: AND (&), OR (|) , XOR (^)
  6. Ternary ( conditional): ? :
  7. Relational / Comparison : ==, <, >, <=, >=, !=
  8. Shift Operator:  left shift (<<) , Right shift (>>), unsigned right shift ( >>> ) 

  Here's a summary of the operator precedence in Java:

  1. Postfix: `expr++`, `expr--`
  2. Unary: `++expr`, `--expr`, `+expr`, `-expr`, `~`, `!`
  3. Multiplicative: `*`, `/`, `%`
  4. Additive: `+`, `-`
  5. Shift: `<<`, `>>`, `>>>`
  6. Relational: `<`, `>`, `<=`, `>=`, `instanceof`
  7. Equality: `==`, `!=`
  8. Bitwise AND: `&`
  9. Bitwise XOR: `^`
  10. Bitwise OR: `|`
  11. Logical AND: `&&`
  12. Logical OR: `||`
  13. Ternary: `? :`
  14. Assignment: `=`, `+=`, `-=`, `*=`, `/=`, `%=`, `&=`, `^=`, `|=`, `<<=`, `>>=`, `>>>=`

  Operators higher in the list have higher precedence and are evaluated before operators lower in the list. Operators on the same line have equal precedence and are evaluated based on their associativity (left-to-right or right-to-left).


 */

 

public class JavaOperatorsExample1 
{
    int no = 10;
    int a = 5;
    static int b = 6;
    public static void main(String[] args) 
    {
        
        //
        //testArithmaticOperator();
        //testAssignmentOperator();
        //testUnaryOperator();
        //testLogicalOperator();
        testBitWiseOperator();
    }

    public static void testArithmaticOperator()
    {
      //
        System.out.println("inside testArithmaticOperator");
        int no = 2 * (2 * (2 + 1) * 2) * (2 + 2);
        System.out.println("no : "+no);
        char c = 65 + 1;
        System.out.println("c : "+c);
        int multiply = 29 / 5; // 5
        int modulous = 29 % 5; // 4
        String firstName = "aman";
        String lastName = "sharma";
        String fullName = firstName + lastName;
        byte d = 10 + 5;
        System.out.println("byte d = "+d);
    }

    public static void testAssignmentOperator()
    {
      /*
        =, +=, -=, *=, /=, %=
       */
      System.out.println(" at testAssignmentOperator");
      int a = 10; // value 10 assign to variable a
      System.out.println("a : "+a);
      a += 5; // 15
      a *= 2; // 30
      a = a / 5; // 6
      a /= 2; // 3
      System.out.println("a : "+a);
      String name = "aman";
      name += " sharma";
      System.out.println("name : "+name);
    }

    // TODO increment / decrement operator
    public static  void testUnaryOperator()
    {
      System.out.println(" at testUnaryOperator ");
      /*
        ++
        --
        postfix :  a++, a--
        prefix  :  ++a, --a 
       */
        int a = 10;
        a++;
        System.out.println("a : "+a); // 11
        System.out.println(a++); // 11
        System.out.println(a++); // 12
        System.out.println(a++); // 13
        System.out.println(a); // 14

        a = 15; // 15
        int c = 15;
        System.out.println(a); // 15
        System.out.println("------"); // 15
        System.out.println("c : "+c);
        c = a++; //a = 15, a++: 16
        System.out.println("c : "+c++); // 15
        System.out.println("c : "+c); // 15
        System.out.println(a); // 
        c = a++;
        System.out.println(a); // 
        // 16
        a = a++;
        System.out.println(a); // 
        System.out.println("------");
        int b = 15;
        ++b;
        System.out.println("b : "+b); // 16
        System.out.println(++b); // 17
        System.out.println(++b); // 18
    }

    public static void  testComparisonOperator()
    {
      System.out.println(" at testComparisonOperator");
      // ==, <, >, <=, >=, !=
      int a = 10;
      int b = 9;
      System.out.println(a == b); // false
      System.out.println(a != b); // true
      System.out.println(b != a); // true
      System.out.println( a > b); // true
      System.out.println( b < a); // true
    }
    
    public static void testLogicalOperator()
    {

      System.out.println(" at testLogicalOperator ");
      /*
          Logical AND ( && )
          condition 1   condition 2       result
            true          true            true
            false         true            false
            true          false           false
            false         false           false

          Logical OR ( || )
          condition 1   condition 2       result
            true          true            true
            false         true            true
            true          false           true
            false         false           false

       */

        int a = 10;
        int b = 5;
        int c = 6;
        System.out.println( a > b && a > c); // true
        System.out.println( a > b || a < b && a > c); // true
        System.out.println( a > b && a < b || a > c); // true
        System.out.println( (a == b && a == c) || a > b); // true
        System.out.println( (a == b && a == c) && a > b); // false
        System.out.println( a > b     || b > c && c < b && a < c ); // true
                          //        true   && false && false
        System.out.println("***************");
        System.out.println(a < c && b < c && c > b || a > c); // false, true
        // false && true
                          // false        &&  true
                          // false                || true
                          //true
        System.out.println((a < c) && (b < c && c > b || a > c));
                          // false && 
        System.out.println(a > c || b > c && c < b || a < c);
                        // true || false
                        // true           && false
                        // false                   || false
                        // false
        //
        System.out.println((a < c));// false
        System.out.println(!(a < c));
    }    
    
    
    public static void  testBitWiseOperator()
    {
      //    & (bitwise AND), | (bitwise OR), 
      //    ^ (bitwise XOR),, ~ (bitwise NOT),
      //  << (left shift), >> (right shift), >>> (unsigned right shift).

      System.out.println(" at testBitWiseOperator ");
      /*
          Bitwise AND ( & )
          condition 1   condition 2       result
            true          true            true
            false         true            false
            true          false           false
            false         false           false

          Bitwise OR ( | )
          condition 1   condition 2       result
            true          true            true
            false         true            true
            true          false           true
            false         false           false

          Bitwise XOR ( ^ )
          condition 1   condition 2       result
            true          true            false
            false         true            true
            true          false           true
            false         false           false

       */

      int a = -5;
      int b = 5;
      System.out.println("a without binary : "+a);
      System.out.println(Integer.toBinaryString(a));
      System.out.println(Integer.toBinaryString(b));
      System.out.println(a & b & a);
      System.out.println(a | b);
      System.out.println(a ^ b);

      //  << (left shift), 
      int c = a << 2;
      System.out.println(" left shift");
      System.out.println("c : "+c); // 10 bit: 1010
      System.out.println("a binary : "+Integer.toBinaryString(a));
      System.out.println("c binary : "+Integer.toBinaryString(c));
      //>> (right shift), 
      int d = a >> 2;
      System.out.println(" right shift");
      System.out.println("d : "+d);
      System.out.println("a binary : "+Integer.toBinaryString(a));
      System.out.println("d binary : "+Integer.toBinaryString(d));
      // >>> (unsigned right shift).
      int e = a >>> 2;
      System.out.println(" unsigned right shift");
      System.out.println("e : "+e);
      System.out.println("a binary : "+Integer.toBinaryString(a));
      System.out.println("e binary : "+Integer.toBinaryString(e));
    }


}
