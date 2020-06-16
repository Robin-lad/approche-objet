/** 
*
*/
package listes;

import java.util.ArrayList;

/**
 * @author robin
 *
 */
public class TestListString {

	/**
	 * @param args void
	 */
	public static void main(String[] args) {
		ArrayList<String> liste1 = new ArrayList<String>();
		liste1.add("Nice");
		liste1.add("Carcassonne");
		liste1.add("Narbonne");
		liste1.add("Lyon");
		liste1.add("Foix");
		liste1.add("Pau");
		liste1.add("Marseille");
		liste1.add("Tarbes");

		int grand = 0;
		int index = -1;
		for (int i = 0; i < liste1.size(); i++) {
			if (liste1.get(i).length() > grand) {
				grand = liste1.get(i).length();
				index = i;
			}
		}
		System.out.println(liste1.get(index));

		for (int i = 0; i < liste1.size(); i++) {
			liste1.set(i, liste1.get(i).toUpperCase());
		}

		System.out.println(liste1);

		for (int i = 0; i < liste1.size(); i++) {
			if (liste1.get(i).startsWith("N")) {
				liste1.remove(i);
			}
		}

		System.out.println(liste1 + "\n\n");

		ArrayList<Ville> tab = new ArrayList<Ville>();
		tab.add(new Ville("Nice", 343000));
		tab.add(new Ville("Carcassonne", 47800));
		tab.add(new Ville("Narbonne", 53400));
		tab.add(new Ville("Lyon", 484000));
		tab.add(new Ville("Foix", 9700));
		tab.add(new Ville("Pau", 77200));
		tab.add(new Ville("Marseille", 850700));
		tab.add(new Ville("Tarbes", 40600));

		int plusgrand = 0;
		int indexgrand = -1;
		for (int i = 0; i < tab.size(); i++) {
			if (tab.get(i).nbHabitants > plusgrand) {
				plusgrand = tab.get(i).nbHabitants;
				indexgrand = i;
			}
		}
		System.out.println(tab.get(indexgrand).nom);

		int pluspetit = Integer.MAX_VALUE;
		int indexpetit = -1;
		for (int i = 0; i < tab.size(); i++) {
			if (tab.get(i).nbHabitants < pluspetit) {
				pluspetit = tab.get(i).nbHabitants;
				indexpetit = i;
			}
		}
		tab.remove(indexpetit);
		System.out.println(tab);

		for (int i = 0; i < tab.size(); i++) {
			if (tab.get(i).nbHabitants > 100000) {
				tab.set(i, new Ville(tab.get(i).nom.toUpperCase(), tab.get(i).nbHabitants));
			}
		}

		System.out.println(tab);
	}
}
