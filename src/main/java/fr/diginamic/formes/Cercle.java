/** 
*
*/
package fr.diginamic.formes;

/**
 * Classe Cercle qui calcule le perimetre et surface d'un cercle
 * 
 * @author robin
 *
 */
public class Cercle extends Forme {

	/** rayon d'un cercle */
	private double rayon;

	/**
	 * Construteur
	 * 
	 * @param rayon du cercle
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	/**
	 * calcule et retourne la surface d'un cercle
	 */
	@Override
	public double calculerSurface() {
		return rayon * rayon * Math.PI;
	}

	/**
	 * calcule et retourne le perimetre d'un cercle
	 */
	@Override
	public double calculerPerimetre() {
		return 2 * Math.PI * rayon;
	}

	/**
	 * Getter
	 * 
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/**
	 * Setter
	 * 
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Cercle [perimetre()=" + calculerPerimetre() + ", surface()=" + calculerSurface() + "]";
	}
}
