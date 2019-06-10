package mathQuiz;

public class Subtraction extends MathOperation{
	
	public Subtraction() {
		operatorName = "-";
	}
	
	@Override
	public int doOperation(int random1, int random2) {
		
		return (random1 - random2);
	}

}
