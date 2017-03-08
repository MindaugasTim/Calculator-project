
public class TestCalc {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.setMemory(new Memory());
		c1.setSimpleCalc(new SimpleCalc());
		c1.controller();
		c1.calcMemory();
		
	}
	
}
