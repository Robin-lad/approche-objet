/** 
*
*/
package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

/** test classe intervenant salarie et pigiste
 * @author robin
 *
 */
public class TestIntervenant {

	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Salarie salarie = new Salarie("Aymeric", "Topiak", 1100);
		Salarie salarie2 = new Salarie("Aymeric2", "Topiak2", 1102);
		Pigiste pigiste = new Pigiste("Yohann", "Toz", 2, 600);
		Pigiste pigiste2 = new Pigiste("Yohann2", "Toz2", 22, 6002);

		salarie.afficherDonnees();
		salarie2.afficherDonnees();
		pigiste.afficherDonnees();
		pigiste2.afficherDonnees();
	}
}
