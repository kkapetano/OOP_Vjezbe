package Vjezba_9.ZD_1;
import java.util.List;
import java.util.ArrayList;

import Vjezba_9.Zd_1.Gunslinger;
import Vjezba_9.Zd_1.ObjectHandling;



public class AppClient {

    public static void main(String[] args) {
        List<SpaceScientist> scientistsSave = new ArrayList<>();
        ArrayList<String> equipment1 = new ArrayList<>();
        equipment1.add("Microscope");
        equipment1.add("Telescope");
        Species spec1 = new Species("Human", "Earth");

        ArrayList<String> equipment2 = new ArrayList<>();
        equipment2.add("Spectrometer");
        equipment2.add("Thermometer");
        Species spec2 = new Species("Twi'lek", "Ryloth");

        ArrayList<String> equipment3 = new ArrayList<>();
        equipment3.add("Analyzer");
        equipment3.add("Hologram");
        Species spec3 = new Species("Wookiee", "Kashyyyk");

        SpaceScientist sc1 = new SpaceScientist("Jane Doe", 1, "Astrophysics", equipment1, spec1);
        SpaceScientist sc2 = new SpaceScientist("John Smith", 2, "Biology", equipment2, spec2);
        SpaceScientist sc3 = new SpaceScientist("Leia Organa", 3, "Chemistry", equipment3, spec3);

        scientistsSave.add(sc1);
        scientistsSave.add(sc2);
        scientistsSave.add(sc3);

        // Spremanje objekata u binarnu datoteku
        ObjectHandling.saveObj2File("spaceScientists.bin", scientistsSave);

        // Čitanje objekata iz binarne datoteke
        List<SpaceScientist> scientistsRead = ObjectHandling.read4File("spaceScientists.bin");
        checkReadContent(scientistsRead);

        // Spremanje objekata u CSV datoteku
        ObjectHandling.saveObj2CSV("spaceScientists.csv", scientistsSave);

        // Čitanje objekata iz CSV datoteke
        List<String[]> csvData = ObjectHandling.read4CSVFile(  "spaceScientists.csv");
        List<SpaceScientist> scientistsFromCSV = ObjectHandling.recreateObj4TxtFile(csvData);
        checkReadContent(scientistsFromCSV);
    }

    // Metoda za ispis podataka pročitanih objekata
    private static <T> void checkReadContent(List<T> lst) {
        lst.forEach(obj -> {
            System.out.println("****************************************************");
            System.out.println(obj.toString());
        });
    }
}