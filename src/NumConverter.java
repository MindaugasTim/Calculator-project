
public class NumConverter implements Converter{

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
