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
public class Ville10PeupleeDpt extends MenuService {

	@Override
	public boolean traiter(Scanner scanner) {
		Map<String, Integer> map = new HashMap<>();
		String format2 = "%-10s%-27s%-3s%s%n";

		System.out.println("Veuillez entrer le numero du département");

		try {
			String dpt = scanner.nextLine();

			for (Ville v : Recensement.getVilles()) {
				if (v.getCodeDepartement().equals(dpt)) {
					if (map.get(v.getNomCommune()) == null) {
						map.put(v.getNomCommune(), v.getPopulationTotale());
					} else {
						int popu = map.get(v.getNomCommune());
						map.put(v.getNomCommune(), popu + v.getPopulationTotale());
					}
				}
			}

			super.reverse(map, format2, "Ville: ");
		} catch (Exception e) {
			System.out.println("Numéro de département incorrect.\n");
		}

		return true;
	}

}