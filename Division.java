package mathQuiz;

public class Division extends MathOperation {
	
	public Division() {
		operatorName = "/";
	}

	@Override
	public int doOperation(int random1, int random2) {
		
		return (random1 / random2);
	}
	
}
