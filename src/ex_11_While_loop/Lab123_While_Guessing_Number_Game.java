package ex_11_While_loop;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Number_Game {
    public static void main(String[] args) {

        Random random = new Random(); //system will take random nbr we need to guess
        int numberTOGuess = random.nextInt(100)+1; //+1 means then it will take till 100 value
        //System.out.println(numberTOGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts = 0;

        while(true){
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // Consume invalid token
                continue;
            }

            guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }

            if(guess < numberTOGuess){
                System.out.println("Too low, try again");
            }else if(guess > numberTOGuess) {
                System.out.println("Too high, try again");
            }
            else{
                System.out.println("Correct! You guessed it in " + attempts + " attempts");
                break;
            }
        }
    }

}
