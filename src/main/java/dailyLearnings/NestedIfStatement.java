package dailyLearnings;

public class NestedIfStatement 
{
	public static void main(String[] args)
	{
		int x=10;
		int y =20;
		if(x<y)
		{
			int a=10;
			int b=50;
			if (a+b==100)
			{
				System.out.println("a+b equal to 100");
			}
			else if(a+b>100)
			{
				System.out.println("a+b greater than 100");
			}
			else
			{
				System.out.println("a+b lesser than 100");
			}
		}
	}
}
