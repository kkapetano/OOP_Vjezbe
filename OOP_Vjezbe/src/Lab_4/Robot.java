package Lab_4;

public abstract class Robot {
    protected String name;
    protected int id;




    void turnOn() {
        System.out.println("Robot " + name + " is now turned on.");
    }
    void turnOff() {
        System.out.println("Robot " + name + " is now turned off.");
    }


    public abstract void changeState();

    public abstract void charge();
}
