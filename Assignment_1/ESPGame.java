import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: (Guessing game picking a color)
 * Due: 06/17/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Alexander Nguyen
*/

public class ESPGame {

	public static void main(String[] args) throws FileNotFoundException {
		Random random = new Random();
		final String COLOR_BLACK = "Black", 
					 COLOR_WHITE = "White", 
					 COLOR_GRAY = "Gray",
					 COLOR_SLIVER = "Sliver",
					 COLOR_MAROON = "Maroon",
					 COLOR_RED = "Red",
					 COLOR_PURPLE = "Purple",
					 COLOR_FUCHSIA = "Fuchsia",
					 COLOR_GREEN = "Green",
					 COLOR_LIME = "Lime",
					 COLOR_OLIVE = "Olive",
					 COLOR_YELLOW = "Yellow",
					 COLOR_NAVY = "Navy",
					 COLOR_BLUE = "Blue",
					 COLOR_TEAL = "Teal",
					 COLOR_AQUA = "Aqua";
		
		String name, description, dueDate, selectedColor = "", guess, fileName;
		int correctGuesses = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("CMSC203 AssignmentL Test your ESP skills!");
		System.out.print("Enter the filename: "); // Insert filename
		fileName = keyboard.nextLine();
		PrintWriter outputfile = new PrintWriter(fileName);
		
		outputfile.println("1 black");
		outputfile.println("2 white");
		outputfile.println("3 gray");
		outputfile.println("4 silver");
		outputfile.println("5 maroon");
		outputfile.println("6 red");
		outputfile.println("7 purple");
		outputfile.println("8 fuchsia");
		outputfile.println("9 green");
		outputfile.println("10 lime");
		outputfile.println("11 olive");
		outputfile.println("12 yellow");
		outputfile.println("13 navy");
		outputfile.println("14 blue");
		outputfile.println("15 teal");
		outputfile.println("16 aqua");
		outputfile.close();
		
		for( int i = 1; i <= 3; i++) {
			int ranNum = random.nextInt(16)+1;
			switch(ranNum) {
				case 1  -> selectedColor = COLOR_BLACK;
				case 2  -> selectedColor = COLOR_WHITE;
				case 3  -> selectedColor = COLOR_GRAY;
				case 4 -> selectedColor = COLOR_SLIVER;	
				case 5 -> selectedColor = COLOR_MAROON;
				case 6 -> selectedColor = COLOR_RED;	
				case 7 -> selectedColor = COLOR_PURPLE;		
				case 8 -> selectedColor = COLOR_FUCHSIA;					
				case 9 -> selectedColor = COLOR_GREEN;	
				case 10 -> selectedColor = COLOR_LIME;
				case 11 ->  selectedColor = COLOR_OLIVE;	
				case 12 -> selectedColor = COLOR_YELLOW;	
				case 13 -> selectedColor = COLOR_NAVY;
				case 14 -> selectedColor = COLOR_BLUE;
				case 15 -> selectedColor = COLOR_TEAL;
				case 16 -> selectedColor = COLOR_AQUA;
			}
			
			System.out.println("Round " + i);
			
			System.out.println("\nI am thinking of a color.");
			System.out.println("Is it one of list of colors?");
			System.out.println("Enter your guess:");
			guess = keyboard.nextLine();
			
			while(!(guess.equalsIgnoreCase(COLOR_BLACK) || guess.equalsIgnoreCase(COLOR_WHITE) || guess.equalsIgnoreCase(COLOR_GRAY) ||
					guess.equalsIgnoreCase(COLOR_SLIVER) || guess.equalsIgnoreCase(COLOR_MAROON)||  guess.equalsIgnoreCase(COLOR_RED) 
					|| guess.equalsIgnoreCase(COLOR_PURPLE) || guess.equalsIgnoreCase(COLOR_FUCHSIA)  || guess.equalsIgnoreCase(COLOR_GREEN)
					|| guess.equalsIgnoreCase(COLOR_LIME) || guess.equalsIgnoreCase(COLOR_OLIVE) || guess.equalsIgnoreCase(COLOR_YELLOW)
					|| guess.equalsIgnoreCase(COLOR_NAVY) || guess.equalsIgnoreCase(COLOR_BLUE) || guess.equalsIgnoreCase(COLOR_TEAL)
					|| guess.equalsIgnoreCase(COLOR_AQUA)) ) {
				System.out.print("Enter your guess: ");
				guess = keyboard.nextLine();
			}
			
			if(guess.equalsIgnoreCase(selectedColor)) {
				correctGuesses++;
				System.out.println("\nI was thinking of " + selectedColor);
			}
			else {
				System.out.println("\nI was thinking of " + selectedColor);
			}
			
			
		}
		System.out.println("Game Over");
		System.out.println("You guessed " + correctGuesses + " out of 3 colors correctly.");
		System.out.print("Enter your name: ");
		name = keyboard.nextLine();
		System.out.print("Describe yourself:");
		description = keyboard.nextLine();
		System.out.print("Due Date:");
		dueDate = keyboard.nextLine();
		
		System.out.println("User Name: " + name);
		System.out.println("User Description: " + description);
		System.out.println("Date: " + dueDate);
	}
}
