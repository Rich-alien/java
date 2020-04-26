package Task3;

import java.util.Calendar;
import java.util.Date;

public class DateAndCalendar {

	public Date printDate(Integer[] array){
		Date date = new Date(array[0]-1900, array[1]-1, array[2],array[3], array[4]);
		return date;
	}

	public Calendar printCalendare(Integer[] array){

		Calendar calendar = Calendar.getInstance();
		calendar.set(array[0], array[1]-1, array[2],array[3], array[4]);
		return calendar;
	}

}
