package Task1;

import java.util.Date;

public class DateTest {

	public void test ( ) {
		Date d = new Date(1_400_000_000_000L);
		System.out.println("d1 = " + d.toString());
		d.setTime(d.getTime()+ 2*60*60*1000);
		System.out.println("d2 = " + d.toString());
	}
}

