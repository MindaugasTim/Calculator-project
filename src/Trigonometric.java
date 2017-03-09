import java.text.DecimalFormat;
import java.util.Scanner;

public class Trigonometric implements TrigoInterface {
	private Scanner scanner;
	private double number;
	private static DecimalFormat df = new DecimalFormat("###.##");
	Memory memory;
	private String result;

	public Trigonometric(){
		scanner = new Scanner(System.in);
	}

	public String getResult() {
		return result;
	}

	@Override
	public void trigoMenu(){
		
		System.out.print("1. Sin\n2. Cos\n3. Tangent\n4. Cotangent\n5. Show memory\n6. Convert one more time\n7. Go to main menu\nEnter number of command from the list: ");
		int choose = scanner.nextInt();
		
		
		switch (choose) {
		case 1:
			countSin();
			break;
		case 2:
			countCos();
			break;	
		case 3:
			countTan();
			break;			
		case 4:
			countCot();
			break;
		case (5):
			Memory.showMemory();
			break;
		case (6):
			trigoMenu();
			break;
		case (7):
			Calculator.mainMenu();
			break;
		default:
			System.out.println("You entered wrong command! Bye bye.");
			
		}
		
	} 

	public void countSin() {
		keyboardInput();
		result = df.format(Math.sin(this.number));
		Memory.addToMemory(result);
		System.out.println("Sin of " + number + " = " + result + "\n");
		trigoMenu();
	}
	
	public void countCos() {
		keyboardInput();
		result = df.format(Math.cos(this.number));
		Memory.addToMemory(result);
		System.out.println("Cos of " + number + " = " + result + "\n");
		trigoMenu();
	}
	
	public void countTan() {
		keyboardInput();
		result = df.format(Math.tan(this.number));	
		Memory.addToMemory(result);
		System.out.println("Tangent of " + number + " = " + result + "\n");
		trigoMenu();
	}
	
	public void countCot() {
		keyboardInput();
		result = df.format(Math.cos(this.number) / Math.sin(this.number));
		Memory.addToMemory(result);
		System.out.println("Cotangent of " + number + " = " + result + "\n");
		trigoMenu();
	}

	public void keyboardInput(){
		System.out.print("Enter number You want to convert: ");
		this.number = scanner.nextDouble();
	}
	
	}
