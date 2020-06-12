/** 
*
*/
package fr.diginamic.salaire;

/**
 * classe qui représente un pigiste
 * 
 * @author robin
 *
 */
public class Pigiste extends Intervenant {

	/** nbJourTravaille nombre de jour de travaille du pigiste */
	private int nbJourTravaille;
	/** remunJourna rémunération journalière du pigiste */
	private double remunJourna;

	/**
	 * Construteur
	 * 
	 * @param prenom          prenom du pigiste
	 * @param nom             nom du pigiste
	 * @param nbJourTravaille nombre de jour de travaille du pigiste
	 * @param remunJourna     rémuneration journalière du pigiste
	 */
	public Pigiste(String prenom, String nom, int nbJourTravaille, double remunJourna) {
		super(prenom, nom);
		this.nbJourTravaille = nbJourTravaille;
		this.remunJourna = remunJourna;
	}

	/**
	 * retourne le salaire du pigiste
	 */
	@Override
	public double getSalaire() {
		return nbJourTravaille * remunJourna;
	}

	@Override
	public String toString() {
		return "Pigiste " + super.toString();
	}
}
