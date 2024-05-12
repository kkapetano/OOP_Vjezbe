package Vjezba_2;

import java.util.Scanner;

public class ZD_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite broj mjerenja temperature: ");
        int brojMjerenja = scanner.nextInt();

        double[] temperature = new double[brojMjerenja];

        for (int i = 0; i < brojMjerenja; i++) {
            System.out.println("Unesite " + (i + 1) + ". mjerenje temperature: ");
            temperature[i] = scanner.nextDouble();
        }

        double suma = 0;
        for (double temp : temperature) {
            suma += temp;
        }

        double prosjek = suma / brojMjerenja;
        System.out.println("Prosjecna temperatura je: " + prosjek);

        int brojIznadProsjeka = 0;
        int brojIspodProsjeka = 0;
        for (double temp : temperature) {
            if (temp > prosjek) {
                brojIznadProsjeka++;
            } else if (temp < prosjek) {
                brojIspodProsjeka++;
            }
        }

        System.out.println("prosjek temp: " + prosjek);
        System.out.println("Broj mjerenja iznad prosjeka: " + brojIznadProsjeka);
        System.out.println("Broj mjerenja ispod prosjeka: " + brojIspodProsjeka);
        System.out.println("Ukupni broj mjerenja: " + brojMjerenja);
    }
}
