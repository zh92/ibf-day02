package day02;

public class Porche extends Car {

    private String turbo = "off";
    public int accelerate = 0;

    public Porche() {
        super.setColor("red");
    }
    
    public Porche(String color, String registration) {
        setColor(color);
        setRegistration(registration);
    }

    public String getTurbo() { return turbo; }

    //Porche color cannot be changed once it is instantiated
    public void setColor(String c) {}
    
    public void accelerate() {
        this.accelerate++;
        if (this.accelerate >4) {
            this.turbo = "on";
        }
    }

    public void decelerate() {
        this.accelerate--;
        if (this.accelerate <= 4) {
            this.turbo = "off";
        }
    }
}
