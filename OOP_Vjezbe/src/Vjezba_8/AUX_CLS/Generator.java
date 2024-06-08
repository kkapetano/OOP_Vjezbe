package Vjezba_8.AUX_CLS;

public class Generator {
    private final int LOW = 1;
    private final int UPP = 120;

    public Generator() {
    }
    public static int genAge2Guess(int LOW, int UPP){
        return (int) (Math.random() * (UPP - LOW + 1) + LOW);
    }
}
