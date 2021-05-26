package Tutorial;

import java.util.Random;
import java.util.Scanner;

public class guessNumberUser {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int randomNumber = rand.nextInt(10) + 1;
		int count = 3;
		System.out.println("I\'ve picked a number between 1 and 10. Guess the number!");
		
		while (count != 0) {
			System.out.println("You have " + count + " guesses left.");
			int playerGuess = sc.nextInt(); 
			count -= 1;
			
			if (playerGuess == randomNumber) {
				System.out.println("You win! The number is indeed " + randomNumber);
				break; 
			} else if (playerGuess > randomNumber) {
				System.out.println("Your guess is too HIGH. Try again!");
			} else {
				System.out.println("Your guess is too LOW. Try again!");
			}
		}
		
		System.out.println("You\'re out of tries. The number was " + randomNumber);
	}

}
