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
 * affiche les 10 villes les plus peuplées d'une région donnée
 * 
 * @author robin
 *
 */
public class Ville10PeupleeRegion extends MenuService {

	@Override
	public void traiter(Scanner scanner) throws RechercheException {
		Map<String, Integer> map = new HashMap<>();
		String format2 = "%-10s%-20s%-3s%s%n";

		System.out.println("Veuillez entrer le nom de la région");

		String region = scanner.nextLine();

		boolean trouve = false;
		for (Ville v : Recensement.getVilles()) {
			if (v.getNomRegion().equals(region)) {
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
			throw new RechercheException("Nom de region inexistant.\n");
		}
		super.reverse(map, format2, "Ville: ");

	}
}
