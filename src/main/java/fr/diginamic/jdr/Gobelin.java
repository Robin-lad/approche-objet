/** 
*
*/
package fr.diginamic.jdr;

/**
 * classe représentant un gobelin
 * 
 * @author robin
 *
 */
public class Gobelin extends Creature {

	/** MIN_FORCE force minimale à la génération du gobelin */
	private static final int MIN_FORCE = 5;
	/** MAX_FORCE force maximale à la génération du gobelin */
	private static final int MAX_FORCE = 10;

	/** MIN_PV points de vie minimum à la génération du gobelin */
	private static final int MIN_PV = 10;
	/** MAX_PV points de vie maximum à la génération du gobelin */
	private static final int MAX_PV = 15;

	/** SCORE_DONNE score donné au joueur en mourrant */
	private static final int SCORE_DONNE = 2;

	/**
	 * Construteur
	 * 
	 */
	public Gobelin() {
		super();
		this.setForce(MIN_FORCE + (int) (Math.random() * ((MAX_FORCE - MIN_FORCE) + 1)));
		this.setPv(MIN_PV + (int) (Math.random() * ((MAX_PV - MIN_PV) + 1)));
	}

	/**
	 * retourne le score que donne la créature en mourrant
	 * 
	 * @return int
	 */
	@Override
	public int getScoreDonne() {
		return SCORE_DONNE;
	}

	/**
	 * retourne le type de la créature : personnage / loup / gobelin etc..
	 * 
	 * @return String
	 */
	@Override
	public String getType() {
		return "gobelin";
	}

	/**
	 * toString
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "Gobelin " + super.toString();
	}

}
