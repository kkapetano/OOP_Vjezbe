package Vjezba_2;

import java.util.Scanner;

public class ZD_1 {
    public static void main(String[] args) {

        String [] prviNiz = {"Vasa", "vana plurimum", "sonant"};
        String spojeniPrviNiz = String.join(" ", prviNiz);
        System.out.println(spojeniPrviNiz);

        String[] drugiNiz = new String [4];
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite 4 elementa za drugi niz:");
        for (int i = 0; i < drugiNiz.length; i++) {
            drugiNiz[i] = unos.nextLine();
        }

        System.out.println("drugi niz:");
        for (String element : drugiNiz) {
            System.out.println(element);
        }

    }
}
