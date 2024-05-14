package Vjezba_5.ZD_2;

public class Robot implements CommonActions {
    private String name;
    private int id;
    private int cntID;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCntID(int cntID) {
        this.cntID = cntID;
    }

    @Override
    public void walk(String cmnd, int steps) {
        System.out.println("Robot is walking " + steps + " steps following the direction: " + cmnd);
    }

    @Override
    public String talk() {
        String message = "This robot cant speak.";
        System.out.println(message);
        return message;
    }
    @Override
    public void think(String topic) {
        System.out.println("Robot is processing data about " + topic);
        System.out.println("Thinking...");
    }

    @Override
    public int calculate(int num) {
        System.out.println("Robot is calculating the number: " + num);
        return num * 2;
    }

    public void infoRobot(){
        System.out.println("Robot: " + this.name + " - id: " + this.id);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", age=" + id +
                '}';
    }
}
