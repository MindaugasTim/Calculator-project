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
			case ("+"):
				input();
				this.result = add(firstNum, secondNum);
				Memory.addToMemory(result);
				output(result);
				break;
			case ("-"):
				input();
				this.result = subtract(firstNum, secondNum);
				Memory.addToMemory(result);
				output(result);
				break;
			case ("/"):
				input();
				this.result = divide(firstNum, secondNum);
				Memory.addToMemory(result);
				output(result);
				break;
			case ("*"):
				input();
				this.result = multiply(firstNum, secondNum);
				Memory.addToMemory(result);
				output(result);
				break;
			case ("e"):
				i = -1;
				break;
			case ("m"):
				Memory.showMemory();
				break;
			case ("o"):
				showCalcMenu();
				break;
			case ("b"):
				Calculator.mainMenu();
				break;
			default:
				System.out.println("Choose : + - / or *");
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

		System.out.println("Choose" + "\n + to add " + "\n - to substract" + "\n / to divide" + "\n * to multiply"
				+ "\n m show last results" + "\n o show menu" + "\n b back to main calculator menu " + "\n e to exit.");
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
