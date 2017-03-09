import java.util.Scanner;

public class TestConvertor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Scanner x = new Scanner(System.in);
		NumConverter con = new NumConverter();
		
		while(true){
		con.ConverterMenu();
		int convert = s.nextInt();
			if(convert==1){
				System.out.println("Input decimal number (e.g. 987): ");
				int decToBin = s.nextInt();
				con.DecToBinary(decToBin);
			}
			if(convert==2){
				System.out.println("Input binary number (e.g. 1001): ");
				String binToDec = x.nextLine();
				con.BinaryToDec(binToDec);
			}
			if(convert==3){
				System.out.println("Input decimal number (e.g. 987): ");
				int decToOct = s.nextInt();
				con.DecToOctal(decToOct);
			}
			if(convert==4){
				System.out.println("Input octal number (e.g. 30371): ");
				String octToDec = x.nextLine();
				con.OctalToDec(octToDec);
			}
			if(convert==5){
				System.out.println("Input decimal number (e.g. 987): ");
				int decToHex = s.nextInt();
				con.DecToHexadecimal(decToHex);
			}
			if(convert==6){
				System.out.println("Input hexadecimal number (e.g. 5f43c1): ");
				String hexToDec = x.nextLine();
				con.HexadecimalToDec(hexToDec);
			}
			if(convert==0){
				System.out.println("---------------");
				break;
			}
			if(convert<0 || convert>6){
				System.out.println("Choose wisely!!!");
			}
		}
		
		
	}

}
