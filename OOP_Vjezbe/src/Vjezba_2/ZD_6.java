package Vjezba_2;
import java.util.Arrays;

public class ZD_6 {
        public static void main(String[] args) {
            int[] originalniNiz = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

            int[] kopijaNiza = Arrays.copyOf(originalniNiz, originalniNiz.length);

            boolean jednaki = Arrays.equals(originalniNiz, kopijaNiza);

            if (jednaki) {
                System.out.println("Nizovi su jednaki.");
            } else {
                System.out.println("Nizovi nisu jednaki.");
            }
        }
    }
