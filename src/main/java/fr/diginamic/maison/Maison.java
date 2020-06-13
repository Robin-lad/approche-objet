/** 
*
*/
package fr.diginamic.maison;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * classe maison qui possède une liste de piece
 * 
 * @author robin
 *
 */
public class Maison {

	private ArrayList<Piece> pieces;

	public Maison() {
		super();
		this.pieces = new ArrayList<Piece>();
	}

	/**
	 * ajoute une piece dans le liste des pieces
	 * 
	 * @param p void
	 */
	public void ajouterPiece(Piece p) {

		if (p != null && p.etage >= 0 && p.superficie >= 1) {
			pieces.add(p);
		} else {
			System.out.println("Impossible de créer cette pièce");
		}

	}

	/**
	 * retourne la superficie totale de la maison
	 * 
	 * @return double
	 */
	public double superficieTotale() {
		double somme = 0;
		for (int i = 0; i < pieces.size(); i++) {
			somme += pieces.get(i).superficie;
		}
		return somme;
	}

	/**
	 * calcule la superficie d'un étage donné
	 * 
	 * @param etage etage chosi pour le calcul de la superficie
	 * @return double superficie de l'etage
	 */
	public double superficieEtage(int etage) {
		double somme = 0;
		for (int i = 0; i < pieces.size(); i++) {
			if (this.pieces.get(i).etage == etage) {
				somme += this.pieces.get(i).superficie;
			}
		}
		return somme;
	}

	/**
	 * Calcule la superficie d'un type de piece donné
	 * 
	 * @param piece pieces à calculer la superficie
	 * @return double
	 */
	public double superficiePieces(String piece) {
		double somme = 0;
		for (int i = 0; i < pieces.size(); i++) {
			if (this.pieces.get(i).getType().equals(piece)) {
				somme += this.pieces.get(i).superficie;
			}
		}
		return somme;
	}

	public int getNbPieceType(String piece) {
		int somme = 0;
		for (int i = 0; i < pieces.size(); i++) {
			if (this.pieces.get(i).getType().equals(piece)) {
				somme++;
			}
		}
		return somme;
	}
}
