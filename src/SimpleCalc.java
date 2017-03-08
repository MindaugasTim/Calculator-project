
public class SimpleCalc implements Operations {

	private String result;

	@Override
	public String add(double x, double y) {
		result = x + " + " + y + " = " + (x + y);
		return result;
	}

	@Override
	public String subtract(double x, double y) {
		result = x + " - " + y + " = " + (x - y);
		return result;
	}

	@Override
	public String divide(double x, double y) {
		result = y == 0 ? "You cant divide by 0" : x + " / " + y + " = " + (x / y);
		return result;
	}

	@Override
	public String multiply(double x, double y) {
		result = x + " * " + y + " = " + (x * y);
		return result;
	}

}
