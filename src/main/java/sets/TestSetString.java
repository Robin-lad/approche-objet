/** 
*
*/
package sets;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author robin
 *
 */
public class TestSetString {

	/**
	 * @param args void
	 */
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("France");
		hs.add("Allemagne");
		hs.add("UK");
		hs.add("Italie");
		hs.add("Japon");
		hs.add("Chine");
		hs.add("Russie");
		hs.add("Inde");

		System.out.println(hs);

		String plusgrand = "";
		Iterator<String> strPays = hs.iterator();
		while (strPays.hasNext()) {
			if (strPays.next().length() > plusgrand.length()) {
				plusgrand = strPays.next();
			}
		}
		hs.remove(plusgrand);
		System.out.println(hs + "\n\n");

		HashSet<Pays> hs2 = new HashSet<Pays>();
		hs2.add(new Pays("USA", 328000000, 62794));
		hs2.add(new Pays("France", 66000000, 41463));
		hs2.add(new Pays("Allemagne", 83000000, 47603));
		hs2.add(new Pays("UK", 66650000, 42943));
		hs2.add(new Pays("Italie", 60360000, 34483));
		hs2.add(new Pays("Japon", 126500000, 39289));
		hs2.add(new Pays("Chine", 1393000000, 9770));
		hs2.add(new Pays("Russie", 144500000, 11288));
		hs2.add(new Pays("Inde", 1353000000, 2000));

		System.out.println(hs2);

		int grandPibParHab = Integer.MIN_VALUE;
		Pays grandPibHabPays = null;
		Iterator<Pays> pays = hs2.iterator();
		while (pays.hasNext()) {
			Pays p = pays.next();
			if (p.pibParHab > grandPibParHab) {
				grandPibParHab = p.pibParHab;
				grandPibHabPays = p;
			}
		}
		System.out.println(grandPibHabPays);
	}
}
