package Vjezba_5.ZD_2;

import java.text.ParseException;

public class App_ROBOTPERSON_Test {
    public static void main(String[] args) throws ParseException {

        Robot rob = new Robot();
        rob.setName("Roby");
        rob.setId(45126);
        Person prs = new Person("Roberta", 22-12-1997);

        prs.think("Life");
        rob.think("Life");
        prs.walk("North", 50);
        rob.walk("South", 123);
        System.out.println(prs.talk()) ;
        System.out.println("********** Calculations **************");

        System.out.println(prs.calculate(9));
        System.out.println(rob.calculate(9));

    }
}

