/** 
*
*/
package fr.diginamic.recensement.menu;

import java.util.Scanner;

import fr.diginamic.exceptions.RechercheException;
import fr.diginamic.recensement.Recensement;

/**
 * Recherche le nombre d'habitants de la région donnée
 * @author robin
 *
 */
public class RechercheHabRegion extends MenuService {

	@Override
	public void traiter(Scanner scanner) throws RechercheException {
		System.out.println("Veuillez entrer le nom de la région.\n");
		String region = scanner.nextLine();
		
		if (region.trim().equals("")) {
			throw new RechercheException("Le numero de la région doit être renseigné.\n");
		}

		int sommeHabDpt = 0;
		for (int i = 0; i < Recensement.getVilles().size(); i++) {
			if (Recensement.getVilles().get(i).getNomRegion().equals(region)) {
				sommeHabDpt += Recensement.getVilles().get(i).getPopulationTotale();
			}
		}

		if (sommeHabDpt != 0) {
			System.out.println("La région " + region + " a " + sommeHabDpt + " habitants.\n");
		} else {
			throw new RechercheException("La région " + region + " n'existe pas.\n");
		}
	}
}
