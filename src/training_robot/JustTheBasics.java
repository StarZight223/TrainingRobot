package training_robot;

public class JustTheBasics {
	public int onlyReturnsZero() {
		return 0;
	}

	public double calculateXPlusY(double x, double y) {
		return x + y;
	}
	
	public double calculateAbsolute(double value) {
		return Math.abs(value);
	}
	
	// Hint: The function Math.pow will be helpful
	public double calculateHypoteneuse(double sideA, double sideB) {
		// TODO: make this calculate the hypoteneuse
		double a = Math.pow(sideA, 2);
		double b = Math.pow(sideB, 2);
		return Math.pow(a + b, 0.5);
	}
	
	public double sumOfSquares(double[] args) {
		// TODO: make this calculate the sum of the squares of all the args.
		double total = 0.0;
		for (double arg : args)
		{
			total = total + Math.pow(arg, 2.0);
		}
		return total;
	}
	
	public void conflictArea() {
		// THIS IS A CONFLICT! GRR! ARGH!
	}
}
