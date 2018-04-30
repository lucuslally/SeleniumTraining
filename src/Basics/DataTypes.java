public class DataTypes {
    public static void main (String[] args){

        // primitive data types

        int i = 1234; // integer
        float f = 1.2343434343434f; // declaration & initialization
        long l = 123456789013443l;
        boolean b = false;
        char c = 'a';
        String s = "This is a Java Tutorial"; // Class in Java

        HelloWorld t;

        String xyz = "Some String Characters";

        // Camel Casing
        // Enhances readability
        int batmanBegins;
        int theDarkKnightRises;

        // Naming coding standards
        /*
        Classes
        should start capitalized then camel casing. Represent a noun (ie. Account)

        Interfaces
        should start capitalized then camel casing. Represent adjectives (ie. ActionListener, Runnable)

        Methods
        should start lower case then camel casing. Represent verb-Noun pair. (ie. getResult, doCalculation)

        Variables
        First character should be small then camel casing. Represent small meaning words. (ie. buttonWidth)

        Constants
        All characters are upper case and connect with (_) (ie. EXIT_ON_CLOSE)

         */

        String abc = new String(); // Create new String object (copy or instance of the Class) and assign it to a reference variable named "abc"
        abc = "Hello";

        String abc1 = "Hello";


        String s1 = "Way";
        String s2 = "2";
        String s3 = "Automation";

        String s4 = s1 + s2 + s3;
        System.out.println(s4);
        System.out.println(s1 + s2 + s3);
        System.out.println("Way" + "2" + "Automation");

        int num1 = 10;
        int num2 = 5;

        System.out.println(num1 + num2);

        System.out.println("before" + num1 + num2 + "after"); // forms and entire string

        System.out.println(!true); // logical operator

        System.out.println(34<=78); // conditional operator

        System.out.println((123<=123) && (10==10)); // and

        System.out.println((123<=123) || (10==10));


        /*

        12 + 45 // Operands

        Unary Operator --> single operand
        ++i increment
        --i decrement
        '!' logical operator for true false condition like !boolean

        Binary Operator --> two operand
        Arithmetic
        +
        -
        *
        /
        %

        Equality & Relational operators
        == equal to
        != not equal to
        > greater than
        < less than
        >= greater than or equal to
        <= lesser than or equal to

        Conditional Operators
        && and
        || or
        ?: Ternary operator


        Ternary Operator --> three operand
         */

    }
}
