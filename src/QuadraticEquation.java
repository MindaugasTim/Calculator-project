
public class QuadraticEquation {

	public void QuadraticEquationSolver(double a, double b, double c) {

		double x = (-b + (Math.sqrt((b * b - ((4 * a * c)))))) / (2 * a);

		double y = (-b - (Math.sqrt((b * b - ((4 * a * c)))))) / (2 * a);

		if ((b * b - ((4 * a * c))) < 0) {

			System.out.println("There are no real roots");

		} else

			System.out.println("The Roots are " + x + " or " + y);

	}

}
