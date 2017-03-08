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
		System.out.print("Enter number You want to convert: ");
		this.number = scanner.nextDouble();
		
		System.out.print("1. Sin\n2. Cos\n3. Tangent\n4. Cotangent\nEnter number of command from the list: ");
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
		default:
			System.out.println("You entered wrong command! Bye bye.");
			
		}
		
	} 

	public void countSin() {		
		result = df.format(Math.sin(this.number));
		Memory.addToMemory(result);
		System.out.println("Sin of " + number + " = " + result);
	}
	
	public void countCos() {
		result = df.format(Math.cos(this.number));
		Memory.addToMemory(result);
		System.out.println("Cos of " + number + " = " + result);
	}
	
	public void countTan() {
		result = df.format(Math.tan(this.number));	
		Memory.addToMemory(result);
		System.out.println("Tangent of " + number + " = " + result);
	}
	
	public void countCot() {
		result = df.format(Math.cos(this.number) / Math.sin(this.number));
		Memory.addToMemory(result);
		System.out.println("Cotangent of " + number + " = " + result);
	}
}
