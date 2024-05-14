package Vjezba_5.ZD_3;

import java.util.Scanner;

public class ClientApp {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Customer customer = new Customer("CUSTOMER_A");
        Package pckg = new Package("WEB-11", customer,"Zadar", sc);
        pckg.putContent();
        pckg.calcTotalPackagePrice();
        pckg.packageInfo();
    }
}