package day02;

public class Car {
    
    private String registration;
    private String color;
    private int year;
    private boolean started;

    //Constructors, constructors have no type
    public Car () {
        //default constructor
        this.color = "white";
    }

    public Car (String color, String registration) {
        this.color = color;
        this.registration = registration;
    }

    public String getRegistration() { return this.registration; }
    public void setRegistration(String r) { this.registration = r; }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public boolean isStarted() {
        return started;
    }

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    public void getOutOfMyWay() {
        System.out.printf("HONK........");
    }
}
