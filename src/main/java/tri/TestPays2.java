/** 
*
*/
package tri;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author robin
 *
 */
public class TestPays2 {

	/**
	 * @param args void
	 */
	public static void main(String[] args) {
		ArrayList<Pays2> p = new ArrayList<Pays2>();
		p.add(new Pays2("France", 287, 10));
		p.add(new Pays2("USA", 1258, 1));
		p.add(new Pays2("Allemagne", 147, 15));
		p.add(new Pays2("Al", 128, 55));

		System.out.println(p);

		Collections.sort(p);

		System.out.println(p);

		Collections.sort(p, new ComparatorHabitant());

		System.out.println(p);

		Collections.sort(p, new ComparatorPibHabitant());

		System.out.println(p);
	}
}
