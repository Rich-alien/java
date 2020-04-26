package Task1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TestCalendar {
	public void test(){
		//get current DateTime
		Calendar c1 = Calendar.getInstance();
		//Gets the date formatter with the default formatting style for the default locale.
		DateFormat df = DateFormat.getDateInstance();
		System.out.println("default   " + df.format(c1.getTime()));

		//Gets the date formatter with the given formatting style for the default locale.
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("def short " + df.format(c1.getTime()));

		Locale locale = new Locale("ru");
//		Locale locale = new Locale("ru", "RU");
		df = DateFormat.getDateInstance(DateFormat.LONG, locale);
		System.out.println("ru long   " + df.format(c1.getTime()));
		df = DateFormat.getDateInstance(DateFormat.FULL, locale);
		System.out.println("ru full   " + df.format(c1.getTime()));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
		System.out.println("ru medium " + df.format(c1.getTime()));
		df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
		System.out.println("ru short  " + df.format(c1.getTime()));
		//Test SimpleDateFormat with RU Locale
		String sFormat = "dd MMM yyyy";
		df = new SimpleDateFormat(sFormat, locale);
		System.out.println(sFormat + " " + df.format(c1.getTime()));
		sFormat = "dd MMMM yyyy";
		df = new SimpleDateFormat(sFormat, locale);
		System.out.println(sFormat + " " + df.format(c1.getTime()));
		sFormat = "EEE, MMM d, ''yy"; //See SimpleDateFormat API
		df = new SimpleDateFormat(sFormat, locale);
		System.out.println(sFormat + " " + df.format(c1.getTime()));
		sFormat = "yyyy.MM.dd G 'at' HH:mm:ss z";
		df = new SimpleDateFormat(sFormat, locale);
		System.out.println(sFormat + " " + df.format(c1.getTime()));

		//Test calendar real class
		System.out.println("calendar instance of GregorianCalendar? " + (c1 instanceof GregorianCalendar));

		//Test Calendar Lenient
		System.out.println("Calendar is lenient? " + c1.isLenient());
		c1.set(2013, 0, 32);
		df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
		System.out.println("WOW 32 January 2013 is " + df.format(c1.getTime()));

		c1.setLenient(false);
		c1.set(2013, 0, 32);
		System.out.println("Calendar is lenient? " + c1.isLenient());
		df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
		//System.out.println("WOW 32 January 2013 is " + df.format(c1.getTime())); //Error!
	}
}