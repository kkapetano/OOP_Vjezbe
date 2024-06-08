package Lab_4;

import java.util.ArrayList;
import java.util.List;

public class AppClient {
    public static void main(String[] args) {
        List<Robot> robots = new ArrayList<>();

        // Dodavanje tri objekta IndustrialRobot
        robots.add(new IndustrialRobot("IR01"));
        robots.add(new IndustrialRobot("IR02"));
        robots.add(new IndustrialRobot("IR03"));

        // Dodavanje dva objekta FlyingRobot
        robots.add(new FlyingRobot("FR01"));
        robots.add(new FlyingRobot("FR02"));

        // Pozivanje metode performActions za svakog robota u listi
        performActions(robots);

    }
    private static void performActions(List<Robot> robots) {
        for (Robot robot : robots) {
            System.out.println("<<<<<<<<<" + robot.getClass().getSimpleName() +  ">>>>>>>>>");
            System.out.println("[name = " + robot.name + " <-> id = " + robot.id + "]");
            robot.turnOn();
            robot.changeState();
            robot.charge();
            robot.turnOff();

        }


    }
}
