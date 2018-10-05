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
		// Pythagorean theorem a^2 + b^2 = c^2
		// c = sq.rt a^2 + b^2
		return Math.pow ( Math.pow (sideA,2)+Math.pow (sideB,2), 0.5);
		
	}
	
	public double sumOfSquares(double[] args) {
		// TODO: make this calculate the sum of the squares of all the args.
		// 1^2 + 2^2 + 3^2 + 4^2 + 5^2 = 55
		double total = 0;
		for (double arg : args) {
			total = total + Math.pow (arg,2);
		}
		return total;
	}
}
