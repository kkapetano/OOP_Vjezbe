package Vjezba_2;
import java.util.Arrays;

public class ZD_8 {
        public static void main(String[] args) {
            double[] niz = generirajNiz(15);

            System.out.println("Nesortirani niz:");
            ispisiNiz(niz);

            Arrays.sort(niz);
            obrniRedoslijed(niz);

            System.out.println("\nSortirani niz (od najviše do najniže vrijednosti):");
            ispisiNiz(niz);
        }

        public static double[] generirajNiz(int duljina) {
            double[] niz = new double[duljina];
            for (int i = 0; i < duljina; i++) {
                niz[i] = Math.random() * 100;
            }
            return niz;
        }

        public static void ispisiNiz(double[] niz) {
            for (double element : niz) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public static void obrniRedoslijed(double[] niz) {
            for (int i = 0; i < niz.length / 2; i++) {
                double temp = niz[i];
                niz[i] = niz[niz.length - 1 - i];
                niz[niz.length - 1 - i] = temp;
            }
        }
    }

