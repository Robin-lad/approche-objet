/** 
*
*/
package listes;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author robin
 *
 */
public class TestListInt {

	/**
	 * @param args void
	 */
	public static void main(String[] args) {
		ArrayList<Integer> liste1 = new ArrayList<Integer>();
		liste1.add(-1);
		liste1.add(5);
		liste1.add(7);
		liste1.add(3);
		liste1.add(-2);
		liste1.add(4);
		liste1.add(8);
		liste1.add(5);

		System.out.println(liste1 + " taille " + liste1.size());

		System.out.println(Collections.max(liste1));
		liste1.remove(liste1.indexOf(Collections.min(liste1)));

		System.out.println(liste1);

		for (int i = 0; i < liste1.size(); i++) {
			if (liste1.get(i) < 0) {
				liste1.set(i, Math.abs(liste1.get(i)));
			}
		}
		System.out.println(liste1);
	}
}
