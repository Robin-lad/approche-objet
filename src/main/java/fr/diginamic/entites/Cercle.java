package fr.diginamic.entites;

/**
 * Classe Cercle qui fait des calculs de géometrie
 * 
 * @author robin
 *
 */
public class Cercle {

	/** rayon du cercle */
	private double rayon;

	/**
	 * Construteur
	 * @param rayon du cercle
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	/**
	 * @return double équivalent au perimetre du cercle
	 */
	public double perimetre() {
		return 2 * Math.PI * rayon;
	}

	/**
	 * @return la surface d'un cercle
	 */
	public double surface() {
		return rayon * rayon * Math.PI;
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + ", perimetre()=" + perimetre() + ", surface()=" + surface() + "]";
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

}
