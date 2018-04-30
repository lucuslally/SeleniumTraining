public class Department {

    // Non static global variables

    public String dept_name;
    public int dept_id;
    public int no_of_emp;

    // Static variable
    public static String comp_name;

    // Static method
    public static void national_holiday(){
        System.out.println("National holiday granted");
    }

    // Non static method

    public void add_dept(){

        System.out.println("Department added");
    }
    public void change_dept(){

        System.out.println("Department changed");
    }
}
