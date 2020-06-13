/** 
*
*/
package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Sallon;
import fr.diginamic.maison.WC;

/**
 * classe de test de maison
 * 
 * @author robin
 *
 */
public class TestMaison {

	/**
	 * Main
	 * 
	 * @param args void
	 */
	public static void main(String[] args) {
		Maison maison = new Maison();

		maison.ajouterPiece(new WC(3, 0));
		maison.ajouterPiece(new Cuisine(25, 0));
		maison.ajouterPiece(new Sallon(30, 0));
		maison.ajouterPiece(new SalleDeBain(30, 0));
		maison.ajouterPiece(new Chambre(15, 1));
		maison.ajouterPiece(new Chambre(20, 1));
		maison.ajouterPiece(new Chambre(22, 1));
		maison.ajouterPiece(new SalleDeBain(30, 1));
		maison.ajouterPiece(null);
		maison.ajouterPiece(new SalleDeBain(-30, 1));

		System.out.println(maison.superficieTotale());
		System.out.println(maison.superficieEtage(0));
		System.out.println(maison.superficieEtage(1));

		System.out.println(maison.superficiePieces("SalleDeBain"));

		System.out.println(maison.getNbPieceType("Chambre"));

	}
}
