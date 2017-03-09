
public class NumConverter implements Converter{

	public void ConverterMenu(){
		System.out.println("Choose converter: "
						+"\n1. Decimal	-> Binary"
						+"\n2. Binary	-> Decimal"
						+"\n3. Decimal	-> Octal"
						+"\n4. Octal	-> Decimal"
						+"\n5. Decimal	-> Hexadecimal"
						+"\n6. Hexadecimal	-> Decimal"	
						+"\n0. EXIT");	
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
