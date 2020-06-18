/** 
*
*/
package fr.diginamic.recensement;

import java.util.Scanner;

import fr.diginamic.recensement.menu.MenuApplication;

/**
 * Classe main qui lance l'application de recensement
 * 
 * @author robin
 *
 */
public class Application {

	private static boolean continuer = true;

	/**
	 * Main
	 * @param args void
	 */
	public static void main(String[] args) {
		Fichier.lectureFichier("D:\\Telechargements\\recensement_2016.csv");
		Scanner sc = new Scanner(System.in);

		while (continuer) {
			MenuApplication.afficherMenu(sc);
		}

		sc.close();
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
		Application.continuer = continuer;
	}
}
