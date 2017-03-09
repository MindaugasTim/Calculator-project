import java.util.Scanner;

public interface Operations {
	
	public Scanner sc = new Scanner(System.in);
	
	public String add(double x, double y);

	public String subtract(double x, double y);

	public String divide(double x, double y);

	public String multiply(double x, double y);
	
	public void input();
	
	public void showCalcMenu();

	public void output(String s);
	
	
}
