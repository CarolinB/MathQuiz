package mathQuiz;

public class Addition extends MathOperation {
	
	public Addition() {
		operatorName = "+";
	}
	
	@Override
	public int doOperation(int random1, int random2) {
		
		return (random1 + random2);
	}
}
