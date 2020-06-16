/** 
*
*/
package map;

import java.util.HashMap;
import java.util.Map;

import sets.Pays;

/**
 * @author robin
 *
 */
public class MapPays {

	/**
	 * @param args void
	 */
	public static void main(String[] args) {
		HashMap<String, Pays> map1 = new HashMap<String, Pays>();
		map1.put("France", new Pays("France", 66000000, 41463));
		map1.put("USA", new Pays("USA", 328000000, 62794));
		map1.put("Chine", new Pays("Chine", 1393000000, 9770));

		String suppr = "";
		int maxint = Integer.MAX_VALUE;
		for (@SuppressWarnings("rawtypes")
		Map.Entry map : map1.entrySet()) {
			if (((Pays) map.getValue()).getNbHabitants() < maxint) {
				maxint = ((Pays) map.getValue()).getNbHabitants();
				suppr = ((Pays) map.getValue()).getNom();
			}
		}

		map1.remove(suppr);
		System.out.println(map1);
	}
}
