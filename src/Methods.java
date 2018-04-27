public class Methods {
    /*
    Methods are block of statements which are used to do a specific task
    Generally used to break up large code blocks into manageable chunks

    1. Access/NonAccessModifier
    2. returnType
    3. MethodName(Parameter List)
    4. {
    5. //method body or statement block
    6. }

     */
    public static void main (String[] args){

    }
    int i; // declaration, initialize

    int j;
    // display

    // return type --> dataType of the value returned by method

    // keyword return

    public void show(){
        int a;
        int b;
        String c;
    }

    public void insertParameters(){
        Methods m = new Methods();
        m.display(1,"hi",'x',123f,false);
        m.show();

        Methods m1 = new Methods();
        m1.show();


    }

    public void display(int k, String a, char c, float f, boolean b){ // declare but cannot define parameters. Need to define values of parameters
        /*
        all definitions goes here
         */
        int j = 100;

        System.out.println("Inside Display Method");

        //String x = "Hello";
        //return "Hello"; // last statement and there can be only one


    }
}
