package Task3;

import org.junit.Assert;
import org.junit.Test;

public class Test3Task {

	private Integer[] arr2;

	@Test
	public void testPersons(){
		Integer[] arr1 = {2010,10,14,10,1};
		Integer[] arr2 = {2011,01,15,05,31};
		Integer[] arr3 = {1900,1,16,4,13};
		Integer[] arr4 = {2112,5,29,15,10};
		Integer[] arr5 = {1819,11,14,13,25};

		String arr1Resilt = "Thu Oct 14 10:01:00 SAMST 2010";
		String arr2Resilt = "Sat Jan 15 05:31:00 SAMT 2011";
		String arr3Resilt = "Tue Jan 16 04:13:00 SAMT 1900";
		String arr4Resilt = "Sun May 29 15:10:00 SAMT 2112";
		String arr5Resilt = "Sun Nov 14 13:25:00 SAMT 1819";

		DateAndCalendar dateAndCalendar = new DateAndCalendar();
		Assert.assertEquals(arr1Resilt, dateAndCalendar.printDate(arr1).toString());
		Assert.assertEquals(arr2Resilt, dateAndCalendar.printDate(arr2).toString());
		Assert.assertEquals(arr3Resilt, dateAndCalendar.printDate(arr3).toString());
		Assert.assertEquals(arr4Resilt, dateAndCalendar.printDate(arr4).toString());
		Assert.assertEquals(arr5Resilt, dateAndCalendar.printDate(arr5).toString());


	}
}
