
public class SimpleCalc implements Operations {

	
	@Override
	public void add(double x, double y) {
		System.out.println(x+y);
	}

	@Override
	public void subtract(double x, double y) {
		System.out.println(x-y);
	}

	@Override
	public void divide(double x, double y) {
		System.out.println(x/y);
	}

	@Override
	public void multiply(double x, double y) {
		System.out.println(x*y);
	}


	
	
}
	

