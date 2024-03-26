package Vjezba_1.zd2;

import java.util.Scanner;

public class ZD_2_1{

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number ... \t");
            double num = sc.nextDouble();

            double square = Math.pow(num, 2);
            double cube = Math.pow(num, 3);

            System.out.println("Square of the number is: " + square);
            System.out.println("Cube of the number is: " + cube);
        }
    }

