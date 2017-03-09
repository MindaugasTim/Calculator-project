

public class SimpleCalc implements Operations {

	private String result;
	private double firstNum;
	private double secondNum;

	
	public void calculationMenu() {
		showCalcMenu();
		int i = 0;
		while (i != -1) {
			result = sc.next();
			switch (result) {
			case ("1"):
				input();
				this.result = add(firstNum, secondNum);
				Memory.addToMemory(result);
				output(result);
				showCalcMenu();
				break;
			case ("2"):
				input();
				this.result = subtract(firstNum, secondNum);
				Memory.addToMemory(result);
				output(result);
				showCalcMenu();
				break;
			case ("3"):
				input();
				this.result = divide(firstNum, secondNum);
				Memory.addToMemory(result);
				output(result);
				showCalcMenu();
				break;
			case ("4"):
				input();
				this.result = multiply(firstNum, secondNum);
				Memory.addToMemory(result);
				output(result);
				showCalcMenu();
				break;
			case ("5"):
				i = -1;
				break;
			case ("6"):
				Memory.showMemory();
			showCalcMenu();
				break;
			case ("7"):
				Menu.menu();
				break;
			default:
				showCalcMenu();
			}

		}

	}

	@Override
	public void input() {

		System.out.println("Enter first number: ");
		this.firstNum = sc.nextDouble();
		System.out.println("Enter second number: ");
		this.secondNum = sc.nextDouble();

	}
	
	@Override
	public void output(String s) {

		System.out.println(s);
	}
	
	@Override
	public void showCalcMenu() {

		System.out.println("Choose" + "\n 1 to add " + "\n 2 to substract" + "\n 3 to divide" + "\n 4 to multiply"
				+ "\n 5 to exit." + "\n 6 show last results" + "\n 7 back to main calculator menu ");
	}

	@Override
	public String add(double x, double y) {
		return result = x + " + " + y + " = " + (x + y);
	}

	@Override
	public String subtract(double x, double y) {
		return result = x + " - " + y + " = " + (x - y);
	}

	@Override
	public String divide(double x, double y) {
		return result = y == 0 ? "You cant divide by 0" : x + " / " + y + " = " + (x / y);
	}

	@Override
	public String multiply(double x, double y) {
		return result = x + " * " + y + " = " + (x * y);
	}

}
