public class Company {

    public static void main(String[] args){

        Department d = new Department();
        Department d1 = new Department();
        Department.comp_name ="Microsoft"; // Static | Class name . Static variable
        Department.national_holiday(); // Static | Class name . Static method name

        d.dept_id =10;
        d.dept_name ="Telecoms";
        d.no_of_emp = 1000;

        d.add_dept();
        d.change_dept();

        System.out.println("Department_id: "+d.dept_id);
        System.out.println("Department_name "+d.dept_name);
        System.out.println("Department_no_of_emp "+d.no_of_emp);

        System.out.println("Department_id: "+d1.dept_id);
        System.out.println("Department_name "+d1.dept_name);
        System.out.println("Department_no_of_emp "+d1.no_of_emp);
    }
}
