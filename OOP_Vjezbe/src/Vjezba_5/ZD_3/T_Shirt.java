package Vjezba_5.ZD_3;

public class T_Shirt extends Item {
    public T_Shirt(float v, int i) {
        super();
    }
    float tshirtPrice;
    int komTshirt;

    @Override
    float itemPrice() {
        return 20;
    }

    @Override
    float getPrice() {
        return 20;
    }

    @Override
    int getKom() {
        return 1;
    }
}
