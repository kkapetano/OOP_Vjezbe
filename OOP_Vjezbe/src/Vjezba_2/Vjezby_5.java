package Vjezba_2;


public class Vjezby_5 {
        public static void main(String[] args) {
            // Unesite podatke za prihode i rashode po mjesecima
            double[] prihodi = {125855,284569,324152,204563,452198,471326,505169,498569,367163,289568,115255,98544};
            double[] rashodi = {105625,155748,198455,195251,257654,322188,355748,315782,389455,302369,109854,85223};

            // Izračunajte profite po mjesecima
            double[] profiti = new double[prihodi.length];
            for (int i = 0; i < prihodi.length; i++) {
                profiti[i] = prihodi[i] - rashodi[i];
            }

            // Ispišite profite po mjesecima
            System.out.println("Profite po mjesecima:");
            for (int i = 0; i < profiti.length; i++) {
                System.out.println("Mjesec " + (i + 1) + ": " + profiti[i]);
            }

            // Izračunajte prosječni profit tvrtke za promatranu godinu
            double sumaProfiti = 0;
            for (double profit : profiti) {
                sumaProfiti += profit;
            }
            double prosjecniProfit = sumaProfiti / profiti.length;

            // Ispišite prosječni profit tvrtke
            System.out.println("Prosječni profit tvrtke za promatranu godinu: " + prosjecniProfit);
        }
    }
