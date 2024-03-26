package Vjezba_1.zd3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppIFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer...\t");


        try {
            int num = sc.nextInt();
            System.out.println("You entered:" + num);
        }catch (InputMismatchException exception){
            System.out.println("Invalid input. Please enter an integer... \t");

        }
    }

}
