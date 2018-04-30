public class Students {

    String name;
    int roll;
    int age;

    public Students(){
        System.out.println("Adding student records");
    }
    public Students(String name, int age, int roll){
        this.name = name; // Local variable name to Global variable name
        this.age = age;
        this.roll = roll;
    }

    public static void main(String[] args){
        Students s1 = new Students();
        s1.name = "Tom";
        s1.roll = 1;
        s1.age = 14;

        Students s2 = new Students();
        s2.name = "Jack";
        s2.roll = 2;
        s2.age = 15;

        Students s3 = new Students("Raman",15,3);
        System.out.println("Argumented constructor name: "+s3.name);
        System.out.println("Argumented constructor age: "+s3.age);
        System.out.println("Argumented constructor roll: "+s3.roll);

        // Constructor - Void return, Same name as class, called automatically when object of class is called
    }
}
