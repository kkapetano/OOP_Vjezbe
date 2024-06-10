package Vjezba_10.ZD_2;

import java.util.ArrayList;

public class FormEvent {
    private float kreda;
    private float kamata;
    private int nacin;
    private int godina;
    private ArrayList<Calculation> calculations;

    public FormEvent(Object source) {
        this.calculations = new ArrayList<>();
        // Constructor implementation
    }

    public float getKreda() {
        return kreda;
    }

    public void setKreda(float kreda) {
        this.kreda = kreda;
    }

    public float getKamata() {
        return kamata;
    }

    public void setKamata(float kamata) {
        this.kamata = kamata;
    }

    public int getNacin() {
        return nacin;
    }

    public void setNacin(int nacin) {
        this.nacin = nacin;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public ArrayList<Calculation> getCals() {
        return calculations;
    }

    public void setCals(ArrayList<Calculation> calculations) {
        this.calculations = calculations;
    }
}
