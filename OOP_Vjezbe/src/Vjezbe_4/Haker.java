package Vjezbe_4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Haker {
    Semafor smf;
    private int [] stNovo=new int [3];
    private int cnt;

    public Haker(Semafor smf){
        this.smf=smf;
        System.out.println("Preuzeo kontrolu nad semaforom" + smf.toString());

    }
    private void stanjeNovo(){
        for(int i = 0; i <3;i++){
            stNovo[i]= ThreadLocalRandom.current().nextInt(0, 19);

        }
        System.out.println("Novo stanje semafora: " + Arrays.toString(stNovo));

    }

    public void manualProgrammingSemafor(){
        cnt=0;
        stanjeNovo();
        smf.setCrveno(String.valueOf(stNovo[0]));
        smf.setCrveno(String.valueOf(stNovo[1]));
        smf.setCrveno(String.valueOf(stNovo[2]));
        for(int st:stNovo){
            System.out.println("Novo stanje za " + cnt + "jeste:" + st);
            cnt++;
        }
        smf.stanje(stNovo[0]);
    }

}
