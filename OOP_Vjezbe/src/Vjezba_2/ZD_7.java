package Vjezba_2;
import java.util.Random;

public class ZD_7 {
    public static void main(String[] args) {
        int [][] niz = gen2DNiz(3,4);

        int maxVrijednost = pronadiMAX(niz);

        System.out.println("Max vrijednost u nizu je: " + maxVrijednost);
    }
    public static int [][] gen2DNiz (int redovi, int stupci){
        int [] [] niz = new int [redovi][stupci];
        Random random = new Random();
        for (int i = 0; i < redovi; i++) {
            for (int j = 0; j < stupci; j++) {
                niz[i][j] = random.nextInt(100);
            }
        }
        return niz;
    }
    public static int pronadiMAX (int [][] niz){
        int max = Integer.MIN_VALUE;
        for (int[]red:niz){
            for (int broj: red){
                if (broj > max){
                    max = broj;
                }
            }
        }
        return max;
    }


}
