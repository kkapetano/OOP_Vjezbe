package Vjezba_6;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;


public class ZD_2 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(21, "Stipe");
        hashMap.put(159, "Divna");
        hashMap.put(985, "Etna");
        hashMap.put(455, "Petar");
        hashMap.put(5788, "Vlatka");



        System.out.println("Hash Map element:");
        printMap(hashMap);

        Map<Integer, String> treeMap = new TreeMap<>(hashMap);

        System.out.println("Tree Map element:");
        printMap(treeMap);


    }
    public static void printMap(Map<Integer,String> map){
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("id=" + entry.getKey() + ", name= " + entry.getValue());
        }
    }
}
