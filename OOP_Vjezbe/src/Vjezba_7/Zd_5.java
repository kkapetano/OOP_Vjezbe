package Vjezba_7;
import java.util.*;

public class Zd_5 {
    public static void main(String[] args) {
        LinkedList<String> vehicles = new LinkedList<>();

        vehicles.add("Car");
        vehicles.add("helicopter");
        vehicles.add("electronic bike");
        vehicles.add("truck");
        vehicles.add("motorcycle");
        vehicles.add("carriage");
        System.out.println("Originalna lista vozila");
        printList(vehicles);






        Iterator<String> iterator = vehicles.iterator();
        while (iterator.hasNext()) {
            String vehicle = iterator.next();
            if (vehicle.contains("carriage")) {
                iterator.remove();
            }
        }
        System.out.println("Lista vozila nakon brisanja");
        printList(vehicles);

        insertVeh(vehicles, "Stagecoach");
        System.out.println("Lista vozila nakon dodavanja Stagecoach");
        printList(vehicles);



    }
    public static void printList(LinkedList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
    public static void insertVeh(LinkedList<String>list, String newVeh){
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()){
            String vehicle = iterator.next();
            System.out.println(vehicle);

            if (vehicle.equals("Stagecoach")){
                iterator.add(newVeh);
            }
        }
    }

}

