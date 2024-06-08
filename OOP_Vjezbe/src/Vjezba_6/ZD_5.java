package Vjezba_6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class DesendingComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}

public class ZD_5 {

        public static void main(String[] args) {
            // Kreiranje ArrayList-e
            ArrayList<String> vehicles = new ArrayList<>();

            // Dodavanje elemenata u ArrayList-u
            vehicles.add("auto");
            vehicles.add("svemirski brod");
            vehicles.add("avion");
            vehicles.add("helikopter");
            vehicles.add("jedrilica");
            vehicles.add("gliser");
            vehicles.add("romobil");
            vehicles.add("bicikla");

            // Ispisivanje elemenata liste bez sortiranja
            System.out.println("Lista vozila prije sortiranja: ");
            for (String vehicle : vehicles) {
                System.out.println(vehicle);
            }
            Collections.sort(vehicles);
            System.out.println("Lista nakon sortiranja: ");
            for (String vehicle : vehicles) {
                System.out.println(vehicle);
            }

            Collections.sort(vehicles, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return Integer.compare(o1.length(), o2.length());

            }
        });
            System.out.println("Lista nakon sortiranja po duljini: ");
            for (String vehicle : vehicles) {
                System.out.println(vehicle);
            }

            Collections.sort(vehicles, new DesendingComparator());

            System.out.println("Lista vozila nakon sortiranja u silaznom redoslijedu: ");
            for (String vehicle : vehicles) {
                System.out.println(vehicle);
            }
        }
    }

