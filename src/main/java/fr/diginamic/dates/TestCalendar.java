/** 
*
*/
package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author robin
 *
 */
public class TestCalendar {

	/**
	 * @param args void
	 */
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();

		String pattern = "dd-MM-yyyy";

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String d = simpleDateFormat.format(date);

		System.out.println(d);

		pattern = "dd-MM-yyyy hh:mm:ss";
		simpleDateFormat = new SimpleDateFormat(pattern);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 59);
		date = cal.getTime();

		d = simpleDateFormat.format(date);

		System.out.println(d);

		pattern = "yyyy-MM-dd hh:mm:ss";
		simpleDateFormat = new SimpleDateFormat(pattern);
		d = simpleDateFormat.format(date);
		System.out.println(d);
	}
}
