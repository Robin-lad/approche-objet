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
public class RechercheHabDpt extends MenuService {

	@Override
	public boolean traiter(Scanner scanner) {
		System.out.println("Veuillez entrer le numero du département.\n");
		String dpt = scanner.next();

		int sommeHabDpt = 0;
		for (int i = 0; i < Recensement.getVilles().size(); i++) {
			if (Recensement.getVilles().get(i).getCodeDepartement().equals(dpt)) {
				sommeHabDpt += Recensement.getVilles().get(i).getPopulationTotale();
			}
		}

		if (sommeHabDpt != 0) {
			System.out.println("Le département " + dpt + " a " + sommeHabDpt + " habitants.\n");
		} else {
			System.out.println("Le département " + dpt + " n'existe pas.\n");
		}

		return true;
	}
}
