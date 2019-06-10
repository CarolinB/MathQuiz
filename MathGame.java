package mathQuiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MathGame {
	
	final static int COUNT = 1;	// number of right answers to reach next level
	
	public void startGame() {

		Scanner sc = new Scanner(System.in);
		MathOperation mathOperation;
		mathOperation = new Addition();
		
		int countRight = 0;
		int countWrong = 0;
		
		System.out.println("Das ist ein Mathe-Übungsprogramm. \n"
				+ "Es gibt 5 Level. "
				+ "Nach " + COUNT + " richtigen Antworten erreichst du das nächste Level."
				+ " \nZum Beenden drücke irgendeine Taste, keine Zahl."
				+ "\n\nLevel 1 * - Addition\n");
		
		while(true) {
			int userResult;
			int random1 = (int)(Math.random() * 100 + 1);
			int random2 = (int)(Math.random() * 100 + 1);
			System.out.println(random1 + " " + mathOperation.operatorName + " " + random2 + " = ");
			
			try {
				userResult = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Das Programm wurde abgebrochen.");
				break;
			}
			
			if (userResult == mathOperation.doOperation(random1, random2)) {
				System.out.println("Richtig, gut gemacht!");
				countRight++;
				
				// Level-conditions
				if (countRight == 1 * COUNT) {
					System.out.println("\nLevel 2 erreicht ** - Subtraktion\n");
					mathOperation = new Subtraction();
					
				} else if (countRight == 2 * COUNT) {
					System.out.println("\nLevel 3 erreicht *** - Multiplikation\n");
					mathOperation = new Multiplication();
					
				} else if (countRight == 3 * COUNT) {
					System.out.println("\nLevel 4 erreicht **** - Division\n");
					mathOperation = new Division();
					
				} else if (countRight == 4 * COUNT) {
					System.out.println("\nLevel 5 erreicht ***** - Modulo\n");
					mathOperation = new Modulo();
					
				} else if (countRight >= 5 * COUNT){
					System.out.println("\nZiel erreicht - super!!\n");
					break;
				}
				
			} else {
				System.out.println("Nicht richtig, versuch es nochmal.");
				countWrong++;
			}
		}
	
	
		// Print Final results
		if ((countRight + countWrong) == 1) {
			System.out.print("Eine Aufgabe. ");
		} else {
			System.out.print((countRight + countWrong) + " Aufgaben. ");
		}
		if (countRight == 1) {
			System.out.print("eine war richtig, ");
		} else {
			System.out.print(countRight + " waren richtig, ");
		}
		if (countWrong == 1) {
			System.out.print("eine war falsch.\n\n");
		} else {
			System.out.print(countWrong + " waren falsch.\n\n");
		}
		
	}
	
}
