public class MethodCalling {

    // Static component --> cannot give a call to non-static component directly

    // Static component --> static (allowed)
    // Non static --> non static, static (allowed)
    // Non static components --> cannot be called without making an object

    // Everything static --> Not OO

    /*
    Compile
    Executed --> JVM
    Main method called first
    Methods in the sequence
     */

    public static void main(String[] args){
        MethodCalling m = new MethodCalling();
        m.go1();
        //go3();
        System.out.println("After calling go1 method");

        /*
        Inside Go1 Method
        Inside Go2 Method
        After calling go2 Method
        After calling go1 method

         */


    }
    public void go(){
        System.out.println("Inside Go Method");
        go2();
        System.out.println("After calling go2 Method");

    }
    public void go1(){
        System.out.println("Inside Go1 Method");
        go2();
        System.out.println("After calling go2 Method");
    }
    public void go2(){
        System.out.println("Inside Go2 Method");
    }
    public static void go3(){
        System.out.println("Inside Go3 Method");
    }
}
