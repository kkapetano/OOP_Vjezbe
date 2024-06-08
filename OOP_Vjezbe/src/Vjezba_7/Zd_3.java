package Vjezba_7;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Zd_3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(5);

        try {
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
            System.out.println("Red nakon 5 elemenata" + queue);
            queue.add(6);
        } catch (IllegalStateException e) {
            System.out.println("Queue is full");
        }
        System.out.println("Red cekanja na kraju:" + queue);

        processFirstElement(queue, 1);
        addElementWithCheck(queue, 6);
    }


    public static boolean processFirstElement(Queue<Integer> queue, int flag) {
        if (flag == 1 && !queue.isEmpty()) {
            int element = queue.poll();
            System.out.println("Obraduje se element:" + element);
            return true;

        }
        System.out.println("Queue is empty or flag is not set");
        return false;


    }


    public static void addElementWithCheck(Queue<Integer> queue, int newElement){
        boolean processed = processFirstElement(queue, 1);
        if (processed){
            try {
                queue.add(newElement);
                System.out.println("New element" + newElement + "added to queue");
            }catch (IllegalStateException e){
                System.out.println("Queue is full");
            }
        }else{
            System.out.println("New elemenet" + newElement+"is not added to queue");
        }
        System.out.println("Queue at the moment is: "+ queue);
    }
}

