/** 
*
*/
package fr.diginamic.enumeration;

/**
 * @author robin
 *
 */
public enum Saison {

	PRINTEMPS("Printemps", 1), ETE("Ete", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	private String nom;
	private int numero;

	private Saison(String nom, int numero) {
		this.nom = nom;
		this.numero = numero;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Setter
	 * 
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public static Saison getSaison(String s) {
		for (Saison s1 : Saison.values()) {
			if (s1.getNom().equals(s)) {
				return s1;
			}
		}
		return null;
	}

}
