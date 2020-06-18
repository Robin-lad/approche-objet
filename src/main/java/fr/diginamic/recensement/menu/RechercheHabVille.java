/** 
*
*/
package fr.diginamic.recensement.menu;

import java.util.Scanner;

import fr.diginamic.recensement.Recensement;

/**
 * Recherche le nombre d'habitants de la ville donnée
 * 
 * @author robin
 *
 */
public class RechercheHabVille extends MenuService {

	@Override
	public boolean traiter(Scanner scanner) {
		System.out.println("Veuillez entrer un nom de ville.\n");
		String ville = scanner.next();

		for (int i = 0; i < Recensement.getVilles().size(); i++) {
			if (Recensement.getVilles().get(i).getNomCommune().equals(ville)) {
				System.out.println("La ville " + Recensement.getVilles().get(i).getNomCommune() + " a "
						+ Recensement.getVilles().get(i).getPopulationTotale() + " habitants\n");
				return true;
			}
		}
		System.out.println("Aucune ville trouvée avec ce nom\n");
		return false;
	}
}
