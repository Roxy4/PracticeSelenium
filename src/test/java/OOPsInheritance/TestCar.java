package OOPsInheritance;

public class TestCar {

    public static void main(String[] args) {
        BMW b = new BMW();
        b.automatic();
        b.refuel();
        b.start();
        b.manual();
        b.V6Engine();
        b.hybrid();

       Car c = new Car();
       c.hybrid();
       c.V6Engine();
       c.manual();





    }
}
