package Vjezba_6;

import java.util.ArrayList;
import java.util.LinkedList;

public class ZD_1 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Zero ind element");
        lista.add("1st ind element");
        lista.add("2nd ind element");
        lista.add("3rd ind element");
        lista.add("4th ind element");

        LinkedList<String> linkedlista = new LinkedList<>(lista);

        System.out.println("Array list: "+ lista);
        System.out.println("Linked list: " + linkedlista);
        System.out.println("************************");

        linkedlista.add("5th ind element");
        linkedlista.addFirst("New element at start");
        linkedlista.addLast("New element at end");

        System.out.println("Prosirena linked lista:");
        for (String element : linkedlista){
            System.out.println(element);
        }
        System.out.println("***********************");
        replaceElementAt(linkedlista, 4, "Replaced Element");
        System.out.println("Linked lista nakon zamjene petog elementa");
        for(String element : linkedlista){
            System.out.println(element);
        }




    }

    public static void replaceElementAt(LinkedList<String> linkedList, int index,String newElement){
        if (index >=0 && index< linkedList.size()) {
            linkedList.remove(index);
            linkedList.add(index, newElement);
        }else {
            System.out.println("Index van granica");
        }


    }
}
