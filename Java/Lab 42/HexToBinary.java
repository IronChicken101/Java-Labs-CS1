//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class HexToBinary
{
	private char hex;

	public HexToBinary()
	{
		hex = ' ';
	}

	public HexToBinary(char hexChar)
	{
		setHex(hexChar);

	}
	public void setHex(char hexChar)
	{
		hex = hexChar;
	} 
	public String getBinary()
	{
		String binaryValue = "";
		switch (hex)
		{
			case 'A' : binaryValue = "1010"; break;
			case 'B' : binaryValue = "1011"; break;
			case 'C' : binaryValue = "1100"; break;
			case 'D' : binaryValue = "1101"; break;
			case 'E' : binaryValue = "1110"; break;
			case 'F' : binaryValue = "1111"; break;
			default  : binaryValue = "Error";
		}

		return binaryValue;
	}

	public String toString()
	{
		return hex + " is " + getBinary() + " in binary!";
	}
}