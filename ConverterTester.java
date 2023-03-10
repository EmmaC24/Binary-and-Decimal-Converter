import java.util.Scanner;

public class ConverterTester {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
        long decimal;
        String binary;
        
        Converter con = new Converter();
        System.out.println ("Convert to binary or decimal? (b/d)");
        String response = keyboard.next();
        if (response.equals("b"))
        {
        	System.out.println("Please enter the decimal you would like to convert to binary:");
        	decimal = keyboard.nextLong();
        	System.out.println (con.decimalToBinary (decimal));
        			
        }
        else
        {
        	System.out.println("Please enter the binary string you would like to convert to a decimal:");
        	binary = keyboard.next();
        	System.out.println (con.binaryToDecimal (binary));
        }
	}

}
