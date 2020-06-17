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
public class TestDates {

	/**
	 * @param args void
	 */
	public static void main(String[] args) {

		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());

		System.out.println(date);

		String pattern2 = "yyyy-MM-dd hh:mm:ss";
		simpleDateFormat = new SimpleDateFormat(pattern2);
		Date b = new Date();
		b.setHours(23);
		b.setMinutes(30);
		b.setSeconds(59);
		date = simpleDateFormat.format(b);

		System.out.println(date);

		// ======================================================================================
	}
}
