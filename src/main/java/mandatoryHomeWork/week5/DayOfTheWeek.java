package mandatoryHomeWork.week5;

public class DayOfTheWeek 
{
	/*
	 * Understood the prob : YES
	 * input : int
	 * output : String
	 * 
	 * Pseudocode:
	 * 1) Logic Add days in String[]
	 * 2) Initialize the days of month in array (for feb use unary to set day if it is leap)
	 * 3) Add the num of day in year from 1971 to year -1 in count after checking if it is leap or not
	 * 4) Add the number of days in the month using the int[]  till month-1
	 * 5) add days to count
	 * 6) return the value in String[] where index is count+4%7 (+4 is to shift day to Friday - since day 1 of 1971 is Friday)
	 */
	
	public String dayOfTheWeek(int day, int month, int year) {
        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] days = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int count = 0;
        for(int i = 1971;i<year;i++) {
            if(i%4==0&&(i%100!=0||i%400==0)){
                count=count+366;
            }
            else{
                count=count+365;
            }
        }
        for(int i=0;i<month-1;i++) {
            count += days[i];
        }
        count += day;
        return week[(count + 4) % 7];
    }
    
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
