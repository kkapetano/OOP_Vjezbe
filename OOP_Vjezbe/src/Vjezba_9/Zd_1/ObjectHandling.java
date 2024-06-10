package Vjezba_9.Zd_1;

import Vjezba_9.ZD_3.SpaceScientist;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;




public class ObjectHandling {

    public static <T> void saveObj2File(String fullPath, List<T> objcts) {

        File file = new File(fullPath);

        try (FileOutputStream fos = new FileOutputStream(file)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(objcts);
            oos.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static <T> List<T> read4File(String fullPath) {

        File file = new File(fullPath);
        List<T> objects = new ArrayList<>();

        try(FileInputStream fis = new FileInputStream(file)) {

            ObjectInputStream ois = new ObjectInputStream(fis);

            T ob = (T) ois.readObject();
            System.out.println(ob.toString());
            System.out.println(ob.getClass().getCanonicalName());
            objects.addAll((Collection<? extends T>) ob);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return objects;
    }
    public static void saveObj2CSV(String fullPath, List<SpaceScientist> objcts) {
        File file = new File(fullPath);
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            for (SpaceScientist s : objcts) {
                writer.printf("%s,%s,%d,%s,%b%n", s.getName(), s.getDob(), s.getResearches(), s.getSpecialty(), s.isInSpace());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<String[]> read4CSVFile(String fullPath) {

        List<String[]> data = new ArrayList<String[]>();
        File file = new File(fullPath);
        String[] rowData;
        String lnRow;

        try (FileReader fr = new FileReader(file)) {

            BufferedReader br = new BufferedReader(fr);
            while ((lnRow = br.readLine()) != null) {
                rowData = lnRow.split("\\s*,\\s*");
                data.add(rowData);
            }

            br.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return data;
    }

    public static void listAllData4File(List<String[]> data) {

        for (String[] strings : data) {

            System.out.println(Arrays.toString(strings));
        }
    }
    public static List<SpaceScientist> recreateObj4TxtFile(List<String[]> data) {
        List<SpaceScientist> scientists = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (String[] strings : data) {
            LocalDate dob = LocalDate.parse(strings[1], dtf); // Ispravno parsiranje datuma
            SpaceScientist s = new SpaceScientist(strings[0], strings[3], Boolean.parseBoolean(strings[4]),dob.getYear());
            scientists.add(s);
        }

        return scientists;
    }


}
