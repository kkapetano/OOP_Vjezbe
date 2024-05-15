package Vjezba_5B;

public class Customer {
    private String address;
    private int id;

    public Customer(String address) {
        this.address = address;


    }

    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", id=" + id +
                '}';
    }

    public int id () {
        return id;
    }
    public String address() {
        return address;
    }




}
