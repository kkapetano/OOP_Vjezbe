package Vjezba_8;

import java.util.Arrays;

public class Zd_3 {

    public static void main(String[] args) {
        int[] arr = genArr(10);
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException aex) {
            StackTraceElement[] ste = aex.getStackTrace();
            System.out.println("Exception: " + aex.getClass().getCanonicalName() + "in: " + ste[0]);

        } finally {
            System.out.println("Be carfeul, array length is:" + arr.length);

        }


    }

    private static int[] genArr(int arraySize) {
        int[] arr = new int[arraySize];
        int i = 0;
        while (i < arraySize) {
            arr[i] = (int) (Math.random() * 100);
            i++;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}


