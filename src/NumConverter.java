import java.util.Scanner;

public class NumConverter implements Converter{

	private Scanner number;
	private Scanner string;
	private String result;
	
	public void ConverterMenu(){
		System.out.println("Choose converter: "
						+"\n1. Decimal	-> Binary"
						+"\n2. Binary	-> Decimal"
						+"\n3. Decimal	-> Octal"
						+"\n4. Octal	-> Decimal"
						+"\n5. Decimal	-> Hexadecimal"
						+"\n6. Hexadecimal	-> Decimal"	
						+"\n0. EXIT");
		int choose = number.nextInt();
		
		switch (choose) {
			case 1:
				System.out.println("Input decimal number (e.g. 987): ");
				int decToBin = number.nextInt();
				DecToBinary(decToBin);
				Memory.addToMemory(Integer.toString(decToBin,2));
				break;
			case 2:
				System.out.println("Input binary number (e.g. 1001): ");
				String binToDec = string.nextLine();
				BinaryToDec(binToDec);
				result = Integer.parseInt(binToDec,2) + "";
				Memory.addToMemory(result);
				break;	
			case 3:
				System.out.println("Input decimal number (e.g. 987): ");
				int decToOct = number.nextInt();
				DecToOctal(decToOct);
				Memory.addToMemory(Integer.toString(decToOct,8));
				break;			
			case 4:
				System.out.println("Input octal number (e.g. 30371): ");
				String octToDec = string.nextLine();
				OctalToDec(octToDec);
				result = Integer.parseInt(octToDec,2) + "";
				Memory.addToMemory(result);
				break;
			case (5):
				System.out.println("Input decimal number (e.g. 987): ");
				int decToHex = number.nextInt();
				DecToHexadecimal(decToHex);
				Memory.addToMemory(Integer.toString(decToHex,16));
				break;
			case (6):
				System.out.println("Input hexadecimal number (e.g. 5f43c1): ");
				String hexToDec = string.nextLine();
				HexadecimalToDec(hexToDec);
				result = Integer.parseInt(hexToDec,2) + "";
				Memory.addToMemory(result);
				break;
			case (0):
				System.out.println("---------------");
				break;
			default:
				System.out.println("You entered wrong command! Bye bye.");
			
		}
		
		
		
	}
	
	@Override
	public void DecToBinary(int x) {
		// TODO Auto-generated method stub
		System.out.println("Binary: "+Integer.toString(x,2));
	}

	@Override
	public void BinaryToDec(String dec) {
		// TODO Auto-generated method stub
		System.out.println("Decimal: "+Integer.parseInt(dec,2));
	}

	@Override
	public void DecToOctal(int x) {
		// TODO Auto-generated method stub
		System.out.println("Octal: "+Integer.toString(x,8));
	}

	@Override
	public void OctalToDec(String dec) {
		// TODO Auto-generated method stub
		System.out.println("Decimal: "+Integer.parseInt(dec,8));
	}

	@Override
	public void DecToHexadecimal(int x) {
		// TODO Auto-generated method stub
		System.out.println("Hexadecimal: "+Integer.toString(x,16));
	}

	@Override
	public void HexadecimalToDec(String dec) {
		// TODO Auto-generated method stub
		System.out.println("Decimal: "+Integer.parseInt(dec,2));
	}

}
