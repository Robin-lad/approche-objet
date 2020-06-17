/** 
*
*/
package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

/**
 * @author robin
 *
 */
public class Recensement {

	private static List<Ville> villes = new ArrayList<>();

	public static List<Ville> getVilles() {
		return villes;
	}

	public static void setVilles(List<Ville> villes) {
		Recensement.villes = villes;
	}
}
