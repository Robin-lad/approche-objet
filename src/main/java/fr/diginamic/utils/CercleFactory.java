/** 
*
*/
package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

/**
 * Classe qui construit des cercles
 * @author robin
 *
 */
public class CercleFactory {

	/**
	 * @param d un double qui vaut le rayon du cercle
	 * @return un objet Cercle 
	 */
	public static Cercle créerCercle(double d) {
		return new Cercle(d);
	}
}
