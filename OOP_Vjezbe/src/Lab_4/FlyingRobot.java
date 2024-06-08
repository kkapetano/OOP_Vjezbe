package Lab_4;

public class FlyingRobot extends Robot {
    private static int cntId = 10;

    public FlyingRobot(String name) {
        this.name = name;
        this.id = cntId;
        cntId += 10; // Incrementing id by 10 for the next flying robot
    }




    @Override
    public void changeState() {
        System.out.println(getClass().getSimpleName() + " can really fly autonomously...");
    }

    @Override
    public void charge() {
        System.out.println(getClass().getSimpleName() + " needs to be charged with the DC current charger!");
    }
    @Override
    public String toString() {
        return "FlyingRobot{name='" + getClass().getSimpleName() + "', id=" + id + "}";
    }
}

