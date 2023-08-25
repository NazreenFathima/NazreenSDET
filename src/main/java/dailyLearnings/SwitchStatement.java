package dailyLearnings;

public class SwitchStatement 
{
	/*
	 * Default statement is executed when any of the case doesn't match the value of expression. It is optional.
	   Break statement terminates the switch block when the condition is satisfied.
	   It is optional, if not used, next case is executed.
	 */
	
	public static void main (String[]  args)
	{
		int dayOfTheWeek = 7;
		switch(dayOfTheWeek) 
		{
		case 1: 
			System.out.println("It's Monday");
			break;
		case 2: 
			System.out.println("It's Tuesday");
			break;
		case 3: 
			System.out.println("It's Wednesday");
			break;
		case 4: 
			System.out.println("It's Thursday");
			break;
		case 5: 
			System.out.println("It's Friday");
			break;
		case 6: 
			System.out.println("It's Saturday");
			break;
		case 7: 
			System.out.println("It's Sunday");
			break;
		default:
			System.out.println("Invalid input");
			
			
		}
	}
}
