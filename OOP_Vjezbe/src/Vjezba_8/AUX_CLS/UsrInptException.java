package Vjezba_8.AUX_CLS;

public class UsrInptException extends Exception {

    private int lwr; // donja granica
    private int uppr; // gornja granica
    private int plGuess; // vrijednost koju igrac unese za godine
    private String msg; // Poruka o iznimci -> mogu biti razlicite

    public UsrInptException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public void setLower(int val) {
        lwr = val;
        System.out.println("You entered: <" + lwr + "> for the lower age bound!!!");
    }
    public void setUpper(int val) {
        uppr = val;
        System.out.println("You entered: <" + uppr + "> for the upper age bound!!!");
    }
    public void selGuess(int val) {
        plGuess = val;
        System.out.println("You entered: <" + plGuess + "> for the player's guess!!!");
    }


    // other methods
}