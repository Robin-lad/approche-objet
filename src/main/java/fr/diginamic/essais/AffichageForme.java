/** 
*
*/
package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

/**
 * Classe qui affiche et fait appel aux méthodes de calculs du perimetre et de
 * la surface
 * 
 * @author robin
 *
 */
public class AffichageForme {

	public void afficher(Forme f) {
		System.out.println("Perimetre = " + f.calculerPerimetre() + "  Surface = " + f.calculerSurface());
	}
}
