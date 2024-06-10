package Vjezba_9.Zd_1;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;
import java.util.List;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;


public class Gunslinger implements Serializable {
    private String name;
    private LocalDate dob;
    private int duels;
    private String strongHand;
    private boolean twoGuns;

    public Gunslinger(String name) {
        this.name = name;
    }


    public Gunslinger(String name, String hnd, boolean two, int ccaYr){
        this.name = name;
        this.strongHand = hnd;
        this.twoGuns = two;
        this.dob = genDob(ccaYr);
        this.duels = genDuelsWon();

    }
    private LocalDate genDob(int ccaYr){
        LocalDate dob;
        LocalDate startDate = LocalDate.of(ccaYr, 1, 1);
        long start = startDate.toEpochDay();
        System.out.println(start);
        int rndYr = ThreadLocalRandom.current().nextInt(ccaYr +25, ccaYr+100);
        LocalDate endDate = LocalDate.of(rndYr, 1, 1);
        long end = endDate.toEpochDay();

        long dobs = ThreadLocalRandom.current().longs(start,end).findAny().getAsLong();
        dob = LocalDate.ofEpochDay(dobs);
        return dob;
    }
    private int genDuelsWon(){
        int dls = ThreadLocalRandom.current().nextInt(10, 100);
        return dls;
    }
    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int getDuels() {
        return duels;
    }

    public String getStrongHand() {
        return strongHand;
    }

    public boolean isTwoGuns() {
        return twoGuns;
    }


    void setTwoGuns(boolean twoGuns) {
    }

    void setStrongHand(String domHand) {
    }

    void setDuels(Integer duels) {
    }

    void setDob(LocalDate dob) {
    }
}
