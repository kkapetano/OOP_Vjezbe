package Vjezba_8;
import java.util.Scanner;
import java.util.Random;

public class Zd_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the age guessing game!");

        int min, max;
        System.out.println("Enter the minimum age: ");
        min = sc.nextInt();
        System.out.println("Enter the maximum age: ");
        max = sc.nextInt();

        if (min >=max || min<1 || max>120) {
            System.out.println("Invalid input! Minimum age must be less than maximum age and in 0 - 120 bounds");
            return;
        }
        int targetAge = rand.nextInt(max - min + 1) + min;
        int guesses = 0;
        System.out.println("Guess the age!");

        while (true) {
            System.out.println("Enter your guess: ");
            int guess = sc.nextInt();
            guesses++;
            if (guess == targetAge) {
                System.out.println("Čestitamo! Pogodili ste godine " + targetAge + " u " + guesses + " pokušaju.");
                break;
            } else {
                System.out.println("Promašaj!!!");
                System.out.println(guesses + ": Vaša vrijednost = " + guess);
                if (guess < targetAge) {
                    System.out.println("Tražena vrijednost je veća od " + guess + "!");
                } else {
                    System.out.println("Tražena vrijednost je manja od " + guess + "!");
                }
                System.out.println("If you wish to continue guessing, enter 1. If you wish to exit, enter 0.");
                int choice = sc.nextInt();
                if (choice != 1) {
                    System.out.println("The age was " + targetAge + ". Better luck next time!");
                    break;
                }
            }

        }
}
}
