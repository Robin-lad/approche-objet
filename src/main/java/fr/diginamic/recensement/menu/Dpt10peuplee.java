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
 * @author robin
 *
 */
public class Dpt10peuplee extends MenuService {

	@Override
	public boolean traiter(Scanner scanner) {
		Map<String, Integer> map = new HashMap<>();
		String format2 = "%-10s%-10s%-3s%s%n";

		for (Ville v : Recensement.getVilles()) {
			if (map.get(v.getCodeDepartement()) == null) {
				map.put(v.getCodeDepartement(), v.getPopulationTotale());
			} else {
				int popu = map.get(v.getCodeDepartement());
				map.put(v.getCodeDepartement(), popu + v.getPopulationTotale());
			}
		}

		super.reverse(map, format2, "Département: ");

		return true;
	}

}
