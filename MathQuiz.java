/* main class */

package mathQuiz;


public class MathQuiz {

	public static void main(String[] args) {
		
		/* A program to test your math knowledge
		 * and let you train your math skills
		 * starting with easy level (addition) 
		 * and ending up with calculations
		 * including subtraction, multiplication, 
		 * division and modulo.
		 * */
		
		
		
		// Beginn Zeitmessung
		long beginn, ende;
		beginn = System.currentTimeMillis();
		
		MathGame newGame = new MathGame();
		newGame.startGame();
		
		
		// Ende Zeitmessung, Ausgabe Zeit
		ende = System.currentTimeMillis();
		System.out.println("Zeit: " +  ((ende - beginn)/1000) + " Sekunden");

	}

}


