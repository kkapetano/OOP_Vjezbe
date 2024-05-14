package Vjezba_5.ZD_3;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Package {
    private int idPackage;
    private int cntPckg;
    private String destination;
    private Customer customer;
    private float pricePackage;
    private int totalKom;
    private String webShop;
    private String destination4Package;
    private Scanner sc = new Scanner(System.in);
    private List<Item> items;
    private float MINI;
    private float MAXI;
    private int KOMS;

    public Package(String webShop ,Customer customer,String destination,Scanner sc) {
        this.webShop = webShop;
        this.customer = customer;
        this.destination4Package = destination;
        this.sc = sc;
        this.MINI = 10.0f;
        this.MAXI = 100.0f;
        this.KOMS = 10;
        this.idPackage = cntPckg;
        this.items = items != null ? items : new java.util.ArrayList<>();
        cntPckg++;
    }

    boolean validPaymentMethod = false;
    String paymentMethod;


    public boolean checkPaymentPackage() {


        class PaymentMedia {

            final String POU = "POU";
            final String CP = "CP";
            final String OPS = "OPS";

            void paymentPossible() {

                System.out.println("Possible payment methods:");
                System.out.println(POU);
                System.out.println(CP);
                System.out.println(OPS);

            }

            boolean payPackage() {

                try {
                    switch (paymentMethod) {

                        case POU:
                            System.out.println("Payment will be made to a courier service ... ");
                            System.out.println("Package with id: " + idPackage + ", payed by customer with id: " + customer.customerID());
                            System.out.println("\n");
                            return true;
                        case CP:
                            System.out.println("Payment is done with credit card ...");
                            System.out.println("Package with id: " + idPackage + ", payed by customer with id: " + customer.customerID());
                            System.out.println("\n");
                            return true;
                        case OPS:
                            System.out.println("Payment is done by online payment service ...");
                            System.out.println("Package with id: " + idPackage + ", payed by customer with id: " + customer.customerID());
                            System.out.println("\n");
                            return true;
                        default:
                            System.out.println("Please choose a valid payment method ...");
                            System.out.println("\n");
                            return false;
                    }
                } catch (NullPointerException npe) {
                    /*paymentPossible();*/
                    return false;
                }

            }

            boolean paymentApproved() {

                if (validPaymentMethod) {
                    return true;
                } else {
                    this.paymentPossible();
                    System.out.println("Please enter valid payment method:\t");
                    paymentMethod = sc.nextLine();
                    validPaymentMethod = payPackage();
                    return paymentApproved();
                }

            }

        }

        PaymentMedia pm = new PaymentMedia();
        validPaymentMethod = pm.paymentApproved();
        return validPaymentMethod;
    }


    public void putContent() {
        int choice;
        while (true) {
            System.out.println("1 - T_Shirt\n2 - Pant\n3 - Helmet\n4 - Sneakers");
            System.out.println("Please enter your choice:");
            switch (sc.nextInt()) {
                case 1:
                    items.add(new T_Shirt(randFloatPrice(), randIntKom()));
                    System.out.println("T-Shirt is ordered!");
                    break;
                case 2:
                    items.add(new Pants(randFloatPrice(), randIntKom()));
                    System.out.println("Some pants are ordered!");
                    break;
                case 3:
                    items.add(new Helmet(randFloatPrice(), randIntKom()));
                    System.out.println("Helmet is ordered!");
                    break;
                case 4:
                    items.add(new Sneakers(randFloatPrice(), randIntKom()));
                    System.out.println("Sneakers are ordered!");
                    break;
                default:
                    System.out.println("Wrong menu input!");
            }
            sc.nextLine();
            System.out.println("To continue shopping press 'y' - any other to exit!");
            String cont = sc.nextLine();
            if (!cont.toLowerCase().equals("y")) {
                System.out.println("-------------------------------------------------");
                System.out.println("Finished shopping - payment need to be defined!");
                if (checkPaymentPackage()) {
                    System.out.println("All is completed for this purchase...");
                    System.out.println("See package info for order details!");
                }
                break;
            } else {
                System.out.println("You have choose to continue shopping!");
            }
        }

    }


    private float randFloatPrice() {
        Random rand = new Random();
        return MINI + rand.nextFloat() * (MAXI - MINI);
    }


    private int randIntKom() {
        return ThreadLocalRandom.current().nextInt(1, KOMS);

    }


    public void packageInfo(){

        System.out.println("Web shop: " + webShop);
        customer.customerInfo();
        System.out.println("Destination: " + destination4Package);
        System.out.println("Payment method: " + paymentMethod);
        System.out.println("Total price: " + pricePackage);
        System.out.println("Total items in the package: " + items.size());
        System.out.println("-------------------------------------------");
        for(Item item : items){
            System.out.println(item.getClass().getSimpleName());
            System.out.println("Price: " + item.itemPrice());
            System.out.println("Kom: " + item.getKom() + "\n");
        }

    }
    public void calcTotalPackagePrice(){
        for(Item item : items){
            pricePackage += item.itemPrice();

        }

    }


}

