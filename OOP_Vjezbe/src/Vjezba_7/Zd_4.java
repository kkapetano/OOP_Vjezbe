package Vjezba_7;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Zd_4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        try {
            Scanner scanner = new Scanner(new File("/Users/rainbow/Desktop/Skola/OOP - PONAVLJANJE/OOP-Vjezbe/OOP_Vjezbe/src/Vjezba_7/data.txt"));
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
            scanner.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }

        System.out.println("Originalna lista:");
        for (String line : list) {
            System.out.println(line);
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        System.out.println("Sortirana lista prema duljini stringova:");
        for (String line : list) {
            System.out.println(line);
        }
    }
}



