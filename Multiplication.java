package mathQuiz;

public class Multiplication extends MathOperation{
	
	public Multiplication() {
		operatorName = "*";
	}
	
	@Override
	public int doOperation(int random1, int random2) {
		
		return (random1 * random2);
	}
}
