package Vjezba_5.ZD_3;

public class Pants extends Item {
    public Pants(float v, int i) {
        super();
    }
    float pantPrice;
    int komPant;


    @Override
    float itemPrice() {
        return 30;
    }

    @Override
    float getPrice() {
        return 30;
    }

    @Override
    int getKom() {
        return 1;
    }
}
