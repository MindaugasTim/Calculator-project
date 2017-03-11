import java.util.Scanner;

public class Menu {
	public static NumConverter converter = new NumConverter();
	public static SimpleCalc simpleCalc = new SimpleCalc();
	public static QuadraticEquation quadratic = new QuadraticEquation();
	public static Trigonometric trigo = new Trigonometric();
	public static Scanner scanner = new Scanner(System.in);
	
	public static void menu(){
		System.out.println("Choose what You want from the list:\n"
				+ "1. Simple artitmetic converter\n"
				+ "2. Convert numbers from dec to bin etc\n"
				+ "3. Calculate quadratic equation\n"
				+ "4. Convert sin, cos, tan and cot\n"
				+ "5. EXIT");
		
		
		int i = 0;
		while (i != -1){
			int choose = scanner.nextInt();
		
		switch (choose) {
		
		case 1:
			simpleCalc.calculationMenu();
			break;
		case 2:
			converter.ConverterMenu();
			break;
		case 3:
			quadratic.quadraticMenu();
			break;
		case 4:
			trigo.trigoMenu();
			break;
		case 5:
			i = -1;
			break;
		default:
			System.out.println("Wrong input");
			break;
		}
		}
	}

}
