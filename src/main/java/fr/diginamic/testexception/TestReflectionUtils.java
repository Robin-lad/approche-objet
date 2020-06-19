/** 
*
*/
package fr.diginamic.testexception;

import java.util.Scanner;

import sets.Pays;

/**
 * @author robin
 *
 */
public class TestReflectionUtils {

	/**
	 * @param args void
	 */
	public static void main(String[] args) {

		Pays p = new Pays("France", 52, 168);

		try {
			ReflectionUtils.afficherAttributs(p);
		} catch (ReflectionException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}
