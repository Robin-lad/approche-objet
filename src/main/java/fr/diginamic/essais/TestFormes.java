/** 
*
*/
package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

/**
 * Classe de test des formes
 * 
 * @author robin
 *
 */
public class TestFormes {

	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		AffichageForme affiche = new AffichageForme();
		Cercle cercle = new Cercle(5);
		Rectangle rectangle = new Rectangle(5, 4);
		Carre carre = new Carre(3);

		affiche.afficher(cercle);
		affiche.afficher(rectangle);
		affiche.afficher(carre);
	}
}
