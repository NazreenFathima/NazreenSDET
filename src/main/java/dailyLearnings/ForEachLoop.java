package dailyLearnings;

public class ForEachLoop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3,4,5};
		for(int nums:numbers)
		{
			System.out.println("The numbers in the array are "+nums);
		}
		for (int num : numbers)
		{
			System.out.println(num);
		}

	}

}
