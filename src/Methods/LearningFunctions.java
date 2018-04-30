public class LearningFunctions {
    public static int a = 30;
    public static int b = 20;

    public static void print(){
        System.out.println("Learning Functions");
    }

    public static void addNumbers(){
        int c = a + b;
        System.out.println("Addition of two numbers are  " + c);
    }
    public static int addNumbers(int r, int s){
        int add = r + s;
        return add;
    }

    public static void main(String[] args){
        print();
        addNumbers();
        addNumbers(30,40);
        int res = addNumbers(30,40);
        System.out.println(res);
    }
}
