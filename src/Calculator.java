import java.util.Scanner;

public class Calculator {

	private static Scanner sc = new Scanner(System.in);
	private static SimpleCalc simpleCalc = new SimpleCalc();
	private static QuadraticEquation quadraticEquation = new QuadraticEquation();
	private static Trigonometric trigonometric = new Trigonometric();
	private static NumConverter numConverter = new NumConverter();

	public static void mainMenu() {
		showNav();
		while (true) {
			int nr = sc.nextInt();
			switch (nr) {
			case (1):
				simpleCalc.calculationMenu();
				break;
			case (2):
				quadraticEquation.quadraticMenu();
				break;
			case (3):
				trigonometric.trigoMenu();
				break;
			case (0):
				break;
			default:
				showNav();
			}
		}
	}

	public static void showNav() {
		System.out.println("Choose 1 to simple calculations" + "\n 2 quadratic equation solver"
				+ "\n 3 trigonometric menu" + "\n 0 exit");

	}

}
