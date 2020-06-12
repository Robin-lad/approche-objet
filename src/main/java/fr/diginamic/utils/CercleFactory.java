/** 
*
*/
package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

/**
 * @author robin
 *
 */
public class CercleFactory {

	public static Cercle créerCercle(double d) {
		return new Cercle(d);
	}
}
