/** 
*
*/
package listes;

import java.util.ArrayList;

/**
 * @author robin
 *
 */
public class FusionListe {

	/**
	 * @param args void
	 */
	public static void main(String[] args) {

		ArrayList<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		ArrayList<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");

		ArrayList<String> liste3 = new ArrayList<String>(liste1);
		liste3.addAll(liste2);

		System.out.println(liste3);
	}
}
