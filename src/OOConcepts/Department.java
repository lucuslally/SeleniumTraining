public class Department {

    // Non static global variables

    public String dept_name;
    public int dept_id;
    public int no_of_emp;

    /*
    Access Modifiers
    default - common for Selenium - Only accessed inside the current package
    public - common for Selenium - Anywhere inside any package/class
    private
    protected

    Modifier    class       package     subclass    world
    public      v           v           v           v
    protected   v           v           v           x
    no modifier v           v           x           x
    private     v           x           x           x
     */

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
