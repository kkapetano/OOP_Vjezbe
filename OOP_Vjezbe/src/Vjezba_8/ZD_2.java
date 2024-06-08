package Vjezba_8;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ZD_2 {







    private static Scanner sc;
    private static int input;
    private static boolean one;
    private static int in;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        one = true;
        while(one) {

            try {
                System.out.println("Please enter a integer: ");
                input = sc.nextInt();
                one = false;
                System.out.println("Your input is-> " + input);
            } catch (InputMismatchException e){

                System.out.println("Wrong input -> only integers are allowed :)");
                System.out.println("Try again -> 1 for YES and any other integer for NO....");
                sc.next(); // clear garbage
                in = sc.nextInt();
                if(in != 1) {
                    sc.close();
                    System.out.println("Quitting....");
                    break;
                }

            }

        }

    }

}