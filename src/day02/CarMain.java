package day02;

public class CarMain {

    //entry point
    public static void main(String[] args) {
        //Instantiate an instance of a car
        Car c = new Car();
        c.setColor("grey");
        c.setRegistration("sdf34343");
        c.start();
        System.out.printf("Is the car started? %b\n", c.isStarted());

        c.getOutOfMyWay();

        Car d = new Car();
        d.setColor("red");

        Car e = new Car("black", "s12334e");
        System.out.printf("Color of my car: %s/n", e.getColor());
        System.out.printf("Registration of my car: %s/n", e.getRegistration());

        Porche p = new Porche();
        System.out.printf("Porche Color of my car? %s\n", p.getColor());
    }
}
