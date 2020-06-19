/** 
*
*/
package fr.diginamic.recensement.menu;

import java.util.Scanner;

import fr.diginamic.exceptions.RechercheException;
import fr.diginamic.recensement.Recensement;

/**
 * Recherche le nombre d'habitants du département donné
 * 
 * @author robin
 *
 */
public class RechercheHabDpt extends MenuService {

	@Override
	public void traiter(Scanner scanner) throws RechercheException {
		System.out.println("Veuillez entrer le numero du département.\n");
		String dpt = scanner.nextLine();

		if (dpt.trim().equals("")) {
			throw new RechercheException("Le numero du département doit être renseigné.\n");
		}

		int sommeHabDpt = 0;
		for (int i = 0; i < Recensement.getVilles().size(); i++) {
			if (Recensement.getVilles().get(i).getCodeDepartement().equals(dpt)) {
				sommeHabDpt += Recensement.getVilles().get(i).getPopulationTotale();
			}
		}

		if (sommeHabDpt != 0) {
			System.out.println("Le département " + dpt + " a " + sommeHabDpt + " habitants.\n");
		} else {
			throw new RechercheException("Le département " + dpt + " n'existe pas.\n");
		}
	}
}
