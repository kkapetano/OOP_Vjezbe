package Vjezba_5B;

public class Sneakers extends Item{
    public Sneakers(float itemInitPrice, int quantity, String itemDescription) {
        this.itemInitPrice = itemInitPrice;
        this.itemDescription = itemDescription;
        this.quantity = quantity;
    }



    @Override
    void changeItemDescription() {
System.out.println("Item description changed.");

    }

    @Override
    public String toString() {
        return "Sneakers{" +
                "quantity=" + quantity +
                ", itemInitPrice=" + itemInitPrice +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemID=" + itemID +
                '}';
    }
    float itemPrice() {
        return itemInitPrice;
    }
}
