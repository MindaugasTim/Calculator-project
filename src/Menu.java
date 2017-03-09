import java.util.Scanner;

public class Menu {
	NumConverter converter = new NumConverter();
	SimpleCalc simpleCalc = new SimpleCalc();
	QuadraticEquation quadratic = new QuadraticEquation();
	Trigonometric trigo = new Trigonometric();
	Scanner scanner = new Scanner(System.in);
	
	public void menu(){
		System.out.println("Choose what You want from the list:\n"
				+ "1. Simple artitmetic converter\n"
				+ "2. Convert numbers from dec to bin etc\n"
				+ "3. Calculate quadratic equation\n"
				+ "4. Convert sin, cos, tan and cot");
		
		int choose = scanner.nextInt();
		
		switch (choose) {
		
		case 1:
			simpleCalc.calculationMenu();
			break;
		case 3:
			quadratic.quadraticMenu();
			break;
		case 4:
			trigo.trigoMenu();
			break;
		default:
			System.out.println("Wrong input");
			break;
		}
	}

}
