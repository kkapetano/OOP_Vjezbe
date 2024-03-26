package Vjezba_1.zd2;

import java.util.Scanner;
import java.lang.Math;


//public class Sphere
public class Primjer_2_App {

    public static void main(String[] args) {

        double volume;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a radius ... \t");
        double r = sc.nextDouble();
        System.out.println("What is with the 4/3?");
        System.out.println("4 ÷ 3 gives: " + 4/3);
        volume = (4/3)*Math.PI*Math.pow(r, 3);
        System.out.println("Volume is: " + volume);

    }
}