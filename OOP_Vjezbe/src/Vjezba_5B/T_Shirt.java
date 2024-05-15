package Vjezba_5B;

public class T_Shirt extends Item{
    public T_Shirt(float itemInitPrice, int quantity, String itemDescription) {
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
        return "T_Shirt{" +
                "itemID=" + itemID +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemInitPrice=" + itemInitPrice +
                ", quantity=" + quantity +
                '}';
    }
    float itemPrice() {
        return itemInitPrice;
    }
}
