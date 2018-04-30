public class SwapNumbers {

    int s;
    int t;

    public static void swap(int a, int b){ // pass by value
        int temp = a;
        a = b;
        b = temp;
    }
    public static void swap(SwapNumbers p){ // pass by reference
        int temp = p.s;
        p.s = p.t;
        p.t = temp;
    }

    public static void main(String[] args){
        SwapNumbers sw = new SwapNumbers();

        sw.s=50;
        sw.t=100;
        swap(sw);
        System.out.println("Pass by reference s is " +sw.s);
        System.out.println("Pass by reference t is " +sw.t);

    }
}
