package Vjezba_9.ZD_3;

import java.io.Serializable;


public class Species {
    private String name;
    private String homeworld;

    public Species(String name, String homeworld) {
        this.name = name;
        this.homeworld = homeworld;
    }

    public String getName() {
        return name;
    }

    public String getHomeworld() {
        return homeworld;
    }

    @Override
    public String toString() {
        return "Species{" +
                "name='" + name + '\'' +
                ", homeworld='" + homeworld + '\'' +
                '}';
    }
}
