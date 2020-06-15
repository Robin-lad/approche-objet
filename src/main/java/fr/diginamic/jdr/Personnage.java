/** 
*
*/
package fr.diginamic.jdr;

/**
 * classe représentant un personnage
 * 
 * @author robin
 *
 */
public class Personnage extends Creature {

	/** score score du personnage */
	private int score;

	/** MIN_FORCE force minimale à la génération du personnage */
	private static final int MIN_FORCE = 12;
	/** MAX_FORCE force maximale à la génération du personnage */
	private static final int MAX_FORCE = 18;

	/** MIN_PV points de vie minimum à la génération du personnage */
	private static final int MIN_PV = 20;
	/** MAX_PV point de vie maximum à la génération du personnage */
	private static final int MAX_PV = 50;

	/**
	 * Construteur
	 * 
	 */
	public Personnage() {
		super();
		this.setForce(MIN_FORCE + (int) (Math.random() * ((MAX_FORCE - MIN_FORCE) + 1)));
		this.setPv(MIN_PV + (int) (Math.random() * ((MAX_PV - MIN_PV) + 1)));
		this.score = 0;
	}

	/**
	 * retourne le score que donne la créature en mourrant
	 * 
	 * @return int
	 */
	@Override
	public int getScoreDonne() {
		return 0;
	}

	/**
	 * retourne le type de la créature : personnage / loup / gobelin etc..
	 * 
	 * @return String
	 */
	@Override
	public String getType() {
		return "personnage";
	}

	/**
	 * Getter
	 * 
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * Setter
	 * 
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * toString
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "Personnage " + super.toString() + " score=" + score;
	}

}