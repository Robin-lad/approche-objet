/** 
*
*/
package fr.diginamic.formes;

/**
 * Classe Carre qui calcule et affiche le perimetre et la surface d'un cercle
 * 
 * @author robin
 *
 */
public class Carre extends Rectangle {

	/** longueur d'un côté du carré */
	private double longueur;

	/**
	 * Construteur
	 * 
	 * @param longueur d'un coté du cercle
	 */
	public Carre(double longueur) {
		super(longueur, longueur);
	}

	/**
	 * Getter
	 * 
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}

	/**
	 * Setter
	 * 
	 * @param longueur the longueur to set
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	@Override
	public String toString() {
		return "Carre [longueur=" + longueur + ", calculerSurface()=" + calculerSurface() + ", calculerPerimetre()="
				+ calculerPerimetre() + "]";
	}
}
