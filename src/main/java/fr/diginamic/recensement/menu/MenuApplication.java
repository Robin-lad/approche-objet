/** 
*
*/
package fr.diginamic.recensement.menu;

import java.util.Scanner;

import fr.diginamic.recensement.Application;

/**
 * @author robin
 *
 */
public class MenuApplication {

	public static final int NB_AFFICHAGE = 10;

	public static void afficherMenu(Scanner sc) {
		System.out.println("Veuillez choisir une option parmis les suivantes");
		System.out.println("1. Population d'une ville donnée");
		System.out.println("2. Population d'un département donné");
		System.out.println("3. Population d'une région donnée");
		System.out.println("4. Afficher les 10 régions les plus peuplées");
		System.out.println("5. Afficher les 10 départements les plus peuplés");
		System.out.println("6. Afficher les 10 villes les plus peuplées d'un département");
		System.out.println("7. Afficher les 10 villes les plus peuplées d'une région");
		System.out.println("8. Afficher les 10 villes les plus peuplées de France");
		System.out.println("9. Sortir");

		int menu = 0;
		do {
			try {
				menu = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Veuillez entrer une valeur.\n");
			}

		} while (menu > 9 || menu < 1);

		switch (menu) {
		case 1:
			RechercheHabVille rechercheVille = new RechercheHabVille();
			rechercheVille.traiter(sc);
			break;
		case 2:
			RechercheHabDpt rechercheDpt = new RechercheHabDpt();
			rechercheDpt.traiter(sc);
			break;
		case 3:
			RechercheHabRegion rechercheRegion = new RechercheHabRegion();
			rechercheRegion.traiter(sc);
			break;
		case 4:
			Region10peuplee recherche10Region = new Region10peuplee();
			recherche10Region.traiter(sc);
			break;
		case 5:
			Dpt10peuplee recherche10Dpt = new Dpt10peuplee();
			recherche10Dpt.traiter(sc);
			break;
		case 6:
			Ville10PeupleeDpt rechercheVille10Dpt = new Ville10PeupleeDpt();
			rechercheVille10Dpt.traiter(sc);
			break;
		case 7:
			Ville10PeupleeRegion rechercheVille10Region = new Ville10PeupleeRegion();
			rechercheVille10Region.traiter(sc);
			break;
		case 8:
			Ville10PeupleeFrance rechercheVille10France = new Ville10PeupleeFrance();
			rechercheVille10France.traiter(sc);
			break;
		case 9:
			System.out.println("Au revoir !\n");
			Application.setContinuer(false);
			break;
		default:
			break;
		}
	}
}
