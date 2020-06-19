/** 
*
*/
package fr.diginamic.recensement.menu;

import java.util.Scanner;

import fr.diginamic.exceptions.RechercheException;
import fr.diginamic.recensement.Recensement;

/**
 * Recherche le nombre d'habitants de la ville donnée
 * 
 * @author robin
 *
 */
public class RechercheHabVille extends MenuService {

	@Override
	public void traiter(Scanner scanner) throws RechercheException {
		System.out.println("Veuillez entrer un nom de ville.\n");
		String ville = scanner.nextLine();

		if (ville.trim().equals("")) {
			throw new RechercheException("Le nom de la ville doit être renseigné.\n");
		}

		boolean trouve = false;
		for (int i = 0; i < Recensement.getVilles().size(); i++) {
			if (Recensement.getVilles().get(i).getNomCommune().equals(ville)) {
				System.out.println("La ville " + Recensement.getVilles().get(i).getNomCommune() + " a "
						+ Recensement.getVilles().get(i).getPopulationTotale() + " habitants\n");
				trouve = true;
			}
		}

		if (!trouve) {
			throw new RechercheException("Aucune ville trouvée avec ce nom.\n");
		}
	}
}
