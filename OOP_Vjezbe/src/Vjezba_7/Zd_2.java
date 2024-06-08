package Vjezba_7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Zd_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = generateRandomNumbers(20,10,1000);

        System.out.println("Lista prije sortiranja");
        for(Integer number:numbers){
            System.out.println(number);
        }
        Collections.sort(numbers);
        System.out.println("Lista nakon sortiranja");
        for(Integer number:numbers){
            System.out.println(number);
        }

        //Anonimna klasa
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });



        System.out.println("Lista nakon sortiranja u obrnutom redoslijedu");
        for(Integer number:numbers){
            System.out.println(number);
        }


    }
    public static ArrayList<Integer> generateRandomNumbers(int count,int min,int max){
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            int randomNum = rand.nextInt(max-min)+min;
            numbers.add(rand.nextInt(max-min)+min);
        }
        return numbers;
    }
}
