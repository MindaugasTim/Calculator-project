import java.util.Scanner;

public class QuadraticEquation implements QuadraticInterface {

	private double a;
	private double b;
	private double c;
	private String result;

	public void QuadraticEquationSolver() {
		
		input();
		
		double x = (-b + (Math.sqrt((b * b - ((4 * a * c)))))) / (2 * a);
		double y = (-b - (Math.sqrt((b * b - ((4 * a * c)))))) / (2 * a);

		if ((b * b - ((4 * a * c))) < 0) {
			result = "There are no real roots";
			output(result);
		} else
			result = "The Roots are " + (Double.toString(x) + " and " + Double.toString(y));
			output(result);

	}

	@Override
	public void input() {
		System.out.println("Enter first number: ");
		this.a = sc.nextDouble();
		System.out.println("Enter second number: ");
		this.b = sc.nextDouble();
		System.out.println("Enter third number: ");
		this.c = sc.nextDouble();

	}

	@Override
	public void output(String s) {
		System.out.println(s);
	}

}
