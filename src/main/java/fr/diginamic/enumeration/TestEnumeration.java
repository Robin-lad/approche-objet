/** 
*
*/
package fr.diginamic.enumeration;

/**
 * @author robin
 *
 */
public class TestEnumeration {

	public static void main(String[] args) {

		for (Saison s : Saison.values()) {
			System.out.println(s);
		}

		System.out.println(Saison.valueOf("ETE").getNom() + " " + Saison.valueOf("ETE").getNumero());

		System.out.println(Saison.getSaison("Hiver").getNom());
	}
}
