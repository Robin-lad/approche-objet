/** 
*
*/
package fr.diginamic.jdr;

/**
 * classe représentant un troll
 * 
 * @author robin
 *
 */
public class Troll extends Creature {

	/** MIN_FORCE force minimale à la génération du troll */
	private static final int MIN_FORCE = 10;
	/** MAX_FORCE force maximale à la génération du troll */
	private static final int MAX_FORCE = 15;

	/** MIN_PV points de vie minimum à la génération du troll */
	private static final int MIN_PV = 20;
	/** MAX_PV points de vie maximum à la génération du troll */
	private static final int MAX_PV = 30;

	/** SCORE_DONNE score donné au joueur en mourrant */
	private static final int SCORE_DONNE = 5;

	/**
	 * Construteur
	 * 
	 */
	public Troll() {
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
		return "troll";
	}

	/**
	 * toString
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "Troll " + super.toString();
	}
}
