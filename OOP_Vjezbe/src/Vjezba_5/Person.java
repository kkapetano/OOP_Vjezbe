package Vjezba_5;

import java.util.UUID;

public class Person implements CommonActions {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public void walk(String cmnd, int steps) {
        System.out.println("I'm a human and you cant command me");

    }

    @Override
    public String talk() {
        String message="You want me to talk - ok: " + UUID.randomUUID().toString();
        return message;
    }

    @Override
    public void think(String topic) {
        System.out.println("Surely, humands are more capable of thinking - arent they?");


    }

    @Override
    public int calculate(int num) {
        return num%2;
    }

    public void infoPerson(){
        System.out.println("Person: " + this.name + " - age: " + this.age);
    }
}