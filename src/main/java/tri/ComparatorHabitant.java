/** 
*
*/
package tri;

import java.util.Comparator;

/**
 * @author robin
 *
 */
public class ComparatorHabitant implements Comparator<Pays2> {

	@Override
	public int compare(Pays2 p1, Pays2 p2) {
		return ((Integer) p1.getNbHabitants()).compareTo((Integer) p2.getNbHabitants());
	}
}
