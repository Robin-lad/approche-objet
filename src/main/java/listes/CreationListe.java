/** 
*
*/
package listes;

import java.util.ArrayList;

/**
 * @author robin
 *
 */
public class CreationListe {

	/**
	 * @param args void
	 */
	public static void main(String[] args) {
		ArrayList<Integer> tab = new ArrayList<Integer>();

		for (int i = 0; i < 100; i++) {
			tab.add(i + 1);
		}
		
		System.out.println(tab.size());
	}

}
