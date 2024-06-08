package Vjezba_8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Zd_1 {

    public static void main(String[] args) {
        String fileName = "/Users/rainbow/Desktop/Skola/OOP - PONAVLJANJE/OOP-Vjezbe/OOP_Vjezbe/src/Vjezba_8/randText.txt";

        // Čitanje datoteke i prikaz sadržaja
        System.out.println("Čitanje datoteke koristeći Scanner:");
        readFileScanner(fileName);

        System.out.println("\n-----------------------------------\n");

        System.out.println("Čitanje datoteke koristeći BufferedReader:");
        readFileBufferedReader(fileName);

        System.out.println("\n-----------------------------------\n");

        // Pisanje teksta u datoteku
        String textToWrite = "Ovo je novi tekst koji želimo zapisati u datoteku.";
        writeToFile(fileName, textToWrite);

        // Čitanje datoteke nakon pisanja teksta
        System.out.println("\n-----------------------------------\n");

        handleFileReading(fileName);
    }

    // Metoda za čitanje datoteke koristeći Scanner
    public static void readFileScanner(String fileName) {
        try {
            Scanner scanner = new Scanner(new FileReader(fileName));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Metoda za čitanje datoteke koristeći BufferedReader
    public static void readFileBufferedReader(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Metoda za pisanje teksta u datoteku
    public static void writeToFile(String fileName, String text) {
        try {
            // Provjera atributa datoteke (Read-only)
            if (Files.isWritable(Paths.get(fileName))) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
                writer.newLine();
                writer.write(text);
                writer.close();
                System.out.println("Tekst je uspješno zapisan u datoteku.");
            } else {
                System.out.println("Datoteka je samo za čitanje (Read-only). Tekst nije zapisan.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Metoda za čitanje datoteke uz upravljanje iznimkama i omogućavanje ponovnog unosa imena datoteke
    public static void handleFileReading(String fileName) {
        boolean fileExists = false;
        do {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;
                System.out.println("Sadržaj datoteke " + fileName + ":");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
                fileExists = true;
            } catch (IOException e) {
                System.out.println("Datoteka '" + fileName + "' ne postoji.");
                System.out.println("Molimo unesite ime postojeće datoteke:");
                Scanner scanner = new Scanner(System.in);
                fileName = scanner.nextLine();
            }
        } while (!fileExists);
    }
}

