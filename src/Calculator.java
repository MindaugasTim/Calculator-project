import java.util.Scanner;

public class Calculator {

	private static SimpleCalc simpleCalc = new SimpleCalc();
	private QuadraticEquation quadraticEquation = new QuadraticEquation();
	private Trigonometric trigonometric = new Trigonometric();
	private NumConverter numConverter = new NumConverter();


	public static void mainMenu() {
	
		simpleCalc.calculationMenu();
		
	}



	

}
