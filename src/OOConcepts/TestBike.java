public class TestBike {
    public static void main(String[] args){

        // super class or parent class
        Bike b = new Bike();
        b.color ="Black";
        b.startBike();

        // child class
        MakeHonda m = new MakeHonda();
        m.color ="Blue";
        m.startBike(); // MakeHonda class method override
        m.tireType();

        Bike b1 = new MakeHonda();
        b1.startBike();
        b1.stopBike();
        ((MakeHonda) b1).tireType();

        // inheritance
    }
}
