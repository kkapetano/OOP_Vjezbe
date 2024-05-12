package Vjezba_2;
import java.util.Arrays;
import java.util.Scanner;

public class ZD_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite dimenzije 2D niza (redovi i kolone):");
        int redovi = scanner.nextInt();
        int kolone = scanner.nextInt();
        double[][] niz = new double[redovi][kolone];

        System.out.println("Unesite elemente 2D niza:");
        for (int i = 0; i < redovi; i++) {
            for (int j = 0; j < kolone; j++) {
                niz[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Elementi 2D niza:");
        System.out.println(Arrays.deepToString(niz));

        // Nedostatak ispisa koristeći deepToString metodu je što ne dobijamo formatiranu tablicu,
        // već samo ispis elemenata u obliku matrice, što može biti neugledno za velike nizove.
    }

}
