package Vjezba_5B;

public class Jacket extends Item{

    public Jacket(float itemInitPrice, int quantity, String itemDescription) {
        this.itemInitPrice = itemInitPrice;
        this.itemDescription = itemDescription;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Jacket{" +
                "quantity=" + quantity +
                ", itemInitPrice=" + itemInitPrice +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemID=" + itemID +
                '}';
    }

    @Override
    void changeItemDescription() {

    }
    float itemPrice() {
        return itemInitPrice;
    }
}
