package Vjezba_3;

public class Robot {
    private int ID;
    private String name;
    private int [][] array2D;
    private int fillCount;



    public Robot(int ID, String name) {
        this.ID = ID;
        this.name = name;
        this.array2D = new int[5][4]; // Initialize array2D
        this.fillCount = 0;

    }
    public int getID() {
        return ID;
    }

    public void walk() {
        System.out.println("I roboti znaju hodati!");
    }
    public void fillArr(int unos){
        if (fillCount <20){
            int row = fillCount / 4;
            int col = fillCount % 4;
            array2D[row][col] = unos;
            fillCount++;
        } else {
            System.out.println("Niz je pun!");
        }
    }
    public void printArr(){
        System.out.println("2D niz:");
        for (int[] row : array2D) {
            for (int element : row) {
            System.out.print(element + " ");
            }
            System.out.println();
        }
    }


    public long factJel (int n){
        if (n < 0) {
            throw new IllegalArgumentException("Broj ne može biti negativan!");
        }
        long faktorijel = 1;
        for (int i = 1; i <= n; i++) {
            faktorijel *= i;

        }
        return faktorijel;

    }

    public static void main(String[] args) {
        Robot robot = new Robot(1, "Robi");
        int intID = robot.getID();
        String ime = robot.getName() ;

        robot.walk();

        int n = 5;
        long faktorijel = robot.factJel(n);
        System.out.println("Faktorijel broja " + n + " je: " + faktorijel);

        for (int i = 1; i <= 20; i++) {
            robot.fillArr(i);
        }
        robot.printArr();

    }

    private String getName() {
        return name;
    }
}

