package Vjezba_6;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Objects;


class Zd_4_Robot {
    private int id;
    private String opis;

    public Zd_4_Robot(int id, String opis) {
        this.id = id;
        this.opis = opis;
    }

    public int getId() {
        return id;
    }
    public String getOpis() {
        return opis;
    }
    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", opis='" + opis + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zd_4_Robot zd4Robot = (Zd_4_Robot) o;
        return id == zd4Robot.id && Objects.equals(opis, zd4Robot.opis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, opis);
    }
}

     class RobotDemo{
        public static void main(String[] args) {
            Zd_4_Robot flyingRobot = new Zd_4_Robot(1, "Flying robot");
            Zd_4_Robot cleaningRobot = new Zd_4_Robot(2, "Cleaning robot");
            Zd_4_Robot thinkingRobot = new Zd_4_Robot(3, "Thinking robot");
            Zd_4_Robot humorousRobot = new Zd_4_Robot(4, "Humorous robot");
            Zd_4_Robot friendlyRobot = new Zd_4_Robot(5, "Friendly robot");
            Zd_4_Robot weirdRobot = new Zd_4_Robot(6, "Weird robot");

            // Dodavanje objekata u LinkedHashMap
            Map<Integer,Zd_4_Robot>robotMap = new LinkedHashMap<>();
            robotMap.put(flyingRobot.getId(), flyingRobot);
            robotMap.put(cleaningRobot.getId(), cleaningRobot);
            robotMap.put(thinkingRobot.getId(), thinkingRobot);
            robotMap.put(humorousRobot.getId(), humorousRobot);
            robotMap.put(friendlyRobot.getId(), friendlyRobot);
            robotMap.put(weirdRobot.getId(), weirdRobot);

            //Dodavanje vec postojeceg objekta
            robotMap.put(flyingRobot.getId(), flyingRobot);

            System.out.println("LinkedHashMap elementi");
            for (Map.Entry<Integer, Zd_4_Robot> entry : robotMap.entrySet()){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

            Set<Zd_4_Robot>robotSet = new LinkedHashSet<>();
            robotSet.add(flyingRobot);
            robotSet.add(cleaningRobot);
            robotSet.add(thinkingRobot);
            robotSet.add(humorousRobot);
            robotSet.add(friendlyRobot);
            robotSet.add(weirdRobot);

            //Dodavanje vec postojeceg objekta
            robotSet.add(flyingRobot);

            System.out.println("LinkedHashSet elementi");
            for (Zd_4_Robot robot : robotSet) {
                System.out.println(robot);
            }
        }
    }

    //Implementacija hashCode i equals metoda je ključna za ispravno ponašanje kolekcija koje se
    //oslanjaju na ove metode za prepoznavanje i rukovanje duplikatima. Kada su ove metode ispravno
    //definirane, možemo učinkovito koristiti HashSet, LinkedHashSet, HashMap, i LinkedHashMap bez pojave neočekivanih
    //duplikata.




