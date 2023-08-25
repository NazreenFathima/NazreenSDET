package dailyLearnings;

public class DoWhileStatement {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		/*
		 * do-while loop checks the condition at the end of the loop after executing the loop statements. 
		 * When the number of iteration is not known and we have to execute the loop at least once, 
		 * we can use do-while loop.
		 */
		int count=0;
		do 
		{
			System.out.println("Count is "+count);
			count++;
		}
		while
			(count<5);

	}

}
