public class BooleanDatatype {
    public static void main(String[] args){

        boolean bol = true;

        System.out.println(10<20);

        int first_num = 10;
        int sec_num = 20;
        int third_num = 30;

        String abc = "Welcome to Selenium tutorial";
        String def = "Welcome to Selenium tutorial";

        if(abc == def){

            System.out.println("Both the Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }


        boolean result = first_num>sec_num;
        System.out.println(result);

        // && and
        // || or
        // > greater than
        // >= greater than or equal to
        // < less than
        // <= less than or equal to
        // != not equals
        // == comparison
        // = assignment

        if(first_num > sec_num || first_num > third_num){
            System.out.println("First num is greater " + first_num);
        }
        else if (sec_num > first_num && sec_num > third_num){
            System.out.println(("Second num is greater " + sec_num));
        }
        else {
            System.out.println("Third number is greater " + third_num);
        }
    }
}
