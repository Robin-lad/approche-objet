/** 
*
*/
package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * @author robin
 *
 */
public class CreationMap {

	/**
	 * @param args void
	 */
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("Paul", 1750);
		hm.put("Hicham", 1825);
		hm.put("Yu", 2250);
		hm.put("Ingrid", 2015);
		hm.put("Chantal", 2418);

		System.out.println(hm.size());

		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");

		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		for (Iterator<Entry<Integer, String>> iterator = mapVilles.entrySet().iterator(); iterator.hasNext();) {
			Entry<Integer, String> mapentry = iterator.next();
			System.out.println(mapentry.getKey() + " " + mapentry.getValue());
		}

		System.out.println("map de taille " + mapVilles.size());

	}
}
