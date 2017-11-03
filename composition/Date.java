

package composition;

public class Date{
	private int day, month, year;

	private static final int[] numberOfDays = {0, 31, 28,
		31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		public Date(int month, int day, int year)
		{
			if((month < 0) || (month > 12) )
			{
				throw new IllegalArgumentException("month (" 
					+ month + ") should be 1-12.");
			}

			if((day <=0) || (day > numberOfDays[month]) && !(month == 2 && day == 29))
			{
				throw new IllegalArgumentException("The day (" + day + ") is not in range based in month. ");
			}

			if(month == 2 && day == 29 && !(year % 400 == 0) ||
				(year % 4 == 0 && year % 100 != 0))
			{
				throw new IllegalArgumentException("The day (" + day + ") is out of range based in month or year.");
			}

			this.day = day;
			this.month = month;
			this.year = year;
		}

		public String toString(){
			return String.format("%02d-%02d-%d", month, day, year);
		}
}
