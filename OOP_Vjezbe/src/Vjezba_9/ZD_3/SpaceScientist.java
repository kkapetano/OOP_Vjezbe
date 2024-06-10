package Vjezba_9.ZD_3;


import java.io.Serializable;
import java.util.ArrayList;

public class SpaceScientist implements Serializable {
    private String name;
    private int id;
    private String specialization;
    private ArrayList<String> equipment;
    private transient Species spec;

    public SpaceScientist(String name, int id, String specialization, ArrayList<String> equipment, Species spec) {
        this.name = name;
        this.id = id;
        this.specialization = specialization;
        this.equipment = equipment;
        this.spec = spec;
    }

    public SpaceScientist(String string, String string1, boolean b, int year) {
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSpecialization() {
        return specialization;
    }

    public ArrayList<String> getEquipment() {
        return equipment;
    }

    public Species getSpec() {
        return spec;
    }

    public void setSpec(Species spec) {
        this.spec = spec;
    }

    @Override
    public String toString() {
        return "SpaceScientist{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", specialization='" + specialization + '\'' +
                ", equipment=" + equipment +
                ", spec=" + spec +
                '}';
    }

    public Object getDob() {
        return null;
    }

    public Object getDuels() {
        return null;
    }

    public Object getStrongHand() {
        return null;
    }

    public Object isTwoGuns() {
        return null;
    }

    public Object getResearches() {
        return null;
    }

    public Object getSpecialty() {
        return null;
    }

    public Object isInSpace() {
        return null;
    }
}
