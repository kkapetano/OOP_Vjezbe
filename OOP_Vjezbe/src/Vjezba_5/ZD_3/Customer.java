package Vjezba_5.ZD_3;

public class Customer {

    private String name;
    private int idCustomer;
    private static int cntCustomer = 100;

    public Customer(String name){
        this.idCustomer = cntCustomer;
        this.name = name;
        cntCustomer++;
    }

    public int customerID(){
        return idCustomer;
    }
    public void customerInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", idCustomer=" + idCustomer +
                '}';
    }
}

