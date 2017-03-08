import java.util.Scanner;

public class Calculator {

	private SimpleCalc simpleCalc;
	private QuadraticEquation quadraticEquation;
	private Memory memory;
	private String result;

	public void controller() {

		Scanner sc = new Scanner(System.in);
		String i = "";
		while (i != "stop") {
			i = sc.next();
			switch (i) {
			case ("+"):
				result = simpleCalc.add(sc.nextDouble(), sc.nextDouble());
				memory.addToMemory(result);
				System.out.println(result);
				break;
			case ("-"):
				result = simpleCalc.subtract(sc.nextDouble(), sc.nextDouble());
				memory.addToMemory(result);
				System.out.println(result);
				break;
			case ("/"):
				result = simpleCalc.divide(sc.nextDouble(), sc.nextDouble());
				memory.addToMemory(result);
				System.out.println(result);
				break;
			case ("*"):
				result = simpleCalc.multiply(sc.nextDouble(), sc.nextDouble());
				memory.addToMemory(result);
				System.out.println(result);
				break;
			case ("s"):
				i = "stop";
				break;
			default:
				System.out.println("Choose : + - / or *");
			}

		}

	}

	public SimpleCalc getSimpleCalc() {
		return simpleCalc;
	}

	public void setSimpleCalc(SimpleCalc simpleCalc) {
		this.simpleCalc = simpleCalc;
	}

	public QuadraticEquation getQuadraticEquation() {
		return quadraticEquation;
	}

	public void setQuadraticEquation(QuadraticEquation quadraticEquation) {
		this.quadraticEquation = quadraticEquation;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public void calcMemory() {
		memory.showMemory();
	}

}
