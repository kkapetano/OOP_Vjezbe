package Vjezba_8.Game_Pckg;
import Vjezba_8.AUX_CLS.Generator;
import Vjezba_8.AUX_CLS.UserInpts;
import Vjezba_8.AUX_CLS.UsrInptException;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Game {
    private static int age2Guess;
    private static int cnt;
    private static boolean gameCont;
    private static UserInpts userInpts;

    public Game() {
        Generator gen = new Generator();
        age2Guess = gen.genAge2Guess(0, 120);
        cnt = 0;
        gameCont = true;
        userInpts = new UserInpts();
    }
    public void runGame() {
        Scanner scanner = new Scanner(System.in);

        while (gameCont) {
            try {
                int lwr;
                while(true){
                    System.out.println("Please enter one integer value [1 -> 120] for lower bound:");
                    lwr = Integer.parseInt(scanner.nextLine());
                    if (lwr < 1 || lwr >= 120) {
                        throw new UsrInptException("Value must be between 1 and 120!");
                    }else{
                        break;
                    }
                }
                int uppr;
                System.out.println("Please enter one integer value [1 -> 120] for upper bound:");
                while(true){
                    uppr = Integer.parseInt(scanner.nextLine());
                    if (uppr <= lwr || uppr > 120) {
                        throw new UsrInptException("Value must be between 1 and 120 and higher than lower bound!");
                    } else {
                        break;
                    }
                }
                int guess;
                while(true){
                    System.out.println("Guess the age:");
                    guess = Integer.parseInt(scanner.nextLine());

                    if (guess > 120 || guess < 1 ) {
                        System.out.println("*****************************************");
                        throw new UsrInptException("Guess must be between 1 and 120!");
                    } else {
                        break;
                    }
                }

                userInpts.setInputs(lwr, uppr, guess);
                cnt++;
                System.out.println("low: " + lwr + " upp: " + uppr + " guess: " + guess);
                if (guess == age2Guess) {
                    System.out.println("*************************************************************");
                    System.out.println("                        YOU WON!");
                    System.out.println("<<<<<<<<<<<<<<<<<< Attempt/s: " + cnt + " >>>>>>>>>>>>>>>>>>");
                    System.out.println("Looked for value " + age2Guess + "        Your guess: " + guess);
                    System.out.println("*************************************************************");
                    gameCont = false;
                } else {
                    if (age2Guess < lwr) {
                        System.out.println("<<<<<<<<<<<<<<<<<< Tip for playing >>>>>>>>>>>>>>>>>>");
                        System.out.println("Age to guess has value lesser than -> " + lwr);
                        System.out.println("Attempt: " + cnt + "     Value guess in attempt: " + guess);
                    } else if(age2Guess > uppr) {
                        System.out.println("<<<<<<<<<<<<<<<<<< Tip for playing >>>>>>>>>>>>>>>>>>");
                        System.out.println("Age to guess has value higher than -> " + uppr);
                        System.out.println("Attempt: " + cnt + "     Value guess in attempt: " + guess);
                    } else {
                        System.out.println("<<<<<<<<<<<<<<<<<< Tip for playing >>>>>>>>>>>>>>>>>>");
                        System.out.println("Age to guess is in the interval -> [" + lwr + " - " + uppr + "]");
                        System.out.println("Attempt: " + cnt + "     Value guess in attempt: " + guess);
                    }

                    System.out.println("*****************************************");
                    System.out.println("Do you want to continue?");
                    System.out.println("Enter 1 for YES, any other number for NO.");
                    System.out.println("*****************************************");
                    int cont = Integer.parseInt(scanner.nextLine());
                    userInpts.setStatus(cont == 1);
                    gameCont = userInpts.getStatus();

                    if (!gameCont) {
                        System.out.println("Thanks for playing. You played " + cnt + " times.");
                    }
                }
            } catch (UsrInptException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter integers only.");
            }
        }

        scanner.close();
    }
}

