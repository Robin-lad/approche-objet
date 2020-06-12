/** 
*
*/
package fr.diginamic.formes;

/**
 * Classe Rectangle qui calcule le perimetre et la surface d'un rectangle
 * 
 * @author robin
 *
 */
public class Rectangle extends Forme {

	/** longueur du rectangle */
	private double longueur;
	/** largeur dur rectangle */
	private double largeur;

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	/**
	 * calcule et retourne la surface du rectangle
	 */
	@Override
	public double calculerSurface() {
		return longueur * largeur;
	}

	/**
	 * calcule et retourne le perimetre du rectangle
	 */
	@Override
	public double calculerPerimetre() {
		return (longueur + largeur) * 2;
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

	/**
	 * Getter
	 * 
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * Setter
	 * 
	 * @param largeur the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + ", calculerSurface()=" + calculerSurface()
				+ ", calculerPerimetre()=" + calculerPerimetre() + "]";
	}
}
