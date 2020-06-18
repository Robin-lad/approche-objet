/** 
*
*/
package fr.diginamic.recensement.menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

/**
 * affiche les 10 regions les plus peuplées
 * @author robin
 *
 */
public class Region10peuplee extends MenuService {

	@Override
	public boolean traiter(Scanner scanner) {

		Map<String, Integer> map = new HashMap<>();
		String format2 = "%-10s%-30s%-3s%s%n";

		for (Ville v : Recensement.getVilles()) {
			if (map.get(v.getNomRegion()) == null) {
				map.put(v.getNomRegion(), v.getPopulationTotale());
			} else {
				int popu = map.get(v.getNomRegion());
				map.put(v.getNomRegion(), popu + v.getPopulationTotale());
			}
		}

		super.reverse(map, format2, "Région: ");

		return true;
	}
}
