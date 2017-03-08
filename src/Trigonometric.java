import java.text.DecimalFormat;
import java.util.Scanner;

public class Trigonometric implements TrigoInterface {
	private Scanner scanner;
	private double number;
	private static DecimalFormat df = new DecimalFormat("###.##");

	public Trigonometric(){
		scanner = new Scanner(System.in);
	}
	

	@Override
	public String trigoMenu(){
		System.out.print("Enter number You want to convert: ");
		this.number = scanner.nextDouble();
		
		System.out.print("1. Sin\n2. Cos\n3. Tangent\n4. Cotangent\nEnter number of command from the list: ");
		int choose = scanner.nextInt();
		
		switch (choose) {
		case 1:
			return countSin();
			
		case 2:
			return countCos();
					
		case 3:
			return countTan();
						
		case 4:
			return countCot();
				
		default:
			System.out.println("You entered wrong command! Bye bye.");
			
		}
		return "";
	} 

	public String countSin() {
		return df.format(Math.sin(this.number));
	}
	
	public String countCos() {
		return df.format(Math.cos(this.number));
	}
	
	public String countTan() {
		return df.format(Math.tan(this.number));	
	}
	
	public String countCot() {
		return df.format(Math.cos(this.number) / Math.sin(this.number));	
	}
}
