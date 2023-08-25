package dailyLearnings;

class ObjectClassMainOutsideClass 
{
	int rollNo;
	String name;
}

class Student
{
	public static void main(String[] args)
	{
		ObjectClassMainOutsideClass obj = new ObjectClassMainOutsideClass();
		System.out.println(obj.rollNo);
		System.out.println(obj.name);
	}
}
