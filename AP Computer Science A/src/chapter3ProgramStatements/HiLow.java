package chapter3ProgramStatements;
import java.util.Scanner;

public class HiLow {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        Scanner value = new Scanner(System.in);
        String str = "Y";
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int guess;
        int maxTries = 5;
        int rand = (int)(Math.random() * range) + min;

        int tries = 0;
        while (str.toLowerCase().equals("y")) {

            System.out.print("Guess your number between 1 and 100: ");
            guess = value.nextInt();

            tries++;
            if (rand == guess) {
                System.out.println("Congratulations! Your guess is correct after " + tries + " attempt(s)!");
                tries = maxTries;
            }
            else if ((rand - guess) > 10) {
                System.out.println("Your guess is too low!");
            }
            else if ((guess - rand) > 10) {
                System.out.println("Your guess is too high!");
            }
            
            if(tries == maxTries) {

                tries = 0;
                if(rand != guess) {
                    System.out.print("Sorry you have lost the game. Actual number is: " + rand);
                    System.out.println();
                }
                System.out.print("Do you wish to play again – Y or N? ");
                str = value.next();
                rand = (int)(Math.random() * range) + min;
            }
        }
        //System.out.println("Game Over! You lost...");
    }
}