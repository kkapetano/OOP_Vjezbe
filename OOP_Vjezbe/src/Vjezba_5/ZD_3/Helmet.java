package Vjezba_5.ZD_3;

public class Helmet extends Item {
    public Helmet(float v, int i) {
        super();
    }
    float helmetPrice;
    int komHelmet;

    @Override
    float itemPrice() {
        return 40;
    }

    @Override
    float getPrice() {
        return 40;
    }

    @Override
    int getKom() {
        return 1;
    }
}
