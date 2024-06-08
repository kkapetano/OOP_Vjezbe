package Vjezba_8.AUX_CLS;

public class UserInpts {
    private int min;
    private int max;
    private int guess;
    private boolean status;

    public UserInpts() {
    }

    public void setInputs(int min, int max, int guess) {
        this.min = min;
        this.max = max;
        this.guess = guess;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }
    public int getMin() {
        return min;
    }
    public int getMax() {
        return max;
    }
    public int getGuess() {
        return guess;
    }


}

