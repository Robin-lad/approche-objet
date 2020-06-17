/** 
*
*/
package fr.diginamic.recensement.menu;

import java.util.Scanner;

import fr.diginamic.recensement.Recensement;

/**
 * @author robin
 *
 */
public class RechercheHabRegion extends MenuService {

	@Override
	public boolean traiter(Scanner scanner) {
		System.out.println("Veuillez entrer le nom de la région.\n");
		String region = scanner.nextLine();

		int sommeHabDpt = 0;
		for (int i = 0; i < Recensement.getVilles().size(); i++) {
			if (Recensement.getVilles().get(i).getNomRegion().equals(region)) {
				sommeHabDpt += Recensement.getVilles().get(i).getPopulationTotale();
			}
		}

		if (sommeHabDpt != 0) {
			System.out.println("La région " + region + " a " + sommeHabDpt + " habitants.\n");
		} else {
			System.out.println("La région " + region + " n'existe pas.\n");
		}
		return true;
	}

}
