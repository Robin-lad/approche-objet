/** 
*
*/
package fr.diginamic.jdr;

import java.util.Scanner;

/**
 * Main qui lance le jeu
 * @author robin
 *
 */
public class TestJDR {

	/** personnage personnage actuel du jeu*/
	private static Personnage personnage = null;
	/** persoVivant boolean true si personnage vivant*/
	private static boolean persoVivant = false;
	/** continuer boolean true si on veut continuer le jeu*/
	private static boolean continuer = true;

	/**
	 * @param args void
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);

		while (continuer) {
			IJeu.menu(scan);
		}

		scan.close();
	}

	
	/** Getter
	 * @return the persoVivant
	 */
	public static boolean isPersoVivant() {
		return persoVivant;
	}


	/** Setter
	 * @param persoVivant the persoVivant to set
	 */
	public static void setPersoVivant(boolean persoVivant) {
		TestJDR.persoVivant = persoVivant;
	}


	/**
	 * Getter
	 * 
	 * @return the continuer
	 */
	public static boolean isContinuer() {
		return continuer;
	}

	/**
	 * Setter
	 * 
	 * @param continuer the continuer to set
	 */
	public static void setContinuer(boolean continuer) {
		TestJDR.continuer = continuer;
	}

	/**
	 * Getter
	 * 
	 * @return the personnage
	 */
	public static Personnage getPersonnage() {
		return personnage;
	}

	/**
	 * Setter
	 * 
	 * @param personnage the personnage to set
	 */
	public static void setPersonnage(Personnage personnage) {
		TestJDR.personnage = personnage;
	}

}
