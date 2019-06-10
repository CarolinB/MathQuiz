package mathQuiz;

public class Modulo extends MathOperation{
	
	public Modulo() {
		operatorName = "%";
	}
	
	@Override
	public int doOperation(int random1, int random2) {
		
		return (random1 % random2);
	}
	
}
