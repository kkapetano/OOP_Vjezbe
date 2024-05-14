package Vjezba_5.ZD_3;

public class Sneakers extends Item {
    public Sneakers(float v, int i) {
        super();
    }
    float sneakerPrice;
    int komSneaker;

    @Override
    float itemPrice() {
        return 100;
    }

    @Override
    float getPrice() {
        return 100;
    }

    @Override
    int getKom() {
        return 1;
    }
}
