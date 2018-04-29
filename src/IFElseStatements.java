public class IFElseStatements {
    public static void main(String[] args){

        int x = (int)(Math.random() * 20);
        System.out.println(x);
        if(x > 10){ //condition. If true then execute code block
            System.out.println(x + " is greater than 10");
        }
        else if (x <= 10 && x >= 5){
            System.out.println(x + " is between 5 and 10");
        }
        else {
            System.out.println(x + " is less than 10");
        }
    }
}
