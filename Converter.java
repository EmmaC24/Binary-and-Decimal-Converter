import java.io.FileNotFoundException;
import java.io.IOException;

public class Converter {

		
	public Converter ()
	{	
	}
	
	public String decimalToBinary (long decimal)
	{
		long remainder = 0;
		String binary = "";
		while (decimal != 0)
		{
			remainder = (decimal % 2);
			binary = remainder + binary;
			decimal = decimal/2;
		}
		return binary;
	}
	
	public long binaryToDecimal (String binary)
	{
		long sum = 0;
		long currentNumber;
		for (int k = 0; k < binary.length(); k++)
		{
			currentNumber = binary.charAt (binary.length() -1 -k) -'0';
			sum += currentNumber*Math.pow(2,k);
		}
		return sum;
	}
	
}
