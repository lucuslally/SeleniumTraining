public class Variables {
    static int i = 10; // instance variables

    public static void main(String[] args) {

        // instance / local / class variables

        Variables v = new Variables(); // v is a reference and a holding a copy of the class
        v.i++; // Object1 i = 11;
        Variables v1 = new Variables(); // another copy created
        v1.i++; // Object2 i = 11;
        Variables v2 = new Variables(); // another copy created
        System.out.println(v2.i); // 10

        /*

        instance -- declared inside the class body
        local variables -- declared inside the method body

        making instance variable static causes it to become a class variable. Every time i is called, it is passed around and manipulated

        referenceVariable.instanceVariable/method

         */
    }

    public void go() {


        int i = 123; // local variable

    }
}
