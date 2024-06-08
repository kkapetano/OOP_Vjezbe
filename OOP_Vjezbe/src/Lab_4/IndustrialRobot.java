package Lab_4;

public class IndustrialRobot extends Robot{
    private static int cnt = 10;


    public IndustrialRobot(String name) {
        this.name = name;
        this.id = cnt;
        cnt += 10; // Inkrementiranje id-a za 10
    }


    @Override
    public void changeState() {
        System.out.println(name + " can't move from one spot to another but have remarkable state dynamics...");
    }

    @Override
    public void charge() {
        System.out.println(name + " is always connected to the electrical grid...");
    }
    @Override
    public String  toString() {
        return "IndustrialRobot{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
