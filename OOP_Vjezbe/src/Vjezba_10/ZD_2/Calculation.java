package Vjezba_10.ZD_2;


public class Calculation {
    private double pay;
    private float kreda;
    private float kamata;
    private int nacin;
    private int godina;

    public Calculation(float kreda, float kamata, int nacin, int godina) {
        this.kreda = kreda;
        this.kamata = kamata;
        this.nacin = nacin;
        this.godina = godina;
        this.pay = calculate(kreda, kamata, nacin, godina);
    }

    public static double calculate(float kreda, float kamata, int nacin, int godina) {
        double rate = kamata / 100.0;
        double n = godina * (nacin == 0 ? 12 : 4); // 12 months or 4 quarters
        double pmt = (kreda * rate) / (1 - Math.pow(1 + rate, -n));
        return pmt;
    }

    public double getPay() {
        return this.pay;
    }

    public float getKreda() {
        return this.kreda;
    }

    public float getKamata() {
        return this.kamata;
    }

    public int getNacin() {
        return this.nacin;
    }

    public int getGodina() {
        return this.godina;
    }

    @Override
    public String toString() {
        return "Visina kredita: " + kreda + "\nKamata: " + kamata + "\nNacin: " + (nacin == 0 ? "Mjesecno" : "Kvartalno") + "\nGodina: " + godina + "\nRata kredita: " + pay;
    }
}
