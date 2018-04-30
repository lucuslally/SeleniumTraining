public class Calculator {
    /*
    Calculator
    1. Methods - Add, sub, mul, div
    2. return - int
    3. parameters - each have two int
     */

    static int x = 10;
    static int y = 2;

    public static void main(String[] args){
        Calculator calc = new Calculator();
        calc.add(x, y); // arguments passed to method expect 12

        calc.subtract(x,y); // expect 8

        calc.multiply(x,y); // expect 20

        calc.divide(x,y); // expect 5

    }

    public int add(int x, int y){ // parameter
        int results = x + y;

        System.out.println(results);
        return results;
    }
    public int subtract(int x, int y){
        int results = x - y;

        System.out.println(results);
        return results;
    }
    public int multiply(int x, int y){
        int results = x * y;

        System.out.println(results);
        return results;
    }
    public int divide(int x, int y){
        int results = x / y;

        System.out.println(results);
        return results;
    }

}
