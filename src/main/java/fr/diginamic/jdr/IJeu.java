/** 
*
*/
package fr.diginamic.jdr;

import java.util.Scanner;

/**
 * classe qui gère toutes les commandes du jeu
 * @author robin
 *
 */
public interface IJeu {

	/**
	 * le menu permet à l'utilisateur de choisir entre différentes options
	 * @param scan scanner pour récuperer les choix de l'utilisateur
	 * @throws InterruptedException void
	 */
	public static void menu(Scanner scan) throws InterruptedException {
		System.out.println("1) Créer un nouveau personnage");
		System.out.println("2) Combattre une créature");
		System.out.println("3) Afficher votre score");
		System.out.println("4) Quitter le jeu");
		int menu = scan.nextInt();

		switch (menu) {
		case 1:
			newPersonnage();
			break;
		case 2:
			combat(scan);
			break;
		case 3:
			afficherScore();
			break;
		case 4:
			quitterJeu();
			break;
		}
	}

	
	/**
	 * Crée un personnage pour l'utilisateur
	 *  void
	 */
	public static void newPersonnage() {
		Personnage personnage = new Personnage();
		TestJDR.setPersonnage(personnage);
		TestJDR.setPersoVivant(true);
		System.out.println("Votre personnage a été créé avec succès : \n" + personnage + "\n");
	}

	/**
	 * Commence un combat entre un monstre choisi par l'utilisateur et son personnage
	 * void
	 * 
	 * @throws InterruptedException
	 */
	public static void combat(Scanner scan) throws InterruptedException {
		if (persoExiste()) {
			if (estEnVie(TestJDR.getPersonnage())) {
				int mob = 0;
				do {
					System.out.println("Veuillez choisir la créature à combattre :");
					System.out.println("1) Loup");
					System.out.println("2) Gobelin");
					System.out.println("3) Troll\n");

					mob = scan.nextInt();

					switch (mob) {
					case 1:
						combattreCreature(new Loup());
						break;
					case 2:
						combattreCreature(new Gobelin());
						break;
					case 3:
						combattreCreature(new Troll());
						break;
					default:
						System.out.println("Veuillez entrer une valeur correcte.\n");
					}
				} while (mob <= 0 || mob > 3);

			} else {
				System.out.println("Votre personnage est décédé. Il a obtenu un score de "
						+ TestJDR.getPersonnage().getScore() + " points. Veuillez créer un nouveau personnage.\n");
			}

		} else {
			System.out.println("Veuillez commencer par créer un personnage.\n");
		}
	}

	/**
	 * affiche le score du personnage de l'utilisateur
	 * void
	 */
	public static void afficherScore() {
		if (persoExiste()) {
			System.out.println("Votre score avec ce personnage est de : " + TestJDR.getPersonnage().getScore() + "\n");
		} else {
			System.out.println("Vous n'avez pas de personnage en vie.\n");
		}
	}

	/**
	 * change le boolean du main en false pour quitter le jeu
	 * void
	 */
	public static void quitterJeu() {
		TestJDR.setContinuer(false);
	}

	/**
	 * Simule un combat entre le personnage de l'utilisateur et le monstre choisi
	 * @param crea créature que le personnage va combattre
	 * @throws InterruptedException void
	 */
	public static void combattreCreature(Creature crea) throws InterruptedException {
		boolean estEnVie = true;
		int attaquePerso;
		int attaqueMob;
		int nombreDeTour = 1;

		while (estEnVie) {
			attaquePerso = TestJDR.getPersonnage().calculAttaque();
			attaqueMob = crea.calculAttaque();

			System.out.println("Tour n°" + nombreDeTour);
			System.out.println("Votre personnage va taper du " + attaquePerso);
			System.out.println("La créature va taper du " + attaqueMob + "\n");

			Thread.sleep(1500);

			if (attaquePerso > attaqueMob) {
				System.out.println(crea.getType() + " perd \t" + (attaquePerso - attaqueMob) + " pv\n");
				estEnVie = pertePV(crea, attaquePerso - attaqueMob);
			} else {
				System.out.println(
						TestJDR.getPersonnage().getType() + " perd \t" + (attaqueMob - attaquePerso) + " pv\n");
				estEnVie = pertePV(TestJDR.getPersonnage(), attaqueMob - attaquePerso);
				TestJDR.setPersoVivant(estEnVie);
			}
			System.out.println(TestJDR.getPersonnage().getType() + "\t" + TestJDR.getPersonnage().getPv() + "pv");
			System.out.println(crea.getType() + "\t\t" + crea.getPv() + "pv\n");

			nombreDeTour++;
		}

		if (TestJDR.isPersoVivant()) {
			TestJDR.getPersonnage().setScore(TestJDR.getPersonnage().getScore() + crea.getScoreDonne());
			System.out.println("Bravo, vous avez tué la créature : " + crea.getType() + ", vous gagnez "
					+ crea.getScoreDonne() + " points de score.\n");
		} else {
			System.out.println("Vous avez perdu le combat face à un " + crea.getType() + ", votre score est de "
					+ TestJDR.getPersonnage().getScore() + " points.\n");
		}
	}

	/**retourne true si personnage de l'utilisateur existe
	 * @return boolean 
	 */
	public static boolean persoExiste() {
		if (TestJDR.getPersonnage() != null) {
			return true;
		}
		return false;
	}

	/**
	 * retourne true si la creature passé en parametre est en vie
	 * @param crea une creature
	 * @return boolean
	 */
	public static boolean estEnVie(Creature crea) {
		if (crea.getPv() > 0) {
			return true;
		}
		return false;
	}

	/**fait perdre des points de vie à la créature passée en parametre
	 * @param crea creature qui va perdre les points de vie
	 * @param pv points de vie à enlever à la creature crea
	 * @return boolean
	 */
	public static boolean pertePV(Creature crea, int pv) {
		crea.setPv(crea.getPv() - pv);
		return estEnVie(crea);
	}
}
