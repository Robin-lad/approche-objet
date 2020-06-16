/** 
*
*/
package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
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

		String pattern2 = "yyyy-MM-dd";

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
	}
}
