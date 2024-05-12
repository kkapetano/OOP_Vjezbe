package LAB_2;

import java.util.Scanner;


public class AUX_CLS {
   private AUX_CLS(){} //PRIVATE CONSTRUCTOR - NO INSTANCES ALLOWED

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Unesite veličinu arrays: ");
        int size=scanner.nextInt();

        String [] stringArray=generateStringArray(size);

        System.out.println("Ispis svih elemenata: \n");
        listArrayElements(stringArray);

        System.out.println("Ispis svih elemenata s njihovim pripadni indexima: \n");
        listArrayElementsAndIndexPos(stringArray);

    }

    public static String [] generateStringArray(int size){
        String [] array=new String[size];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter one string...");
            array[i]=scanner.nextLine();
        }
        return array;
    }
    public static void listArrayElements(String [] array ){
        for (String element : array) {
            System.out.println("Element: " + element);
        }

    }
    public static void listArrayElementsAndIndexPos(String[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index position: "+i+" -element: "+array[i]);
        }
    }
}
