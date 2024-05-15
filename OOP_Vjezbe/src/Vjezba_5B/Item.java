package Vjezba_5B;

public abstract class Item {
    int quantity;
    float itemInitPrice;
    String itemDescription;
    int itemID;

    public Item() {
    }


    void decreaseItemQuantity(int quantity) {
        this.quantity -= quantity;
    }
    abstract void changeItemDescription();


    @Override
    public String toString() {
        return "Item{" +
                "quantity=" + quantity +
                ", itemInitPrice=" + itemInitPrice +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemID=" + itemID +
                '}';
    }

    int additionalQuantity(){
        return quantity + 1;
    }
    int quantity () {
        return quantity;
    }
    String itemDescription() {
        return itemDescription;
    }
    float itemInitPrice() {
        return itemInitPrice;
    }
    float itemCurrentPrice() {
        return itemInitPrice;
    }
    float itemPrice() {
        return itemInitPrice;
    }
    float itemID() {
        return itemID;
    }


}
