package mandatoryHomeWork.week3.HW;

public class ConvertTheTemperature 
{
	/*
	 * Understood the prob  : YES
	 * 
	 * Input : double
	 * Output : double[]
	 * 
	 * Data Set : 
	 * Input: celsius = 36.50
Output: [309.65000,97.70000]
Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.

Input: celsius = 122.11
Output: [395.26000,251.79800]
Explanation: Temperature at 122.11 Celsius converted in Kelvin is 395.26 and converted in Fahrenheit is 251.798.
	*
	*
	*Pseudocode:
	*1)Kelvin = Celsius + 273.15
	*2)Fahrenheit = Celsius * 1.80 + 32.00
	*3)return double[kelvin, fahrenheit]
	*
	 */
	
	public double[] ConvertTemp(double num)
	{	
		double[] output = new double[2];
		output[0] = num + 273.15;
		output[1] = num * 1.80 + 32.00;
		return output;
	}
	
	
	
	
}
