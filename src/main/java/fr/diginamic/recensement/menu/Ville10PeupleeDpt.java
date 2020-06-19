/** 
*
*/
package fr.diginamic.recensement.menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import fr.diginamic.exceptions.RechercheException;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

/**
 * affiche les 10 villes les plus peuplées d'un département donné
 * 
 * @author robin
 *
 */
public class Ville10PeupleeDpt extends MenuService {

	@Override
	public void traiter(Scanner scanner) throws NumberFormatException, RechercheException {
		Map<String, Integer> map = new HashMap<>();
		String format2 = "%-10s%-27s%-3s%s%n";

		System.out.println("Veuillez entrer le numero du département");

		String dpt = scanner.nextLine();

		boolean trouve = false;
		for (Ville v : Recensement.getVilles()) {
			if (v.getCodeDepartement().equals(dpt)) {
				if (map.get(v.getNomCommune()) == null) {
					map.put(v.getNomCommune(), v.getPopulationTotale());
				} else {
					int popu = map.get(v.getNomCommune());
					map.put(v.getNomCommune(), popu + v.getPopulationTotale());
				}
				trouve = true;
			}
		}

		if (!trouve) {
			throw new RechercheException("Numero de département inexistant.\n");
		}
		super.reverse(map, format2, "Ville: ");
	}
}
