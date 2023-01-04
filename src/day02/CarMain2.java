package day02;
public class CarMain2 {
    
    public static void main (String[] args) {

        Porche p = new Porche();
        
        Car c = new Porche("yellow", "s1234z");

        System.out.printf(">>> registration: %s\n", c.getRegistration());

        //Casting
        p = (Porche)c;
        p.accelerate();
        System.out.printf(">>> registration: %s\n", p.getRegistration());

        c = new Car();
        if (c instanceof Porche) {
            System.out.printf("It is a porche");
            p = (Porche)c;
            p.accelerate();
        }

    }
}
