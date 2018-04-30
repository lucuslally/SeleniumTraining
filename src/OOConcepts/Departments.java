public class Departments implements Employee{

    public static void main(String[] args){
        Employee e = new Departments(); // Created new child class Departments
        e.hr_policy();
        e.salary();

    }

    @Override
    public void salary() {

        System.out.println("Salary granted for this month");

    }

    @Override
    public void hr_policy() {
        System.out.println("HR Policies applied");

    }
}
