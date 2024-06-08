package Vjezba_6;

import java.util.*;

public class ZD_3 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        fillSet(hashSet);
        fillSet(linkedHashSet);
        fillSet(treeSet);

        // Popunjavanje skupova
        fillSet(hashSet);
        fillSet(linkedHashSet);
        fillSet(treeSet);

        // Ispis svih skupova
        System.out.println("HashSet:");
        printSet(hashSet);
        System.out.println("LinkedHashSet:");
        printSet(linkedHashSet);
        System.out.println("TreeSet:");
        printSet(treeSet);

        // Ispitivanje prisutnosti elementa i dodavanje ako ga nema
        checkAndAddElement(hashSet, "Nema ga");
        checkAndAddElement(linkedHashSet, "Nema ga");
        checkAndAddElement(treeSet, "Nema ga");

        // Ponovni ispis svih skupova nakon dodavanja elementa
        System.out.println("\nHashSet nakon dodavanja elementa:");
        printSet(hashSet);
        System.out.println("LinkedHashSet nakon dodavanja elementa:");
        printSet(linkedHashSet);
        System.out.println("TreeSet nakon dodavanja elementa:");
        printSet(treeSet);

        // Ponovno dodavanje istog elementa
        hashSet.add("Nema ga");
        linkedHashSet.add("Nema ga");
        treeSet.add("Nema ga");

        // Ispis nakon ponovnog dodavanja istog elementa
        System.out.println("\nHashSet nakon ponovnog dodavanja istog elementa:");
        printSet(hashSet);
        System.out.println("LinkedHashSet nakon ponovnog dodavanja istog elementa:");
        printSet(linkedHashSet);
        System.out.println("TreeSet nakon ponovnog dodavanja istog elementa:");
        printSet(treeSet);

        // Brisanje elementa iz skupa
        removeElement(hashSet, "Nema ga");
        removeElement(linkedHashSet, "Nema ga");
        removeElement(treeSet, "Nema ga");

        // Ispis nakon brisanja elementa
        System.out.println("\nHashSet nakon brisanja elementa:");
        printSet(hashSet);
        System.out.println("LinkedHashSet nakon brisanja elementa:");
        printSet(linkedHashSet);
        System.out.println("TreeSet nakon brisanja elementa:");
        printSet(treeSet);




    }
    public static void fillSet(Set<String> set){
        set.add("Element 1");
        set.add("Element 2");
        set.add("Element 3");
        set.add("Element 4");
        set.add("Element 5");
    }
    public static void checkAndAddElement(Set<String>set,String element){
        if(set.contains(element)){
            System.out.println("Element " + element + " vec postoji u skupu.");
        }else{
            System.out.println("Element " + element + " ne postoji u skupu. Ubacivanje elementa...");
            set.add(element);
        }
    }
    public static void printSet(Set<String> set){
        for (String element : set){
            System.out.println(element);
        }
    }
    public static void removeElement(Set<String>set, String element){
        if(set.remove(element)){
            System.out.println("Element " + element + " je uklonjen");
        }else{
            System.out.println("Element " + element + " nije pronaden u skupu");
        }
    }
}
