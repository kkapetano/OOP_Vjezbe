package Vjezbe_4;

public class Semafor {

    private static String zeleno ="1";
    private static String zuto ="2";
    private static String crveno ="0";

    public static String getZeleno() {
        return zeleno;
    }

    public static void setZeleno(String zeleno) {
        Semafor.zeleno = zeleno;
    }

    public static String getZuto() {
        return zuto;
    }

    public static void setZuto(String zuto) {
        Semafor.zuto = zuto;
    }

    public static String getCrveno() {
        return crveno;
    }

    public static void setCrveno(String crveno) {
        Semafor.crveno = crveno;
    }
    public void stanje(int num){
        String stanje = String.valueOf(num);
        System.out.println("Trenutno stanje semafora je: "+stanje);
        System.out.println("-----------------------------");
        if(stanje.equals(zeleno)){
            System.out.println("Semafor je na zelenom -> možete proći");
        }else if(stanje.equals(zuto)){
            System.out.println("Semafor je na žutom -> oprez");
        }else if(stanje.equals(crveno)){
            System.out.println("Semafor je na crvenom -> stoj");
        }
    }
}
